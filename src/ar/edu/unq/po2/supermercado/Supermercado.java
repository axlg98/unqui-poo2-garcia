package ar.edu.unq.po2.supermercado;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private String nombreSupermercado;
	private String direccionSupermercado;
	List<Producto> productos;
	
	//CONSTUCTORES
	public Supermercado() {
		
	}
	
	public Supermercado(String nombreSupermercado, String direccionSupermercado) {
		this.productos = new ArrayList<Producto>();
		this.setNombreSupermercado(nombreSupermercado);
		this.setDireccionSupermercado(direccionSupermercado);
	}
	
	public Double todosLosPreciosDelSupermercado() {
		Double precioTotal = 0D;
		for (Producto producto : productos) {
			precioTotal += producto.calcularPrecio();
		}
		return precioTotal;
	}

	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	
	public int cantidadTotalDeProductos() {
		return productos.size();
	}
	
	//GETTER Y SETTER
	public String getNombreSupermercado() {
		return nombreSupermercado;
	}
	public void setNombreSupermercado(String nombreSupermercado) {
		this.nombreSupermercado = nombreSupermercado;
	}
	public String getDireccionSupermercado() {
		return direccionSupermercado;
	}
	public void setDireccionSupermercado(String direccionSupermercado) {
		this.direccionSupermercado = direccionSupermercado;
	}
	
	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	
}
