package bo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.NoResultException;

import dao.MedicamentoDAO;
import model.Medicamento;

public class MedicamentoBO {

	private static MedicamentoBO instancia;

	public static MedicamentoBO getInstance() {
		if(instancia == null) {
			instancia = new MedicamentoBO();
		}
		return instancia;
	}

	public List<Medicamento> getAllMedicamento() throws Exception{
		try {
			return MedicamentoDAO.getInstance().getAllMedicamentosActivos();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new Exception ("Error, no se pudo decuperar la lista de medicamentos");
		}
	}

	public Medicamento getByCodigoMedicamento(String codigo) throws Exception {
		Medicamento retorno = null;
		Medicamento tm = null;
		try {
			tm = MedicamentoDAO.getInstance().getByCodigoMedicamento(codigo);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new Exception ("Error, no se pudo recuperar medicamento con el código indicado");
		}
		if (tm.isActivo()) {
			retorno = tm;
		} else {
			throw new Exception ("El medicamento se encuenta dado de baja");
		}
		return retorno;
	}

	public List<Medicamento> getAllMedicamentoByLetra(String letra) throws Exception {
		List<Medicamento> retorno = new ArrayList<Medicamento>(); 
		letra +="%";
		try {
			List<Medicamento> lista =  MedicamentoDAO.getInstance().getAllMedicamentoByLetra(letra);
			retorno = lista.stream().filter(m->m.isActivo()).collect(Collectors.toList());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new Exception ("Error, no se pudo recuperar lista de medicamentos");
		}
		if(retorno.isEmpty()) {
			throw new Exception("No hay medicamentos que empiecen con esa letra");
		}
		return retorno;
	}

	public boolean addMedicamento(Medicamento m) throws Exception {
		Medicamento med = null;
		boolean retorno = false;
		try {
			med = MedicamentoDAO.getInstance().getByCodigoMedicamento(m.getcod_medicamento());			
		} catch ( Exception e) {
			System.out.println(e.getMessage());
		}

		if(med != null) {
			if(med.isActivo()) {
				throw new Exception("Error, ya existe Medicamento con ese código");
			} else {
				MedicamentoDAO.getInstance().sobreescribirMedicamento(m);;
			}
		} else {
			retorno = MedicamentoDAO.getInstance().addMedicamento(m);
		}

		return retorno;
	}

	public void deleteMedicamento (Medicamento m) throws Exception {
		try {
			MedicamentoDAO.getInstance().deleteMedicamento(m);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new Exception ("Error al eliminar Medicamento");
		};
	}
}
