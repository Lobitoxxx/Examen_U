package com.examen.Farmacia.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="Ajustes")
@Table(name="ajustes")
public class Ajustes {
	@Id
	String idAjuste;
	String IDProducto;
	String motivo;
	int cantidad;
	String fecha;
	String tipo;
	String idLote;
	public Ajustes() {
		super();
	}
	public Ajustes(String idAjuste, String iDProducto, String motivo, int cantidad, String fecha, String tipo,
			String idLote) {
		super();
		this.idAjuste = idAjuste;
		IDProducto = iDProducto;
		this.motivo = motivo;
		this.cantidad = cantidad;
		this.fecha = fecha;
		this.tipo = tipo;
		this.idLote = idLote;
	}
	public String getIdAjuste() {
		return idAjuste;
	}
	public void setIdAjuste(String idAjuste) {
		this.idAjuste = idAjuste;
	}
	public String getIDProducto() {
		return IDProducto;
	}
	public void setIDProducto(String iDProducto) {
		IDProducto = iDProducto;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getIdLote() {
		return idLote;
	}
	public void setIdLote(String idLote) {
		this.idLote = idLote;
	}
	
	
}