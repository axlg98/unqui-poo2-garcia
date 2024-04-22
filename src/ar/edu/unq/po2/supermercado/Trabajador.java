package ar.edu.unq.po2.supermercado;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	private Double totalPercibido;
	private Double impuestoAPagar;
	private Double montoImponible;
	private List<Ingreso> ingresos;
	
	public Trabajador() {
		ingresos = new ArrayList<Ingreso>();
	}

	public void agregarIngreso(Ingreso ingreso) {
		this.ingresos.add(ingreso);
	}
	
	public Double getMontoImponible() {
		return montoImponible;
	}
	
	public Double getImpuestoAPagar() {
		impuestoAPagar += this.getMontoImponible() * 0.2;
		return impuestoAPagar ;
	}
	
	public Double montoImponible(Ingreso ingreso) {
		return ingreso.montoImponible(this);
	}
	
	public Double cantidadDeMontoImponible() {
		Double cantidad = 0D;
		for(Ingreso ingreso : this.getIngresos()) {
			cantidad += ingreso.montoImponible(this);
		}
		return cantidad;
	}
	
	//GETTER Y SETTER

	public List<Ingreso> getIngresos() {
		return ingresos;
	}

	public void setIngresos(List<Ingreso> ingresos) {
		this.ingresos = ingresos;
	}
	
	public Double getTotalPercibido() {
		return totalPercibido;
	}
	
	
	
}
