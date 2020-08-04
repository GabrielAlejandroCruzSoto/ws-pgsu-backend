package bk.pgsu.am.wspgsubackend.model.dto;

import org.bson.types.ObjectId;

public class TelefonoDTO {

	private ObjectId _id;
	
	private String nombre_contacto;
	
	private int numero_telefono;

	public TelefonoDTO() {
		super();
	}
	
	public TelefonoDTO(ObjectId _id, String nombre_contacto, int numero_telefono) {
		super();
		this._id = _id;
		this.nombre_contacto = nombre_contacto;
		this.numero_telefono = numero_telefono;
	}

	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getNombre_contacto() {
		return nombre_contacto;
	}

	public void setNombre_contacto(String nombre_contacto) {
		this.nombre_contacto = nombre_contacto;
	}

	public int getNumero_telefono() {
		return numero_telefono;
	}

	public void setNumero_telefono(int numero_telefono) {
		this.numero_telefono = numero_telefono;
	}
}
