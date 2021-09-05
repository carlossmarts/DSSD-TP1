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
	
	public List<Medicamento> getAllMedicamentosActivos(){
		List<Medicamento> medicamentos = new ArrayList<Medicamento>();

		EntityManager em = JPAUtil.getEMF().createEntityManager();

		String query = "SELECT m FROM Medicamento m join fetch m.tipo_medicamento WHERE m.activo = :activo";
		TypedQuery<Medicamento> tq = em.createQuery(query, Medicamento.class);
		tq.setParameter("activo", true);
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

		Medicamento med = null;

		try {
			et = em.getTransaction();
			et.begin();

			med = em.find(Medicamento.class, m.getId());
			med.setActivo(activo);

			em.persist(med);
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
	
	public void sobreescribirMedicamento (Medicamento m) {
		EntityManager em = JPAUtil.getEMF().createEntityManager();
		EntityTransaction et = null;
		
		Medicamento med = null;
		
		try {
			et = em.getTransaction();
			et.begin();
			
			med = em.find(Medicamento.class, m.getId());
			med.setDroga(m.getDroga());
			med.setNombre(m.getNombre());
			med.setTipo_medicamento(m.getTipo_medicamento());
			med.setActivo(true);
			
			em.persist(med);
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
