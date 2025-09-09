package co.edu.unbosque.util.exception;

public class NumeroTarjetaException extends Exception {

	public NumeroTarjetaException() {
		super("El número debe tener 16 números sin espacios");
	}

}
