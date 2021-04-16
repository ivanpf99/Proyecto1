package com.elorrieta.segundodia;

/**
 * Solicitar el nombre y la edad de 2 personas y mostrar el de la persona qcon mayor edad
 * 
 * @author Ivan Perez
 *
 */
import java.util.Scanner; // scaner el la clase para añadir texto

public class Problema13 {

	public static void main(String[] ar) {
		Scanner teclado = new Scanner(System.in);
		String nombre1, nombre2;
		int edad1, edad2;

		// Añadir la variables en el teclado
		System.out.print("Ingrese el nombre:");
		nombre1 = teclado.next();
		System.out.print("Ingrese edad:");
		edad1 = teclado.nextInt();
		System.out.print("Ingrese el nombre:");
		nombre2 = teclado.next();
		System.out.print("Ingrese edad:");
		edad2 = teclado.nextInt();
		System.out.print("La persona de mayor edad es:");
		if (edad1 > edad2) {
			System.out.print(nombre1);
		} else {
			System.out.print(nombre2);
		}

		teclado.close();
	}

}
