package ar.edu.unq.po2.mercadoCentral;

public class Servicio implements Facturable{
	private Double costoPorUnidad;
	private int cantidadDeUnidad;
	
	private Agencia agencia;
	private Factura factura;
	
	public Servicio(Double costoPorUnidad, int cantidadDeUnidad) {
		this.setCostoPorUnidad(costoPorUnidad);
		this.setCantidadDeUnidad(cantidadDeUnidad);
	}
	
	@Override
	public Double montoAPagar() {
		return this.getCantidadDeUnidad() * this.getCostoPorUnidad();
	}
	
	@Override
	public void registrar() {
		agencia = new AgenciaCooperativa();
		factura = new Factura(this.montoAPagar());
		agencia.registrarPago(factura);
	}
	
	//GET Y SET
	
	
	
	public int getCantidadDeUnidad() {
		return cantidadDeUnidad;
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

	public void setCantidadDeUnidad(int cantidadDeUnidad) {
		this.cantidadDeUnidad = cantidadDeUnidad;
	}

	public Double getCostoPorUnidad() {
		return costoPorUnidad;
	}

	public void setCostoPorUnidad(Double costoPorUnidad) {
		this.costoPorUnidad = costoPorUnidad;
	}
	
	
}
