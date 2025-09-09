package co.edu.unbosque.util.exception;

public class NumeroTarjetaValido extends Exception {

	public NumeroTarjetaValido() {
		super("El número debe tener 16 números sin espacios");
	}

}
