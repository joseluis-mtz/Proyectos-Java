package com.mycompany.ejercicio2metodos;

/*
 * @author joseluis
 * Tema: Métodos
 */
public class clsMetodos {
    
  // Método no estático -> Es accesible desde el objeto, se asocia al objeto
  public void Salida()
  {
      System.out.println("Hola no soy estático.");
  }
  
  // Método estático -> Es accesible desde la clase, se asocia a la clase
  static void SalidaDos()
  {
      System.out.println("Hola soy estático.");
  }
  
  // Método sin parámetros y sin retorno de valores
    public void imprimir()
    {
        System.out.println("Hola mundo");
    }
    
    // Método con un parámetro sin retorno de valores
    public void imprimir(String mensaje)
    {
        System.out.println(mensaje);
    }
    
    // Método con un parámetro sin retorno de valores (diferente tipo de dato -> Sobrecarga)
    public void imprimir(boolean valor)
    {
        if(valor == true)
        {
            System.out.println("Verdadero");
        }
        else
        {
            System.out.println("Falso");
        }
    }
    
    // Método con dos parámetros y con retorno de valores
    public int sumar(int num1, int num2)
    {
        int resultado = num1 + num2;
        return resultado; 
    }
}
