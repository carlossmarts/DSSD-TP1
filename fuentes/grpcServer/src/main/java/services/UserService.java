package services;

import grpc.User.GetUserRequest;
import grpc.User.UserDTO;
import grpc.userGrpc.userImplBase;
import io.grpc.stub.StreamObserver;

public class UserService extends userImplBase{

	@Override
	public void getUser(GetUserRequest request, StreamObserver<UserDTO> responseObserver) {
		UserDTO.Builder response = UserDTO.newBuilder();
		
		System.out.println("Llamada al servicio get user con id " + request.getId());
		
		response.setNombre("Carlos");
		response.setEdad(30);
		
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

}
