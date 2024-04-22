package ar.edu.unq.po2.empresaUml;

import java.sql.Date;
import java.time.LocalDate;

public class Empleado {
	
	String nombre;
	String direccion;
	String estadoCivil;
	Date fechaDeNacimiento;
	Double sueldoBasico;
	
	public Empleado() {
		
	}
	
	public Double sueldoBruto() {
		return 0D;
	}
	
	public Double sueldoNeto() {
		return 0D;
	}
	
	public Double retenciones() {
		return 0D;
	}
	
	public Double obraSocial() {
		return 0D;
	}

	public Double getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(Double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}
}
