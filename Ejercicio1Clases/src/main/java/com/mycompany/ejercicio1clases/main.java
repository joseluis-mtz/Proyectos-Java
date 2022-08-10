package com.mycompany.ejercicio1clases;

/*
 * @author joseluis
 * Tema: Clases en POO
 */

public class main 
{    
    public static void main(String[] args) 
    {	
        // Creación de una instancia de la clase clsCalculos
        clsCalculos objUno = new clsCalculos();
        // Establecer valores a los atributos
        objUno.setNumeroA(4);
        objUno.setNumeroB(2);
        // Utilizar los métodos de la clase
        objUno.sumar(objUno);
        // Imprimir
        System.out.println("El resultado es: " + objUno.getResultado());
        
        // Creación de una instancia de la clase clsCalculos con el segundo constructor disponible
        clsCalculos objDos = new clsCalculos(4, 4);
        // Uso del método de clase
        objUno.sumar(objDos);
        // Imprimir
        System.out.println("El resultado es: " + objDos.getResultado());
    }
}

