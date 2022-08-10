package com.mycompany.ejemploclases;

public class principal {
    
    public static void main(String[] args)
    {
        //Crear un objeto
        clsCalculos objUno = new clsCalculos();
        objUno.setNumeroA(4);
        objUno.setNumeroB(6);
        objUno.sumar(objUno);
        System.out.println("El resultado es: " + objUno.getResultado());
        
        clsCalculos objDos = new clsCalculos(10, 20);
        objDos.sumar(objDos);
        System.out.println("El segundo resultado es: " + objDos.getResultado());
    }
}