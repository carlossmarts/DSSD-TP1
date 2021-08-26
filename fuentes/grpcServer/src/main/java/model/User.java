package model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class User {
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id", unique = true)
	private int id;
	
	@Column(name = "nombre", nullable = false )
	private String nombre;
	
	@Column(name = "edad", nullable = false)
	private int edad;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
	
	
	
	

}
