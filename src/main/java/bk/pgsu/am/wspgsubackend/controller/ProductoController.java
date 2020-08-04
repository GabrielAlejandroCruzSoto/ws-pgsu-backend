package bk.pgsu.am.wspgsubackend.controller;

import javax.xml.ws.Response;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import bk.pgsu.am.wspgsubackend.controller.service.IProductoService;
import bk.pgsu.am.wspgsubackend.model.Producto;
import bk.pgsu.am.wspgsubackend.model.dto.ProductoDTO;

@RestController
public class ProductoController {
	
	@Autowired
	ModelMapper modelMapper;
	
	@Autowired
	IProductoService productService;
	
	@PostMapping(path = "/producto/save")
	public ResponseEntity<ProductoDTO>  saveProducto(@RequestBody ProductoDTO productodto) {
		Producto producto = productService.guardarProducto(this.convertToModel(productodto));
		return new ResponseEntity<ProductoDTO>(this.convertToDto(producto),HttpStatus.CREATED); 
	}
	private ProductoDTO convertToDto(Producto producto) {
		return (ProductoDTO) modelMapper.map(producto, ProductoDTO.class);
	}
	private Producto convertToModel(ProductoDTO productodto) {
		return (Producto) modelMapper.map(productodto, Producto.class);	   
	}
}
