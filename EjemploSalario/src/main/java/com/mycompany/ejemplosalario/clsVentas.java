package com.mycompany.ejemplosalario;

public class clsVentas extends clsEmpleado{
    
    // Método de la clase abstracta sobreescrito
    @Override
    public boolean aumento() {
        if(super.getEdad() > 18  && this.comision > 300)
        {
            double salarioNuevo = super.getSalario() + super.aumento;
            super.setSalario(salarioNuevo);
            System.out.println("Se aumento el salario del empleado: " + super.getNombre());
            return true;
        }
        return false;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + " comision=" + comision;
    }
    
    // Atributos
    private double comision;
    
    // Constructor
    public clsVentas(double comision, String nombre, int edad, double salario)
    {
        super(nombre, edad, salario);
        this.comision = comision;
    }
    
    //Encapsulación
    public double getComision()
    {
        return this.comision;
    }
    public void setComision(double comision)
    {
        this.comision = comision;
    }
}