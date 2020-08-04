package bk.pgsu.am.wspgsubackend.controller.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bk.pgsu.am.wspgsubackend.controller.service.IMarcaService;
import bk.pgsu.am.wspgsubackend.model.Marca;
import bk.pgsu.am.wspgsubackend.repository.IMarcaRepository;

@Service
public class MarcaServiceImpl implements IMarcaService{
	
	@Autowired
	private IMarcaRepository marcaRepo;
	
	@Override
	public Marca guardarMarca(Marca marca) {
		return marcaRepo.save(marca);
	}
	
	@Override
	public List<Marca> obtenerMarcas(){
		return marcaRepo.findAll();
	}
	
	@Override
	public Marca obtenerMarcaPorNombre(String nombreMarca) {
		return marcaRepo.obtenerMarcaPorNombre(nombreMarca).get(0); 
	}
	
	@Override
	public Marca actualizarMarca(Marca marca) {
		return marcaRepo.save(marca);
	}
	
	@Override
	public boolean existeMarcaPorNombre(String nombre) {
		boolean result = false;
		if(this.obtenerMarcaPorNombre(nombre) != null) {
			result = true;
		}else {
			result = false;
		}
		return result;
	}
}