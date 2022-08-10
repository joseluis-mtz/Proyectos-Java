package com.mycompany.ejercicio1clases;

public class clsCalculos {
 
    // Definición de atributos
    private int numeroA;
    private int numeroB;
    private int resultado;
    
    // Encapsulación
    public int getNumeroA()
    {
        return this.numeroA;
    }
    
    public void setNumeroA(int valor)
    {
        this.numeroA = valor;
    }
    
    public int getNumeroB()
    {
        return this.numeroB;
    }
    
    public void setNumeroB(int valor)
    {
        this.numeroB = valor;
    }
    
    public int getResultado()
    {
        return this.resultado;
    }
    
    public void setResultado(int valor)
    {
        this.resultado = valor;
    }
    
    // Creción de métodos
    public clsCalculos sumar(clsCalculos objeto)
    {
        int calculado = objeto.getNumeroA() + objeto.getNumeroB();
        objeto.setResultado(calculado);
        return objeto;
    }
    
    // Constructores
    public clsCalculos()
    {
        // Constructor vacío
    }
    
    public clsCalculos(int numero1, int numero2)
    {
        this.numeroA = numero1;
        this.numeroB = numero2;
    }
}