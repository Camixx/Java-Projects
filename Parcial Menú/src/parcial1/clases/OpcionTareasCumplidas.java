package parcial1.clases;

public class OpcionTareasCumplidas extends OpcionDeMenu {

	private MenuDeTareas menu;
	
	public OpcionTareasCumplidas(String descripcion, char charSelector, MenuDeTareas menu) {
		super(descripcion, charSelector);
		setMenu(menu);
	}
	
	public void setMenu(MenuDeTareas menu) {
		this.menu = menu;
	}

	@Override
	public void ejecutar() {
		System.out.println("Cantidad de tareas cumplidas: " + menu.getTotalTareasCumplidas());
	}

}
