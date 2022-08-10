package com.mycompany.ejemploherencia;

public class clsHija extends clsPadre{
    
    @Override
    public void imprimirUsuarioPass()
    {
        System.out.println("El usuario es: " + this.usuario);
    }
    
    public clsHija(String user)
    {
        this.usuario = user;
    }
}
