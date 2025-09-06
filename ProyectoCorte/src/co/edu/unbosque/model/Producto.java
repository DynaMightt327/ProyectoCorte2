package co.edu.unbosque.model;

public class Producto {
	//Esta es una opcion, no sé si realmente las dejamos así
	public enum Categoria{
		MODA,
		HOGAR_Y_MUEBLES,
		ELECTRONICA,
		DEPORTES,
		ELECTRODOMESTICOS,
		ARTE,
		BELLEZA_Y_CUIDADO_PERSONAL,
		HERRAMIENTAS,
		CONSTRUCCION,
		MASCOTAS
	}
	
	private String nombreProducto;
	private float precio;
	private String descripcionProducto;
	private int cantidad;
	private int descuento;
	private double puntuacion;

	public Producto() {
		// TODO Auto-generated constructor stub
	}
}
