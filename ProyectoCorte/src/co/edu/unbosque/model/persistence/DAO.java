package co.edu.unbosque.model.persistence;

import java.util.List;

public interface DAO<E> {

	public boolean crear(E objeto);

	public List<E> leerTodos();

	public boolean actualizar(E objeto);

	public boolean eliminar(String producto);
	
	public void escribirEnArchivoTexto();

	public void leerDesdeArchivoDeTexto(String url);

}
