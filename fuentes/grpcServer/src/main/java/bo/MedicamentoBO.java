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

	public List<Medicamento> getAllMedicamento(){
		return MedicamentoDAO.getInstance().getAllMedicamentosActivos();
	}

	public Medicamento getByCodigoMedicamento(String codigo) {
		Medicamento retorno = null;
		Medicamento tm =  MedicamentoDAO.getInstance().getByCodigoMedicamento(codigo);
		if (tm.isActivo()) {
			retorno = tm;
		}
		return retorno;
	}

	public List<Medicamento> getAllMedicamentoByLetra(String letra) {
		List<Medicamento> retorno = new ArrayList<Medicamento>(); 
		letra +="%";
		retorno =  MedicamentoDAO.getInstance().getAllMedicamentoByLetra(letra);
		return retorno.stream().filter(m->m.isActivo()).collect(Collectors.toList());
	}

	public boolean addMedicamento(Medicamento m) throws Exception {
		Medicamento med = null;
		boolean retorno = false;
		try {
			med = MedicamentoDAO.getInstance().getByCodigoMedicamento(m.getcod_medicamento());			
		} catch ( NoResultException e) {
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

	public void deleteMedicamento (Medicamento m) {
		MedicamentoDAO.getInstance().deleteMedicamento(m);;
	}
}
