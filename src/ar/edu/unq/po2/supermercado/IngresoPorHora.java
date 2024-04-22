package ar.edu.unq.po2.supermercado;

public class IngresoPorHora extends Ingreso{
	private int cantHoraExtra;
	
	public IngresoPorHora(String mes,String concepto, Double montoPercibido, int cantHoraExtra) {
		super(mes,concepto,montoPercibido);
		this.setCantHoraExtra(cantHoraExtra);
	}
	
	@Override
	public Double montoImponible(Trabajador trabajador) {
		return 0D;
	}
	
	//GET Y SET

	public int getCantHoraExtra() {
		return cantHoraExtra;
	}

	public void setCantHoraExtra(int cantHoraExtra) {
		this.cantHoraExtra = cantHoraExtra;
	}
	
	
	
}
