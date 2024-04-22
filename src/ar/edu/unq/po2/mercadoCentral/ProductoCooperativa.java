package ar.edu.unq.po2.mercadoCentral;

public class ProductoCooperativa extends Producto{
	public ProductoCooperativa(Double precio, int cantidad) {
		super(precio,cantidad);
	}
	
	@Override
	public Double montoAPagar() {
		return this.getPrecio() * 0.10;
	}
	
	
}
