package com.elorrieta.segundodia;

import java.util.Scanner;

/**
 * Un Programa que saque la nota final del curso
 * 
 * @author Ivan Perez
 *
 */

public class Programamediacurso {

	public static void main(String[] args) {

		// Pedir las notas del alumno

		float nota1 = 0;
		float notafinal1 = 0;
		float nota2 = 0;
		float notafinal2 = 0;
		float nota3 = 0;
		float notafinal3 = 0;
		float nota4 = 0;
		float notafinal4 = 0;
		float nota5 = 0;
		float notafinal5 = 0;
		float notafinal = 0; // La suma de todas las notas finales

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

		// calcular notas

		notafinal1 = nota1 * 10 / 100;
		notafinal2 = nota2 * 5 / 100;
		notafinal3 = nota3 * 5 / 100;
		notafinal4 = nota4 * 10 / 100;
		notafinal5 = nota5 * 70 / 100;
		notafinal = notafinal1 + notafinal2 + notafinal3 + notafinal4 + notafinal5;

		// Mostrar el resultado

		System.out.println("La nota final es:");
		System.out.println(notafinal);

		// Cerramos teclaco
		teclado.close();
	} // final main

}
