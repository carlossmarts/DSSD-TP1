package test;

import java.util.List;

import bo.TipoMedicamentoBO;
import dao.TipoMedicamentoDAO;
import model.TipoMedicamento;

public class TestTipoMedicamentoBO {

	public static void main(String[] args) {
		
		TipoMedicamentoBO bo = TipoMedicamentoBO.getInstance();

		System.out.println("test get all");
		List<TipoMedicamento> tipos = bo.getAllTipoMedicamento();

		tipos.forEach(tipo -> System.out.println(tipo));

		System.out.println("----------------------------------");
		System.out.println("Test getByNombre");
		System.out.println(bo.getByNombreTipoMedicamento("capsula"));


		System.out.println("----------------------------------");
		System.out.println("Test add tipo ");
		try {			
			bo.addTipoMedicamento("algo");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		tipos = bo.getAllTipoMedicamento();
		tipos.forEach(tipo -> System.out.println(tipo));
		
		System.out.println("intento agregarlo de nuevo");
		try {			
			bo.addTipoMedicamento("algo");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("----------------------------------");
		System.out.println("Test baja tipo");
		bo.deleteTipoMedicamento("algo");
		tipos = bo.getAllTipoMedicamento();
		tipos.forEach(tipo -> System.out.println(tipo));
		
		System.out.println("agrego de nuevo el dado de baja");
		try {			
			bo.addTipoMedicamento("algo");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		tipos = bo.getAllTipoMedicamento();
		tipos.forEach(tipo -> System.out.println(tipo));
		

	}

}
