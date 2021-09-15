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
    public class MedicamentoModel : PageModel
    {
        [BindProperty]
        public string Tipo { get; set; }

        [BindProperty]
        public string Letra { get; set; }

        public SelectList TagOptions { get; set; }

        public ListMedicamentoDTO ListMedicamento { get; set; }
        public async Task OnGetAsync()
        {
            AppContext.SetSwitch("System.Net.Http.SocketsHttpHandler.Http2UnencryptedSupport", true);
            using var channel = GrpcChannel.ForAddress("http://localhost:9000");
            var med = new Medicamento.MedicamentoClient(channel);
            var tipoMed = new tipoMedicamento.tipoMedicamentoClient(channel);
            this.ListMedicamento = await med.getAllMedicamentoAsync(new Empty { });
            var tipos = await tipoMed.getAllTipoMedicamentoAsync(new Empty() { });
            this.TagOptions = new SelectList(tipos.Tipos, "Nombre", "Nombre", this.Tipo);

        }
        public async Task OnPostAsync()
        {
            AppContext.SetSwitch("System.Net.Http.SocketsHttpHandler.Http2UnencryptedSupport", true);
            using var channel = GrpcChannel.ForAddress("http://localhost:9000");
            var med = new Medicamento.MedicamentoClient(channel);
            var tipoMed = new tipoMedicamento.tipoMedicamentoClient(channel);

            this.ListMedicamento = await med.getByTipoMedicamentoAsync(new GetByNombreRequest() { Nombre = Tipo });
            var tipos = await tipoMed.getAllTipoMedicamentoAsync(new Empty() { });

            this.ListMedicamento = await med.getMedicamentosByLetraAsync(new GetByNombreRequest() { Nombre = Letra });

            this.TagOptions = new SelectList(tipos.Tipos, "Nombre", "Nombre", this.Tipo);
        }
    }
}
