package co.edu.unbosque.util.exception;

public class TelefonoValido extends Exception {

	public TelefonoValido() {
		super("El número de celular solo debe tener 10 números sin espacios");
	}

}
