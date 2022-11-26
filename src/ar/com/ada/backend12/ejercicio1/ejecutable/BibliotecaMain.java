package ar.com.ada.backend12.ejercicio1.ejecutable;

import java.util.Scanner;

import ar.com.ada.backend12.ejercicio1.modelo.Biblioteca;
import ar.com.ada.backend12.ejercicio1.modelo.Menu;

public class BibliotecaMain {
	public static void main(String[] args) {

		Biblioteca sanMartin = new Biblioteca();
		sanMartin.llenarBiblioteca(sanMartin);
		Menu menu = new Menu();

		Scanner in = new Scanner(System.in);
		boolean cierreMientras = true;

		while (cierreMientras) {
			menu.imprimirMenu();

			System.out.print("Ingrese una opcion: ");

			int opcion = in.nextInt();

			switch (opcion) {
			case 1:
				break;

			case 2:
				break;

			case 3:
				break;

			case 4:
				break;

			case 5:
				break;

			case 6:
				break;

			case 7:
				break;

			case 8:
				break;

			case 9:
				break;

			case 10:
				break;

			}

		}
		in.close();
	}
}
