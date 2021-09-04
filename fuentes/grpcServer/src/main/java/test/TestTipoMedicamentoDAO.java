package test;

import java.util.List;

import dao.TipoMedicamentoDAO;
import model.TipoMedicamento;

public class TestTipoMedicamentoDAO {
	public static void main(String[] args) {
		TipoMedicamentoDAO dao = new TipoMedicamentoDAO();

		System.out.println("test get all");
		List<TipoMedicamento> tipos = dao.getAllTipoMedicamento();

		tipos.forEach(tipo -> System.out.println(tipo));

		System.out.println("----------------------------------");
		System.out.println("Test getByNombre");
		System.out.println(dao.getByNombreTipoMedicamento("capsula"));


		System.out.println("----------------------------------");
		System.out.println("Test add tipo");
//		dao.addTipoMedicamento("jarabe");
//		tipos = dao.getAllTipoMedicamento();
//		tipos.forEach(tipo -> System.out.println(tipo));

		System.out.println("----------------------------------");
		System.out.println("Test baja tipo");
		dao.deleteTipoMedicamento("jarabe");
		tipos = dao.getAllTipoMedicamento();
		tipos.forEach(tipo -> System.out.println(tipo));

	}

}
