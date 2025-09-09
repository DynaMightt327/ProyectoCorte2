package co.edu.unbosque.util.exception;

public class NombreUsuarioException extends Exception {

	public NombreUsuarioException() {
		super("El nombre debe contener contener al menos 1 letra, mínimo 4 caracteres y máximo 8");
	}

}
