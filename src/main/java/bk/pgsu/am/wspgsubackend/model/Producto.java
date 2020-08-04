package bk.pgsu.am.wspgsubackend.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "col_productos")
public class Producto {
	@Id
	private ObjectId _id;
	
	@Field(name = "codigo_barra")
	private long codigo_barra;
	
	@DBRef
	private Marca marca;
	
	@Field(name = "nombre_producto")
	private String nombre_producto;
	
	@Field(name = "formato_producto")
	private String formato_producto;
	
	@Field(name = "tipo_producto")
	private	String tipo_producto;

	public Producto() {
		super();
	}
	
	public Producto(ObjectId _id, long codigo_barra, Marca marca, String nombre_producto, String formato_producto,
			String tipo_producto) {
		super();
		this._id = _id;
		this.codigo_barra = codigo_barra;
		this.marca = marca;
		this.nombre_producto = nombre_producto;
		this.formato_producto = formato_producto;
		this.tipo_producto = tipo_producto;
	}

	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public long getCodigo_barra() {
		return codigo_barra;
	}

	public void setCodigo_barra(long codigo_barra) {
		this.codigo_barra = codigo_barra;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public String getFormato_producto() {
		return formato_producto;
	}

	public void setFormato_producto(String formato_producto) {
		this.formato_producto = formato_producto;
	}

	public String getTipo_producto() {
		return tipo_producto;
	}

	public void setTipo_producto(String tipo_producto) {
		this.tipo_producto = tipo_producto;
	}

}