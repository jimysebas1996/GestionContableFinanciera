package ControladorBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConectarMySQL {
    // Librería de MySQL

    public String driver = "com.mysql.jdbc.Driver";
    // Nombre de la base de datos
    public String database = "Sistema_Facturacion";
    // Host
    public String hostname = "192.168.1.131"; //localhost";
    // Puerto
    public String port = "3306";
    // Ruta de nuestra base de datos (desactivamos el uso de SSL con "?useSSL=false")
    public String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false & useTimezone=true&serverTimezone=UTC";
    // Nombre de usuario
    public String username = "root";
    // Clave de usuario
    public String password = "jav240495";
    // Variable para la conexion con la base de datos
    static Connection conexion = null;

    public Connection conectarMySQL() {
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(url, username, password);

            if (conexion != null) {
                //JOptionPane.showMessageDialog(null, "CONEXION EXITOSA");
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "NO se pudo Conectar a la BD..", "ERROR !!!..", JOptionPane.ERROR_MESSAGE);

            //JOptionPane.showMessageDialog(null, "NO CONECTADO, OCURRIO UN ERROR: " + e.getMessage());
        }
        return conexion;
    }//Fin de la funcion conectarMySQL

    public void cerrarConexion() {
        try {
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error en cerrar conexion :" + e);
        }
    }

//    public int cerrarConexionMysql() throws SQLException {
//        try {
//            if (conexion != null) {
//                conexion.close();
//            }
//        } catch (SQLException e) {
//            //JOptionPane.showMessageDialog(null, "NO CONECTADO, OCURRIO UN ERROR: " + e.getMessage());
//            JOptionPane.showMessageDialog(null, "NO se pudo Conectar a la BD..", "ERROR !!!..", JOptionPane.ERROR_MESSAGE);
//        }
//
//        return 0;
//    }//Fin de la funcion cerrarConexionMysql
}//Fin de la clase ConectarMySQL
