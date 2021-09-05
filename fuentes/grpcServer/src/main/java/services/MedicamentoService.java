package services;

import java.util.ArrayList;
import java.util.List;

import bo.TipoMedicamentoBO;
import grpc.MedicamentoGrpc.MedicamentoImplBase;
import grpc.MedicamentoOuterClass.Empty;
import grpc.MedicamentoOuterClass.GetByNombreRequest;
import grpc.MedicamentoOuterClass.ListMedicamentoDTO;
import grpc.MedicamentoOuterClass.MedicamentoDTO;
import grpc.MedicamentoOuterClass.MedicamentoResDTO;
import grpc.MedicamentoOuterClass.ServerResponse;
import grpc.TipoMedicamento.ListTipoMedicamentoDTO;
import grpc.User.ListUserDTO;
import io.grpc.stub.StreamObserver;
import model.TipoMedicamento;
import model.User;

public class MedicamentoService extends MedicamentoImplBase {

	@Override
	public void getAllMedicamento(Empty request, StreamObserver<ListMedicamentoDTO> responseObserver) {

	}

	@Override
	public void getMedicamentosByLetra(GetByNombreRequest request,
			StreamObserver<ListMedicamentoDTO> responseObserver) {
		// TODO Auto-generated method stub
		super.getMedicamentosByLetra(request, responseObserver);
	}

	@Override
	public void getByNameTipoMedicamento(GetByNombreRequest request,
			StreamObserver<MedicamentoResDTO> responseObserver) {
		// TODO Auto-generated method stub
		super.getByNameTipoMedicamento(request, responseObserver);
	}

	@Override
	public void addTipoMedicamento(MedicamentoDTO request, StreamObserver<ServerResponse> responseObserver) {
		// TODO Auto-generated method stub
		super.addTipoMedicamento(request, responseObserver);
	}

	@Override
	public void deleteTipoMedicamnto(MedicamentoDTO request, StreamObserver<ServerResponse> responseObserver) {
		// TODO Auto-generated method stub
		super.deleteTipoMedicamnto(request, responseObserver);
	}

}
