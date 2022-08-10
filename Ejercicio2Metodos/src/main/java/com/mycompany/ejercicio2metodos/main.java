package com.mycompany.ejercicio2metodos;
/**
 * @author joseluis
 * Tema: Métodos
 */
public class main 
{
    // Método main
    public static void main(String[] args)
    {
        // Acceso a un método estático
        clsMetodos.SalidaDos();
        
        // Acceso a un método no estático
        clsMetodos objUno = new clsMetodos();
        objUno.Salida();
    }
    
// Método con parámetros por valor
    // Método con parámetros por referencia
}