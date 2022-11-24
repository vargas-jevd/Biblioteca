package ar.com.ada.backend12.ejercicio1.modelo;

import java.util.Objects;

public class Cubiculo implements Prestable {
	
	private int numero;
	private Luz tipoDeLuz = Luz.ARTIFICIAL;
	private boolean computador = false;
	
	//Informacion de prestamo
	protected boolean prestado = false;
	protected String nombreDePrestatario = null;
	protected String telefonoDePrestatario = null;
	protected String fechaDePrestamo = null;
	
	public Cubiculo(int numero) {
		super();
		this.numero = numero;
	}
	
	public Cubiculo(int numero, Luz tipoDeLuz) {
		super();
		this.numero = numero;
		this.tipoDeLuz = tipoDeLuz;
	}
	
	public Cubiculo(int numero, boolean computador) {
		super();
		this.numero = numero;
		this.computador = computador;
	}
	
	public Cubiculo(int numero, Luz tipoDeLuz, boolean computador) {
		super();
		this.numero = numero;
		this.tipoDeLuz = tipoDeLuz;
		this.computador = computador;
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

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Luz getTipoDeLuz() {
		return tipoDeLuz;
	}

	public void setTipoDeLuz(Luz tipoDeLuz) {
		this.tipoDeLuz = tipoDeLuz;
	}

	public boolean isComputador() {
		return computador;
	}

	public void setComputador(boolean computador) {
		this.computador = computador;
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
		return Objects.hash(computador, fechaDePrestamo, nombreDePrestatario, numero, prestado, telefonoDePrestatario,
				tipoDeLuz);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cubiculo other = (Cubiculo) obj;
		return computador == other.computador && Objects.equals(fechaDePrestamo, other.fechaDePrestamo)
				&& Objects.equals(nombreDePrestatario, other.nombreDePrestatario) && numero == other.numero
				&& prestado == other.prestado && Objects.equals(telefonoDePrestatario, other.telefonoDePrestatario)
				&& tipoDeLuz == other.tipoDeLuz;
	}

	@Override
	public String toString() {
		return "Cubiculo [numero=" + numero + ", tipoDeLuz=" + tipoDeLuz + ", computador=" + computador + ", prestado="
				+ prestado + ", nombreDePrestatario=" + nombreDePrestatario + ", telefonoDePrestatario="
				+ telefonoDePrestatario + ", fechaDePrestamo=" + fechaDePrestamo + "]";
	}
}
