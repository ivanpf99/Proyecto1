package com.elorrieta.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ListadoPokemon {

	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection("jdbc:sqlite:pokemon.db");
				Statement st = con.createStatement();
				ResultSet rs = st
						.executeQuery("SELECT id, nombre,numero,precio,brillante FROM pokemon ORDER BY nombre ASC; ");

		) {

			while (rs.next()) {

				String nombre = rs.getString("nombre");
				String numero = rs.getString("numero");
				int precio = rs.getInt("precio");
				int brillante = rs.getInt("brillante");
				int id = rs.getInt("id");

				System.out.println(id + " - " + nombre + " - " + numero + " - " + precio + " - " + brillante);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}// main

}
