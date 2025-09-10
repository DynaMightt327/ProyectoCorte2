package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import co.edu.unbosque.controller.Controlador;

public class VentanaPrincipal extends JFrame {
	// no está terminada aun

	// deben ir los botones y ventanas aca, todo eso :p
	private JButton botonIngresarUbicacion;
	private JComboBox comboBoxCategoria;
	private JButton botonVender;
	private JButton botonDescuento;
	private JButton botonBuscar;
	private JTextField campoBusqueda;
	private JButton botonCarritoCompra;
	private JComboBox comboBoxUsuario;
	// private JLabel titulo;

	public VentanaPrincipal(Controlador controller) {
		inicializarComponentes();
		setVisible(true);
	}

	private void inicializarComponentes() {
		// configuracion Ventana
		this.setTitle("Mercado Libre");
		this.setBounds(20, 20, 1480, 920);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);// finaliza el programa por completo
		this.setResizable(false);
		this.setLayout(null);

		// seccion de arriba

		// 1. logo pagina

		ImageIcon image = new ImageIcon(getClass().getResource("logoPagina.JPG"));
		JLabel labelImage = new JLabel(image);
		labelImage.setBounds(50, 0, 400, 600);
		add(labelImage);

		// 2. barra de opciones
		botonIngresarUbicacion = new JButton("Ingresa tu ubicación ");
		botonIngresarUbicacion.setBounds(50, 120, 100, 40);// toca ir mirando donde quedan ubicados ;-;
		botonIngresarUbicacion.setForeground(Color.decode("#F5EE27"));
		botonIngresarUbicacion.setFocusPainted(false);
		this.add(botonIngresarUbicacion);
		//
		campoBusqueda = new JTextField();
		campoBusqueda.setBounds(150, 0, 265, 35);
		campoBusqueda.setFont(new Font("Arial", Font.PLAIN, 14));
		campoBusqueda.setBorder(BorderFactory.createLineBorder(Color.getColor("white"), 2));
		campoBusqueda.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// buscar en tiempo real();

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});
		this.add(campoBusqueda);
		// boton buscar
		botonBuscar = new JButton("Buscar");
		botonBuscar.setBounds(EXIT_ON_CLOSE, ABORT, WIDTH, HEIGHT);
		botonBuscar.setBackground(Color.decode("#AED581"));
		botonBuscar.setForeground(Color.decode("#144031"));
		botonBuscar.setFocusPainted(false);
		this.add(botonBuscar);
	}

}
