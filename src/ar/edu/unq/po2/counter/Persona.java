package ar.edu.unq.po2.counter;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	private LocalDate anioDeNacimiento;
	private String nombre;
	
	public Persona(LocalDate anioDeNacimiento, String nombre) {
		super();
		this.setAnioDeNacimiento(anioDeNacimiento);
		this.setNombre(nombre);
	}
	
	public int edadDeLaPersona() {
		LocalDate hoy = LocalDate.now();
		Period periodo = Period.between(this.getAnioDeNacimiento(),hoy);
		return periodo.getYears();
 	}
	
	public boolean menorQue(Persona persona){
		return this.edadDeLaPersona() < persona.edadDeLaPersona();
		
	}
	
	//GET Y SET

	public LocalDate getAnioDeNacimiento() {
		return anioDeNacimiento;
	}

	public void setAnioDeNacimiento(LocalDate anioDeNacimiento) {
		this.anioDeNacimiento = anioDeNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}
