package ar.edu.unq.po2.mercadoCentral;

import java.util.ArrayList;
import java.util.List;

public class Stock {
	private List<Producto> prodsStock;
	
	public Stock() {
		this.prodsStock = new ArrayList<Producto>();
	}
	
	public void agregarProducto(Producto producto) {
		prodsStock.add(producto);
	}
	
	public void decrementarStock(Producto producto) {
		if(prodsStock.contains(producto)) {
			this.getProdsStock().remove(producto);
		}
	}

	public List<Producto> getProdsStock() {
		return prodsStock;
	}

	public void setProdsStock(List<Producto> prodsStock) {
		this.prodsStock = prodsStock;
	}
	
	
}
