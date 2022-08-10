package com.mycompany.ejemplosalario;

public class principal {
    public static void main(String[] args)
    {
        //Crear objetos
        clsVentas objVentas = new clsVentas(400, "Juan", 19, 1000);
        clsRepartidor objRepartidor = new clsRepartidor("zona 3", "Liz", 20, 900);
        
        objVentas.aumento();
        objRepartidor.aumento();
        
        System.out.println(objVentas);
        
        System.out.println(objRepartidor);
    }
}