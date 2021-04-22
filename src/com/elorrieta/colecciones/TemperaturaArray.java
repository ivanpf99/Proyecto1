package com.elorrieta.colecciones;

/**
 * cargar valores en una array y mostrar tremperatura media, minima y maxima.
 * 
 * @author Ivan Perez
 *
 */

public class TemperaturaArray {

	public static void main(String[] args) {

		int suma = 0;
		int tempMax = Integer.MIN_VALUE;
		int tempMin = Integer.MAX_VALUE;

		int[] temperaturas = new int[7];

		temperaturas[0] = 12;
		temperaturas[1] = 20;
		temperaturas[2] = 18;
		temperaturas[3] = 5;
		temperaturas[4] = 22;
		temperaturas[5] = 15;
		temperaturas[6] = 18;

		for (int i = 0; i < temperaturas.length; i++) {
			int tempi = temperaturas[i]; // tempi = tempInteraccion
			suma += tempi;
			if (tempMax < tempi) {
				tempMax = tempi;
			} // if
			if (tempMin > tempi) {
				tempMin = tempi;
			} // if
		} // for
		System.out.println("La media:" + suma / temperaturas.length);
		System.out.println("La maxima:" + tempMax);
		System.out.println("La minima:" + tempMin);
	}// main

}// class
