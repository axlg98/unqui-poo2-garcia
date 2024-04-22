package ar.edu.unq.po2.empresaUml;

public class PlantaPermanente extends Empleado{
	
	Double cantidadHijos;
	boolean tieneConyuge;
	int anioAntiguedad;
	

	public Double sueldoBruto() {
		return this.getSueldoBasico() + this.salarioFamiliar(); 
	}
	
	public Double salarioFamiliar() {
		return this.asignacionHijo() + this.asignacionConyuge();
	}
	
	public Double asignacionHijo() {
		return (150 * this.getCantidadHijos()) + this.aniosDeAntiguedad();
	}
	
	public int asignacionConyuge() {
		if(this.isTieneConyuge()) {
			return 100;
		}else {
			return 0;
		}
	}
	
	public int aniosDeAntiguedad() {
		return 50 * this.getAnioAntiguedad();
	}
	
	public Double retenciones() {
		return this.obraSocial() + this.aportesJubilacion();
	}
	
	public Double obraSocial() {
		return (this.sueldoBruto() * 10) + this.cantidadPorHijos();
	}
	
	public Double aportesJubilacion() {
		return this.sueldoBruto() * 0.05;
	}
	
	public Double cantidadPorHijos() {
		return 20 * this.getCantidadHijos();
	}

	public void setAnioAntiguedad(int anioAntiguedad) {
		this.anioAntiguedad = anioAntiguedad;
	}
	
	public int getAnioAntiguedad() {
		return anioAntiguedad;
	}

	public void seAnioAntiguedad(int anioAntiguedad) {
		this.anioAntiguedad = anioAntiguedad;
	}
	
	public boolean isTieneConyuge() {
		return tieneConyuge;
	}

	public void setTieneConyuge(boolean tieneConyuge) {
		this.tieneConyuge = tieneConyuge;
	}
	
	public Double getCantidadHijos() {
		return cantidadHijos;
	}

	public void setCantidadHijos(Double cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}
	
}
