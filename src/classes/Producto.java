package classes;

import java.util.ArrayList;
import java.util.Arrays;

public class Producto {
    private String nombre;
    private String tipo;
    private int precio;
    private String id;

    public Producto(String nombre, String tipo, int precio, String id) {
        super();
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.id = id;
    }
    
    public Producto() {
        super();
        this.nombre = "";
        this.tipo = "";
        this.precio = 0;
        this.id = "";
    }
    
    public Producto(Producto p) {
        super();
        this.nombre = p.nombre;
        this.tipo = p.tipo;
        this.precio = p.precio;
        this.id = p.id;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String toString() {
        return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", tipo=" + tipo + "]";
    }
}