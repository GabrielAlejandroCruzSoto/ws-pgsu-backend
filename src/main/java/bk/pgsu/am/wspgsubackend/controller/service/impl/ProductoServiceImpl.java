package bk.pgsu.am.wspgsubackend.controller.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bk.pgsu.am.wspgsubackend.controller.service.IMarcaService;
import bk.pgsu.am.wspgsubackend.controller.service.IProductoService;
import bk.pgsu.am.wspgsubackend.expection.MarcaNotFoundException;
import bk.pgsu.am.wspgsubackend.model.Marca;
import bk.pgsu.am.wspgsubackend.model.Producto;
import bk.pgsu.am.wspgsubackend.repository.IProductoRepository;

@Service
public class ProductoServiceImpl implements IProductoService {
	
	@Autowired
	private IProductoRepository productoRepository;
	
	@Autowired
	private IMarcaService marcaService;
		
	@Override
	public Producto guardarProducto(Producto producto) {
		Producto productoSalida = null;
		
		Marca marca = marcaService.obtenerMarcaPorNombre(producto.getMarca().getNombre_marca());
		if (marca==null){
			throw new MarcaNotFoundException("No existe Marca");
		}else {
			producto.setMarca(marca);
			productoSalida = productoRepository.save(producto);
		}
		
		return productoSalida;
	}

}
