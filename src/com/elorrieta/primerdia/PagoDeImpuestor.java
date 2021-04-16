package com.elorrieta.primerdia;

import java.util.Scanner;

/**
 * Ingresar el sueldo de una persona y si supera los 3000€ mostrar mensaje en
 * pantalla para que pague impuestos
 *
 * @author Ivan Perez
 *
 */

public class PagoDeImpuestor {

	public static void main(String[] args) {

		// Declarar variables Tipo Nombre = Valor
		float sueldo = 0;

		// Variabla para leer Datos por teclado
		Scanner teclado = new Scanner(System.in);

		// Pedir datos en la pantalla
		System.out.print("Ingrese su sueldo");
		sueldo = teclado.nextFloat();

		// Calcular las variantes

		if (sueldo < 3000) {
			System.out.print("Tiene que pagar impuestos");
		} else {
			System.out.print("No tiene que pagar impuestos");
		}

		teclado.close();
	}

}
