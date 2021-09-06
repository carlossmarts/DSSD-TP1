package services;

import java.util.ArrayList;
import java.util.List;

import bo.MedicamentoBO;
import bo.TipoMedicamentoBO;
import grpc.MedicamentoGrpc.MedicamentoImplBase;
import grpc.MedicamentoOuterClass.Empty;
import grpc.MedicamentoOuterClass.GetByNombreRequest;
import grpc.MedicamentoOuterClass.ListMedicamentoDTO;
import grpc.MedicamentoOuterClass.MedicamentoDTO;
import grpc.MedicamentoOuterClass.MedicamentoResDTO;
import grpc.MedicamentoOuterClass.ServerResponse;
import grpc.TipoMedicamento.ListTipoMedicamentoDTO;
import grpc.TipoMedicamento.TipoMedicamentoDTO;
import grpc.TipoMedicamento.TipoMedicamentoResDTO;
import io.grpc.stub.StreamObserver;
import model.Medicamento;
import model.TipoMedicamento;

public class MedicamentoService extends MedicamentoImplBase {

	@Override
	public void getAllMedicamento(Empty request, StreamObserver<ListMedicamentoDTO> responseObserver) {
		ListMedicamentoDTO.Builder response = ListMedicamentoDTO.newBuilder();
		ServerResponse.Builder serverResponse = ServerResponse.newBuilder();

		System.out.println("Llamada al servicio geAllNameMedicamento");
		List<Medicamento> medicamentos = new ArrayList<Medicamento>();
		try {
			medicamentos = MedicamentoBO.getInstance().getAllMedicamento();
		} catch (Exception e) {
			serverResponse.setCode(500);
			serverResponse.setMsg(e.getMessage());
		}
		if(!medicamentos.isEmpty()) {			
			serverResponse.setCode(200);
			serverResponse.setMsg("OK");
		}

		for (Medicamento m : medicamentos) {
			response.addMedicamentos(mapMedicamentoToDTO(m));
		}
		response.setResponse(serverResponse);
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();

	}

	@Override
	public void getMedicamentosByLetra(GetByNombreRequest request,
			StreamObserver<ListMedicamentoDTO> responseObserver) {
		String letra = request.getNombre();
		System.out.println("Llamada al servicio getMedicamentosByLetra con letra: "+ letra);
		ListMedicamentoDTO.Builder response = ListMedicamentoDTO.newBuilder();
		ServerResponse.Builder serverResponse = ServerResponse.newBuilder();

		List<Medicamento> medicamentos = new ArrayList<Medicamento>();
		try {
			medicamentos = MedicamentoBO.getInstance().getAllMedicamentoByLetra(request.getNombre());
		} catch (Exception e) {
			serverResponse.setCode(500);
			serverResponse.setMsg(e.getMessage());
		}
		if(!medicamentos.isEmpty()) {			
			serverResponse.setCode(200);
			serverResponse.setMsg("OK");
		}

		for (Medicamento m : medicamentos) {
			response.addMedicamentos(mapMedicamentoToDTO(m));
		}
		response.setResponse(serverResponse);
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
		
	}

	
	

	@Override
	public void getByTipoMedicamento(GetByNombreRequest request, StreamObserver<ListMedicamentoDTO> responseObserver) {
		String tipo = request.getNombre();
		List<Medicamento> medicamentos = new ArrayList<Medicamento>();

		System.out.println("Llamada al servicio getByNameMedicamento con tipo: "+ tipo);
		
		ServerResponse.Builder serverResponse = ServerResponse.newBuilder();
		ListMedicamentoDTO.Builder response = ListMedicamentoDTO.newBuilder();

		try {
			medicamentos = MedicamentoBO.getInstance().getAllMedicamentoByTipo(tipo);
		} catch (Exception e) {
			serverResponse.setCode(500);
			serverResponse.setMsg(e.getMessage());
		}
		if(!medicamentos.isEmpty()) {			
			serverResponse.setCode(200);
			serverResponse.setMsg("OK");
		}
		
		for (Medicamento m : medicamentos) {
			response.addMedicamentos(mapMedicamentoToDTO(m));
		}
		response.setResponse(serverResponse);
		
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();

	}

	@Override
	public void addMedicamento(MedicamentoDTO request, StreamObserver<ServerResponse> responseObserver) {
		TipoMedicamento tipo = new TipoMedicamento(request.getNombre(), true);
		ServerResponse.Builder serverResponse = ServerResponse.newBuilder();
		Medicamento m = null;
		try {
			m = mapDTOToMedicamento(request);
		}	catch (Exception e) {
			serverResponse.setCode(500);
			serverResponse.setMsg(e.getMessage());
		}
		
		System.out.println("Llamada a método addMedicamento con objeto: " + m.toString());
		
		try {
			MedicamentoBO.getInstance().addMedicamento(m);
			serverResponse.setCode(200);
			serverResponse.setMsg("Medicamento agregado");
		} catch (Exception e) {
			serverResponse.setCode(500);
			serverResponse.setMsg(e.getMessage());
		}	
		
		responseObserver.onNext(serverResponse.build());
		responseObserver.onCompleted();
	}

	@Override
	public void deleteMedicamnto(MedicamentoDTO request, StreamObserver<ServerResponse> responseObserver) {
		Medicamento m = null;
		ServerResponse.Builder serverResponse = ServerResponse.newBuilder();
		try {
			m = mapDTOToMedicamento(request);
		}	catch (Exception e) {
			serverResponse.setCode(500);
			serverResponse.setMsg(e.getMessage());
		}
		System.out.println("Llamada al servicio deleteMedicamento con objeto "+ m);
		
		try {
			MedicamentoBO.getInstance().deleteMedicamento(m);
			serverResponse.setCode(200);
			serverResponse.setMsg("Medicamento eliminado");
		
		} catch (Exception e) {
			serverResponse.setCode(500);
			serverResponse.setMsg(e.getMessage());
		}	
		
		responseObserver.onNext(serverResponse.build());
		responseObserver.onCompleted();
	}

	public MedicamentoDTO.Builder mapMedicamentoToDTO (Medicamento m){
		MedicamentoDTO.Builder dto = MedicamentoDTO.newBuilder();
		dto.setId(m.getId());
		dto.setCodMedicamento(m.getcod_medicamento());
		dto.setNombre(m.getNombre());
		dto.setDroga(m.getDroga());
		dto.setTipo(m.getTipo_medicamento().getNombre_tipo());

		return dto;
	}
	
	public Medicamento mapDTOToMedicamento (MedicamentoDTO dto) throws Exception{		
		Medicamento m = new Medicamento();
		m.setId(dto.getId());
		m.setcod_medicamento(dto.getCodMedicamento());
		m.setNombre(dto.getNombre());
		m.setDroga(dto.getDroga());
		m.setActivo(true);
		m.setTipo_medicamento(TipoMedicamentoBO.getInstance().getByNombreTipoMedicamento(dto.getTipo()));
		
		return m;
	}
}
