package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import java.util.List;
import co.edu.unbosque.model.CarritoDeCompra;

public class CarritoDeCompraDAO implements DAO<CarritoDeCompra>{

	private List<CarritoDeCompra> listaCarritoDeCompra = new ArrayList<>();
	private final String FILE_NAME = "CarritoDeCompra.csv";
	
	public CarritoDeCompraDAO() {
		listaCarritoDeCompra = new ArrayList<>();
	}

	@Override
	public boolean crear(CarritoDeCompra objeto) {
		for (CarritoDeCompra carritodecompra : listaCarritoDeCompra) {
			if (carritodecompra.getNombreProducto().equalsIgnoreCase(objeto.getNombreProducto())) {

				return false;
			}
		}
		return listaCarritoDeCompra.add(objeto);
	}

	@Override
	public List<CarritoDeCompra> leerTodos() {
		return new ArrayList<>(listaCarritoDeCompra);
	}

	@Override
	public boolean actualizar(CarritoDeCompra objeto) {
		for (int i = 0; i < listaCarritoDeCompra.size(); i++) {
			if (listaCarritoDeCompra.get(i).getNombreProducto().equalsIgnoreCase(objeto.getNombreProducto())) {
				listaCarritoDeCompra.set(i, objeto);
				escribirEnArchivoTexto();
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean eliminar(String producto) {
		return listaCarritoDeCompra.removeIf(p -> p.getNombreProducto().equalsIgnoreCase(producto));
	}

	@Override
	public void escribirEnArchivoTexto() {
		StringBuilder sb = new StringBuilder();
		for (CarritoDeCompra carritodecompra : listaCarritoDeCompra) {
			sb.append(carritodecompra.getNombreProducto() + ";");
			sb.append(carritodecompra.getPrecio() + ";");
			sb.append(carritodecompra.getCantidad() + ";");
			sb.append(carritodecompra.getDescuento() + ";");
			sb.append(carritodecompra.getPrecioFinal() + ";");

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
				CarritoDeCompra temp = new CarritoDeCompra();
				temp.setNombreProducto(columnas[0]);
				temp.setPrecio(Float.parseFloat(columnas[1]));
				temp.setCantidad(Integer.parseInt(columnas[2]));
				temp.setDescuento(Integer.parseInt(columnas[3]));
				temp.setPrecioFinal(Integer.parseInt(columnas[4]));

				listaCarritoDeCompra.add(temp);
			}

		}
		
	}

	@Override
	public List<CarritoDeCompra> buscarPorAtributo(String atributo, String valor) {
		// FALTA POR AGREGAR
		return null;
	}

	@Override
	public boolean existe(String id) {
		// FALTA POR AGREGAR
		return false;
	}

}
