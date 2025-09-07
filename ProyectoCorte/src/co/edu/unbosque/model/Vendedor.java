package co.edu.unbosque.model;

public class Vendedor extends Usuario {

	private int numeroVentas;

	public Vendedor() {
		super();
	}

	public Vendedor(int numeroVentas) {
		super();
		this.numeroVentas = numeroVentas;
	}

	public Vendedor(String idUsuario, String contrasenia, String direccion, String telefono) {
		super(idUsuario, contrasenia, direccion, telefono);
		// TODO Auto-generated constructor stub
	}

	public Vendedor(String idUsuario, String contrasenia, String direccion, String telefono, int numeroVentas) {
		super(idUsuario, contrasenia, direccion, telefono);
		this.numeroVentas = numeroVentas;
	}

	public int getNumeroVentas() {
		return numeroVentas;
	}

	public void setNumeroVentas(int numeroVentas) {
		this.numeroVentas = numeroVentas;
	}

	@Override
	public String toString() {
		return " Número de ventas del vendedor: " + numeroVentas;
	}

}
