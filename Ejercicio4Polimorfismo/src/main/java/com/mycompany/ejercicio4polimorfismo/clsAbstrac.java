package com.mycompany.ejercicio4polimorfismo;

/*
 * @author joseluis
 */
public abstract class clsAbstrac 
{
    public abstract void calcular(double num1, double num2);
}

class clsOperacionesUno extends clsAbstrac
{
    @Override
    public void calcular(double num1, double num2)
    {
        double resultado = num1 + num2;
        System.out.println("El resultado de la suma es: " + resultado);
    }
}

class clsOperacionesDos extends clsAbstrac
{
    @Override
    public void calcular(double num1, double num2)
    {
        double resultado = num1 * num2;
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
}