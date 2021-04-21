package com.elorrieta.colecciones;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Pedir por pantalla temperaturas hasta que se aburra el usuario. Ir
 * guardandolas una a una en unn array. Al terminar recorrer array y mostrar
 * media.
 * 
 * @author Admin
 *
 */

//ArrayList<Integer> temperaturas = new ArrayList<Integer>();

public class TemperaturaMedia {

	public static void main(String[] args) {

		ArrayList<Integer> temperaturas = new ArrayList<Integer>();
		int suma = 0;
		int temp = 0;
		final int SALIR = 888;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzaca la temperatura");

		temp = Integer.parseInt(sc.nextLine());

		if (temp != SALIR) {
			temperaturas.add(temp);
			suma = suma + temp; // suma += temp;
		}
		while (temp != SALIR) {
			System.out.println("La media es" + (suma / temperaturas.size()));
		}

		sc.close();

	}// main

}// class
