package org.example.ayudas;

public class Repartidor {
    private String nombre;
    private String telefono;
    private String vehiculo;
    private String licencia;
    private int edad;
    private String ciudad;
    private String email;
    private String fechaContratacion;
    private double salario;
    private String estado;

    public Repartidor() {
    }

    public Repartidor(String nombre, String telefono, String vehiculo, String licencia, int edad, String ciudad, String email, String fechaContratacion, double salario, String estado) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.vehiculo = vehiculo;
        this.licencia = licencia;
        this.edad = edad;
        this.ciudad = ciudad;
        this.email = email;
        this.fechaContratacion = fechaContratacion;
        this.salario = salario;
        this.estado = estado;
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

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

