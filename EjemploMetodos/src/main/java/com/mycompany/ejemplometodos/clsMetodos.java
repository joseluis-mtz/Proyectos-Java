package com.mycompany.ejemplometodos;

public class clsMetodos {
    // Método no estático -> Es accesible desde el objeto, se asocia al objeto
    public void Salida()
    {
        System.out.println("Hola soy un método no estático");
    }
    
    public static void SalidaDos()
    {
        System.out.println("Hola soy un método estático");
    }
    
    public void imprimir()
    {
        System.out.println("Hola mundo");
    }
    
    public void imprimir(String mensaje)
    {
        System.out.println(mensaje);
    }
    
    public void imprimir(boolean valor)
    {
        if (valor == true) {
            System.out.println("Verdadero");
        }
        else
        {
            System.out.println("Falso");
        }
    }
    
    public int sumar(int numero1, int numero2)
    {
        int resultado = numero1 +numero2;
        return resultado;
    }
}