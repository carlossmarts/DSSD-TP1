using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Grpc.Net.Client;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;

namespace WebApplication1.Pages.Administracion
{
    public class MedicamentoModel : PageModel
    {

        public ListMedicamentoDTO ListMedicamento { get; set; }
        public async Task OnGetAsync()
        {
            AppContext.SetSwitch("System.Net.Http.SocketsHttpHandler.Http2UnencryptedSupport", true);
            using var channel = GrpcChannel.ForAddress("http://localhost:9000");
            var med = new Medicamento.MedicamentoClient(channel);

            this.ListMedicamento = await med.getAllMedicamentoAsync(new Empty { });

        }
    }
}
