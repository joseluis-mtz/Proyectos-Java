package com.mycompany.ejemploherencia;

public class clsPadre {
    // Atributos
    private String pwd;
    public String usuario;
    
    // Encapsulación
    
    // Métodos
    public void cambiarDatos(String usuario)
    {
        this.usuario = usuario;
    }
    
    public void imprimirUsuarioPass()
    {
        System.out.println(this.usuario);
        System.out.println(this.pwd);
    }
    
    // Constructor
    public clsPadre()
    {
        //Vacio
        pwd = "123";
    }
    
}