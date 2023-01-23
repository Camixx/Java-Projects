package ar.edu.ort.tp1.pacial1.clases;

public class Silla extends Mueble {

	private static final int COEFICIENTE_SILLA = 3;
	private long alto;
	private MaterialSilla material;

	public Silla(String modelo, float costoBase, float porcentajeGanancia, long alto, MaterialSilla material) {
		super(modelo, costoBase, porcentajeGanancia);
		setAlto(alto);
		setMaterialSilla(material);
	}


	private void setMaterialSilla(MaterialSilla material) {
		this.material = material;		
	}


	private void setAlto(long alto) {
		this.alto = alto;		
	}


	@Override
	public float calcularPrecioVenta() {
		float precio = super.getCostoBase() + (alto * material.getMultiplicadorValor());
		
		return precio;
	}



	
	
	
}
