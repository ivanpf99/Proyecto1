package com.elorrieta.objetos;

public class Vehiculo implements Cantarin, Conducible {

	private String matricula;
	private String color;
	private int asientos;
	private int ruedas;

	public Vehiculo() {
		super();
		System.out.println("constructor por defecto");
		this.matricula = "";
		this.color = "blanco";
		this.asientos = 1;
		this.ruedas = 2;
	}

	public Vehiculo(String _matricula) {
		this();
		System.out.println("constructor con matricula");
		/*
		 * this() hace todas esta lineas super(); this.matricula = ""; this.color =
		 * "blanco"; this.asientos = 1; this.ruedas = 2;
		 */
		this.matricula = _matricula;
	}

	public Vehiculo(String _matricula, String _color) {
		// this();
		// this.matricula = _matricula;
		this(_matricula);
		System.out.println("constructor con matricula y color");
		this.color = _color;

	}

	public Vehiculo(String matricula, String color, int asientos, int ruedas) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.asientos = asientos;
		this.ruedas = ruedas;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAsientos() {
		return asientos;
	}

	public void setAsientos(int asientos) {
		this.asientos = asientos;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", color=" + color + ", asientos=" + asientos + ", ruedas=" + ruedas
				+ "]";
	}

	@Override
	public void cantar() {
		System.out.println("A Jose Maria hoy le han regalado un coche pepino que se conduce sin las manos");

	}

	@Override
	public void arrancar() {
		System.out.println("Brum Brum Brum");

	}

	@Override
	public void parar() {
		System.out.println("Brum!!!!");

	}

	@Override
	public void girar() {
		System.out.println("Todo a la derecha");

	}

	@Override
	public void tocarBocina() {
		System.out.println("Aua Aua");

	}
}
