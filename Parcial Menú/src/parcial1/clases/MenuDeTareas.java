package parcial1.clases;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuDeTareas extends Menu {

	public MenuDeTareas(String titulo, Scanner input) {
		super(titulo, input);
	}

	public void registrar(OpcionOnOff opcion) {
		super.registrar(opcion);
	}
	
	public int getTotalTareasCumplidas() {
		int cantTareas = 0;
		ArrayList<OpcionDeMenu> items = super.getItems();

		for (OpcionDeMenu o : items) {
			if (o instanceof OpcionOnOff) {
				if (((OpcionOnOff) o).estaActivada() == true) {
					cantTareas++;
				}
			}
		}

		return cantTareas;
	}
	
	

}
