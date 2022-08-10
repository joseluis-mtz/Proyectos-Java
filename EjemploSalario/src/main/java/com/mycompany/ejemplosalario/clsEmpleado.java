package com.mycompany.ejemplosalario;

public abstract class clsEmpleado {
    //Método abstracto
    public abstract boolean aumento();
    
    // Atributos
    private String nombre;
    private int edad;
    private double salario;
    
    //Constante
    public final double aumento = 500;
    
    //Encapsulación
    public String getNombre()
    {
        return this.nombre;
    }
    
    public int getEdad()
    {
        return this.edad;
    }
    
    public double getSalario()
    {
        return this.salario;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public void setEdad(int edad)
    {
        this.edad = edad;
    }
    
    public void setSalario(double salario)
    {
        this.salario = salario;
    }
    
    // Construcores
    public clsEmpleado(String nombre, int edad, double salario)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    
    // Método
    @Override
    public String toString()
    {
        return "nombre="+ nombre+ ", edad=" + edad + "salario ="+salario+",";
    }

}