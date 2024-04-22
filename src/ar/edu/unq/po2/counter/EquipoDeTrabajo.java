package ar.edu.unq.po2.counter;

import java.util.ArrayList;
import java.util.List;

public class EquipoDeTrabajo {
	
	private String nombreEquipo;
	List<UnaPersona> personas;
	
	public EquipoDeTrabajo(String nombreEquipo) {
		personas = new ArrayList<UnaPersona>();
		this.setNombreEquipo(nombreEquipo);
	}
	
	public Double promedioDeEdadDeLasPersonas() {
		Double todasLasEdades = this.cantidadDeEdadesDeTodasLasPersonas();
		return todasLasEdades / this.getPersonas().size();
	}
	
	public Double cantidadDeEdadesDeTodasLasPersonas() {
		Double todasLasEdades = 0D;
		for(UnaPersona persona : this.getPersonas()) {
			todasLasEdades += persona.getEdad();
		}
		return todasLasEdades;
	}
	
	public void agregarPersona(UnaPersona persona) {
		personas.add(persona);
	}
	
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}
	public List<UnaPersona> getPersonas() {
		return personas;
	}
	public void setPersonas(List<UnaPersona> personas) {
		this.personas = personas;
	}
	
	
	
}
