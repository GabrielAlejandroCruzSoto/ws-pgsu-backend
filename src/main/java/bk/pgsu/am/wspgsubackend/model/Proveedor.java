package bk.pgsu.am.wspgsubackend.model;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "col_proveedores")
public class Proveedor {
	
	@Id
	private ObjectId _id;
	
	@Field(name = "rut")
	private String rut;
	
	@Field(name = "razon_social")
	private String razon_social;
	
	@Field(name = "direccion")
	private String direccion;
	
	@DBRef
	private List<Telefono> lst_telefonos;

	public Proveedor() {
		super();
	}
	
	public Proveedor(ObjectId _id, String rut, String razon_social, String direccion, List<Telefono> lst_telefonos) {
		super();
		this._id = _id;
		this.rut = rut;
		this.razon_social = razon_social;
		this.direccion = direccion;
		this.lst_telefonos = lst_telefonos;
	}

	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getRazon_social() {
		return razon_social;
	}

	public void setRazon_social(String razon_social) {
		this.razon_social = razon_social;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Telefono> getLst_telefonos() {
		return lst_telefonos;
	}

	public void setLst_telefonos(List<Telefono> lst_telefonos) {
		this.lst_telefonos = lst_telefonos;
	}
		
}
