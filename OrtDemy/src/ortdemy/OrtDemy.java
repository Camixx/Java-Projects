package ortdemy;

import java.util.ArrayList;

public class OrtDemy {

	private ArrayList<Usuario> usuarios;
	private ArrayList<Curso> cursos;
	private ArrayList<Categoria> categorias;
	static private int MAX_BECADOS = 5;

	public OrtDemy() {
		this.usuarios = new ArrayList<Usuario>();
		this.cursos = new ArrayList<Curso>();
		this.categorias = new ArrayList<Categoria>();
	}

	public ResultadoSuscripcion suscribirseAcurso(String idUsuario, String idCurso) {

		ResultadoSuscripcion resultado;

		Usuario usuario = buscarUsuario(idUsuario);

		if (usuario == null) {
			resultado = ResultadoSuscripcion.USUARIO_INEX;
		} else {
			Curso curso = buscarCurso(idCurso);
			if (curso == null) {
				resultado = ResultadoSuscripcion.CURSO_INEX;
			} else {
				if (curso.buscarUsuario(idUsuario) == true) {
					resultado = ResultadoSuscripcion.YA_SUSCRIPTO;
				} else {
					if (idUsuario.equals(curso.getIdAutor())) {
						resultado = ResultadoSuscripcion.ES_AUTOR;
					} else {
						if (usuario.esBecado() == true && curso.cantBecados() == 5) {
							resultado = ResultadoSuscripcion.MAX_BECADOS;
						} else {
							curso.agregarUsuario(usuario);
							resultado = ResultadoSuscripcion.SUSCRIPTO_OK;
						}
					}
				}
			}

		}

		return resultado;

	}

	private Curso buscarCurso(String idCurso) {

		Curso cursoBuscado = null;
		int i = 0;

		while (i < cursos.size() && cursoBuscado == null) {
			if (idCurso.equals(cursos.get(i).getId())) {
				cursoBuscado = cursos.get(i);
			}
			i++;
		}

		return cursoBuscado;
	}

	private Usuario buscarUsuario(String idUsuario) {

		Usuario usuarioBuscado = null;
		int i = 0;

		while (i < usuarios.size() && usuarioBuscado == null) {
			if (idUsuario.equals(usuarios.get(i).getId())) {
				usuarioBuscado = usuarios.get(i);
			}
			i++;
		}

		return usuarioBuscado;
	}

}
