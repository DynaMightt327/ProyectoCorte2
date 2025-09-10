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
import co.edu.unbosque.model.Producto.Categoria;
import co.edu.unbosque.model.Usuario;

public class VentanaPrincipal extends JFrame {
	// no está terminada aun

	// deben ir los botones y ventanas aca, todo eso :p
	private JButton botonIngresarUbicacion;
	private JComboBox comboBoxCategoria;
	private JButton botonVender;
	private JButton botonDescuento;
	private JTextField campoBusqueda;
	private JComboBox comboBoxUsuario;
	// private JLabel titulo;

	public VentanaPrincipal(Controlador controller) {
		inicializarComponentes();
		setVisible(true);
	}

	private void inicializarComponentes() {
		// configuracion Ventana (esta ya quedó lista)
		this.setTitle("Mercado Libre");
		this.setBounds(20, 20, 1380, 820);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);// finaliza el programa por completo
		this.setResizable(false);
		this.setLayout(null);

		// seccion de arriba

		// Logo mercado libre
		ImageIcon image = new ImageIcon(getClass().getResource("logoPagina.JPG"));
		JLabel labelImage = new JLabel(image);
		labelImage.setBounds(30, 10, 300, 100);
		add(labelImage);

		// Anuncio envio gratis
		ImageIcon imagen2 = new ImageIcon(getClass().getResource("envio.JPG"));
		JLabel labelImagen2 = new JLabel(imagen2);
		labelImagen2.setBounds(980, 10, 380, 100);
		add(labelImagen2);

		// boton de buscar con imagen
		ImageIcon imagen3 = new ImageIcon(getClass().getResource("lupa.JPG"));
		JButton buttonImagen3 = new JButton(imagen3);
		buttonImagen3.setBounds(885, 35, 35, 35);
		buttonImagen3.setBackground(Color.decode("#FFFFFF"));
		buttonImagen3.setForeground(Color.decode("#144031"));
		buttonImagen3.setFocusPainted(false);
		this.add(buttonImagen3);
		
		//imagen de perfil de usuario (decoracion)
		ImageIcon imagen4 = new ImageIcon(getClass().getResource("user.JPG"));
		JLabel labelImagen4 = new JLabel(imagen4);
		labelImagen4.setBounds(950, 120, 40, 40);
		this.add(labelImagen4);

		// barra de opciones
		botonIngresarUbicacion = new JButton("Ingresa tu ubicación ");
		botonIngresarUbicacion.setBounds(50, 120, 180, 40);
		botonIngresarUbicacion.setBackground(Color.decode("#F5EE27"));
		botonIngresarUbicacion.setForeground(Color.decode("#0D0B0B"));
		botonIngresarUbicacion.setFocusPainted(false);
		this.add(botonIngresarUbicacion);

		// comboBox categoria
		comboBoxCategoria = new JComboBox<Categoria>();// toca arreglar esto para que salgan
		comboBoxCategoria.setBounds(250, 120, 200, 40);
		comboBoxCategoria.setBorder(BorderFactory.createLineBorder(Color.getColor("yellow"), 1));// este no está																	// sirviendo?
		this.add(comboBoxCategoria);

		// boton vender
		botonVender = new JButton("Vender");
		botonVender.setBounds(500, 120, 100, 40);
		botonVender.setBackground(Color.decode("#F5EE27"));
		botonVender.setForeground(Color.decode("#0D0B0B"));
		botonVender.setFocusPainted(false);
		this.add(botonVender);

		// boton descuento
		botonDescuento = new JButton("Descuentos");
		botonDescuento.setBounds(650, 120, 150, 40);
		botonDescuento.setBackground(Color.decode("#F5EE27"));
		botonDescuento.setForeground(Color.decode("#0D0B0B"));
		botonDescuento.setFocusPainted(false);
		this.add(botonDescuento);

		// comboBox usuario
		comboBoxUsuario = new JComboBox<Usuario>();// toca arreglar esto para que salgan
		comboBoxUsuario.setBounds(1000, 120, 200, 40);
		comboBoxUsuario.setBorder(BorderFactory.createLineBorder(Color.getColor("yellow"), 1));// este no está																	// sirviendo?
		this.add(comboBoxUsuario);

		// carrito
		ImageIcon carrito = new ImageIcon(getClass().getResource("carrito.JPG"));
		JButton buttonCarrito = new JButton(carrito);
		buttonCarrito.setBounds(1290, 125, 35, 35);
		buttonCarrito.setBackground(Color.decode("#FFFFFF"));
		buttonCarrito.setForeground(Color.decode("#144031"));
		buttonCarrito.setFocusPainted(false);
		this.add(buttonCarrito);

		// campo busqueda
		campoBusqueda = new JTextField();
		campoBusqueda.setBounds(380, 35, 500, 35);
		campoBusqueda.setFont(new Font("Arial", Font.PLAIN, 14));
		campoBusqueda.setBorder(BorderFactory.createLineBorder(Color.getColor("white"), 1));
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

	}
//no se puede olvidar hacerle getters y setters a los botones
}
