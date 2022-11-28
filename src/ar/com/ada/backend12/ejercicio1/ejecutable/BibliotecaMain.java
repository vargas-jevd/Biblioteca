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

		System.out.println("\n=============================================================");
		System.out.println("Bienvenido al sistema de Gestión de la Biblioteca San Martin");
		boolean cierreMientras = true;
		while (cierreMientras) {
			menu.imprimirMenu();
			System.out.print("Ingrese una opcion del menú: ");
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
				System.out.println("Estas son las revistas disponibles: ");
				sanMartin.listarRevistas();
				break;

			case "3":
				System.out.println("Los cubiculos disponibles son: ");
				sanMartin.imprimirCubiculos(sanMartin);
				break;

			case "4":
				System.out.println("Prestar Libros");
				codigo = obtenerCodigo("prestar");
				nombreDelPrestatario = obtenerNombreDelPrestatario();
				telefonoDelPrestatario = obtenerTelefonoPrestatario();
				fechaDelPrestamo = obtenerFechaPrestamo();

				sanMartin.prestarLibro(codigo, nombreDelPrestatario, telefonoDelPrestatario, fechaDelPrestamo);
				System.out.println(sanMartin.obtenerInfoLibro(codigo));
				break;

			case "5":
				System.out.println("Prestar Revistas");
				codigo = obtenerCodigo("prestar");
				nombreDelPrestatario = obtenerNombreDelPrestatario();
				telefonoDelPrestatario = obtenerTelefonoPrestatario();
				fechaDelPrestamo = obtenerFechaPrestamo();

				sanMartin.prestarRevista(codigo,nombreDelPrestatario,telefonoDelPrestatario,fechaDelPrestamo);
				System.out.println(sanMartin.obtenerInfoRevista(codigo));
				break;

			case "6":
				System.out.println("Prestar Cubículo");
				numero = obtenerNumero("prestar");
				nombreDelPrestatario = obtenerNombreDelPrestatario();
				telefonoDelPrestatario = obtenerTelefonoPrestatario();
				fechaDelPrestamo = obtenerFechaPrestamo();

				sanMartin.prestarCubiculo(numero,nombreDelPrestatario,telefonoDelPrestatario,fechaDelPrestamo);
				System.out.println(sanMartin.obtenerInfoCubiculo(numero));
				break;

			case "7":
				System.out.println("Devolver Libros");
				codigo = obtenerCodigo("devolver");
				sanMartin.devolverLibro(codigo);
				System.out.println("\nEl libro ha sido devuelto con éxito.");
				System.out.println("Detalle del libro devuelto: ");
				System.out.println(sanMartin.obtenerInfoLibro(codigo));
				break;

			case "8":
				System.out.println("Devolver Revistas");
				codigo = obtenerCodigo("devolver");
				sanMartin.devolverRevista(codigo);
				System.out.println("\nLa revista ha sido devuelta con éxito.");
				System.out.println("Detalle de la revista devuelta: ");
				System.out.println(sanMartin.obtenerInfoRevista(codigo));
				break;

			case "9":
				System.out.println("Devolver Cubículo");
				numero = obtenerNumero("devolver");
				sanMartin.devolverCubiculo(numero);
				System.out.println("\nEl cubículo ha sido devuelto con éxito.");
				System.out.println("Detalle del cubículo devuelto: ");
				System.out.println(sanMartin.obtenerInfoCubiculo(numero));
				break;

			case "10":
				cierreMientras = false;
				System.out.println("Chau!");
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

	private static String obtenerCodigo(String prestarOdevolver) {
		String codigo = obtenerString("Ingrese el código de lo que se desea " + prestarOdevolver+ ": ");
		return codigo;
	}

	private static int obtenerNumero(String prestar) {
		String prestarOdevolver= prestar;
		String numero = obtenerString("Ingrese el código de lo que se desea " + prestarOdevolver+ ":" );
		return parseInt(numero);
	}

}
