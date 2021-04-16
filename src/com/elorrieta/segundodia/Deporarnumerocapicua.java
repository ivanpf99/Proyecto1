package com.elorrieta.segundodia;

/**
 * Programa para encontrar un numero capicua
 * 
 * @author Ivan Perez
 *
 */
import java.util.Scanner;

public class Deporarnumerocapicua {
	public static void main(String[] args) {

		int numero = 0;
		int numerobase = 0;
		int inverso = 0;
		int resto = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Dime un numero entero");
		numero = teclado.nextInt();
		numerobase = numero;

		while (numero > 0) {

			resto = numero % 10;
			inverso = inverso * 10 + resto;
			numero = numero / 10;
		}

		// TODO depurar y solucionar bug
		if (numerobase == inverso) {
			System.out.println("Es kapikua");
		} else {
			System.out.println("NO Es kapikua");
		}

		teclado.close();

	}

}
