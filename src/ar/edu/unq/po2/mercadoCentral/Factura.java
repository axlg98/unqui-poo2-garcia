package ar.edu.unq.po2.mercadoCentral;

public class Factura {
	private Double precioFactura;
	
	public Factura(Double precioFactura) {
		this.setPrecioFactura(precioFactura);
	}
	
	//GET Y SET

	public Double getPrecioFactura() {
		return precioFactura;
	}

	public void setPrecioFactura(Double precioFactura) {
		this.precioFactura = precioFactura;
	}
	
	
}
