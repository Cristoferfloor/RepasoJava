package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class testproducto {

    public static void main(String[] args) {
         Producto producto = new Producto("Laptop", 1200.0);

        
        producto.setPrecio(-800.0);
        System.out.println("Nombre: " + producto.getNombre() +", Precio: " + producto.getPrecio());

        
        double precioConDescuento = producto.calcularPrecioPromo(10.0);
        System.out.println("Nombre: " + producto.getNombre() +", Precio con 10% de descuento: " + precioConDescuento);
    }
    
}
