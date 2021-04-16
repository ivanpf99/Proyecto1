package com.elorrieta.tercerdia;

/**
 * 
 * Programa que permite meter numeros enteros y nos muestre la tabla de multiplicar. Finaliza al ingresar -1
 * 
 * @author Ivan Perez
 *
 */
import java.util.Scanner;

public class UtilidadesProblema1 {

	public void cargarValor() {
		Scanner teclado = new Scanner(System.in);
		int valor;
		do {
			System.out.print("Ingrese valor:");
			valor = teclado.nextInt();
			if (valor != -1) {
				calcular(valor);
			}
		} while (valor != -1);

		teclado.close();
	}

	public void calcular(int v) {
		for (int f = v; f <= v * 10; f = f + v) {
			System.out.print(f + "-");
		}
	}

	public static void main(String[] ar) {
		TablaMultiplicar tabla;
		tabla = new TablaMultiplicar();
		tabla.cargarValor();

	}

}
