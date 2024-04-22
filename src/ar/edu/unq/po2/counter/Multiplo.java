package ar.edu.unq.po2.counter;

public class Multiplo {
	
	 private int x;
	 private int y;
	
	public Multiplo() {
		
	}
	
	public Multiplo(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public int multiploDe() {
		int valor = this.getX() * this.getY();
		int resultado = 0;
		while(valor < 1000){
			resultado = valor;
			valor += this.getX() * this.getY();
		}
		
		if(valor >= 100 || valor == 0) {
			valor = -1;
		}else {
			resultado = valor;
		}
		return resultado;
	}
	
}
