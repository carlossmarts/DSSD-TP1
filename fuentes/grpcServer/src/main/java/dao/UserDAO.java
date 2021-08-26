package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.User;

public class UserDAO {
	
	private static UserDAO instancia;
	
	public static UserDAO getInstance() {
		if(instancia == null) {
			instancia = new UserDAO();
		}
		return instancia;
	}
	
	public List<User> getAllUser(){
		List <User> usuarios = new ArrayList<User>();
		
		EntityManager em = JPAUtil.getEMF().createEntityManager();
		
		String query = "SELECT u FROM User u WHERE u.id IS NOT NULL";
		TypedQuery<User> tq = em.createQuery(query, User.class);
		try {
			usuarios = tq.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}
		
		return usuarios;
	}
	
	public User getByIdUser(int id){
		User usuario = new User();
		
		EntityManager em = JPAUtil.getEMF().createEntityManager();
		
		String query = "SELECT u FROM User u WHERE u.id = :id";
		TypedQuery<User> tq = em.createQuery(query, User.class);
		tq.setParameter("id", id);
		try {
			usuario = tq.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}
		
		return usuario;
	}
}
