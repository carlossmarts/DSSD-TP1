package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import model.Medicamento;

public class MedicamentoDAO {
	private static MedicamentoDAO instancia;

	public static MedicamentoDAO getInstance() {
		if(instancia == null) {
			instancia = new MedicamentoDAO();
		}
		return instancia;
	}

	public List<Medicamento> getAllMedicamento(){
		List<Medicamento> medicamentos = new ArrayList<Medicamento>();

		EntityManager em = JPAUtil.getEMF().createEntityManager();

		String query = "SELECT m FROM Medicamento m join fetch m.tipo_medicamento WHERE m.id IS NOT NULL";
		TypedQuery<Medicamento> tq = em.createQuery(query, Medicamento.class);
		try {
			medicamentos = tq.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}

		return medicamentos;
	}
	
	public List<Medicamento> getAllMedicamentoByLetra(String letra){
		List<Medicamento> medicamentos = new ArrayList<Medicamento>();

		EntityManager em = JPAUtil.getEMF().createEntityManager();

		String query = "SELECT m FROM Medicamento m join fetch m.tipo_medicamento WHERE m.nombre like :letra";
		TypedQuery<Medicamento> tq = em.createQuery(query, Medicamento.class);
		tq.setParameter("letra", letra);
		try {
			medicamentos = tq.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}

		return medicamentos;
	}
	
	

	public Medicamento getByCodigoMedicamento(String codigo){
		Medicamento tipo = null;

		EntityManager em = JPAUtil.getEMF().createEntityManager();

		String query = "SELECT m FROM Medicamento m join fetch m.tipo_medicamento WHERE m.cod_medicamento = :codigo";
		TypedQuery<Medicamento> tq = em.createQuery(query, Medicamento.class);
		tq.setParameter("codigo", codigo);
		try {
			tipo = tq.getSingleResult();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			em.close();
		}

		return tipo;
	}

	public boolean addMedicamento(Medicamento m) {

		boolean retorno = false;
		EntityManager em = JPAUtil.getEMF().createEntityManager();

		EntityTransaction et = null;

		try {
			et = em.getTransaction();
			et.begin();
			em.persist(m);
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

	public void deleteMedicamento (Medicamento m) {
		modificarActivo(m, false);
	}

	public void modificarActivo (Medicamento m, boolean activo) {
		EntityManager em = JPAUtil.getEMF().createEntityManager();
		EntityTransaction et = null;

		Medicamento tipo = null;

		try {
			et = em.getTransaction();
			et.begin();

			tipo = em.find(Medicamento.class, m.getId());
			tipo.setActivo(activo);

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
