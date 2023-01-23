package ar.edu.ort.tp1.pacial1.clases;

public class Sillon extends Mueble {

	private int cantCuerpos;
	private TelaSillon tela;
	
	public Sillon(String modelo, float costoBase, float porcentajeGanancia, int cantCuerpos, TelaSillon tela) {
		super(modelo, costoBase, porcentajeGanancia);
		setCantCuerpos(cantCuerpos);
		setTelaSillon(tela);
	}


	private void setTelaSillon(TelaSillon tela) {
		this.tela = tela;		
	}


	private void setCantCuerpos(int cantCuerpos) {
		this.cantCuerpos = cantCuerpos;		
	}


	@Override
	public float calcularPrecioVenta() {
	
		float precio = super.getCostoBase() * cantCuerpos * tela.getPorcentaje();
		
		return precio;
	}
	
	

}
