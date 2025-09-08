package co.edu.unbosque.model.persistence;

import java.util.List;

public interface DAO<E> {

	public boolean crear(E objeto);//CRUD

	public List<E> leerTodos();//CRUD

	public boolean actualizar(E objeto);//CRUD

	public boolean eliminar(String producto);//CRUD
	
	public void escribirEnArchivoTexto();//LECTURA Y ESCRITURA DE ARCHIVOS

	public void leerDesdeArchivoDeTexto(String url);//LECTURA Y ESCRITURA DE ARCHIVOS
	
	public List<E> buscarPorAtributo(String atributo, String valor);//BUSCA POR ATRIBUTO
	
	public boolean existe(String id);//VERIFICA QUE CADA USUARIO SEA ÚNICO

}
