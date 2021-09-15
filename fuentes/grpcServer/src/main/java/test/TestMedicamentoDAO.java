package test;

import java.util.ArrayList;
import java.util.List;

import dao.MedicamentoDAO;
import dao.TipoMedicamentoDAO;
import model.Medicamento;
import model.TipoMedicamento;

public class TestMedicamentoDAO {

	public static void main(String[] args) {
		MedicamentoDAO dao = MedicamentoDAO.getInstance();
		TipoMedicamentoDAO tmDao = TipoMedicamentoDAO.getInstance();
		
//		System.out.println("TestGetAll");
//		List<Medicamento> medicamentos = new ArrayList<Medicamento>();
//		try {
//			medicamentos = dao.getAllMedicamento();
//		} catch (Exception e) {
//			System.err.println(e.getMessage());
//		}
//		medicamentos.forEach(m -> System.out.println(m));
		
//		System.out.println("----------------------------------------------");
//		System.out.println("test getByCodigo");
//		Medicamento m = null;
//		try {
//			m = dao.getByCodigoMedicamento("PFG-12345-8");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		System.out.println(m);
		
//		System.out.println("----------------------------------------------");
//		System.out.println("test getByLetra");
//		List<Medicamento> medicamentos = new ArrayList<Medicamento>();
//		try {
//			medicamentos = dao.getAllMedicamentoByLetra("a%");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		medicamentos.forEach(m -> System.out.println(m));

//		System.out.println("----------------------------------------------");
//		System.out.println("test addMedicamento");
//		TipoMedicamento tm = tmDao.getByNombreTipoMedicamento("colirio");
//		Medicamento m = new Medicamento(11111, "PAA-11111-5", "nombreMed", "alguna", true, tm);
//		try {
//			dao.addMedicamento(m);
//			System.out.println(dao.getByCodigoMedicamento("PAA-11111-5"));
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
//		System.out.println("----------------------------------------------");
//		System.out.println("test deleteMedicamento");
//		Medicamento m;
//		try {
//			m = dao.getByCodigoMedicamento("PAA-11111-5");
//			System.out.println(dao.getByCodigoMedicamento("PAA-11111-5"));
//			dao.deleteMedicamento(m);
//			System.out.println(dao.getByCodigoMedicamento("PAA-11111-5"));
//			dao.modificarActivo(m, true);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
	}

}
