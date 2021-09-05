package test;

import java.util.ArrayList;
import java.util.List;

import bo.TipoMedicamentoBO;
import dao.TipoMedicamentoDAO;
import model.TipoMedicamento;

public class TestTipoMedicamentoBO {

	public static void main(String[] args) {
		
		TipoMedicamentoBO bo = TipoMedicamentoBO.getInstance();

//		System.out.println("test get all");
//		List<TipoMedicamento> tipos = new ArrayList<TipoMedicamento>();
//		try {
//			tipos = bo.getAllTipoMedicamento();
//			tipos.forEach(tipo -> System.out.println(tipo));
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}

//		System.out.println("----------------------------------");
//		System.out.println("Test getByNombre");
//		try {
//			System.out.println(bo.getByNombreTipoMedicamento("capsula"));
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}


//		System.out.println("----------------------------------");
//		System.out.println("Test add tipo ");
//		List<TipoMedicamento> tipos = new ArrayList<TipoMedicamento>();
//		try {			
//			bo.addTipoMedicamento("algo");
//			tipos = bo.getAllTipoMedicamento();
//			tipos.forEach(tipo -> System.out.println(tipo));
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
//		System.out.println("intento agregarlo de nuevo");
//		try {			
//			bo.addTipoMedicamento("algo");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}

//		System.out.println("----------------------------------");
//		System.out.println("Test baja tipo");
//		List<TipoMedicamento> tipos = new ArrayList<TipoMedicamento>();
//		try {
//			bo.deleteTipoMedicamento("algo");
//			tipos = bo.getAllTipoMedicamento();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		tipos.forEach(tipo -> System.out.println(tipo));
//		
//		System.out.println("agrego de nuevo el dado de baja");
//		try {			
//			bo.addTipoMedicamento("algo");
//			tipos = bo.getAllTipoMedicamento();
//			tipos.forEach(tipo -> System.out.println(tipo));
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		

	}

}
