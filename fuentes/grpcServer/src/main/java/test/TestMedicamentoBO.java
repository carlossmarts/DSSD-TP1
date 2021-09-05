package test;

import java.util.ArrayList;
import java.util.List;

import bo.MedicamentoBO;
import bo.TipoMedicamentoBO;
import dao.MedicamentoDAO;
import model.Medicamento;
import model.TipoMedicamento;

public class TestMedicamentoBO {

	public static void main(String[] args) {
		MedicamentoBO bo = MedicamentoBO.getInstance();
		MedicamentoDAO dao = MedicamentoDAO.getInstance();
		TipoMedicamentoBO tmBO = TipoMedicamentoBO.getInstance();

//		System.out.println("test get all");
//		List<Medicamento> medicamentos = new ArrayList<Medicamento>();
//		try {
//			medicamentos = bo.getAllMedicamento();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//
//		medicamentos.forEach(m -> System.out.println(m));

		
//		System.out.println("test get by codigo");
//		Medicamento m;
//		try {
//			m = bo.getByCodigoMedicamento("PAA-11111-5");	//activo
//			System.out.println(m);
//			m = bo.getByCodigoMedicamento("PFG-12345-8");	//no activo
//			System.out.println(m);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}	
		
//		System.out.println("Test get medicamentos por letra A");
//		List<Medicamento> medicamentos;
//		try {
//			medicamentos = bo.getAllMedicamentoByLetra("a");
//			medicamentos.forEach(m -> System.out.println(m));
//			System.out.println("Test get medicamentos por letra B");
//			medicamentos = bo.getAllMedicamentoByLetra("b");
//			medicamentos.forEach(m -> System.out.println(m));
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
//		System.out.println("test addMedicamento");
//		TipoMedicamento tm = tmBO.getByNombreTipoMedicamento("colirio");
//		Medicamento m = new Medicamento(11111, "PAA-11111-5", "nombreMed", "alguna", true, tm);
//		try {
//			bo.addMedicamento(m);			
//			System.out.println(bo.getByCodigoMedicamento("PAA-11111-5"));
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
//		System.out.println("test delete Medicamento");
//		Medicamento m = null;
//		try {
//			m = bo.getByCodigoMedicamento("PAA-11111-5");
//			bo.deleteMedicamento(m);
//			System.out.println(dao.getByCodigoMedicamento("PAA-11111-5"));
//			dao.modificarActivo(m, true); 
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		System.out.println(m);
		
	}

}
