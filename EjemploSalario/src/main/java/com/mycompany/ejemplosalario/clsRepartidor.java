
package com.mycompany.ejemplosalario;

public class clsRepartidor extends clsEmpleado{
    // Atributo
    public String zona;
    
    // Encapsulación
    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }
    
    public clsRepartidor(String zona, String nombre, int edad, double salario)
    {
        super(nombre,edad, salario);
        this.zona = zona;
    }

    @Override
    public String toString()
    {
        return super.toString() + " zona="+ zona;
    }
    
    @Override
    public boolean aumento() 
    {
        if(super.getEdad() > 18  && this.zona.equalsIgnoreCase("zona 3"))
        {
            double salarioNuevo = super.getSalario() + super.aumento;
            super.setSalario(salarioNuevo);
            System.out.println("Se aumento el salario del empleado: " + super.getNombre());
            return true;
        }
        return false;
    }
}
