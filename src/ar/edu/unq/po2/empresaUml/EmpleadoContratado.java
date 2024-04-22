package ar.edu.unq.po2.empresaUml;

public class EmpleadoContratado extends Empleado{
	
	int nroContrato;
	String medioDePago;
	
	public EmpleadoContratado() {
		
	};
	
	public Double sueldoBruto() {
		return this.getSueldoBasico();
	}
	
	
	
}
