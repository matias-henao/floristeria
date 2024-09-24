package org.example;

import org.example.ayudas.Proveedor;
import org.example.ayudas.Repartidor;
import org.example.modelos.Cliente;
import org.example.modelos.Flor;

public class Main {
    public static void main(String[] args) {
        Cliente clienteVacio = new Cliente();
        Cliente clienteLleno = new Cliente("Juan Pérez", "Calle Falsa 123", "123456789", "juan@example.com", 30, "Madrid", "28001", "Tarjeta", "2023-09-01", "Ninguna");

        System.out.println("Cliente (Vacío):");
        System.out.println("Nombre: " + clienteVacio.getNombre());
        System.out.println("Dirección: " + clienteVacio.getDireccion());
        System.out.println("Teléfono: " + clienteVacio.getTelefono());
        System.out.println("Email: " + clienteVacio.getEmail());
        System.out.println("Edad: " + clienteVacio.getEdad());
        System.out.println("Ciudad: " + clienteVacio.getCiudad());
        System.out.println("Código Postal: " + clienteVacio.getCodigoPostal());
        System.out.println("Método de Pago: " + clienteVacio.getMetodoPago());
        System.out.println("Fecha de Registro: " + clienteVacio.getFechaRegistro());
        System.out.println("Notas: " + clienteVacio.getNotas());

        System.out.println("Cliente (Lleno):");
        System.out.println("Nombre: " + clienteLleno.getNombre());
        System.out.println("Dirección: " + clienteLleno.getDireccion());
        System.out.println("Teléfono: " + clienteLleno.getTelefono());
        System.out.println("Email: " + clienteLleno.getEmail());
        System.out.println("Edad: " + clienteLleno.getEdad());
        System.out.println("Ciudad: " + clienteLleno.getCiudad());
        System.out.println("Código Postal: " + clienteLleno.getCodigoPostal());
        System.out.println("Método de Pago: " + clienteLleno.getMetodoPago());
        System.out.println("Fecha de Registro: " + clienteLleno.getFechaRegistro());
        System.out.println("Notas: " + clienteLleno.getNotas());


        Flor florVacio = new Flor();
        Flor florLleno = new Flor("Rosa", "Rojo", 2.5, "Flor de Jardín", true, "2023-09-01", "Proveedor A", 50, "Mantener en agua", "5");
        System.out.println("Flor (Vacío):");
        System.out.println("Nombre: " + florVacio.getNombre());
        System.out.println("Color: " + florVacio.getColor());
        System.out.println("Precio: " + florVacio.getPrecio());
        System.out.println("Tipo: " + florVacio.getTipo());
        System.out.println("Disponible: " + florVacio.isDisponible());
        System.out.println("Fecha de Cosecha: " + florVacio.getFechaCosecha());
        System.out.println("Proveedor: " + florVacio.getProveedor());
        System.out.println("Cantidad: " + florVacio.getCantidad());
        System.out.println("Cuidados: " + florVacio.getCuidados());
        System.out.println("Numero de petalos: " + florVacio.getNumeroPetalos());

        System.out.println("Flor (Lleno):");
        System.out.println("Nombre: " + florLleno.getNombre());
        System.out.println("Color: " + florLleno.getColor());
        System.out.println("Precio: " + florLleno.getPrecio());
        System.out.println("Tipo: " + florLleno.getTipo());
        System.out.println("Disponible: " + florLleno.isDisponible());
        System.out.println("Fecha de Cosecha: " + florLleno.getFechaCosecha());
        System.out.println("Proveedor: " + florLleno.getProveedor());
        System.out.println("Cantidad: " + florLleno.getCantidad());
        System.out.println("Cuidados: " + florLleno.getCuidados());
        System.out.println("Descripción: " + florLleno.getNumeroPetalos());


        Repartidor repartidorVacio = new Repartidor();
        Repartidor repartidorLleno = new Repartidor("Carlos Gómez", "987654321", "Furgoneta", "ABC123", 35, "Barcelona", "carlos@example.com", "2023-08-15", 1500, "Activo");
        System.out.println("Repartidor (Vacío):");
        System.out.println("Nombre: " + repartidorVacio.getNombre());
        System.out.println("Teléfono: " + repartidorVacio.getTelefono());
        System.out.println("Vehículo: " + repartidorVacio.getVehiculo());
        System.out.println("Licencia: " + repartidorVacio.getLicencia());
        System.out.println("Edad: " + repartidorVacio.getEdad());
        System.out.println("Ciudad: " + repartidorVacio.getCiudad());
        System.out.println("Email: " + repartidorVacio.getEmail());
        System.out.println("Fecha de Contratación: " + repartidorVacio.getFechaContratacion());
        System.out.println("Salario: " + repartidorVacio.getSalario());
        System.out.println("Estado: " + repartidorVacio.getEstado());
        System.out.println();

        System.out.println("Repartidor (Lleno):");
        System.out.println("Nombre: " + repartidorLleno.getNombre());
        System.out.println("Teléfono: " + repartidorLleno.getTelefono());
        System.out.println("Vehículo: " + repartidorLleno.getVehiculo());
        System.out.println("Licencia: " + repartidorLleno.getLicencia());
        System.out.println("Edad: " + repartidorLleno.getEdad());
        System.out.println("Ciudad: " + repartidorLleno.getCiudad());
        System.out.println("Email: " + repartidorLleno.getEmail());
        System.out.println("Fecha de Contratación: " + repartidorLleno.getFechaContratacion());
        System.out.println("Salario: " + repartidorLleno.getSalario());
        System.out.println("Estado: " + repartidorLleno.getEstado());
        System.out.println();


        System.out.println("Nombre");
        Proveedor proveedorVacio = new Proveedor();
        Proveedor proveedorLleno = new Proveedor("Matias", "1122334455", "matias@example.com", "Avenida Principal 456", "Sevilla", "Flores variadas", "Entrega a domicilio", "2023-09-10", "Activo", 4.5);
        System.out.println("Proveedor (Vacío):");
        System.out.println("Nombre: " + proveedorVacio.getNombre());
        System.out.println("Teléfono: " + proveedorVacio.getTelefono());
        System.out.println("Email: " + proveedorVacio.getEmail());
        System.out.println("Dirección: " + proveedorVacio.getDireccion());
        System.out.println("Ciudad: " + proveedorVacio.getCiudad());
        System.out.println("Producto Principal: " + proveedorVacio.getProductoPrincipal());
        System.out.println("Método de Entrega: " + proveedorVacio.getMetodoEntrega());
        System.out.println("Fecha de Registro: " + proveedorVacio.getFechaRegistro());
        System.out.println("Estado: " + proveedorVacio.getEstado());
        System.out.println("Calificación: " + proveedorVacio.getCalificacion());

        System.out.println("Proveedor (Lleno):");
        System.out.println("Nombre: " + proveedorLleno.getNombre());
        System.out.println("Teléfono: " + proveedorLleno.getTelefono());
        System.out.println("Email: " + proveedorLleno.getEmail());
        System.out.println("Dirección: " + proveedorLleno.getDireccion());
        System.out.println("Ciudad: " + proveedorLleno.getCiudad());
        System.out.println("Producto Principal: " + proveedorLleno.getProductoPrincipal());
        System.out.println("Método de Entrega: " + proveedorLleno.getMetodoEntrega());
        System.out.println("Fecha de Registro: " + proveedorLleno.getFechaRegistro());
        System.out.println("Estado: " + proveedorLleno.getEstado());
        System.out.println("Calificación: " + proveedorLleno.getCalificacion());
    }
}
