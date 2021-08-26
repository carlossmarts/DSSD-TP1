package test;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import services.UserService;

public class GRPCServer {
	public static void main(String[] args) throws IOException, InterruptedException{
		
		System.out.println("Iniciando servidor grpc");
		
		Server server = ServerBuilder
						.forPort(9090).addService(new UserService()).build();
		server.start();
		
		System.out.println("Servidor escuchando en puerto " + server.getPort());
		
		server.awaitTermination();
	}
}
