package ar.com.ada.backend12.ejercicio1.modelo;

import java.util.Objects;

public class Revista extends Publicacion {
	private int volumen;
	private int numero;
	
	public Revista(String codigo, String titulo) {
		super(codigo, titulo);
	}
	
	public Revista(String codigo, String titulo, int volumen, int numero) {
		super(codigo, titulo);
		this.volumen = volumen;
		this.numero = numero;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(numero, volumen);
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
		Revista other = (Revista) obj;
		return numero == other.numero && volumen == other.volumen;
	}

	@Override
	public String toString() {
		return "Revista [volumen=" + volumen + ", numero=" + numero + ", codigo=" + codigo + ", titulo=" + titulo
				+ ", prestado=" + prestado + ", nombreDePrestatario=" + nombreDePrestatario + ", telefonoDePrestatario="
				+ telefonoDePrestatario + ", fechaDePrestamo=" + fechaDePrestamo + "]";
	}
}
