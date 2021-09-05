package services;

import java.util.List;

import dao.UserDAO;
import grpc.User.Empty;
import grpc.User.GetUserRequest;
import grpc.User.ListUserDTO;
import grpc.User.UserDTO;
import grpc.userGrpc.userImplBase;
import io.grpc.stub.StreamObserver;
import model.User;

public class UserService extends userImplBase{

	private UserDAO dao = UserDAO.getInstance();
	@Override
	public void getUser(GetUserRequest request, StreamObserver<UserDTO> responseObserver) {
		System.out.println("Llamada a método getUser con id" + request.getId());
		User u = dao.getByIdUser(Integer.parseInt(request.getId()));

		UserDTO.Builder response = mapUserToDTO(u);
		
	}

	@Override
	public void getAllUser(Empty request, StreamObserver<ListUserDTO> responseObserver) {
		ListUserDTO.Builder response = ListUserDTO.newBuilder();
		System.out.println("Llamada a método getAllUser");
		List<User> us = dao.getAllUser();
		for (User u : us) {
			response.addList(mapUserToDTO(u));
		}
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}
	
	public UserDTO.Builder mapUserToDTO(User u){
		UserDTO.Builder dto = UserDTO.newBuilder();
		dto.setId(u.getId());
		dto.setNombre(u.getNombre());
		dto.setEdad(u.getEdad());
		
		return dto;
	}
	



}
