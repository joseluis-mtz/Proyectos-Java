package com.mycompany.ejemplopolimorfismo;

public class clsParam {
    
    public void imprimir(int valor)
    {
        System.out.println("Función ejecutada con un parámetro: " + valor);
    }
    
    public void imprimir(int valor, int valor2)
    {
        System.out.println("Función ejecutada con dos parámetros: " + valor + " valor2: " + valor2);
    }
    
    public void imprimir(double valor)
    {
        System.out.println("Función ejecutada con un parámetro de tipo diferente: " + valor);
    }
}