package co.edu.unbosque.util.exception;

public class CantidadProductoException extends Exception{

	public CantidadProductoException() {
		super("Por favor, ingrese una cantidad válida");
	}

}
