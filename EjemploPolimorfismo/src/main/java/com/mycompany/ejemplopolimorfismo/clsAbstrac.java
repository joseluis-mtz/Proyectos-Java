package com.mycompany.ejemplopolimorfismo;

public abstract class clsAbstrac {
    
    public abstract void calcular(double num1, double num2);
}

class clsOperacionUno extends clsAbstrac
{
    @Override
    public void calcular(double num1, double num2) {
        double resultado = num1 + num2;
        System.out.println("La suma es: " + resultado);
    }
}

class clsOperacionDos extends clsAbstrac
{

    @Override
    public void calcular(double num1, double num2) {
        double resultado = num1 * num2;
        System.out.println("La multiplicación es: " + resultado);
    }
    
}