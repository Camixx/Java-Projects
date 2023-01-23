package parcial1.clases;

public class OpcionOnOff extends OpcionDeMenu implements Activable {

	private boolean estaActivada;

	public OpcionOnOff(String descripcion, char charSelector) {
		super(descripcion, charSelector);
		desactivar();
	}

	public OpcionOnOff(String descripcion, char charSelector, boolean estadoInicial) {
		super(descripcion, charSelector);
		setEstado(estadoInicial);
	}

	public void setEstado(boolean estado) {
		this.estaActivada = estado;
	}
	
	

	@Override
	public void mostrar() {

		String grafico;

		if (estaActivada == true) {
			grafico = "[X]";
		} else {
			grafico = "[ ]";
		}

		System.out.println(grafico + " " + super.getCharSelector() + " - " + super.getDescripcion());
	}

	@Override
	public void ejecutar() {
		if(estaActivada == true) {
			desactivar();
		}else {
			activar();
		}
	}

	@Override
	public void activar() {
		setEstado(true);
		
	}

	@Override
	public void desactivar() {
		setEstado(false);
		
	}

	@Override
	public boolean estaActivada() {
		return estaActivada;
	}
	
	

}
