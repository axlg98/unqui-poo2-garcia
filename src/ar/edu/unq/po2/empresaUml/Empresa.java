package ar.edu.unq.po2.empresaUml;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	String nombre;
	String cuit;
	List<Empleado> empleados;
	
	public Empresa(String nombre,String cuit) {
		empleados = new ArrayList<Empleado>();
		this.nombre = nombre;
		this.cuit = cuit;
	}
	
	public void agregarEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}
	
	public Double sueldoTotalBruto() {
		Double totalSueldoBruto = 0D;
		for(Empleado e : empleados) {
			totalSueldoBruto += e.sueldoBruto();
		}
		return totalSueldoBruto;
	}
	
	public Double sueldoTotalBasico() {
		Double totalSueldoBasico = 0D;
		for(Empleado e : empleados) {
			totalSueldoBasico += e.getSueldoBasico();
		}
		return totalSueldoBasico;
	}
	
	
}
