package bo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import dao.JPAUtil;
import dao.TipoMedicamentoDAO;
import javassist.expr.NewArray;
import model.TipoMedicamento;

public class TipoMedicamentoBO {
	
	private static TipoMedicamentoBO instancia;

	public static TipoMedicamentoBO getInstance() {
		if(instancia == null) {
			instancia = new TipoMedicamentoBO();
		}
		return instancia;
	}

	public List<TipoMedicamento> getAllTipoMedicamento() throws Exception{
		try {
			return TipoMedicamentoDAO.getInstance().getAllTipoMedicamento();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new Exception("Error: No se pudo traer lista de tipos de medicamentos");
		}
	}
	
	public List<TipoMedicamento> getAllTipoMedicamentoActivo() throws Exception{
		try {
			return TipoMedicamentoDAO.getInstance().getAllTipoMedicamentoActivo();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new Exception("Error: No se pudo traer lista de tipos de medicamentos");
		}
	}
	
	

	public TipoMedicamento getByNombreTipoMedicamento(String nombreTipo) throws Exception{
		TipoMedicamento retorno = null;
		TipoMedicamento tm;
		try {
			tm = TipoMedicamentoDAO.getInstance().getByNombreTipoMedicamento(nombreTipo);
			if (tm.isActivo()) {
				retorno = tm;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new Exception("Error: No se pudo traer tipo de medicamento");
		}
		return retorno;
	}

	public boolean addTipoMedicamento(String nombre) throws Exception {
		TipoMedicamento tm = null;
		boolean retorno = false;
		try {
			tm = TipoMedicamentoDAO.getInstance().getByNombreTipoMedicamento(nombre);			
		} catch ( Exception e) {
			System.out.println("No hay tipo preexistente, se puede agregar"); 
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

	public void deleteTipoMedicamento (String nombre) throws Exception {
		try {
			TipoMedicamentoDAO.getInstance().deleteTipoMedicamento(nombre);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new Exception("Error: No se pudo borrar tipo de medicamentos");
		}
	}
}
