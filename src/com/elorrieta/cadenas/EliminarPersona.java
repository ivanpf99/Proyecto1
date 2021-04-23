package com.elorrieta.cadenas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EliminarPersona {

	public static void main(String[] args) {

		String sql = "DELETE FROM person WHERE id = ? ;";

		try (Connection con = DriverManager.getConnection("jdbc:sqlite:sample.db");
				PreparedStatement pst = con.prepareStatement(sql)) {

			// TODO pedir datos por consola

			int id = 0;
			Scanner sc = new Scanner(System.in);

			System.out.println("Introduzca la id que desea eliminar");

			id = sc.nextInt();

			sc.close();

			// sustituimos las '?' de la SQL por las variables
			pst.setInt(1, id);

			int filas = pst.executeUpdate(); // ejecuta la SQL contra la bbdd que nos hemos conectado
			System.out.println("Hemos eliminado " + filas + " filas");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	} // main

}
