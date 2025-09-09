package co.edu.unbosque.util.exception;

public class TelefonoException extends Exception {

	public TelefonoException() {
		super("El número de celular solo debe tener 10 números sin espacios");
	}

}
