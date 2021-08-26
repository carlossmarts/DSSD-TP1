package test;

import java.util.List;

import dao.UserDAO;
import model.User;

public class TestUserDAO {

	public static void main(String[] args) {
		UserDAO dao = new UserDAO();
		
		List<User> usuarios = dao.getAllUser();
		
		usuarios.forEach(user -> System.out.println(user));

	}

}
