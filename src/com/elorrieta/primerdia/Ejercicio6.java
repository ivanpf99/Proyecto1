package com.elorrieta.primerdia;

import java.util.Scanner;

/**
 * Recibir 2 numeros por un teclado y obtener su suma y su producto
 * 
 * @author Ivan Perez
 *
 */

public class Ejercicio6 {

	public static void main(String[] args) {

		// Declarar variables Tipo Nombre = Valor

		float primerNumero = 0;
		float segundoNumero = 0;
		float suma = 0;
		float producto = 0;

		// Variabla para leer Datos por teclado

		Scanner teclado = new Scanner(System.in);

		// Pedir datos en la pantalla

		System.out.print("Ingrese primer numero");
		primerNumero = teclado.nextFloat();
		System.out.print("Ingrese segundo numero");
		segundoNumero = teclado.nextFloat();

		// hecer las operaciones

		suma = primerNumero + segundoNumero;

		producto = primerNumero * segundoNumero;

		// mostrar resultados
		System.out.print("la suma es" + suma);

		System.out.print("el producto es" + producto);

		teclado.close();

	}

}
