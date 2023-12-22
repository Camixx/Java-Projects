package ortdemy;

import java.util.ArrayList;

public class Curso {

	private String id;
	private String titulo;
	private double precio;
	private double valoracion;
	private Usuario autor;
	private ArrayList<Usuario> usuariosSuscriptos;
	private ArrayList<Leccion> lecciones;

	public Curso(String id, String titulo, double precio, double valoracion, Usuario autor) {
		this.id = id;
		this.titulo = titulo;
		this.precio = precio;
		this.valoracion = valoracion;
		this.autor = autor;
		this.usuariosSuscriptos = new ArrayList<Usuario>();
		this.lecciones = new ArrayList<Leccion>();
	}

	public boolean buscarUsuario(String idUsuario) {
		boolean usuarioEncontrado = false;
		int i = 0;

		while (i < usuariosSuscriptos.size() && usuarioEncontrado == false) {
			if (idUsuario.equals(usuariosSuscriptos.get(i).getId())) {
				usuarioEncontrado = true;
			}
			i++;
		}

		return usuarioEncontrado;
	}

	public String getIdAutor() {
		return this.autor.getId();
	}

	public int cantBecados() {
		int usuariosBecados = 0;
		int i = 0;

		while (i < usuariosSuscriptos.size()) {
			if (usuariosSuscriptos.get(i).esBecado() == true) {
				usuariosBecados++;
			}
			i++;
		}

		return usuariosBecados;

	}

	public void agregarUsuario(Usuario usuario) {
		this.usuariosSuscriptos.add(usuario);

	}

	public String getId() {
		return this.id;
	}

}
