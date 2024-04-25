package ar.edu.unq.po2.mercadoCentral;

public class Impuesto implements Facturable{
	private Double tasaDeServicio;
	
	private Agencia agencia;
	private Factura factura;
	
	public Impuesto(Double tasaDeServicio) {
		this.setTasaDeServicio(tasaDeServicio);
	}
	
	@Override
	public Double montoAPagar() {
		return this.getTasaDeServicio();
	}
	
	@Override
	public void registrar() {
		agencia = new AgenciaCooperativa();
		factura = new Factura(this.montoAPagar());
		agencia.registrarPago(factura);
	}
	
	//GET Y SET	
	
	public Double getTasaDeServicio() {
		return tasaDeServicio;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public void setTasaDeServicio(Double tasaDeServicio) {
		this.tasaDeServicio = tasaDeServicio;
	}
	
	
}
