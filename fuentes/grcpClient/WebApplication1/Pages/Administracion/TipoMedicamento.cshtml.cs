using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Grpc.Net.Client;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;

namespace WebApplication1.Pages.Administracion
{
    public class TipoMedicamentoModel : PageModel
    {
        public ListTipoMedicamentoDTO ListTipoMedicamento { get; set; }
        public async Task OnGetAsync(string nombre, bool activo)
        {
            AppContext.SetSwitch("System.Net.Http.SocketsHttpHandler.Http2UnencryptedSupport", true);
            using var channel = GrpcChannel.ForAddress("http://localhost:9000");
            var tipoMed = new tipoMedicamento.tipoMedicamentoClient(channel);
            if (nombre != null )
            {
                await tipoMed.deleteTipoMedicamntoAsync(new TipoMedicamentoDTO() { Nombre = nombre, Activo = activo });
            }

            this.ListTipoMedicamento = await tipoMed.getAllTipoMedicamentoAsync(new Empty { });

            RedirectToPage("../Index");
        }
    }
}
