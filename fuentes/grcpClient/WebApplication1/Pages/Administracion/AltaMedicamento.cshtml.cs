using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Grpc.Net.Client;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using Microsoft.AspNetCore.Mvc.Rendering;

namespace WebApplication1.Pages.Administracion
{
    public class AltaMedicamentoModel : PageModel
    {
        [BindProperty]
        public string cod_medicamento { get; set; }
        [BindProperty]
        public string nombre { get; set; }
        [BindProperty]
        public string droga { get; set; }
        [BindProperty]
        public string tipo { get; set; }

        public SelectList TagOptions { get; set; }

        public async Task OnGetAsync()
        {
            AppContext.SetSwitch("System.Net.Http.SocketsHttpHandler.Http2UnencryptedSupport", true);
            using var channel = GrpcChannel.ForAddress("http://localhost:9000");
            var med = new tipoMedicamento.tipoMedicamentoClient(channel);
            var tipos = await med.getAllTipoMedicamentoAsync(new Empty() { });
            this.TagOptions = new SelectList(tipos.Tipos, "Nombre", "Nombre", this.tipo);
        }

        public async Task OnPostAsync()
        {
            int codepart = 0;
            try
            {
                var codeParts = cod_medicamento.Split('-'); // DCR-88599-9
                if (codeParts.Count() == 3)
                {
                    if (!codeParts[0].Any(c => char.IsDigit(c)) && codeParts[0].Length == 3)
                    {
                        if (int.TryParse(codeParts[1], out _) && codeParts[1].Length == 5)
                        {
                            if (int.TryParse(codeParts[2], out _) && codeParts[2].Length == 1 && Convert.ToInt32(codeParts[2]) > 0)
                            {
                                codepart = int.Parse(codeParts[1]);

                                while (codepart >= 10)
                                {
                                    var codepartstr = codepart.ToString();
                                    codepart = 0;
                                    foreach (var num in codepartstr)
                                    {
                                        codepart += int.Parse(num.ToString());
                                    }
                                }

                                if (codepart == Convert.ToInt32(codeParts[2]))
                                {
                                    AppContext.SetSwitch("System.Net.Http.SocketsHttpHandler.Http2UnencryptedSupport", true);
                                    using var channel = GrpcChannel.ForAddress("http://localhost:9000");
                                    var med = new Medicamento.MedicamentoClient(channel);
                                    await med.addMedicamentoAsync(new MedicamentoDTO() { Id = Convert.ToInt32(codeParts[1]), CodMedicamento = cod_medicamento, Nombre = nombre, Droga = droga, Tipo = tipo });
                                }
                                else
                                {
                                    throw new Exception("Código verificador inválido.");
                                }
                            }
                            else
                            {
                                throw new Exception("La tercer parte del código debe contener 1 dígito verificador.");
                            }
                        }
                        else
                        {
                            throw new Exception("La segunda parte del código debe contener 5 dígitos.");
                        }
                    }
                    else
                    {
                        throw new Exception("La primer parte del código debe tener 3 caracteres.");
                    }
                }
                else
                {
                    throw new Exception("Estructura del código inválida.");
                }
            }
            catch (Exception x)
            {
                Response.Redirect("/Error?Message=" + x.Message);
            }
        }
    }
}
