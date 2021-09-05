package test;

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
//		List<Medicamento> medicamentos = dao.getAllMedicamento();
//		medicamentos.forEach(m -> System.out.println(m));
		
//		System.out.println("----------------------------------------------");
//		System.out.println("test getByCodigo");
//		Medicamento m = dao.getByCodigoMedicamento("PFG-12345-8");
//		System.out.println(m);
		
		System.out.println("----------------------------------------------");
		System.out.println("test getByLetra");
		List<Medicamento> medicamentos = dao.getAllMedicamentoByLetra("a%");
		medicamentos.forEach(m -> System.out.println(m));

//		System.out.println("----------------------------------------------");
//		System.out.println("test addMedicamento");
//		TipoMedicamento tm = tmDao.getByNombreTipoMedicamento("colirio");
//		Medicamento m = new Medicamento(11111, "PAA-11111-5", "nombreMed", "alguna", true, tm);
//		dao.addMedicamento(m);
//		System.out.println(dao.getByCodigoMedicamento("PAA-11111-5"));
		
//		System.out.println("----------------------------------------------");
//		System.out.println("test deleteMedicamento");
//		Medicamento m = dao.getByCodigoMedicamento("PAA-11111-5");
//		System.out.println(dao.getByCodigoMedicamento("PAA-11111-5"));
//		dao.deleteMedicamento(m);
//		System.out.println(dao.getByCodigoMedicamento("PAA-11111-5"));
//		dao.modificarActivo(m, true);
	}

}
