package com.elorrieta.primerdia;

import java.util.Scanner;

/**
 * 
 * @author Ivan Perez
 * @see https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=4&codigo=77&inicio=0
 *
 */
public class Calculosuseldo {
	public static void main(String[] args) {
		// Declarar variables Tipo nombre = Vanlor
		int horasTrabajadas = 0;
		float costoHora = 0;
		float sueldo = 0;

		// variable para leer datos por teclado
		Scanner teclado = new Scanner(System.in);

		// Pedir datos por pantalla
		System.out.print("Ingrese la cantidad de horas trabajadas por el empleado:");
		// Guardar una variable el valor entero "int" leido por pantalla

		horasTrabajadas = teclado.nextInt();
		System.out.print("Ingrese el valor de la hora:");
		costoHora = teclado.nextFloat();
		sueldo = horasTrabajadas * costoHora;
		System.out.print("El empleado debe cobrar:");
		System.out.print(sueldo);

		// Cerramos teclaco
		teclado.close();
	}
}