package ar.edu.unq.po2.mercadoCentral;

public class Producto implements Facturable{
	private Double precio;
	private int cantidad;
	
	public Producto(Double precio, int cantidad) {
		this.setPrecio(precio);
		this.setCantidad(cantidad);
	}
	
	@Override
	public Double montoAPagar() {
		return this.getPrecio();
	}
	
	@Override
	public void registrar() {
		this.decrementarStock();
	}
	
	public void decrementarStock() {
		if(this.getCantidad() > 0) {
			this.setCantidad(this.getCantidad() - 1);
		}
	}
	
	public void aumentarStock(int unaCantidad) {
		this.setCantidad(this.getCantidad() + unaCantidad);
	}
	
	
	public int getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	
}
