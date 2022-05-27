package com.margaritasing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // Crear un objeto de forma normal
        CalculatorService service = new CalculatorService();

        // Crear un objeto a partir de spring
        CalculatorService calculadora = (CalculatorService) context.getBean("calculatorService");

        String text =  calculadora.HolaMundo();

        System.out.println(text);

        CalculatorService calculadora1 = (CalculatorService) context.getBean("calculatorService");
        text = calculadora1.HolaMundo();

        System.out.println(text);





    }


}
