package com.elorrieta.objetos;

public class Pokemon {

	// atributos

	private String nombre;
	private float precio;
	private int numero;
	private boolean isBrillante;

	// constructor

	public Pokemon() {
		super();
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

	public void setPrecio(float precio) {
		this.precio = (precio >= 0) ? precio : 0;
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

}
