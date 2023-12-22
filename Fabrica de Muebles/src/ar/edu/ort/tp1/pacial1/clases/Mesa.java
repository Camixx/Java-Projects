package ar.edu.ort.tp1.pacial1.clases;

public class Mesa extends Mueble {

	private static final float COEFICIENTE_SUPERFICIE = 0.2f;
	private long largo;
	private long ancho;
	private TipoMesa tipoMesa;
	
	
	public Mesa(String modelo, float costoBase, float porcentajeGanancia, long largo, long ancho, TipoMesa tipo) {
		super(modelo, costoBase, porcentajeGanancia);
		setLargo(largo);
		setAncho(ancho);
		setTipoMesa(tipo);
	}


	private void setTipoMesa(TipoMesa tipo) {
		this.tipoMesa = tipo;		
	}


	private void setAncho(long ancho) {
		this.ancho = ancho;		
	}


	private void setLargo(long largo) {
		this.largo = largo;		
	}


	@Override
	public float calcularPrecioVenta() {
		
		float precio = ((super.getCostoBase() * tipoMesa.getMultiplicadorValor()) + COEFICIENTE_SUPERFICIE) * largo * ancho;
		
		return precio;
	}
	
	

}
