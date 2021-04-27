package com.elorrieta.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertarPokemon {

	public static void main(String[] args) {

		String sql = "INSERT INTO pokemon (nombre,numero,precio,brillante) VALUES (?,?,?,?) ;";

		try (Scanner sc = new Scanner(System.in);
				Connection con = DriverManager.getConnection("jdbc:sqlite:pokemon.db");
				PreparedStatement pst = con.prepareStatement(sql)) {

			String salir = "";
			while (!"s".equalsIgnoreCase(salir)) {

				System.out.println("Dime el nombre");
				String nombre = sc.nextLine();

				System.out.println("Dime el numero");
				String numero = sc.nextLine();

				System.out.println("Dime el precio");
				float precio = sc.nextFloat();

				System.out.println("Dime si es brillante (Si=1 o No=0");
				int brillante = sc.nextInt();

				pst.setString(1, nombre);
				pst.setString(2, numero);
				pst.setFloat(3, precio);
				pst.setInt(4, brillante);
				pst.executeUpdate();

				System.out.println("¿ quieres salir ? S-Si     N-No");
				salir = sc.nextLine();

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
