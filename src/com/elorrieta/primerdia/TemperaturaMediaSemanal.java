package com.elorrieta.primerdia;

import java.util.Scanner;

/**
 * Pedir por teclado la temperatura de los 7 dias y calcular media
 * 
 * @author Ivan Perez
 *
 */

public class TemperaturaMediaSemanal {

	public static void main(String[] args) {

		// Declarar variables Tipo Nombre = Valor
		float lunes = 0;
		float martes = 0;
		float miercoles = 0;
		float jueves = 0;
		float viernes = 0;
		float sabado = 0;
		float domingo = 0;
		float temperaturaMedia = 0;
		final int DIAS_SEMANA = 7; // Final es para una constante fija, siempre en mayusculas

		// Variabla para leer Datos por teclado
		Scanner teclado = new Scanner(System.in);

		// Pedir datos en la pantalla
		System.out.print("Ingrese la temperatura del lunes");
		lunes = teclado.nextFloat();
		System.out.print("Ingrese la temperatura del martes");
		martes = teclado.nextFloat();
		System.out.print("Ingrese la temperatura del miercoles");
		miercoles = teclado.nextFloat();
		System.out.print("Ingrese la temperatura del jueves");
		jueves = teclado.nextFloat();
		System.out.print("Ingrese la temperatura del viernes");
		viernes = teclado.nextFloat();
		System.out.print("Ingrese la temperatura del sabado");
		sabado = teclado.nextFloat();
		System.out.print("Ingrese la temperatura del domingo");
		domingo = teclado.nextFloat();

		// calcular media
		temperaturaMedia = (lunes + martes + miercoles + jueves + viernes + sabado + domingo) / DIAS_SEMANA;

		if (temperaturaMedia < 20) {
			System.out.print("Hace frio");
		} else {
			System.out.print("Hace caloret");
		}

		// mostrar media
		System.out.print("La media es" + temperaturaMedia);

		teclado.close();

	}

}
