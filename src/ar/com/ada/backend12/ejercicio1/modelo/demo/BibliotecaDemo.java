package ar.com.ada.backend12.ejercicio1.modelo.demo;

import ar.com.ada.backend12.ejercicio1.modelo.Biblioteca;
import ar.com.ada.backend12.ejercicio1.modelo.Cubiculo;
import ar.com.ada.backend12.ejercicio1.modelo.Libro;
import ar.com.ada.backend12.ejercicio1.modelo.Luz;
import ar.com.ada.backend12.ejercicio1.modelo.Revista;

public class BibliotecaDemo {
	public static void main(String[] args) {
		//Instanciamos la biblioteca
		Biblioteca b = new Biblioteca();
		
		//Llenamos la biblioteca de libros, revistas y cubiculos
		llenarBiblioteca(b);
		
		//Imprimimos los libros
		imprimirLibros(b);
		
		//Imprimimos las revistas
		imprimirRevistas(b);
		
		//Imprimimos los cubiculos
		imprimirCubiculos(b);
		
		//Prestamos y devolvemos algunos libros, cubiculos y revistas
		b.prestarLibro("L0000002", "Javier Vargas", "(345) 123-45-67", "11/11/2022 14:00:00");
		b.prestarLibro("L0000004", "Javier Vargas", "(345) 123-45-67", "11/11/2022 14:00:00");
		b.prestarLibro("L0000005", "Javier Vargas", "(345) 123-45-67", "11/11/2022 14:00:00");
		b.prestarLibro("L0000006", "Javier Vargas", "(345) 123-45-67", "11/11/2022 14:00:00");
		b.prestarLibro("L0000007", "Javier Vargas", "(345) 123-45-67", "11/11/2022 14:00:00");
		b.prestarLibro("L0000008", "Javier Vargas", "(345) 123-45-67", "11/11/2022 14:00:00");
		b.devolverLibro("L0000005");
		b.devolverLibro("L0000007");
		
		b.prestarRevista("R0000002", "Javier Vargas", "(345) 123-45-67", "11/11/2022 14:00:00");
		b.prestarRevista("R0000004", "Javier Vargas", "(345) 123-45-67", "11/11/2022 14:00:00");
		b.prestarRevista("R0000005", "Javier Vargas", "(345) 123-45-67", "11/11/2022 14:00:00");
		b.prestarRevista("R0000006", "Javier Vargas", "(345) 123-45-67", "11/11/2022 14:00:00");
		b.prestarRevista("R0000007", "Javier Vargas", "(345) 123-45-67", "11/11/2022 14:00:00");
		b.prestarRevista("R0000008", "Javier Vargas", "(345) 123-45-67", "11/11/2022 14:00:00");
		b.devolverRevista("R0000005");
		b.devolverRevista("R0000007");
		
		b.prestarCubiculo(102, "Javier Vargas", "(345) 123-45-67", "11/11/2022 14:00:00");
		b.prestarCubiculo(104, "Javier Vargas", "(345) 123-45-67", "11/11/2022 14:00:00");
		b.prestarCubiculo(105, "Javier Vargas", "(345) 123-45-67", "11/11/2022 14:00:00");
		b.prestarCubiculo(106, "Javier Vargas", "(345) 123-45-67", "11/11/2022 14:00:00");
		b.prestarCubiculo(107, "Javier Vargas", "(345) 123-45-67", "11/11/2022 14:00:00");
		b.prestarCubiculo(108, "Javier Vargas", "(345) 123-45-67", "11/11/2022 14:00:00");
		b.devolverCubiculo(105);
		b.devolverCubiculo(107);
		
		//Obtenemos la informacion de algunos libros, revistas y cubiculos
		System.out.println("--- INFORMACION DE ALGUNOS LIBROS, REVISTAS Y CUBICULOS");
		System.out.println(b.obtenerInfoLibro("L0000002"));
		System.out.println(b.obtenerInfoLibro("L0000004"));
		System.out.println(b.obtenerInfoLibro("L0000005"));
		System.out.println(b.obtenerInfoLibro("L0000006"));
		System.out.println(b.obtenerInfoLibro("L0000007"));
		System.out.println(b.obtenerInfoLibro("L0000008"));
		
		System.out.println("");
		System.out.println(b.obtenerInfoRevista("R0000002"));
		System.out.println(b.obtenerInfoRevista("R0000004"));
		System.out.println(b.obtenerInfoRevista("R0000005"));
		System.out.println(b.obtenerInfoRevista("R0000006"));
		System.out.println(b.obtenerInfoRevista("R0000007"));
		System.out.println(b.obtenerInfoRevista("R0000008"));

		System.out.println("");
		System.out.println(b.obtenerInfoCubiculo(102));
		System.out.println(b.obtenerInfoCubiculo(104));
		System.out.println(b.obtenerInfoCubiculo(105));
		System.out.println(b.obtenerInfoCubiculo(106));
		System.out.println(b.obtenerInfoCubiculo(107));
		System.out.println(b.obtenerInfoCubiculo(108));
	}
	
	private static void llenarBiblioteca(Biblioteca b) {
		//Libros
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
		
		//Revistas
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
		
		//Cubiculos
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
	
	private static void imprimirLibros(Biblioteca b) {
		System.out.println("--- LIBROS ---");
		b.listarLibros();
		System.out.println("");
	}
	
	private static void imprimirRevistas(Biblioteca b) {
		System.out.println("--- REVISTAS ---");
		b.listarRevistas();
		System.out.println("");
	}
	
	private static void imprimirCubiculos(Biblioteca b) {
		System.out.println("--- CUBICULOS ---");
		b.listarCubiculos();
		System.out.println("");
	}
}
