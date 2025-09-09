package co.edu.unbosque.util.exception;

public class NombreUsuarioValido extends Exception {

	public NombreUsuarioValido() {
		super("El nombre debe contener contener al menos 1 letra, mínimo 4 caracteres y máximo 8");
	}

}
