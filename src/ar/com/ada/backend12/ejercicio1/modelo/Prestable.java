package ar.com.ada.backend12.ejercicio1.modelo;

public interface Prestable {
	public abstract void prestar(String nombre, String telefono, String fecha);
	public abstract void devolver();
}
