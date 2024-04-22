package ar.edu.unq.po2.empresaUml;

public class PlantaTemporaria extends Empleado{
	int edad;
	int horaExtra;
	
	public Double sueldoBruto() {
		return this.getSueldoBasico() + (this.getHoraExtra() * 40); 
	}
	
	// this.cantidadSiSuperaLaEdad() + this.cantidadAporteJubilatorio()
	
	public int cantidadSiSuperaLaEdad() {
		if(this.getEdad() > 50) {
			return 25;
		}else {
			return 0;
		}
	}
	
	public Double retenciones() {
		return this.obraSocial() + +this.cantidadAporteJubilatorio();
	}
	
	public Double cantidadAporteJubilatorio() {
		return (this.sueldoBruto()* 0.10) + (5 * this.getHoraExtra());
	}	
	
	public Double obraSocial() {
		return (this.sueldoBruto() * 0.10) + this.cantidadSiSuperaLaEdad();
	}
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getHoraExtra() {
		return horaExtra;
	}

	public void setHoraExtra(int horaExtra) {
		this.horaExtra = horaExtra;
	}
	
}
