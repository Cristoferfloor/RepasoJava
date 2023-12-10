package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class testItem {

    public static void main(String[] args) {
        Item item1 = new Item("Producto A", 20);

        System.out.println("Valores Iniciales del Item 1:");
        item1.imprimir();

        item1.vender(5);
        System.out.println("\nDespués de vender 5 productos:");
        item1.imprimir();

       
        item1.devolver(2);
        System.out.println("\nDespués de devolver 2 productos:");
        item1.imprimir();

      
    
    }
    
}
