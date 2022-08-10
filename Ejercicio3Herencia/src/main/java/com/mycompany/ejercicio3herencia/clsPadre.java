package com.mycompany.ejercicio3herencia;

/**
 * @author joseluis
 */
public class clsPadre {
    //Atributos
    private String pwd;
    public String usuario;
    
    //Encapsulación
    
    //Métodos
    public void cambiarDatos(String usuario)
    {
        this.usuario = usuario;
    }
    
    public void imprimirUsuarioyPass()
    {
        System.out.println(this.usuario);
        System.out.println(this.pwd);
    }
    
    //Constructor
    public clsPadre()
    {
        // Vacío
        this.pwd = "123";
    }
}
