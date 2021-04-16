package com.elorrieta.segundodia;

/**
 * Pedir dos apellidos y mostrar si son iguales o no
 * 
 * @author Ivan Perez
 *
 */
import java.util.Scanner;

public class Problema13tres {

	public static void main(String[] ar) {

		Scanner teclado = new Scanner(System.in);
		String apellido1, apellido2;

		System.out.print("Ingrese primer apellido:");
		apellido1 = teclado.next();
		System.out.print("Ingrese segundo apellido:");
		apellido2 = teclado.next();
		if (apellido1.equals(apellido2)) {
			System.out.print("Los apellidos son iguales");
		} else {
			System.out.print("Los apellidos son distintos");
		}
		teclado.close();
	}

}
