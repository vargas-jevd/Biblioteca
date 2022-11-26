package ar.com.ada.backend12.ejercicio1.ejecutable;

import static java.lang.Integer.parseInt;

import java.util.Scanner;

import ar.com.ada.backend12.ejercicio1.modelo.Biblioteca;
import ar.com.ada.backend12.ejercicio1.modelo.Menu;

public class BibliotecaMain {
	static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		Biblioteca sanMartin = new Biblioteca();
		sanMartin.llenarBiblioteca(sanMartin);
		Menu menu = new Menu();

		boolean cierreMientras = true;

		while (cierreMientras) {
			menu.imprimirMenu();
			System.out.print("Ingrese una opcion: ");
			String opcion = in.nextLine();

			String codigo;
			int numero;
			String nombreDelPrestatario;
			String telefonoDelPrestatario;
			String fechaDelPrestamo;

			switch (opcion) {
			case "1":
				System.out.println("Estos son los libros disponibles: ");
				sanMartin.listarLibros();
				break;

			case "2":
				break;

			case "3":
				break;

			case "4":
				// Prestar Libro
				codigo = obtenerCodigo();
				nombreDelPrestatario = obtenerNombreDelPrestatario();
				telefonoDelPrestatario = obtenerTelefonoPrestatario();
				fechaDelPrestamo = obtenerFechaPrestamo();

				sanMartin.prestarLibro(codigo, nombreDelPrestatario, telefonoDelPrestatario, fechaDelPrestamo);
				System.out.println(sanMartin.obtenerInfoLibro(codigo));
				break;

			case "5":
				break;

			case "6":
				break;

			case "7":
				break;

			case "8":
				break;

			case "9":
				break;

			case "10":
				break;

			default:
				System.out.println("Ingrese una opción valida.");
			}
		}
		in.close();
	}

	// ============== Aca termina el MAIN, solo vienen FUNCIONES que usaremos en el
	// main ============
	private static String obtenerString(String mensaje) {
		System.out.print(mensaje);
		String salida = in.nextLine();
		return salida;
	}

	private static String obtenerNombreDelPrestatario() {
		String nombre = obtenerString("Ingrese el nombre del Prestatario: ");
		return nombre;
	}

	private static String obtenerTelefonoPrestatario() {
		String telefono = obtenerString(
				"Ingrese el número de telefono del prestatario (xxx) xxx-xx-xxx --> (345) 123-45-67: ");
		return telefono;
	}

	private static String obtenerFechaPrestamo() {
		String fecha = obtenerString("Ingrese la fecha del préstamo DD/MM/AAAA HH:SS:MS --> 11/11/2022 14:00:00: ");
		return fecha;
	}

	private static String obtenerCodigo() {
		String codigo = obtenerString("Ingrese el código de lo que se desea prestar: ");
		return codigo;
	}

	private static int obtenerNumero() {
		String numero = obtenerString("Ingrese el código de lo que se desea prestar: ");
		return parseInt(numero);
	}

}
