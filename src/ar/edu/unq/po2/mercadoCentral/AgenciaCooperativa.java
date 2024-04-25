package ar.edu.unq.po2.mercadoCentral;

public class AgenciaCooperativa implements Agencia{
	
	public AgenciaCooperativa() {
		
	}
	
	@Override
	public void registrarPago(Factura factura) {
		System.out.print( "Costo de la Factura: " + factura.getPrecioFactura() + ".");
	}
	
}
