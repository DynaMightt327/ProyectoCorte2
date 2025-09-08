package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import java.util.List;
import co.edu.unbosque.model.Comprador;

public class CompradorDAO implements DAO<Comprador> {

	private List<Comprador> listaComprador = new ArrayList<>();
	private final String FILE_NAME = "";

	public CompradorDAO() {
		listaComprador = new ArrayList<>();
	}

	@Override
	public boolean crear(Comprador objeto) {
		for (Comprador comprador : listaComprador) {
			if (comprador.getIdUsuario().equals(objeto.getIdUsuario())) {
				return false;
			}
		}
		return listaComprador.add(objeto);
	}

	@Override
	public List<Comprador> leerTodos() {
		return new ArrayList<>(listaComprador);
	}

	@Override
	public boolean actualizar(Comprador objeto) {
		for (int i = 0; i < listaComprador.size(); i++) {
			if (listaComprador.get(i).getIdUsuario().equalsIgnoreCase(objeto.getIdUsuario())) {
				listaComprador.set(i, objeto);
				escribirEnArchivoTexto();
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean eliminar(String producto) {
		return listaComprador.removeIf(p -> p.getIdUsuario().equalsIgnoreCase(producto));
	}

	@Override
	public void escribirEnArchivoTexto() {

		StringBuilder sb = new StringBuilder();
		for (Comprador comprador : listaComprador) {
			sb.append(comprador.getIdUsuario() + ";");
			sb.append(comprador.getContrasenia() + ";");
			sb.append(comprador.getDireccion() + ";");
			sb.append(comprador.getTelefono() + ";");
			sb.append(comprador.getNumeroTarjeta() + ";");
			sb.append(comprador.getContraseniaTarjeta() + ";");
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
				Comprador temp = new Comprador();
				temp.setIdUsuario(columnas[0]);
				temp.setContrasenia(columnas[1]);
				temp.setDireccion(columnas[2]);
				temp.setTelefono(columnas[3]);
				temp.setNumeroTarjeta(columnas[4]);
				temp.setContraseniaTarjeta(columnas[5]);

				listaComprador.add(temp);
			}

		}

	}

	@Override
	public List<Comprador> buscarPorAtributo(String atributo, String valor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existe(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
