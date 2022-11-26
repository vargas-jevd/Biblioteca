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

		while (i.hasNext()) {
			System.out.println(libros.get(i.next()).toString());
		}
	}

	public void listarRevistas() {
		Iterator<String> i = revistas.keySet().iterator();

		while (i.hasNext()) {
			System.out.println(revistas.get(i.next()).toString());
		}
	}

	public void listarCubiculos() {
		Iterator<Integer> i = cubiculos.keySet().iterator();

		while (i.hasNext()) {
			System.out.println(cubiculos.get(i.next()).toString());
		}
	}

	public void llenarBiblioteca(Biblioteca b) {
		// Libros
		b.addLibro(new Libro("L0000001", "1984", 1949));
		b.addLibro(new Libro("L0000002", "Nada", 1945));
		b.addLibro(new Libro("L0000003", "Los Miserables", 1862));
		b.addLibro(new Libro("L0000004", "El Alquimista", 2000));
		b.addLibro(new Libro("L0000005", "La Divina Comedia", 1320));
		b.addLibro(new Libro("L0000006", "Cien Anios de Soledad", 1967));
		b.addLibro(new Libro("L0000007", "El principito", 1943));
		b.addLibro(new Libro("L0000008", "El Retrato de Dorian Grey", 1890));
		b.addLibro(new Libro("L0000009", "Un Mundo Feliz", 1932));
		b.addLibro(new Libro("L0000010", "Mujercitas", 1868));

		// Revistas
		b.addRevista(new Revista("R0000001", "Semana", 50, 11));
		b.addRevista(new Revista("R0000002", "Rolling Stones", 20, 8));
		b.addRevista(new Revista("R0000003", "Time", 1, 1));
		b.addRevista(new Revista("R0000004", "People", 13, 9));
		b.addRevista(new Revista("R0000005", "Wired", 23, 2));
		b.addRevista(new Revista("R0000006", "Nintendo Power", 2, 3));
		b.addRevista(new Revista("R0000007", "The New Yorker", 33, 11));
		b.addRevista(new Revista("R0000008", "Life", 22, 6));
		b.addRevista(new Revista("R0000009", "Vea", 13, 1));
		b.addRevista(new Revista("R0000010", "Mecanica Popular", 23, 12));

		// Cubiculos
		b.addCubiculo(new Cubiculo(100));
		b.addCubiculo(new Cubiculo(101));
		b.addCubiculo(new Cubiculo(102));
		b.addCubiculo(new Cubiculo(103, true));
		b.addCubiculo(new Cubiculo(104, true));
		b.addCubiculo(new Cubiculo(105, true));
		b.addCubiculo(new Cubiculo(106, Luz.NATURAL));
		b.addCubiculo(new Cubiculo(107, Luz.NATURAL));
		b.addCubiculo(new Cubiculo(108, Luz.NATURAL));
		b.addCubiculo(new Cubiculo(109, Luz.NATURAL));
	}

	public void imprimirLibros(Biblioteca b) {
		System.out.println("--- LIBROS ---");
		b.listarLibros();
		System.out.println("");
	}

	public void imprimirRevistas(Biblioteca b) {
		System.out.println("--- REVISTAS ---");
		b.listarRevistas();
		System.out.println("");
	}

	public void imprimirCubiculos(Biblioteca b) {
		System.out.println("--- CUBICULOS ---");
		b.listarCubiculos();
		System.out.println("");
	}

}
