package com.mycompany.ejercicio5excepciones;

import java.util.Scanner;

/*
 * @author joseluis
 * Tema: Excepciones
 */
public class main {
    public static void main(String[] args)
    {
        // Error de sintaxis
        System.out.println("Hola mundo");
        //System.out.println("Hola mundo);
        
        //Error de lógica -> El resultado de suma no es el esperado
        int[] datos = new int[3];
        datos[0] = 1;
        datos[1] = 1;
        datos[2] = 1;        
        int suma = 0;
        
        for (int i = 1; i < datos.length; i++) 
        {
            suma = suma + datos[i];
        }
        System.out.println("Suma: " + suma);
        
        // Error de procesamiento -> La posición 3 no se encuentra en el arreglo
        //for (int i = 0; i <= datos.length; i++) 
        //{
        //    suma = suma + datos[i];
        //}
        //System.out.println("Suma: " + suma);
        
        //Calcular división, manejo de errores
        try{
        Scanner reader = new Scanner(System.in);
        int num1, num2, resultado;
        System.out.println("Ingrese primero numero");
        num1 = reader.nextInt();
        System.out.println("Ingrese segundo numero");
        num2 = reader.nextInt();
        resultado = num1/num2;
        System.err.println("La división es: " + resultado);
        }
        catch(ArithmeticException varEx)
        {
            System.err.println("El programa tuvo un error.");
            System.err.println(varEx.getMessage());
        }
        finally
        {
            System.out.println("Si desea realizar otra acción reinicie el programa.");
        }
    }
}