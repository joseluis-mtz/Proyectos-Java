package com.mycompany.ejercicio3herencia;

/**
 * @author joseluis
 */
public class clsHija extends clsPadre{

    @Override
    public void imprimirUsuarioyPass() {
        System.out.println("El usuario es: " + this.usuario);
    }
    
    public clsHija(String user)
    {
        this.usuario = user;
    }
}
