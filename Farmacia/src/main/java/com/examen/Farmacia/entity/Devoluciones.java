package com.examen.Farmacia.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="Devoluciones")
@Table(name="devoluciones")
public class Devoluciones {
	@Id
	String IdDevolucion;
	String IdVenta;
	int Cantidad;
	int Fecha;
	public Devoluciones() {
		super();
	}
	public Devoluciones(String IdDevolucion,String IdVenta,int Cantidad,int Fecha) {
		super();
		this.IdDevolucion=IdDevolucion;
		this.IdVenta=IdVenta;
		this.Cantidad=Cantidad;
		this.Fecha=Fecha;
	}
	public String getIdDevolucion() {
		return IdDevolucion;
	}
	public void setIdDevolucion(String idDevolucion) {
		IdDevolucion = idDevolucion;
	}
	public String getIdVenta() {
		return IdVenta;
	}
	public void setIdVenta(String idVenta) {
		IdVenta = idVenta;
	}
	public int getCantidad() {
		return Cantidad;
	}
	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}
	public int getFecha() {
		return Fecha;
	}
	public void setFecha(int fecha) {
		Fecha = fecha;
	}
	
}