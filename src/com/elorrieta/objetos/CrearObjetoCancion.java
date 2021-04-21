package com.elorrieta.objetos;

import java.util.Scanner;

public class CrearObjetoCancion {

	public static void main(String[] args) {

		System.out.println("Alta Nueva Cancion");
		System.out.println("---------------------");

		Scanner sc = new Scanner(System.in);
		Cancion c = new Cancion();

		// Pedir los datos

		String nombre = ("");
		String grupo = ("");
		int duracion = 0; // Duracion en segundos

		// Nombre

		System.out.println("Introduce nombre de la cancion");
		nombre = sc.nextLine();
		c.setNombre(nombre);

		// Grupo

		System.out.println("Introduce grupo");
		grupo = sc.nextLine();
		c.setGrupo(grupo);

		// Duracion

		System.out.println("Introduce la duracion (No puede exceder los 400)");
		boolean repetir = true;
		do {
			try {
				duracion = Integer.parseInt(sc.nextLine());
				c.setDuracion(duracion);
				repetir = false;
			} catch (NumberFormatException e) {
				System.out.println("duraciojn incorecta, debe ser un numero entero");
			} catch (Exception e) {
				System.out.println("Duracion incorrecta por favor intentelo de nuevo");
			}
		} while (repetir);

		sc.close();

		// mostrar por pantalla
		System.out.println(c);

	}// Main
}
