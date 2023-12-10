package com.cmc.repaso.entidades;

public class Estudiante {

    private String nombre;
    private double nota;
    private String resultado;


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return this.nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getResultado() {
        return this.resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
  
    public Estudiante(String nombre) {
      this.nombre = nombre;
    }
  
    public void calificar(double nota) {
      this.nota = nota;
  
      if (nota < 8) {
        this.resultado = "F";
      } else {
        this.resultado = "A";
      }
    }
    
}
