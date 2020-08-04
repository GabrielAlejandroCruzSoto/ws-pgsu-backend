package bk.pgsu.am.wspgsubackend.model.dto;

import org.bson.types.ObjectId;

public class MarcaDTO {
	
	private ObjectId _id;
	
	private String nombre_marca;

	public MarcaDTO() {
		super();
	}
	
	public MarcaDTO(ObjectId _id, String nombre_marca) {
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
