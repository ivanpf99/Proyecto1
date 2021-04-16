package com.elorrieta.segundodia;

/**
 * 
 * Programa que muestra los numeros del 1 al 10 y luego a la inversa
 * 
 *
 * @author Ivan Perez
 *
 */

public class ejercicio11 {

	public static void main(String[] args) {

		System.out.println("Inicia Programa");

		int x;
		x = 1;
		while (x <= 10) {
			System.out.println("interaccion con while" + x);
			x++;
		}
		for (int i = 9; i >= 1; i--) {
			System.out.println("interaccion con for" + i);

		}
		System.out.println("Termina programa");

	}
}
