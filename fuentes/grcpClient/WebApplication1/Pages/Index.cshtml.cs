using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Grpc.Net.Client;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using Microsoft.Extensions.Logging;

namespace WebApplication1.Pages
{
    public class IndexModel : PageModel
    {
        private readonly ILogger<IndexModel> _logger;
        public ListMedicamentoDTO Message1 { get; set; }
        public ListTipoMedicamentoDTO Message2 { get; set; }

        public IndexModel(ILogger<IndexModel> logger)
        {
            _logger = logger;
        }

        public async Task OnGetAsync()
        {
            //AppContext.SetSwitch("System.Net.Http.SocketsHttpHandler.Http2UnencryptedSupport", true);
            //using var channel = GrpcChannel.ForAddress("http://localhost:9000");
            //var med = new Medicamento.MedicamentoClient(channel);
            //var tipoMed = new tipoMedicamento.tipoMedicamentoClient(channel);

            //var reply = await med.getAllMedicamentoAsync(new Empty { });

            //var reply2 = await tipoMed.getAllTipoMedicamentoAsync(new Empty { });

            //var tm = tipoMed.getByNameTipoMedicamentoAsync(new GetByNombreRequest() { Nombre = "colirio" });

            //await med.addMedicamentoAsync(new MedicamentoDTO() { Id = 66666, CodMedicamento = "RSH-54321-7", Nombre = "nombreMed", Droga = "alguna", Tipo = "colirio" });

            //this.Message1 = reply;
            //this.Message2 = reply2;
        }
    }
}
