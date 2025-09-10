package co.edu.unbosque.model;

public class CarritoDeCompra {

	private String nombreProducto;
	private float precio;
	private int cantidad;
	private int descuento;
	private int precioFinal;
	
	public CarritoDeCompra() {
		super();
	}

	public CarritoDeCompra(String nombreProducto, float precio, int cantidad, int descuento,
			int precioFinal) {
		super();
		this.nombreProducto = nombreProducto;
		this.precio = precio;
		this.cantidad = cantidad;
		this.descuento = descuento;
		this.precioFinal = precioFinal;
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

	public int getPrecioFinal() {
		return precioFinal;
	}

	public void setPrecioFinal(int precioFinal) {
		this.precioFinal = precioFinal;
	}

	@Override
	public String toString() {
		return " - Nombre Producto: " + nombreProducto + "\n - Precio Producto: " + precio + "\n - Cantidad: " + cantidad
				+ "\n - Descuento: " + descuento + "\n ´- Precio Final: " + precioFinal;
	}
	
	

	
	
	
	
	
	
}
