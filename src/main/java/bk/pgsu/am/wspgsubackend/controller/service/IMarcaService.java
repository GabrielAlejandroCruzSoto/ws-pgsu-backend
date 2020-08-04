package bk.pgsu.am.wspgsubackend.controller.service;

import java.util.List;

import bk.pgsu.am.wspgsubackend.model.Marca;

public interface IMarcaService {

	public Marca guardarMarca(Marca marca);

	public List<Marca> obtenerMarcas();

	public Marca actualizarMarca(Marca marca);

	public Marca obtenerMarcaPorNombre(String nombreMarca);

	boolean existeMarcaPorNombre(String nombre);

}
