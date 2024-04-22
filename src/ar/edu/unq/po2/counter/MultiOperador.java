package ar.edu.unq.po2.counter;

import java.util.ArrayList;
import java.util.List;

public class MultiOperador {
	List<Integer> numeros;
	
	public MultiOperador() {
		numeros = new ArrayList<Integer>();
	}
	
	public int sumarLosNumeros() {
		int contador = 0;
		for(Integer i : numeros) {
			contador += i;
		}
		return contador;
	}
	
	public int restarLosNumeros() {
		int contador = 0;
		for(Integer i : numeros) {
			contador -= i;
		}
		return contador;
	}
	
	public int multiplicacionDeLosNumeros() {
		int contador = 1;
		for(Integer i : numeros) {
			contador *= i;
		}
		return contador;
	}
	
	public void agregarNumero(int x) {
		numeros.add(x);
	}
}
