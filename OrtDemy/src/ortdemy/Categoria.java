package ortdemy;

import java.util.ArrayList;

public class Categoria {

	private String id;
	private String nombre;
	private ArrayList<Curso> cursos;

	public Categoria(String id, String nombre) {
		this.id = id;
		this.nombre = nombre;
		this.cursos = new ArrayList<Curso>();
	}

}
