package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import model.TipoMedicamento;
import model.User;

public class TipoMedicamentoDAO {
	private static UserDAO instancia;

	public static UserDAO getInstance() {
		if(instancia == null) {
			instancia = new UserDAO();
		}
		return instancia;
	}

	public List<TipoMedicamento> getAllTipoMedicamento(){
		List<TipoMedicamento> tipos = new ArrayList<TipoMedicamento>();

		EntityManager em = JPAUtil.getEMF().createEntityManager();

		String query = "SELECT tp FROM TipoMedicamento tp WHERE tp.nombre_tipo IS NOT NULL";
		TypedQuery<TipoMedicamento> tq = em.createQuery(query, TipoMedicamento.class);
		try {
			tipos = tq.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}

		return tipos;
	}

	public TipoMedicamento getByNombreTipoMedicamento(String nombreTipo){
		TipoMedicamento tipo = new TipoMedicamento();

		EntityManager em = JPAUtil.getEMF().createEntityManager();

		String query = "SELECT tp FROM TipoMedicamento tp WHERE tp.nombre_tipo= :nombreTipo";
		TypedQuery<TipoMedicamento> tq = em.createQuery(query, TipoMedicamento.class);
		tq.setParameter("nombreTipo", nombreTipo);
		try {
			tipo = tq.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}

		return tipo;
	}

	public boolean addTipoMedicamento(String nombre) {

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
		} catch (Exception ex) {
			if (et != null) {
				et.rollback();
			}
			ex.printStackTrace();
		} finally {
			em.close();
		}
		return retorno;
	}
	
	public void deleteTipoMedicamento (String nombre) {
		modificarActivo(nombre, false);
	}
	
	public void modificarActivo (String nombre, boolean activo) {
		EntityManager em = JPAUtil.getEMF().createEntityManager();
        EntityTransaction et = null;
        
    	TipoMedicamento tipo = null;
 
        try {
            et = em.getTransaction();
            et.begin();
 
            tipo = em.find(TipoMedicamento.class, nombre);
            tipo.setActivo(false);
 
            em.persist(tipo);
            et.commit();
        } catch (Exception ex) {
            if (et != null) {
                et.rollback();
            }
            ex.printStackTrace();
        } finally {
            em.close();
        }
    }
}
