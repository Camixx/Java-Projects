package droides;

import java.util.ArrayList;

public class Droide {

	private ArrayList<String> piezasOperativas;
	private ArrayList<String> piezasNoOperativas;
	private ArrayList<Droide> droidesRegistrados;

	public Droide() {

		this.piezasOperativas = new ArrayList<String>();
		this.piezasNoOperativas = new ArrayList<String>();
		this.droidesRegistrados = new ArrayList<Droide>();
	}

	public Resultado autoRepararse() {

		Resultado resultado = Resultado.REPARACION_IMPOSIBLE;
		int i = 0;
		boolean fueronCambiadas = false;

		while (i < piezasNoOperativas.size()) {
			String piezaCambiada = buscarPiezaEnDroide(piezasNoOperativas.get(i));
			if (piezaCambiada != null) {
				piezasNoOperativas.remove(piezaCambiada);
				piezasOperativas.add(piezaCambiada);
				fueronCambiadas = true;
			}

			i++;
		}

		if (piezasNoOperativas.size() == 0) {
			resultado = Resultado.COMPLETAMENTE_OPERATIVO;
		} else {
			if (fueronCambiadas == true) {
				resultado = Resultado.REPARACION_PARCIAL;
			}
		}

		return resultado;

	}

	private String buscarPiezaEnDroide(String piezaBuscada) {

		String piezaEncontrada = null;
		int i = 0;

		while (i < droidesRegistrados.size() && piezaEncontrada == null) {
			piezaEncontrada = droidesRegistrados.get(i).buscarPieza(piezaBuscada);
			i++;
		}

		return piezaEncontrada;

	}

	public String buscarPieza(String piezaBuscada) {

		String piezaEncontrada = null;
		int i = 0;

		while (i < piezasNoOperativas.size() && piezaEncontrada == null) {
			if (piezaBuscada.equals(piezasNoOperativas.get(i))) {
				piezaEncontrada = piezasNoOperativas.get(i);
				piezasNoOperativas.remove(i);
			}
			i++;
		}

		return piezaEncontrada;

	}
	

}
