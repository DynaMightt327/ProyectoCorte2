package co.edu.unbosque.model;

public class Producto {

	public enum Categoria {
		MODA, HOGAR_Y_MUEBLES, ELECTRONICA, DEPORTES, ELECTRODOMESTICOS, ARTE, BELLEZA_Y_CUIDADO_PERSONAL, HERRAMIENTAS,
		CONSTRUCCION, MASCOTAS
	}

	private String nombreProducto;
	private float precio;
	private String descripcionProducto;
	private int cantidad;
	private int descuento;
	private double puntuacion;
	private Categoria categoria;

	public Producto() {
		super();
	}

	public Producto(String nombreProducto, float precio, String descripcionProducto, int cantidad, int descuento,
			double puntuacion, Categoria categoria) {
		super();
		this.nombreProducto = nombreProducto;
		this.precio = precio;
		this.descripcionProducto = descripcionProducto;
		this.cantidad = cantidad;
		this.descuento = descuento;
		this.puntuacion = puntuacion;
		this.categoria = categoria;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getDescripcionProducto() {
		return descripcionProducto;
	}

	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}

	public double getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(double puntuacion) {
		this.puntuacion = puntuacion;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return " \n - Nombre del producto: " + nombreProducto + "\n - Precio: " + precio + " \n - Descripción: " + descripcionProducto
				+ "\n - Cantidad: " + cantidad + "\n - Descuento: " + descuento + "\n - Puntuación: " + puntuacion + "\n - Categoria: "
				+ categoria;
	}

}
