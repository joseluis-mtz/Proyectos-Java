package com.mycompany.ejemplodb;

public class principal {
    public static void main(String[] args) {
        clsConexion objConectar = new clsConexion("root", "adminroot", "agenda"); // Se conecta a la base de datos
        
        System.out.println("LISTADO DE DATOS");
        objConectar.consultar("personas"); // Se consultan los datos de la tabla
        
        //System.out.println("REGISTRO GUARDADO");
        //objConectar.insertar("personas", "Fermin", 35, "M"); // Se insertan datos
        
        //System.out.println("REGISTRO ELIMINADO");
        //objConectar.eliminar("personas", "5"); // Se elimina un registro
        
        //System.out.println("REGISTRO ACTUALIZADO");
        //objConectar.actualizar("personas", "4", "Emmanuel", 15, "M");
    }
}