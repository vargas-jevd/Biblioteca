package ar.com.ada.backend12.ejercicio1.modelo.demo;

import ar.com.ada.backend12.ejercicio1.modelo.Biblioteca;

public class BibliotecaDemo {
	public static void main(String[] args) {

		// Instanciamos la biblioteca
		Biblioteca b = new Biblioteca();

		// Llenamos la biblioteca de libros, revistas y cubiculos
		b.llenarBiblioteca(b);

		// Imprimimos los libros
		b.imprimirLibros(b);

		// Imprimimos las revistas
		b.imprimirRevistas(b);

		// Imprimimos los cubiculos
		b.imprimirCubiculos(b);

		// Prestamos y devolvemos algunos libros, cubiculos y revistas
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

		// Obtenemos la informacion de algunos libros, revistas y cubiculos
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

}