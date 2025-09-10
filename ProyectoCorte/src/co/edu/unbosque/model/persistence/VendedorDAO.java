package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import java.util.List;
import co.edu.unbosque.model.Vendedor;

public class VendedorDAO implements DAO<Vendedor> {

	private List<Vendedor> listaVendedor = new ArrayList<>();
	private final String FILE_NAME = "vendedor.csv";

	public VendedorDAO() {
		listaVendedor = new ArrayList<>();
	}

	@Override
	public boolean crear(Vendedor objeto) {
		for (Vendedor vendedor : listaVendedor) {
			if (vendedor.getIdUsuario().equals(objeto.getIdUsuario())) {
				return false;
			}
		}
		return listaVendedor.add(objeto);
	}

	@Override
	public List<Vendedor> leerTodos() {
		return new ArrayList<>(listaVendedor);
	}

	@Override
	public boolean actualizar(Vendedor objeto) {
		for (int i = 0; i < listaVendedor.size(); i++) {
			if (listaVendedor.get(i).getIdUsuario().equalsIgnoreCase(objeto.getIdUsuario())) {
				listaVendedor.set(i, objeto);
				escribirEnArchivoTexto();
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean eliminar(String producto) {
		return listaVendedor.removeIf(p -> p.getIdUsuario().equalsIgnoreCase(producto));
	}

	@Override
	public void escribirEnArchivoTexto() {

		StringBuilder sb = new StringBuilder();
		for (Vendedor vendedor : listaVendedor) {
			sb.append(vendedor.getIdUsuario() + ";");
			sb.append(vendedor.getContrasenia() + ";");
			sb.append(vendedor.getDireccion() + ";");
			sb.append(vendedor.getTelefono() + ";");
			sb.append(vendedor.getNumeroVentas() + ";");
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
				Vendedor temp = new Vendedor();
				temp.setIdUsuario(columnas[0]);
				temp.setContrasenia(columnas[1]);
				temp.setDireccion(columnas[2]);
				temp.setTelefono(Long.parseLong(columnas[3]));
				temp.setNumeroVentas(Integer.parseInt(columnas[4]));

				listaVendedor.add(temp);
			}

		}

	}

	@Override
	public List<Vendedor> buscarPorAtributo(String atributo, String valor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existe(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
