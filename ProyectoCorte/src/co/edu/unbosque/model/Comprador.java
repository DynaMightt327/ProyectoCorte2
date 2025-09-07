package co.edu.unbosque.model;

public class Comprador extends Usuario {

	private String numeroTarjeta;
	private String contraseniaTarjeta;

	public Comprador() {
		super();
	}

	public Comprador(String numeroTarjeta, String contraseniaTarjeta) {
		super();
		this.numeroTarjeta = numeroTarjeta;
		this.contraseniaTarjeta = contraseniaTarjeta;
	}

	public Comprador(String idUsuario, String contrasenia, String direccion, String telefono) {
		super(idUsuario, contrasenia, direccion, telefono);
		// TODO Auto-generated constructor stub
	}

	public Comprador(String idUsuario, String contrasenia, String direccion, String telefono, String numeroTarjeta,
			String contraseniaTarjeta) {
		super(idUsuario, contrasenia, direccion, telefono);
		this.numeroTarjeta = numeroTarjeta;
		this.contraseniaTarjeta = contraseniaTarjeta;
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public String getContraseniaTarjeta() {
		return contraseniaTarjeta;
	}

	public void setContraseniaTarjeta(String contraseniaTarjeta) {
		this.contraseniaTarjeta = contraseniaTarjeta;
	}

	@Override
	public String toString() {
		return " Número de tarjeta: " + numeroTarjeta + " Contraseña de la tarjeta: " + contraseniaTarjeta;
	}

}
