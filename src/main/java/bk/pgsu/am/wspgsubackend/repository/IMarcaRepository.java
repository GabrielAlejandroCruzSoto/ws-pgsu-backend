package bk.pgsu.am.wspgsubackend.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import bk.pgsu.am.wspgsubackend.model.Marca;

public interface IMarcaRepository extends MongoRepository<Marca, ObjectId> {
	@Query("{'nombre_marca':?0}")
	public List<Marca> obtenerMarcaPorNombre(String nombreMarca);
}
