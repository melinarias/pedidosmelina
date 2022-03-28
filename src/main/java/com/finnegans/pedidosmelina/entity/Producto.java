package com.finnegans.pedidosmelina.entity;

import javax.persistence.*;

@Entity
@Table(name="productos")
public class Producto {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_producto")
    private Integer idProducto;

    private String nombre;

    private Float impuesto;

    private String descripcion;

    private Integer cantidad;

    @Column(name="precio")
    private Float precioBase;

    public Producto(){};

    public Producto(String nombre, Float impuesto, Integer idProducto, String descripcion, Integer cantidad, Float precioBase) {
        this.nombre = nombre;
        this.impuesto = impuesto;
        this.idProducto = idProducto;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioBase = precioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(Float impuesto) {
        this.impuesto = impuesto;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Float getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Float precioBase) {
        this.precioBase = precioBase;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", impuesto=" + impuesto +
                ", idProducto=" + idProducto +
                ", descripcion='" + descripcion + '\'' +
                ", cantidad=" + cantidad +
                ", precioBase=" + precioBase +
                '}';
    }
}
