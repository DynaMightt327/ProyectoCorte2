package co.edu.unbosque.util.exception;

public class ContraseniaException extends Exception {

	public ContraseniaException() {
		super("Ingrese una contraseña de mínimo 4 caracteres y máximo 8 que contenga mayusculas, minusculas y números");
	}

}
