package bk.pgsu.am.wspgsubackend.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "col_marcas")
public class Marca {
	
	@Id
	private ObjectId _id;
	
	@Field(name = "nombre_marca")
	private String nombre_marca;

	public Marca() {
		super();
	}
	
	public Marca(ObjectId _id, String nombre_marca) {
		super();
		this._id = _id;
		this.nombre_marca = nombre_marca;
	}

	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getNombre_marca() {
		return nombre_marca;
	}

	public void setNombre_marca(String nombre_marca) {
		this.nombre_marca = nombre_marca;
	}
	
}
