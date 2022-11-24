package ar.com.ada.backend12.ejercicio1.modelo;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Biblioteca {
	private Map<String, Libro> libros;
	private Map<String, Revista> revistas;
	private Map<Integer, Cubiculo> cubiculos;
	
	public Biblioteca() {
		super();
		
		libros = new LinkedHashMap<>();
		revistas = new LinkedHashMap<>();
		cubiculos = new TreeMap<Integer, Cubiculo>();
	}
	
	public void addLibro(Libro l) {
		libros.put(l.getCodigo(), l);
	}
	
	public void addRevista(Revista r) {
		revistas.put(r.getCodigo(), r);
	}
	
	public void addCubiculo(Cubiculo c) {
		cubiculos.put(c.getNumero(), c);
	}
	
	public void prestarLibro(String codigo, String nombre, String telefono, String fecha) {
		Libro l = libros.get(codigo);
		l.prestar(nombre, telefono, fecha);
	}
	
	public void devolverLibro(String codigo) {
		Libro l = libros.get(codigo);
		l.devolver();
	}
	
	public void prestarRevista(String codigo, String nombre, String telefono, String fecha) {
		Revista r = revistas.get(codigo);
		r.prestar(nombre, telefono, fecha);
	}
	
	public void devolverRevista(String codigo) {
		Revista r = revistas.get(codigo);
		r.devolver();
	}
	
	public void prestarCubiculo(int numero, String nombre, String telefono, String fecha) {
		Cubiculo c = cubiculos.get(numero);
		c.prestar(nombre, telefono, fecha);
	}
	
	public void devolverCubiculo(int numero) {
		Cubiculo c = cubiculos.get(numero);
		c.devolver();
	}
	
	public Libro obtenerLibro(String codigo) {
		return libros.get(codigo);
	}
	
	public String obtenerInfoLibro(String codigo) {
		return libros.get(codigo).toString();
	}
	
	public String obtenerInfoRevista(String codigo) {
		return revistas.get(codigo).toString();
	}
	
	public String obtenerInfoCubiculo(int numero) {
		return cubiculos.get(numero).toString();
	}
	
	public void listarLibros() {
		Iterator<String> i = libros.keySet().iterator();
		
		while(i.hasNext()) {
			System.out.println(libros.get(i.next()).toString());
		}
	}
	
	public void listarRevistas() {
		Iterator<String> i = revistas.keySet().iterator();
		
		while(i.hasNext()) {
			System.out.println(revistas.get(i.next()).toString());
		}
	}
	
	public void listarCubiculos() {
		Iterator<Integer> i = cubiculos.keySet().iterator();
		
		while(i.hasNext()) {
			System.out.println(cubiculos.get(i.next()).toString());
		}
	}
}
