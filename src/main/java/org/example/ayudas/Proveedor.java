package org.example.ayudas;

public class Proveedor {
    private String nombre;
    private String telefono;
    private String email;
    private String direccion;
    private String ciudad;
    private String productoPrincipal;
    private String metodoEntrega;
    private String fechaRegistro;
    private String estado;
    private Double calificacion;

    public Proveedor() {
    }

    public Proveedor(String nombre, String telefono, String email, String direccion, String ciudad, String productoPrincipal, String metodoEntrega, String fechaRegistro, String estado, Double calificacion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.productoPrincipal = productoPrincipal;
        this.metodoEntrega = metodoEntrega;
        this.fechaRegistro = fechaRegistro;
        this.estado = estado;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProductoPrincipal() {
        return productoPrincipal;
    }

    public void setProductoPrincipal(String productoPrincipal) {
        this.productoPrincipal = productoPrincipal;
    }

    public String getMetodoEntrega() {
        return metodoEntrega;
    }

    public void setMetodoEntrega(String metodoEntrega) {
        this.metodoEntrega = metodoEntrega;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }
}
