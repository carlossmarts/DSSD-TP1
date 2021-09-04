package pruebaFilter;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		Clase c = new Clase();
		
		c.getFormularios().stream().forEach(System.out::println);
		
		System.out.println("***********************************");
		
		c.getFormulariosByNroSocio(61235331003L).stream().forEach(form -> System.out.println(form));
		
		System.out.println("***********************************");
		
		c.getFormulariosByPeriodo("2021", "semestre 1").stream().forEach(form -> System.out.println(form));
		
		
		
		
	}

}
