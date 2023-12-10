package com.cmc.repaso.entidades;

public class Producto {
    
    private String nombre;
    private double precio;

   
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        setPrecio(precio); 
    }

    
    public void setPrecio(double precio) {
        if (precio < 0) {
            this.precio = precio * -1; 
        } else {
            this.precio = precio;
        }
    }

    
    public double calcularPrecioPromo(double porcentajeDescuento) {
        if (porcentajeDescuento < 0) {
            porcentajeDescuento = 0; 
        }
        double descuento = (porcentajeDescuento / 100) * precio;
        return precio - descuento;
    }

    
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
