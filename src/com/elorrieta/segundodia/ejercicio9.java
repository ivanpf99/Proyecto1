package com.elorrieta.segundodia;

/**
 * Programa qie lee 3 numeros y muestra el mas grande
 * 
 * @author Ivan Perez
 *
 */

public class ejercicio9 {

	public static void main(String[] args) {

		int num1 = 1;
		int num2 = 5;
		int num3 = 3;

		if (num1 > num2 && num1 > num3) {
			System.out.print("numero mas alto es" + num2);
		} else {
			System.out.print("numero mas alto es" + num3);

		}

	}

}