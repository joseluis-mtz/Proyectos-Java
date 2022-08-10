package com.mycompany.ejemplometodos;

public class principal {
    public static void main(String[] args)
    {
        clsMetodos.SalidaDos();
        
        clsMetodos objUno = new clsMetodos();
        objUno.Salida();
        objUno.imprimir();
        objUno.imprimir("Soy un mensaje");
        objUno.imprimir(false);
        System.out.println(objUno.sumar(3, 3));;
    }
}