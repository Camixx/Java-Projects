package ar.edu.ort.tp1.pacial1.clases;

public abstract class Mueble implements Mostrable{
	
	private String modelo;
	private float costoBase;
	private float porcentajeGanancia;

	public Mueble(String modelo, float costoBase, float porcentajeGanancia) {
		setModelo(modelo);
		setCostoBase(costoBase);
		setPorcentajeGanancia(porcentajeGanancia);
	}

	private void setPorcentajeGanancia(float porcentajeGanancia) {
		this.porcentajeGanancia = porcentajeGanancia;		
	}

	private void setCostoBase(float costoBase) {
		this.costoBase = costoBase;		
	}
	
	private void setModelo(String modelo) {
		this.modelo = modelo;		
	}

	public abstract float calcularPrecioVenta();
	
	protected float getCostoBase() {
		return costoBase;
	}

	public boolean modeloCorrecto(String modelo) {
	
		boolean esCorrecto = false;
		
		if(this.modelo.equals(modelo)) {
			esCorrecto = true;
		}
		
		return esCorrecto;
	}

	@Override
	public void mostrar() {
		
		System.out.println("Mueble tipo: " + getClass() + " - Modelo: " + this.modelo + " - Precio de venta: " + this.calcularPrecioVenta());
		
	}

	public String getModelo() {
		return this.modelo;
	}
	

	

}
