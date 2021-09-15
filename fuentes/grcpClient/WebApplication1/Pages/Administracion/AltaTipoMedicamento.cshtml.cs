using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Grpc.Net.Client;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;

namespace WebApplication1.Pages.Administracion
{
    public class AltaTipoMedicamentoModel : PageModel
    {
        [BindProperty]
        public string tipo { get; set; }
        [BindProperty]
        public bool activo { get; set; }
        public void OnGet()
        {
        }

        public async Task OnPostAsync()
        {
            AppContext.SetSwitch("System.Net.Http.SocketsHttpHandler.Http2UnencryptedSupport", true);
            using var channel = GrpcChannel.ForAddress("http://localhost:9000");
            var med = new tipoMedicamento.tipoMedicamentoClient(channel);

            await med.addTipoMedicamentoAsync(new TipoMedicamentoDTO() { Nombre = tipo, Activo = activo });

        }
    }
}
