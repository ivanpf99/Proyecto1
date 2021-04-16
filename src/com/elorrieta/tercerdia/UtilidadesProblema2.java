package com.elorrieta.tercerdia;

/**
 * Ingresar tres valores por teclado y que muestre el mayor y el menor
 * 
 * @author Ivan Perez
 *
 */
import java.util.Scanner;

public class UtilidadesProblema2 {

	public void cargarValores() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese primer valor:");
		int valor1 = teclado.nextInt();
		System.out.print("Ingrese segundo valor:");
		int valor2 = teclado.nextInt();
		System.out.print("Ingrese tercer valor:");
		int valor3 = teclado.nextInt();
		int mayor, menor;
		mayor = calcularMayor(valor1, valor2, valor3);
		menor = calcularMenor(valor1, valor2, valor3);
		System.out.println("El valor mayor de los tres es:" + mayor);
		System.out.println("El valor menor de los tres es:" + menor);
		teclado.close();
	}

	public int calcularMayor(int v1, int v2, int v3) {
		int m;
		if (v1 > v2 && v1 > v3) {
			m = v1;
		} else {
			if (v2 > v3) {
				m = v2;
			} else {
				m = v3;
			}
		}
		return m;
	}

	public int calcularMenor(int v1, int v2, int v3) {
		int m;
		if (v1 < v2 && v1 < v3) {
			m = v1;
		} else {
			if (v2 < v3) {
				m = v2;
			} else {
				m = v3;
			}
		}
		return m;
	}

	public static void main(String[] ar) {
		MayorMenor maymen = new MayorMenor();
		maymen.cargarValores();
	}

}
