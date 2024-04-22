package ar.edu.unq.po2.counter;

import java.util.ArrayList;
import java.util.List;

public class Counter {
	
	private List<Integer> numeros;
	
	public Counter() {
		numeros= new ArrayList<Integer>();
	}
	
	public int cantidadDePares() {
		int cantidad = 0;
		for(Integer numero : this.getNumeros()) {
			if (numero % 2 == 0) {
				cantidad += 1;
			}
		}
		return cantidad;
	}
	
	public int cantidadDeImpares() {
		int cantidad = 0;
		for(Integer numero : this.getNumeros()) {
			if (numero % 2 > 0) {
				cantidad += 1;
			}
		}
		return cantidad;
	}
	
	public int cantidadMultiplo(int x) {
		int cantidad = 0;
		for(Integer numero : this.getNumeros()) {
			if (numero % x == 0) {
				cantidad += 1;
			}
		}
		return cantidad;
	}
	
	//Agregar número
	
	public void addNumber(int numero) {
		numeros.add(numero);
	}
	
	//GET
	
	public List<Integer> getNumeros() {
		return numeros;
	}
	
}
