package com;
import java.util.Objects;

public class Empleado {
    private int id;
    private String nombre;
    private String apellido;
    private String zonaVenta;
    private int ventas;
    private String pais;


    public Empleado() {
    }

    public Empleado(int id, String nombre, String apellido, String zonaVenta, int ventas, String pais) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.zonaVenta = zonaVenta;
        this.ventas = ventas;
        this.pais = pais;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getZonaVenta() {
        return this.zonaVenta;
    }

    public void setZonaVenta(String zonaVenta) {
        this.zonaVenta = zonaVenta;
    }

    public int getVentas() {
        return this.ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", apellido='" + getApellido() + "'" +
            ", zonaVenta='" + getZonaVenta() + "'" +
            ", ventas='" + getVentas() + "'" +
            ", pais='" + getPais() + "'" +
            "}";
    }

}
