package com.mycompany.ejemplorecursivo;

public class main {
    
    public static void main(String[] args)
    {
        multiplicar(3,10);
    }
    
    public static void multiplicar(int tabla, int numero)
    {
        if (numero>1)
        {
            multiplicar(tabla,numero-1);
        }
        System.out.println(tabla + "x" + numero + "=" + tabla*numero);
    }
    
    /*
    Llamamos a la función con un 10. 
    Imprimimos el 10 y llamamos a la función con un 9. 
    Imprimimos el 9 y llamamos a la función con un 8. 
    
    Problema: llamada infinita. Para ello, 
    lo que tenemos que hacer es que cuando el número sea 0, 
    deje de llamar a la función.
    */

}