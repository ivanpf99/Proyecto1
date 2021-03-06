package com.elorrieta.objetos;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuConcesionario {

	// variables global para todos los metodos de esta clase
	private static Scanner sc = new Scanner(System.in);
	private static String opcion = "";
	private static ArrayList<Vehiculo> stock = new ArrayList<Vehiculo>();

	public static void main(String[] args) {

		System.out.println("Bienvenido");

		try {

			cargarVehiculos();

			do {

				menu();
				leerOpcion();

				switch (opcion) {
				case "1": {
					listar();
					break;
				}
				case "2": {
					darDeAlta();
					break;
				}
				case "3": {
					darDeBaja();
					break;
				}
				case "4": {
					modificar();
					break;
				}
				case "s": {
					System.out.println("Adios");
					break;
				}

				default:
					System.out.println(opcion + " opcion no disponible");
				}

			} while (!"s".equalsIgnoreCase(opcion));

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Termina programa");
	}// main

	private static void cargarVehiculos() {

		stock.add(new Vehiculo("134 CMS", "rojo"));

		Vehiculo v = new Vehiculo();
		v.setColor("negro");
		v.setMatricula("2365 JKL");
		v.setAsientos(5);
		v.setRuedas(4);
		stock.add(v);

	}

// Dar de alta un vehiculo
	private static void darDeAlta() {

		int asientos = 1;
		int ruedas = 2;
		Vehiculo v = new Vehiculo();

		System.out.println("Por favor introduzca los datos:");

		// Color
		System.out.println("Digame el color");
		String color = sc.nextLine();
		v.setColor(color);

		// Matricula
		System.out.println("Digame la matricula");
		String matricula = sc.nextLine();
		v.setMatricula(matricula);

		// Asientos
		do {
			System.out.println("Numero de asientos( deve ser 1 o mayor :");

			try {
				asientos = Integer.parseInt(sc.nextLine());
				v.setAsientos(asientos);
			} catch (Exception e) {
				System.out.println("Formato incorrecto, por favor prueve de nuevo.");
			}
		} while (asientos <= 1);

		// Ruedas
		do {
			System.out.println("Numero de ruedas( deve ser 2 o mayor :");

			try {
				ruedas = Integer.parseInt(sc.nextLine());
				v.setRuedas(ruedas);
			} catch (Exception e) {
				System.out.println("Formato incorrecto, por favor prueve de nuevo.");
			}
		} while (ruedas <= 2);

		// a?adirlo en la coleccion 'stock'
		stock.add(v);

	}

	// dar de baja un vehiculo
	private static void darDeBaja() {
		System.out.println("Dar de baja");

		// Pedir los datos del vehiculo
		System.out.println("Introduzca la matricula del vehiculo");
		String matricula = sc.nextLine();

		boolean encontrado = false;
		for (Vehiculo v : stock) {

			if (matricula.equals(v.getMatricula())) {
				encontrado = true;
				stock.remove(v);
				System.out.println("Vehiculo eliminado con exito");
				break;

			}
		}
		if (!encontrado) {
			System.out.println("Vehiculo no encontrado");
		}
	}

	// Modificar un vehiculo
	private static void modificar() {
		Vehiculo vm = new Vehiculo(); // VehiculoModificar
		boolean encontrado = false;

		System.out.println("Modificar");
		System.out.println("-----------------------------");
		System.out.println("Dime la Matricula:");
		String matricula = sc.nextLine();

		// buscar por matricula
		for (Vehiculo v : stock) {
			if (matricula.equalsIgnoreCase(v.getMatricula())) {
				encontrado = true;
				vm = v;
				break;
			}
		}

		if (!encontrado) {
			System.out.println("Vehiculo no encontrado");

		} else {
			// Pedir datos nuevos
			System.out.println("Matricula(" + vm.getMatricula() + "):");
			vm.setMatricula(sc.nextLine());

			System.out.println("Color(" + vm.getColor() + "):");
			vm.setColor(sc.nextLine());

			System.out.println("Asientos(" + vm.getAsientos() + "):");
			boolean error = true;

			do {
				try {
					vm.setAsientos(Integer.parseInt(sc.nextLine()));
					error = false;
				} catch (Exception e) {
					System.out.println("es incorrecto, prueba de nuevo:");
				}
			} while (error);

			System.out.println("Ruedas(" + vm.getRuedas() + "):");

			do {
				try {
					vm.setRuedas(Integer.parseInt(sc.nextLine()));
					error = false;
				} catch (Exception e) {
					System.out.println("es incorrecto, prueba de nuevo:");
				}
			} while (error);

		}

	}// modificar

	private static void listar() {
		System.out.println("--------------------------------------");
		System.out.println(" Listado Vehiculos");
		System.out.println("--------------------------------------");
		for (Vehiculo vehiculo : stock) {
			System.out.println(vehiculo);
		}
		System.out.println("");
		System.out.println("");

	}

	private static void leerOpcion() {
		System.out.println("Elije una opcion del menu:");
		opcion = sc.nextLine();

	}

	private static void menu() {
		System.out.println("1. Listar");
		System.out.println("2. Dar de Alta");
		System.out.println("3. Dar de baja");
		System.out.println("4. modificar");
		System.out.println("------------------");
		System.out.println("S- salir");

	}

}
