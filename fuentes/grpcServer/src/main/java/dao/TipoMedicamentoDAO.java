package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import model.TipoMedicamento;

public class TipoMedicamentoDAO {
	private static TipoMedicamentoDAO instancia;

	public static TipoMedicamentoDAO getInstance() {
		if(instancia == null) {
			instancia = new TipoMedicamentoDAO();
		}
		return instancia;
	}

	public List<TipoMedicamento> getAllTipoMedicamento() throws Exception{
		List<TipoMedicamento> tipos = new ArrayList<TipoMedicamento>();

		EntityManager em = JPAUtil.getEMF().createEntityManager();

		String query = "SELECT tp FROM TipoMedicamento tp WHERE tp.nombre_tipo IS NOT NULL";
		TypedQuery<TipoMedicamento> tq = em.createQuery(query, TipoMedicamento.class);
		try {
			tipos = tq.getResultList();
		} catch (Exception e) {
			String msg = "Error de persistencia - Método GetAllTipoMedicamento: " + e.getMessage();
			System.out.println(msg);
			throw new Exception(msg);
		} finally {
			em.close();
		}

		return tipos;
	}

	public TipoMedicamento getByNombreTipoMedicamento(String nombreTipo) throws Exception{
		TipoMedicamento tipo = null;

		EntityManager em = JPAUtil.getEMF().createEntityManager();

		String query = "SELECT tp FROM TipoMedicamento tp WHERE tp.nombre_tipo= :nombreTipo";
		TypedQuery<TipoMedicamento> tq = em.createQuery(query, TipoMedicamento.class);
		tq.setParameter("nombreTipo", nombreTipo);
		try {
			tipo = tq.getSingleResult();
		} catch (Exception e) {
			String msg = "Error de persistencia - Método GetByNombreTipoMedicamento: " + e.getMessage();
			System.out.println(msg);
			throw new Exception(msg);
		} finally {
			em.close();
		}

		return tipo;
	}

	public boolean addTipoMedicamento(String nombre) throws Exception {

		boolean retorno = false;
		EntityManager em = JPAUtil.getEMF().createEntityManager();

		EntityTransaction et = null;

		try {
			et = em.getTransaction();
			et.begin();

			// Create and set values for new customer
			TipoMedicamento tipo = new TipoMedicamento();
			tipo.setNombre_tipo(nombre);
			tipo.setActivo(true);

			em.persist(tipo);
			et.commit();
			retorno = true;
		} catch (Exception e) {
			if (et != null) {
				et.rollback();
			}
			String msg = "Error de persistencia - Método addTipoMedicamento: " + e.getMessage();
			System.out.println(msg);
			throw new Exception(msg);
		} finally {
			em.close();
		}
		return retorno;
	}
	
	public void deleteTipoMedicamento (String nombre) throws Exception {
		try {
			modificarActivo(nombre, false);
		} catch (Exception e) {
			String msg = "Error de persistencia - Método deleteMedicamento ";
			System.out.println(msg);
			throw new Exception(msg);
		}
	}
	
	public void modificarActivo (String nombre, boolean activo) throws Exception {
		EntityManager em = JPAUtil.getEMF().createEntityManager();
        EntityTransaction et = null;
        
    	TipoMedicamento tipo = null;
 
        try {
            et = em.getTransaction();
            et.begin();
 
            tipo = em.find(TipoMedicamento.class, nombre);
            tipo.setActivo(activo);
 
            em.persist(tipo);
            et.commit();
        } catch (Exception e) {
            if (et != null) {
                et.rollback();
            }
			String msg = "Error de persistencia - Método modificarActivo: " + e.getMessage();
			System.out.println(msg);
			throw new Exception(msg);
        } finally {
            em.close();
        }
    }
}
