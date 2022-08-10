package com.mycompany.ejercicio4polimorfismo;

/*
 * @author joseluis
 * Tema: Polimorfismo
 */
public class main {
    
    public static void main(String[] args)
    {
        // Polimorfismo tipo sobrecarga
        clsTodo objCarro = new clsCarro();
        clsTodo objMoto = new clsMoto();
        objCarro.Sonar();
        objMoto.Sonar();
        
        // Polimorfismo tipo parámetrico
        clsParam objParam = new clsParam();
        objParam.imprimir(4);
        objParam.imprimir(4, 10);
        objParam.imprimir(2.3);
        
        // Polimorfismo tipo inclusión
        
        clsOperacionesUno objUno = new clsOperacionesUno();
        objUno.calcular(4, 6);
        clsOperacionesDos objDos = new clsOperacionesDos();
        objDos.calcular(2.3, 2.0);
    }
}