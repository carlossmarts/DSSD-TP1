package services;

import java.util.ArrayList;
import java.util.List;

import com.sun.istack.NotNull;

import bo.TipoMedicamentoBO;
import dao.TipoMedicamentoDAO;
import grpc.TipoMedicamento.Empty;
import grpc.TipoMedicamento.GetByNombreRequest;
import grpc.TipoMedicamento.ListTipoMedicamentoDTO;
import grpc.TipoMedicamento.ServerResponse;
import grpc.TipoMedicamento.TipoMedicamentoDTO;
import grpc.TipoMedicamento.TipoMedicamentoResDTO;
import grpc.User.UserDTO;
import grpc.tipoMedicamentoGrpc.tipoMedicamentoImplBase;
import io.grpc.stub.StreamObserver;
import model.TipoMedicamento;
import model.User;

public class TipoMedicamentoService extends tipoMedicamentoImplBase{

	@Override
	public void getAllTipoMedicamento(Empty request, StreamObserver<ListTipoMedicamentoDTO> responseObserver) {
		ListTipoMedicamentoDTO.Builder response = ListTipoMedicamentoDTO.newBuilder();
		ServerResponse.Builder serverResponse = ServerResponse.newBuilder();

		List<TipoMedicamento> tipos = new ArrayList<TipoMedicamento>();
		try {
			tipos = TipoMedicamentoBO.getInstance().getAllTipoMedicamento();		//este va para testing
//			tipos = TipoMedicamentoBO.getInstance().getAllTipoMedicamentoActivo(); //este va para cuando se llama desde el frontend
		} catch (Exception e) {
			serverResponse.setCode(500);
			serverResponse.setMsg(e.getMessage());
		}
		if(!tipos.isEmpty()) {			
			serverResponse.setCode(200);
			serverResponse.setMsg("OK");
		}

		for (TipoMedicamento tipo :tipos) {
			response.addTipos(mapTipoMedicamentoToDTO(tipo));
		}
		response.setResponse(serverResponse);
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

	@Override
	public void getByNameTipoMedicamento(GetByNombreRequest request,
			StreamObserver<TipoMedicamentoResDTO> responseObserver) {
		String nombre = request.getNombre();

		System.out.println("Llamada al servicio getByNameTipoMedicamento con nombre: "+ nombre);
		TipoMedicamento tipo = null;
		ServerResponse.Builder serverResponse = ServerResponse.newBuilder();
		TipoMedicamentoResDTO.Builder response = TipoMedicamentoResDTO.newBuilder();

		try {
			tipo = TipoMedicamentoBO.getInstance().getByNombreTipoMedicamento(nombre);
		} catch (Exception e) {
			serverResponse.setCode(500);
			serverResponse.setMsg(e.getMessage());
		}
		if(tipo != null) {
			response.setNombre(tipo.getNombre_tipo());
			response.setActivo(tipo.isActivo());
			serverResponse.setCode(200);
			serverResponse.setMsg("OK");
		}
		response.setResponse(serverResponse);

		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

	@Override
	public void addTipoMedicamento(TipoMedicamentoDTO request, StreamObserver<ServerResponse> responseObserver) {
		TipoMedicamento tipo = new TipoMedicamento(request.getNombre(), true);

		System.out.println("Llamada al servicio addTipoMedicamento con objeto "+ tipo);
		ServerResponse.Builder serverResponse = ServerResponse.newBuilder();
		
		try {
			TipoMedicamentoBO.getInstance().addTipoMedicamento(tipo.getNombre_tipo());
			serverResponse.setCode(200);
			serverResponse.setMsg("Agregado tipo de medicamento");
		
		} catch (Exception e) {
			serverResponse.setCode(500);
			serverResponse.setMsg(e.getMessage());
		}	
		
		responseObserver.onNext(serverResponse.build());
		responseObserver.onCompleted();
	}

	@Override
	public void deleteTipoMedicamnto(TipoMedicamentoDTO request, StreamObserver<ServerResponse> responseObserver) {
		TipoMedicamento tipo = new TipoMedicamento(request.getNombre(), request.getActivo());

		System.out.println("Llamada al servicio deleteTipoMedicamento con objeto "+ tipo);
		ServerResponse.Builder serverResponse = ServerResponse.newBuilder();
		
		try {
			TipoMedicamentoBO.getInstance().deleteTipoMedicamento(tipo.getNombre_tipo());
			serverResponse.setCode(200);
			serverResponse.setMsg("Eliminado tipo de medicamento");
		
		} catch (Exception e) {
			serverResponse.setCode(500);
			serverResponse.setMsg(e.getMessage());
		}	
		
		responseObserver.onNext(serverResponse.build());
		responseObserver.onCompleted();
	}

	public TipoMedicamentoDTO.Builder mapTipoMedicamentoToDTO (TipoMedicamento tm){
		TipoMedicamentoDTO.Builder dto = TipoMedicamentoDTO.newBuilder();
		dto.setNombre(tm.getNombre_tipo());
		dto.setActivo(tm.isActivo());

		return dto;
	}

}
