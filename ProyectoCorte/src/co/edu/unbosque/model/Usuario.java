package co.edu.unbosque.model;

public abstract class Usuario {

	private String idUsuario;
	private String contrasenia;
	private String direccion;
	private String telefono;

	public Usuario() {
		super();
	}

	public Usuario(String idUsuario, String contrasenia, String direccion, String telefono) {
		super();
		this.idUsuario = idUsuario;
		this.contrasenia = contrasenia;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return " Id usuario: " + idUsuario + " Contraseña: " + contrasenia + " Dirección: " + direccion + " Teléfono: "
				+ telefono;
	}

}
