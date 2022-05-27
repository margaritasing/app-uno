package com.margaritasing;

public class GestorFactura {

    Calculadora calculadora;
    String nombre;

    public GestorFactura( Calculadora calculadora, String nombre) {
        System.out.println("Ejecutando constructor gestor");
        this.calculadora = calculadora;
        this.nombre = nombre;

    }

    //Metodos


}
