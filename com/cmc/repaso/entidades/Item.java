package com.cmc.repaso.entidades;

public class Item {
    private String nombre;
    private int productosActuales;
    private int productosDevueltos;
    private int productosVendidos;

    
    public Item(String nombre, int productosActuales) {
        this.nombre = nombre;
        this.productosActuales = productosActuales;
    }

   
    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Productos Actuales: " + productosActuales);
        System.out.println("Productos Vendidos: " + productosVendidos);
        System.out.println("Productos Devueltos: " + productosDevueltos);
    }

  
    public void vender(int cantidadVendidos) {
        if (cantidadVendidos > 0 && cantidadVendidos <= productosActuales) {
            productosActuales -= cantidadVendidos;
            productosVendidos += cantidadVendidos;
        } else {
            System.out.println("No hay suficientes productos para vender.");
        }
    }

  
    public void devolver(int cantidadDevueltos) {
        if (cantidadDevueltos > 0 && cantidadDevueltos <= productosVendidos) {
            productosActuales += cantidadDevueltos;
            productosVendidos -= cantidadDevueltos;
            productosDevueltos += cantidadDevueltos;
        } else {
            System.out.println("La cantidad de productos devueltos es inválida.");
        }
    }
}
