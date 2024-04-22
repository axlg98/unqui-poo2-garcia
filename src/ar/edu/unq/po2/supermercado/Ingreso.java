package ar.edu.unq.po2.supermercado;

public class Ingreso {
	private String mes;
	private String concepto;
	private Double montoPercibido;
	
	public Ingreso(String mes, String concepto, Double montoPercibido){
		this.setMes(mes);
		this.setConcepto(concepto);
		this.setMontoPercibido(montoPercibido);
	}
	
	public Double montoImponible(Trabajador trabajador) {
		return trabajador.getMontoImponible();
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public Double getMontoPercibido() {
		return montoPercibido;
	}

	public void setMontoPercibido(Double montoPercibido) {
		this.montoPercibido = montoPercibido;
	}
	
	
	
}
