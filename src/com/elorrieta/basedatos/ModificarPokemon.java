package com.elorrieta.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ModificarPokemon {

	public static void main(String[] args) {

		String sql = "UPDATE pokemon SET nombre = ?, numero = ?, precio = ?, brillante = ? WHERE id = ? ;";

		try (Scanner sc = new Scanner(System.in);
				Connection con = DriverManager.getConnection("jdbc:sqlite:pokemon.db");
				PreparedStatement pst = con.prepareStatement(sql)) {

			// Pedir datos por consola

			System.out.println("Dime el ID para modificar un pokemon:");
			int id = Integer.parseInt(sc.nextLine());

			System.out.println("Dime el nombre nuevo:");
			String nombre = sc.nextLine();

			System.out.println("Dime el numero");
			String numero = sc.nextLine();

			System.out.println("Dime el precio");
			float precio = sc.nextFloat();

			System.out.println("Dime si es brillante (Si=1 o No=0");
			int brillante = sc.nextInt();

			// Sustituir las ?

			pst.setString(1, nombre);
			pst.setString(2, numero);
			pst.setFloat(3, precio);
			pst.setInt(4, brillante);
			pst.setInt(5, id);

			int filas = pst.executeUpdate(); // ejecuta la SQL contra la bbdd que nos hemos conectado
			if (filas == 1) {
				System.out.println("Pokemon modificada");
			} else {
				System.out.println("Pokemon NO modificada");

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
