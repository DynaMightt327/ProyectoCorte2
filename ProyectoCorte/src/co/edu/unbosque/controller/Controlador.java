package co.edu.unbosque.controller;

import co.edu.unbosque.view.VentanaPrincipal;

public class Controlador {

	private VentanaPrincipal vp;

	public Controlador() {
		vp = new VentanaPrincipal(this);
	}

	public void runGUI() {
		vp.setVisible(true);
	}

}
