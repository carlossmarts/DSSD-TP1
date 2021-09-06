using System;
using System.Threading.Tasks;
using Grpc.Net.Client;

namespace GrpcClient
{
    class Program
    {
        static async Task Main(string[] args)
        {
            AppContext.SetSwitch("System.Net.Http.SocketsHttpHandler.Http2UnencryptedSupport", true);

            using var channel = GrpcChannel.ForAddress("http://localhost:9000");
            //var med = new Medicamento.MedicamentoClient(channel);
            var med = new Medicamento.MedicamentoClient(channel);
            var medd = new tipoMedicamento.tipoMedicamentoClient(channel);

            while (true)
            {
                var reply = await med.getAllMedicamentoAsync(new Empty { });
                var replytipo = await medd.getAllTipoMedicamentoAsync(new Empty { });

                Console.WriteLine($"---------------------------");
                Console.WriteLine($"Reply: {reply}");
                Console.WriteLine($"---------------------------");
                Console.WriteLine($"Reply: {replytipo}");
                Console.ReadLine();
            }
        }
    }
}
