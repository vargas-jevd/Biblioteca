package ar.com.ada.backend12.ejercicio1.modelo;

import java.util.Objects;

public class Libro extends Publicacion {
	private int anio;
	
	public Libro(String codigo, String titulo) {
		super(codigo, titulo);
	}
	
	public Libro(String codigo, String titulo, int anio) {
		super(codigo, titulo);
		this.anio = anio;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(anio);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return anio == other.anio;
	}

	@Override
	public String toString() {
		return "Libro [anio=" + anio + ", codigo=" + codigo + ", titulo=" + titulo + ", prestado=" + prestado
				+ ", nombreDePrestatario=" + nombreDePrestatario + ", fechaDePrestamo=" + fechaDePrestamo + "]";
	}
}
