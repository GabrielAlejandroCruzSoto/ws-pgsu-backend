package bk.pgsu.am.wspgsubackend.model;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "col_compras")
public class Compra {
	
	@Id
	private ObjectId _id;
	
	@Field(name = "fechaCompra")
	private Date fechaCompra;
	
	@DBRef
	private Proveedor proveedor;
	
	@Field(name = "nro_factura")
	private	int nro_factura;
	
	@Field(name = "monto_neto")
	private int monto_neto;
	
	@Field(name = "iva_credito_fiscal")
	private int iva_credito_fiscal;
	
	@Field(name = "monto_total")
	private int monto_total;
	
	@Field(name = "observacion")
	private String observacion;

	public Compra() {
		super();

	}
	
	public Compra(ObjectId _id, Date fechaCompra, Proveedor proveedor, int nro_factura, int monto_neto,
			int iva_credito_fiscal, int monto_total, String observacion) {
		super();
		this._id = _id;
		this.fechaCompra = fechaCompra;
		this.proveedor = proveedor;
		this.nro_factura = nro_factura;
		this.monto_neto = monto_neto;
		this.iva_credito_fiscal = iva_credito_fiscal;
		this.monto_total = monto_total;
		this.observacion = observacion;
	}

	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public Date getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public int getNro_factura() {
		return nro_factura;
	}

	public void setNro_factura(int nro_factura) {
		this.nro_factura = nro_factura;
	}

	public int getMonto_neto() {
		return monto_neto;
	}

	public void setMonto_neto(int monto_neto) {
		this.monto_neto = monto_neto;
	}

	public int getIva_credito_fiscal() {
		return iva_credito_fiscal;
	}

	public void setIva_credito_fiscal(int iva_credito_fiscal) {
		this.iva_credito_fiscal = iva_credito_fiscal;
	}

	public int getMonto_total() {
		return monto_total;
	}

	public void setMonto_total(int monto_total) {
		this.monto_total = monto_total;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	
}
