package com.mycompany.ejemploerrores;

import java.util.FormatterClosedException;
import java.util.InputMismatchException;
import java.util.Scanner;
import org.xml.sax.SAXException;

public class principal {
    public static void main(String[] args)
    {
        // Error de sintaxis
        //System.out.println("Hola mundo");
        
        // Error de lógica -> El resultado no es el esperado
        /*
        int[] datos = new int[3];
        datos[0] = 1; // ->No se suma este
        datos[1] = 1;
        datos[2] = 1;
        int suma = 0;
        
        for (int i = 0; i < datos.length; i++) {
            suma = suma + datos[i];
        }
        
        System.out.println("La suma es: " + suma);
        */
        
        // Error de procesamientoint[] datos = new int[3];
        try{
            Scanner lector = new Scanner(System.in);
            int num1, num2, resultado;
            System.out.println("Ingrese un número:");
            num1 = lector.nextInt();
            System.out.println("Ingrese otro número:");
            num2 = lector.nextInt();
            resultado = num1 / num2;
            System.out.println("La división es: " + resultado);
        }
        catch(Exception varEx)
        {
            System.err.println("El programa tuvo un error.");
            System.err.println(varEx.getMessage());
        }
        finally
        {
            System.out.println("Si desea hacer algo más ejecute de nuevo de el programa.");
        }
    }
}