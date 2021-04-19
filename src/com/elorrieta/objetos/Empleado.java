package com.elorrieta.objetos;

public class Empleado {
	// COMO ES PUBLICA PODEMOS AACEDER DESDE OTROAS CLASES
	public static final int SUELDO_MINIMO = 600;

	// atributos

	private String nombre;
	private float sueldo;
	private boolean becario;

	// constructor

	public Empleado() {
		super();
		this.nombre = "Anonimo";
		this.sueldo = SUELDO_MINIMO;
		this.becario = false;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setsueldo(float sueldo) {
		this.sueldo = (sueldo >= 600) ? sueldo : 600;
	}

	public boolean becario() {
		return becario;
	}

	public void setBecario(boolean becario) {
		this.becario = becario;
		if (becario)
			;
		{
			this.sueldo = 0;
		}
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + ", isBecario=" + becario + "]";
	}

}
