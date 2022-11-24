package ar.com.ada.backend12.ejercicio1.modelo;

import java.util.Objects;

public abstract class Publicacion implements Prestable {
	protected String codigo;
	protected String titulo;
	
	//Informacion de prestamo
	protected boolean prestado = false;
	protected String nombreDePrestatario = null;
	protected String telefonoDePrestatario = null;
	protected String fechaDePrestamo = null;
	
	public Publicacion(String codigo, String titulo) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
	}
	
	public void prestar(String nombreDePrestatario, String telefonoDePrestatario, String fechaDePrestamo) {
		this.prestado = true;
		this.nombreDePrestatario = nombreDePrestatario;
		this.telefonoDePrestatario = telefonoDePrestatario;
		this.fechaDePrestamo = fechaDePrestamo;
	}
	
	public void devolver() {
		this.prestado = false;
		this.nombreDePrestatario = null;
		this.telefonoDePrestatario = null;
		this.fechaDePrestamo = null;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	public String getNombreDePrestatario() {
		return nombreDePrestatario;
	}

	public void setNombreDePrestatario(String nombreDePrestatario) {
		this.nombreDePrestatario = nombreDePrestatario;
	}
	
	public String getTelefonoDePrestatario() {
		return telefonoDePrestatario;
	}

	public void setTelefonoDePrestatario(String telefonoDePrestatario) {
		this.telefonoDePrestatario = telefonoDePrestatario;
	}

	public String getFechaDePrestamo() {
		return fechaDePrestamo;
	}

	public void setFechaDePrestamo(String fechaDePrestamo) {
		this.fechaDePrestamo = fechaDePrestamo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, fechaDePrestamo, nombreDePrestatario, prestado, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publicacion other = (Publicacion) obj;
		return Objects.equals(codigo, other.codigo) && Objects.equals(fechaDePrestamo, other.fechaDePrestamo)
				&& Objects.equals(nombreDePrestatario, other.nombreDePrestatario) && prestado == other.prestado
				&& Objects.equals(titulo, other.titulo);
	}
}
