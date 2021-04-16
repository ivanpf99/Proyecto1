package com.elorrieta.segundodia;

import java.util.Scanner;

/**
 * 
 * Pedir por teclado les temperauras hasta que se escriba 888 para salir, al
 * salir enseñar la media
 * 
 * @author Ivan Perez
 *
 */

public class Temperaturas {

	public static void main(String[] args) {

		float temperatura = 0;
		float total = 0; // Suma de todas las temperaturas
		int numeroTemoeraturas = 0;
		final int SALIR = 888;
		Scanner teclado = new Scanner(System.in);

		// Bucle para pedir temperaturas y sumarlas
		while (temperatura != SALIR)
			;

		System.out.println("Dime la temperatura (o 888 para salir):");
		temperatura = teclado.nextFloat();

		// Realizar operaciones si no queremos SALIR

		if ((temperatura != SALIR)) {
			total += temperatura; // total = total + temperatura
			numeroTemoeraturas++;

		}
		// Mostrar media

		teclado.close();
		System.out.println("Media :" + (total / numeroTemoeraturas));

	}// Cierre del main

}
