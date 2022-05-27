package com.margaritasing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // Crear un objeto de forma normal
        //Calculadora service = new Calculadora();

        // Crear un objeto a partir de spring
        Calculadora calculadora = (Calculadora) context.getBean("calculadora");

        String text =  calculadora.HolaMundo();

        System.out.println(text);

        Calculadora calculadora1 = (Calculadora) context.getBean("calculadora");
        text = calculadora1.HolaMundo();

        System.out.println(text);

        //Ejemplo 2

       GestorFactura gestor = (GestorFactura) context.getBean("gestorFacturas");
       System.out.println(gestor.calculadora.HolaMundo());






    }


}
