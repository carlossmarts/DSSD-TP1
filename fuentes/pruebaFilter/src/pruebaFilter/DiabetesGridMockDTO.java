package pruebaFilter;

public class DiabetesGridMockDTO {
    private long id;
    private long nroSocio;
    private long dni;
    private String nombre;
    private String apellido;
    private String estado;
    private String fecha;
    private String anio;
    private String semestre;

    public DiabetesGridMockDTO(long id,
                               long nroSocio,
                               long dni,
                               String nombre,
                               String apellido,
                               String estado,
                               String fecha,
                               String anio,
                               String semestre) {
        this.id = id;
        this.nroSocio = nroSocio;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estado = estado;
        this.fecha = fecha;
        this.anio = anio;
        this.semestre = semestre;
    }

    public long getId() {return id;}

    public void setId(long id) { this.id = id; }

    public long getNroSocio() { return nroSocio; }

    public void setNroSocio(long nroSocio) { this.nroSocio = nroSocio; }

    public long getDni() { return dni; }

    public void setDni(long dni) { this.dni = dni; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }

    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getEstado() { return estado; }

    public void setEstado(String estado) { this.estado = estado; }

    public String getFecha() { return fecha; }

    public void setFecha(String fecha) { this.fecha = fecha; }

    public String getAnio() { return anio; }

    public void setAnio(String anio) { this.anio = anio; }

    public String getSemestre() { return semestre; }

    public void setSemestre(String semestre) { this.semestre = semestre; }

	@Override
	public String toString() {
		return "DiabetesGridMockDTO [id=" + id + ", nroSocio=" + nroSocio + ", dni=" + dni + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", estado=" + estado + ", fecha=" + fecha + ", anio=" + anio
				+ ", semestre=" + semestre + "]";
	}
    
    
}
