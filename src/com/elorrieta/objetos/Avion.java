package com.elorrieta.objetos;

public final class Avion extends Vehiculo {

	private int alas;

	public Avion() {
		super();
		this.alas = 2;
	}

	public Avion(String matricula, String color, int asientos, int ruedas) {
		super(matricula, color, asientos, ruedas);

	}

	public int isAlas() {
		return alas;
	}

	public void setAlas(int alas) {
		this.alas = alas;
	}

	public void getAlas() {

	}

	@Override
	public void arrancar() {
		System.out.println("Sistemas operativos");
	}

	public void parar() {
		System.out.println("El motor esta en llamas, estamos parados aqui");

	}

}
