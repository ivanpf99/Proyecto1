package com.elorrieta.primerdia;

import java.util.Scanner;

/**
 * Confeccionar un programa que pida por teclado tres notas de un alumno,
 * calcule el promedio
 *
 * @author Ivan Perez
 *
 */

public class ClasificacionDeAlumnado {

	public static void main(String[] args) {

		// Declarar variables Tipo Nombre = Valor

		float nota1 = 0;
		float nota2 = 0;
		float nota3 = 0;
		float notaMedia = 0;
		float NUMERO_NOTAS = 3; // Final es para una constante fija, siempre en mayusculas

		// Variabla para leer Datos por teclado
		Scanner teclado = new Scanner(System.in);

		// Pedir datos en la pantalla
		System.out.print("Ingrese nota");
		nota1 = teclado.nextFloat();
		System.out.print("Ingrese nota");
		nota2 = teclado.nextFloat();
		System.out.print("Ingrese nota");
		nota3 = teclado.nextFloat();

		// calcular media
		notaMedia = (nota1 + nota2 + nota3) / 3;

		if (nota1 <= 7) {
			System.out.print("Promocionado");
		} else {

		}
		teclado.close();

	}

}
