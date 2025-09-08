package co.edu.unbosque.util.exception;

public class LanzadorException {

	public static void verificarCantidadProductoValida(String entradaUsuario) throws CantidadProductoException {
		try {
			int cantidad = Integer.parseInt(entradaUsuario.trim());

			if (cantidad < 1 || cantidad > 99) {
				throw new CantidadProductoException();
			}

		} catch (NumberFormatException e) {
			throw new CantidadProductoException();
		} catch (NullPointerException e) {
			throw new CantidadProductoException();
		}
	}

}
