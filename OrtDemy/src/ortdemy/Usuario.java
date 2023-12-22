package ortdemy;

public class Usuario {

	private String id;
	private String nombre;
	private String mail;
	private boolean esBecado;

	public Usuario(String id, String nombre, String mail, boolean esBecado) {
		this.id = id;
		this.nombre = nombre;
		this.mail = mail;
		this.setEsBecado(esBecado);
	}

	public boolean esBecado() {
		return this.esBecado;
	}

	public void setEsBecado(boolean esBecado) {
		this.esBecado = esBecado;
	}

	public String getId() {
		return this.id;
	}

}
