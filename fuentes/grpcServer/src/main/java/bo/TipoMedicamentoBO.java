package bo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import dao.JPAUtil;
import dao.TipoMedicamentoDAO;
import model.TipoMedicamento;

public class TipoMedicamentoBO {
	
	private static TipoMedicamentoBO instancia;

	public static TipoMedicamentoBO getInstance() {
		if(instancia == null) {
			instancia = new TipoMedicamentoBO();
		}
		return instancia;
	}

	public List<TipoMedicamento> getAllTipoMedicamento(){
		return TipoMedicamentoDAO.getInstance().getAllTipoMedicamento();
	}

	public TipoMedicamento getByNombreTipoMedicamento(String nombreTipo){
		TipoMedicamento retorno = null;
		TipoMedicamento tm =  TipoMedicamentoDAO.getInstance().getByNombreTipoMedicamento(nombreTipo);
		if (tm.isActivo()) {
			retorno = tm;
		}
		return retorno;
	}

	public boolean addTipoMedicamento(String nombre) throws Exception {
		TipoMedicamento tm = null;
		boolean retorno = false;
		try {
			tm = TipoMedicamentoDAO.getInstance().getByNombreTipoMedicamento(nombre);			
		} catch ( NoResultException e) {
			System.out.println(e.getMessage());
		}

		if(tm != null) {
			if(tm.isActivo()) {
				throw new Exception("Error, ya existe tipo de medicamento");
			} else {
				TipoMedicamentoDAO.getInstance().modificarActivo(nombre, true);
			}
		} else {
			retorno = TipoMedicamentoDAO.getInstance().addTipoMedicamento(nombre);
		}

		return retorno;
	}

	public void deleteTipoMedicamento (String nombre) {
		TipoMedicamentoDAO.getInstance().deleteTipoMedicamento(nombre);
	}
}
