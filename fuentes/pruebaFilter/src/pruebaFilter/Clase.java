package pruebaFilter;

import java.util.ArrayList;
import java.util.List;

public class Clase {
	private List<DiabetesGridMockDTO> lista = new ArrayList<>();
	
	 private void cargarLista(){
	        lista.add(new DiabetesGridMockDTO(1, 61235331003L, 44262253L, "CHARO ANSELMO", "ROLANDO", "COMPLETO", "05/03/2021", "2021", "semestre 1"));
	        lista.add(new DiabetesGridMockDTO(2, 61182667301L, 18805468L, "JOANA", "LOPEZ", "ENVIADO", "05/08/2021", "2021", "semestre 2"));
	        lista.add(new DiabetesGridMockDTO(3, 60925723302L, 17036384L, "CLAUDIA NORMA", "LOPEZ", "COMPLETO", "05/03/2021", "2021", "semestre 1"));
	        lista.add(new DiabetesGridMockDTO(4, 60925723302L, 17036384L, "CLAUDIA NORMA", "LOPEZ", "PENDIENTE", "05/07/2021", "2021", "semestre 2"));
	        lista.add(new DiabetesGridMockDTO(5, 61311285603L, 47974965L, "JOAQUIN EZEQUIEL", "GAROFALO", "COMPLETO", "05/02/2021", "2021", "semestre 1"));
	        lista.add(new DiabetesGridMockDTO(6, 61311285603L, 47974965L, "JOAQUIN EZEQUIEL", "GAROFALO", "PENDIENTE", "05/08/2021", "2021", "semestre 2"));
	        lista.add(new DiabetesGridMockDTO(7, 60370247201L, 13886939L, "ALEJANDRO", "STOESSEL", "ENVIADO", "03/09/2021", "2021", "semestre 1"));
	        lista.add(new DiabetesGridMockDTO(8, 61235331003L, 44262253L, "CHARO ANSELMO", "ROLANDO", "PENDIENTE", "02/09/2021", "2021", "semestre 2"));
	 }
	 
	 public List<DiabetesGridMockDTO> getFormularios (){
		 if (lista.isEmpty()) {
			 cargarLista();
		 }
		 return this.lista;
	 }

	 public List<DiabetesGridMockDTO> getFormulariosByNroSocio ( Long nroSocio ){
		 if (lista.isEmpty()) {
			 cargarLista();
		 }
		 
		 List<DiabetesGridMockDTO> retorno = new ArrayList<>();
		 
		 lista.stream().filter(form -> form.getNroSocio() == nroSocio).forEach(form -> retorno.add(form));
		 
		 return retorno;
	 }

	 public List<DiabetesGridMockDTO> getFormulariosByPeriodo( String anio, String semestre){
		 if (lista.isEmpty()) {
			 cargarLista();
		 }
		 
		 List<DiabetesGridMockDTO> retorno = new ArrayList<>();
		 
		 lista.stream().filter(form -> (form.getAnio() == anio && form.getSemestre() == semestre)).forEach(form -> retorno.add(form));
		 
		 return retorno;
	 }
	 
	 
	 
	 
}
