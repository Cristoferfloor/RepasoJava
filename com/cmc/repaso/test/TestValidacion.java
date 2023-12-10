package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

     public static void main(String[] args) {
        // Instanciar un objeto de tipo Validacion
        Validacion validacion = new Validacion();

       
        double monto1 = 100.50;
        double monto2 = 0;
        double monto3 = -50.75;

       
        boolean resultado1 = validacion.validarMonto(monto1);
        boolean resultado2 = validacion.validarMonto(monto2);
        boolean resultado3 = validacion.validarMonto(monto3);

        
        System.out.println("El monto " + monto1 + " es válido: " + resultado1);
        System.out.println("El monto " + monto2 + " es válido: " + resultado2);
        System.out.println("El monto " + monto3 + " es válido: " + resultado3);
    }
    }
    

