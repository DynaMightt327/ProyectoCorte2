package co.edu.unbosque.util.exception;

public class LanzadorException {

	public static void verificarCantidadProductoValida(String entrada) throws CantidadProductoException {
		try {
			int cantidad = Integer.parseInt(entrada.trim());

			if (cantidad < 1 || cantidad > 99) {
				throw new CantidadProductoException();
			}

		} catch (NumberFormatException e) {
			throw new CantidadProductoException();
		} catch (NullPointerException e) {
			throw new CantidadProductoException();
		}
	}

	public static void verificarContraseñaValida(String entrada) throws ContraseniaValida {

		if (entrada.length() < 4 || entrada.length() > 8) {
			throw new ContraseniaValida();
		}

		boolean tieneMayuscula = false;
		boolean tieneMinuscula = false;
		boolean tieneNumero = false;

		for (char c : entrada.toCharArray()) {
			if (Character.isUpperCase(c)) {
				tieneMayuscula = true;
			} else if (Character.isLowerCase(c)) {
				tieneMinuscula = true;
			} else if (Character.isDigit(c)) {
				tieneNumero = true;
			}
		}

		if (!(tieneMayuscula && tieneMinuscula && tieneNumero)) {
			throw new ContraseniaValida();
		}

	}

	public static void verificarDireccionValida(String entrada) throws DireccionValida {

		if (entrada.length() < 5 || entrada.length() > 50) {
			throw new DireccionValida();
		}

		boolean tieneLetra = false;
		boolean tieneNumero = false;

		for (char c : entrada.toCharArray()) {
			if (Character.isLetter(c)) {
				tieneLetra = true;
			} else if (Character.isDigit(c)) {
				tieneNumero = true;
			} else if (!(Character.isWhitespace(c) || c == '#' || c == '-')) {
				throw new DireccionValida();
			}
		}

		if (!(tieneLetra && tieneNumero)) {
			throw new DireccionValida();
		}

	}

	public static void verificarNombreUsuario(String entrada) throws NombreUsuarioValido {
		if (entrada.length() < 4 || entrada.length() > 8) {
			throw new NombreUsuarioValido();
		}

		boolean tieneLetra = false;

		for (char c : entrada.toCharArray()) {
			if (Character.isLetter(c)) {
				tieneLetra = true;
			}
		}

		if (!tieneLetra) {
			throw new NombreUsuarioValido();
		}

	}

	public static void verificarNombrePersona(String entrada) throws NombreValido {
		if (entrada.length() < 3 || entrada.length() > 12) {
			throw new NombreValido();
		}

		for (char c : entrada.toCharArray()) {
			if (!Character.isLetter(c)) {
				throw new NombreValido();
			}
		}

	}

	public static void verificarNumeroTarjeta(String entrada) throws NumeroTarjetaValido {
		if (entrada.length() != 16) {
			throw new NumeroTarjetaValido();
		}

		for (char c : entrada.toCharArray()) {
			if (!Character.isDigit(c)) {
				throw new NumeroTarjetaValido();
			}
		}

	}

	public static void verificarPrecioProducto(String entrada) throws PrecioException {
		try {
			double valor = Double.parseDouble(entrada);

			if (valor <= 0) {
				throw new PrecioException();
			}

		} catch (NumberFormatException e) {
			throw new PrecioException();
		}
	}

	public static void verificarNumeroCelular(String entrada) throws TelefonoValido {
		if (entrada.length() != 10) {
			throw new TelefonoValido();
		}

		for (char c : entrada.toCharArray()) {
			if (!Character.isDigit(c)) {
				throw new TelefonoValido();
			}
		}

	}

}
