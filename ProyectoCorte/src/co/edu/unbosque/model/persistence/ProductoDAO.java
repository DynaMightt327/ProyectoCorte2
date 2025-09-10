package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import java.util.List;
import co.edu.unbosque.model.Producto;

public class ProductoDAO implements DAO<Producto> {

	private List<Producto> listaProductos = new ArrayList<>();
	private final String FILE_NAME = "Producto.csv";

	public ProductoDAO() {
		listaProductos = new ArrayList<>();
	}

	@Override
	public boolean crear(Producto objeto) {
		for (Producto producto : listaProductos) {
			if (producto.getNombreProducto().equalsIgnoreCase(objeto.getNombreProducto())) {

				return false;
			}
		}
		return listaProductos.add(objeto);
	}

	@Override
	public List<Producto> leerTodos() {
		return new ArrayList<>(listaProductos);
	}

	@Override
	public boolean actualizar(Producto objeto) {
		for (int i = 0; i < listaProductos.size(); i++) {
			if (listaProductos.get(i).getNombreProducto().equalsIgnoreCase(objeto.getNombreProducto())) {
				listaProductos.set(i, objeto);
				escribirEnArchivoTexto();
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean eliminar(String producto) {
		return listaProductos.removeIf(p -> p.getNombreProducto().equalsIgnoreCase(producto));
	}

	@Override
	public void escribirEnArchivoTexto() {
		StringBuilder sb = new StringBuilder();
		for (Producto producto : listaProductos) {
			sb.append(producto.getNombreProducto() + ";");
			sb.append(producto.getPrecio() + ";");
			sb.append(producto.getDescripcionProducto() + ";");
			sb.append(producto.getCantidad() + ";");
			sb.append(producto.getDescuento() + ";");
			sb.append(producto.getPuntuacion() + ";");
			sb.append(producto.getCategoria() + ";");

		}
		FileHandler.escribirEnArchivoTexto(FILE_NAME, sb.toString());
	}

	@Override
	public void leerDesdeArchivoDeTexto(String url) {

		String contenido;
		contenido = FileHandler.leerDesdeArchivoDeTexto("");
		if (contenido == "" || contenido.isBlank()) {
			return;
		} else {
			String[] filas = contenido.split("\n");
			for (int i = 0; i < filas.length; i++) {
				String[] columnas = filas[i].split(";");
				Producto temp = new Producto();
				temp.setNombreProducto(columnas[0]);
				temp.setPrecio(Float.parseFloat(columnas[1]));
				temp.setDescripcionProducto(columnas[2]);
				temp.setCantidad(Integer.parseInt(columnas[3]));
				temp.setDescuento(Integer.parseInt(columnas[4]));
				temp.setPuntuacion(Double.parseDouble(columnas[5]));
				temp.setCategoria(null);// TOCA CORREGIR ESTA LINEA

				listaProductos.add(temp);
			}

		}

	}

	@Override
	public List<Producto> buscarPorAtributo(String atributo, String valor) {
		// FALTA POR AGREGAR
		return null;
	}

	@Override
	public boolean existe(String id) {
		// FALTA POR AGREGAR
		return false;
	}

}

