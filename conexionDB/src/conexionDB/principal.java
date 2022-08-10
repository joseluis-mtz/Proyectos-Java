package conexionDB;

import conexionDB.clsConexion;

public class principal {
	public static void main(String[] args)
	{
		clsConexion objConectar = new clsConexion("joseluis", "adminroot", "agenda"); // Se conecta a la base de datos
        
        //System.out.println("LISTADO DE DATOS");
        objConectar.consultar("personas"); // Se consultan los datos de la tabla
        
        System.out.println("REGISTRO GUARDADO");
        objConectar.insertar("personas", "Maria", 20, "F"); // Se insertan datos
		
        
        //System.out.println("REGISTRO ELIMINADO");
        objConectar.eliminar("personas", "1"); // Se elimina un registro
        
        //System.out.println("REGISTRO ACTUALIZADO");
        objConectar.actualizar("personas", "2", "Mauricio", 15, "F");
        objConectar.actualizar("personas", "6", "Laura", 15, "M");
	}
}
