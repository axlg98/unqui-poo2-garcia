package ar.edu.unq.po2.supermercado;

public class Producto {
	private String nombre;
	private Double precio;
	private Double precioCuidado;
	private boolean esPrecioCuidado;
	
	//CONSTRUCTOR
	
	public Producto(String nombre, Double precio) {
		this.setNombre(nombre);
		this.setPrecio(precio);
	}
	//
	
	public Double calcularPrecio() {
		Double  precio = 0D;
		if(this.isEsPrecioCuidado()) {
			precio += (this.getPrecio() * this.getPrecioCuidado());		
		}else {
			precio += this.getPrecio();
		}
		return precio;
	}
	
	//GET Y SET

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public boolean isEsPrecioCuidado() {
		return esPrecioCuidado;
	}

	public void setEsPrecioCuidado(boolean esPrecioCuidado) {
		this.esPrecioCuidado = esPrecioCuidado;
	}
	
	public Double getPrecioCuidado() {
		return precioCuidado;
	}

	public void setPrecioCuidado(Double precioCuidado) {
		this.precioCuidado = precioCuidado;
	}
	
}
