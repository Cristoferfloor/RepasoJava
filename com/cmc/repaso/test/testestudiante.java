package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class testestudiante {

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Juan");

        
        estudiante.calificar(7.5);
        System.out.println("Nombre: " + estudiante.getNombre() +", Nota: " + estudiante.getNota() + ", Resultado: " + estudiante.getResultado());
        estudiante.calificar(8.5);
        System.out.println("Nombre: " + estudiante.getNombre() +", Nota: " + estudiante.getNota() +", Resultado: " + estudiante.getResultado());
        
    }
    
}
