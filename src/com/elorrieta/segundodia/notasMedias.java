package com.elorrieta.segundodia;

import java.util.Scanner;

/**
 * Meter 5 notas y hacer la media
 * 
 * @author Ivan Perez
 *
 */

public class notasMedias {

	public static void main(String[] args) {
		float nota1 = 0;
		float nota2 = 0;
		float nota3 = 0;
		float nota4 = 0;
		float nota5 = 0;
		float notaMedia = 0;
		float NUMERO_NOTAS = 5; // Final es para una constante fija, siempre en mayusculas

		// Variabla para leer Datos por teclado
		Scanner teclado = new Scanner(System.in);

		// Pedir datos en la pantalla
		System.out.print("Ingrese nota");
		nota1 = teclado.nextFloat();
		System.out.print("Ingrese nota");
		nota2 = teclado.nextFloat();
		System.out.print("Ingrese nota");
		nota3 = teclado.nextFloat();
		System.out.print("Ingrese nota");
		nota4 = teclado.nextFloat();
		System.out.print("Ingrese nota");
		nota5 = teclado.nextFloat();

		// calcular media
		notaMedia = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;

		teclado.close();
	}

}
