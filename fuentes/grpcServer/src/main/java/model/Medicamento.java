package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="medicamento")

public class Medicamento {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id", unique = true)
	private int id;
	
	@Column(name="cod_medicamento", unique = true)
	private String cod_medicamento;
	
	@Column(name = "nombre", nullable = false )
	private String nombre;
	
	@Column(name = "droga", nullable = false )
	private String droga;
	
	@Column(name = "activo", nullable = false )
	private boolean activo;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipo_nombre_tipo")
	private TipoMedicamento tipo_medicamento;
	
	
	
	public Medicamento(int id, String cod_medicamento, String nombre, String droga, boolean activo,
			TipoMedicamento tipo_medicamento) {
		super();
		this.id = id;
		this.cod_medicamento = cod_medicamento;
		this.nombre = nombre;
		this.droga = droga;
		this.activo = activo;
		this.tipo_medicamento = tipo_medicamento;
	}


	public Medicamento() {}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getcod_medicamento() {
		return cod_medicamento;
	}
	public void setcod_medicamento(String cod_medicamento) {
		this.cod_medicamento = cod_medicamento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDroga() {
		return droga;
	}
	public void setDroga(String droga) {
		this.droga = droga;
	}
	public TipoMedicamento getTipo_medicamento() {
		return tipo_medicamento;
	}
	public void setTipo_medicamento(TipoMedicamento tipo_medicamento) {
		this.tipo_medicamento = tipo_medicamento;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	@Override
	public String toString() {
		return "Medicamento [id=" + id + ", cod_medicamento=" + cod_medicamento + ", nombre=" + nombre + ", droga="
				+ droga + ", activo=" + activo + ", tipo_medicamento=" + tipo_medicamento + "]";
	}
	
	
	
	
	
	
}
