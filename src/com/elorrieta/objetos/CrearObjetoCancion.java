package com.elorrieta.objetos;

import java.util.Scanner;

public class CrearObjetoCancion {

	public static void main(String[] args) {

		System.out.println("Alta Nueva Cancion");
		System.out.println("---------------------");

		Scanner sc = new Scanner(System.in);

		// Pedir los datos

		String nombre = ("");
		String grupo = ("");
		int duracion = 0; // Duracion en segundos

		// Nombre

		System.out.println("Introduce nombre de la cancion");
		nombre = sc.nextLine();

		// Grupo

		System.out.println("Introduce grupo");
		grupo = sc.nextLine();

		// Duracion

		System.out.println("Introduce la duracion");
		duracion = sc.nextInt();

		sc.close();

		// Crear Objeto Cancion

		Cancion c1 = new Cancion();
		c1.setNombre(nombre);
		c1.setGrupo(grupo);
		c1.setDuracion(duracion);

		// mostrar por pantalla
		System.out.println(c1);

	} // main

}
