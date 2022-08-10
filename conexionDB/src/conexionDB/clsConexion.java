package conexionDB;

import java.sql.*; // Libreria para trabajar con el driver de MySQL

public class clsConexion {
	// Atrinutos para conectar a la base de datos
	String usuario;
	String password;
	String baseDatos;
	Connection conexion;

	// Constructor para inicializar atributos
	public clsConexion(String User, String Pass, String DB) {
		// Asignación de valores
		usuario = User;
		password = Pass;
		baseDatos = DB;
	}

	// Método conectar
	public void conectar() {
		// Bloque TRY-CATCH para encapsular errores
		try {
			// Se obtienen una instancia de conexión con la cadena de conexión a mi servidor
			// de BD
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + baseDatos, usuario, password);
		} catch (SQLException e) // Se captura una excepción en caso de que se haya generado
		{
			e.getMessage();
		}
	}

	// Método para desconectar o cerrar la conexión
	public void desconectar() {
		try {
			conexion.close(); // Se cierra la conexión
		} catch (SQLException e) // Se captura una excepción en caso de que se haya generado
		{
			e.getMessage();
		}
	}
	
	// CONSULTAR ----------------------- INSERTAR ------------------ ELIMINAR ---------------------------- ACTUALIZAR
	public void consultar(String tabla) {
		conectar();
		try {
			Statement sentencia = conexion.createStatement();

			ResultSet rs = sentencia.executeQuery("select * from " + tabla);

			while (rs.next()) {
				System.out.println((rs.getString("idPersona") + " " + rs.getString("nombre") + " "
						+ rs.getString("edad") + " " + rs.getString("sexo") + "\n"));
			}
			desconectar();
		} catch (Exception e) {
			System.err.println("NO Conecta.");
			e.printStackTrace();
			desconectar();
		}
		desconectar();
	}

	public void insertar(String tabla, String nombre, int edad, String sexo) {
		conectar();
		nombre = '\'' + nombre + '\'';
		//edad = '\'' + edad + '\'';
		sexo = '\'' + sexo + '\'';
		try {
			Statement sentencia = conexion.createStatement();
			sentencia.executeUpdate("insert into " + tabla + "(nombre, edad, sexo)" + " values(" + nombre + ',' + edad
					+ ',' + sexo + ");");
		} catch (Exception e) {
			System.out.println("error");
			System.err.println(e.getMessage());
		}
		desconectar();
	}

	public void eliminar(String tabla, String id) {
		conectar();
		id = '\'' + id + '\'';
		try {
			Statement s = conexion.createStatement();
			s.executeUpdate("delete from " + tabla + " where idPersona =" + id + ';');

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		desconectar();
	}

	public void actualizar(String tabla, String id, String nombre, int edad, String sexo) {
		conectar();
		nombre = '\'' + nombre + '\'';
		sexo = '\'' + sexo + '\'';
		try {
			Statement sentencia = conexion.createStatement();
			sentencia.executeUpdate("UPDATE " + tabla + " set nombre = " + nombre + ", edad=" + edad + ", sexo=" + sexo
					+ " where idPersona=" + id + ";");
			
			String sql = "UPDATE " + tabla + " set nombre = " + nombre + ", edad=" + edad + ", sexo=" + sexo
					+ " where idPersona=" + id + ";";
			System.out.println(sql);
			// sentencia.executeUpdate("UPDATE" + tabla + " values(" + nombre + ',' + edad +
			// ',' + sexo + ");");
		} catch (Exception e) {
			System.out.println("error");
			System.err.println(e.getMessage());
		}
		desconectar();
	}
}
