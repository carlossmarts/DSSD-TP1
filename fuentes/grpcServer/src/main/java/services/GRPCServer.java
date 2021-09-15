package services;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GRPCServer {
	public static void main(String[] args) throws IOException, InterruptedException{
		
		System.out.println("Iniciando servidor grpc");
		
		Server server = ServerBuilder.forPort(9000)
						.addService(new TipoMedicamentoService())
						.addService(new MedicamentoService())
						.build();
		server.start();
		
		System.out.println("Servidor escuchando en puerto " + server.getPort());
		
		server.awaitTermination();
	}
}
