package bk.pgsu.am.wspgsubackend.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import bk.pgsu.am.wspgsubackend.controller.service.IMarcaService;
import bk.pgsu.am.wspgsubackend.model.Marca;
import bk.pgsu.am.wspgsubackend.model.dto.MarcaDTO;

@RestController
public class MarcaController {
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private IMarcaService marcaService;

	private MarcaDTO convertToDto(Marca marca) {
		return (MarcaDTO) modelMapper.map(marca, MarcaDTO.class);
	}
	private Marca convertToModel(MarcaDTO marcadto) {
		return (Marca) modelMapper.map(marcadto, Marca.class);	   
	}
	
	@PostMapping(path = "/marca/save")
	public MarcaDTO guardarMarca(@RequestBody MarcaDTO marcadtoDto) {
		Marca marcain  = this.convertToModel(marcadtoDto);
		Marca marcaout = marcaService.guardarMarca(marcain);
		MarcaDTO marcadtoout = this.convertToDto(marcaout);
		return marcadtoout;
	}
	
	@GetMapping(path = "/marca/all")
	public List<Marca> obtenerMarcas() {
		return marcaService.obtenerMarcas();
	}
}
