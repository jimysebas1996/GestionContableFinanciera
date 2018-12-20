package ControladorBD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class GenerarNumFactura {
    
    //Instancias de otras clases
    ConectarMySQL conectarMySQL = new ConectarMySQL();
    //Variables a usar
    Statement sentencia;
    ResultSet rs = null;
    DefaultTableModel modeloTabla = null;
    Object[] registro = null;
    
    public int numero_factura(){
        int resultado = 0;
        
        try {
                sentencia = conectarMySQL.conectarMySQL().createStatement();
                rs = sentencia.executeQuery("SELECT COUNT(*) FROM TBL_FACTURAS;");
                rs.next();
                resultado = rs.getInt(1);
                conectarMySQL.cerrarConexion();
            } catch (SQLException ex) {
                
            }
        
        return resultado;
    }//Fin de la funcion numero_factura
    
}//Fin de la clase generar_nunm_factura
