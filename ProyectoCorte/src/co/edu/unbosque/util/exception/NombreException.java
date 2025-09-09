package co.edu.unbosque.util.exception;

public class NombreException extends Exception {

	public NombreException() {
		super("El nombre debe tener solo letras, sin espacios y mínimo 3 caracteres y máximo 12");
	}

}
