package com.elorrieta.objetos;

public class Pokemon {

	// atributos
	private int id;
	private String nombre;
	private float precio;
	private int numero;
	private boolean isBrillante;

	// constructor

	public Pokemon() {
		super();
		this.id = 0;
		this.nombre = "sin nombre";
		this.precio = 0;
		this.numero = 0;
		this.isBrillante = false;
	}

	public Pokemon(String nombre) {
		this(); // Llamamos al contructor de arriba
		this.nombre = nombre;
	}

	public Pokemon(String nombre, float precio) {
		this(); // Cambiar siempre super por this
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		if (isBrillante) {
			return precio * 2;
		} else {
			return precio;
		}

	}

	public void setPrecio(float precio) throws Exception {
		if (precio < 0) {
			throw new Exception("El precio deve ser 0 o superior");
		}

		this.precio = precio;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean isBrillante() {
		return isBrillante;
	}

	public void setBrillante(boolean isBrillante) {
		this.isBrillante = isBrillante;
	}

	@Override
	public String toString() {
		return "Pokemon [nombre=" + nombre + ", precio=" + getPrecio() + ", numero=" + numero + ", isBrillante="
				+ isBrillante + "]";
	}

	public void setVida(int i) {
		// TODO Auto-generated method stub

	}

	public String nombreYvida() {
		// TODO Auto-generated method stub
		return null;
	}

	public int atacar() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int vida(int ataque1) {
		// TODO Auto-generated method stub
		return 0;
	}

}
