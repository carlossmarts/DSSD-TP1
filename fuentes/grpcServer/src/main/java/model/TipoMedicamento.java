package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipo")
public class TipoMedicamento {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="nombre_tipo", unique = true)
	private String nombre_tipo;
	
	@Column(name = "activo", nullable = false )
	private boolean activo;
	
	
	
	public TipoMedicamento(String nombre_tipo, boolean activo) {
		super();
		this.nombre_tipo = nombre_tipo;
		this.activo = activo;
	}
	
	public TipoMedicamento() {}

	public String getNombre_tipo() {
		return nombre_tipo;
	}
	public void setNombre_tipo(String nombre_tipo) {
		this.nombre_tipo = nombre_tipo;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "TipoMedicamento [nombre_tipo=" + nombre_tipo + ", activo=" + activo + "]";
	} 
	
	
	
	
}
