package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.CarritoDeCompraDAO;
import co.edu.unbosque.model.persistence.CompradorDAO;
import co.edu.unbosque.model.persistence.ProductoDAO;
import co.edu.unbosque.model.persistence.VendedorDAO;

public class ModelFacade {

	private CarritoDeCompraDAO carritodecompraDAO;
	private CompradorDAO compradorDAO;
	private ProductoDAO productoDAO;
	private VendedorDAO vendedorDAO;
	
	public ModelFacade() {
		
	carritodecompraDAO = new CarritoDeCompraDAO();
	compradorDAO = new CompradorDAO();
	productoDAO = new ProductoDAO();
	vendedorDAO = new VendedorDAO();
		
	}

	public CarritoDeCompraDAO getCarritodecompraDAO() {
		return carritodecompraDAO;
	}

	public void setCarritodecompraDAO(CarritoDeCompraDAO carritodecompraDAO) {
		this.carritodecompraDAO = carritodecompraDAO;
	}

	public CompradorDAO getCompradorDAO() {
		return compradorDAO;
	}

	public void setCompradorDAO(CompradorDAO compradorDAO) {
		this.compradorDAO = compradorDAO;
	}

	public ProductoDAO getProductoDAO() {
		return productoDAO;
	}

	public void setProductoDAO(ProductoDAO productoDAO) {
		this.productoDAO = productoDAO;
	}

	public VendedorDAO getVendedorDAO() {
		return vendedorDAO;
	}

	public void setVendedorDAO(VendedorDAO vendedorDAO) {
		this.vendedorDAO = vendedorDAO;
	}
	
	
	
	
	
	
	
	
}

