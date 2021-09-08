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

        public string test { get; set; }

        public async Task OnGetAsync()
        {
            AppContext.SetSwitch("System.Net.Http.SocketsHttpHandler.Http2UnencryptedSupport", true);
            using var channel = GrpcChannel.ForAddress("http://localhost:9000");
            var med = new tipoMedicamento.tipoMedicamentoClient(channel);
            //var tipos = await med.getAllTipoMedicamentoAsync(new Empty() { }).ResponseAsync.Result.Tipos.ToArray();

            //TagOptions = new SelectList(tipos, "nombre_tipo", "nombre_tipo");
        }

        public async Task OnPostAsync()
        {
            AppContext.SetSwitch("System.Net.Http.SocketsHttpHandler.Http2UnencryptedSupport", true);
            using var channel = GrpcChannel.ForAddress("http://localhost:9000");
            var med = new Medicamento.MedicamentoClient(channel);

            await med.addMedicamentoAsync(new MedicamentoDTO() { Id = 77777, CodMedicamento = cod_medicamento, Nombre = nombre, Droga = droga, Tipo = tipo });

        }
    }
}
