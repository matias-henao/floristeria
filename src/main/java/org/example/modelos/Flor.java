package org.example.modelos;

public class Flor {
    private String nombre;
    private String color;
    private Double precio;
    private String tipo;
    private Boolean disponible;
    private String fechaCosecha;
    private String proveedor;
    private Integer cantidad;
    private String cuidados;
    private String numeroPetalos;

    public Flor() {
    }

    public Flor(String nombre, String color, Double precio, String tipo, Boolean disponible, String fechaCosecha, String proveedor, Integer cantidad, String cuidados, String numeroPetalos) {
        this.nombre = nombre;
        this.color = color;
        this.precio = precio;
        this.tipo = tipo;
        this.disponible = disponible;
        this.fechaCosecha = fechaCosecha;
        this.proveedor = proveedor;
        this.cantidad = cantidad;
        this.cuidados = cuidados;
        this.numeroPetalos = numeroPetalos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getFechaCosecha() {
        return fechaCosecha;
    }

    public void setFechaCosecha(String fechaCosecha) {
        this.fechaCosecha = fechaCosecha;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCuidados() {
        return cuidados;
    }

    public void setCuidados(String cuidados) {
        this.cuidados = cuidados;
    }

    public String getNumeroPetalos() {
        return numeroPetalos;
    }

    public void setNumeroPetalos(String numeroPetalos) {
        this.numeroPetalos = numeroPetalos;
    }
}
