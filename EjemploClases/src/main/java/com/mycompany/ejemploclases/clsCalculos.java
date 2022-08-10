package com.mycompany.ejemploclases;

public class clsCalculos 
{
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
    
    //Métodos
    public clsCalculos sumar(clsCalculos objeto)
    {
        int calculado = objeto.getNumeroA() + objeto.getNumeroB();
        objeto.setResultado(calculado);
        return objeto;
    }
    
    public clsCalculos restar(clsCalculos objeto)
    {
        int calculado = objeto.getNumeroA() - objeto.getNumeroB();
        objeto.setResultado(calculado);
        return objeto;
    }
    
    // Constructores
    public clsCalculos()
    {
        // sin acciones
    }
    
    public clsCalculos(int numero1, int numero2)
    {
        this.numeroA = numero1;
        this.numeroB = numero2;
    }
}