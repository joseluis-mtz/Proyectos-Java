package com.mycompany.ejemplopolimorfismo;

public class principal {
    public static void main(String[] args)
    {
        //Tipo sobrecarga
        clsTodo objCarro = new clsCarro();
        clsTodo objMoto = new clsMoto();
        //objCarro.Sonar();
        //objMoto.Sonar();
        
        // Tipo parámetrico
        clsParam objParam = new clsParam();
        //objParam.imprimir(3, 10);
        //objParam.imprimir(5);
        //objParam.imprimir(2.3);
        
        clsOperacionUno objUno = new clsOperacionUno();
        objUno.calcular(4, 6);
        clsOperacionDos objDos = new clsOperacionDos();
        objDos.calcular(3, 3);
    }
}