package ControladorBD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EliminarDato {

    //Instancia de otras clases
    ConectarMySQL conectarMySQL = new ConectarMySQL();
    ListarDatos listarDatos = new ListarDatos();
    Statement sentencia;
    ResultSet rs = null;

    public boolean eliminar_cliente_id(String cedula, String codigo) {
        boolean resultado = false;
        String elicliente = "DELETE FROM TBL_CLIENTE WHERE CLIE_CODIGO = ?";
        String elipersona = "DELETE FROM TBL_PERSONA WHERE PER_CED = ?";
        try {
            try (PreparedStatement eliminar_cliente = conectarMySQL.conectarMySQL().prepareStatement(elicliente)) {
                eliminar_cliente.setString(1, codigo);
                eliminar_cliente.executeUpdate();
                eliminar_cliente.close();
            }
            try (PreparedStatement eliminar_persona = conectarMySQL.conectarMySQL().prepareStatement(elipersona)) {
                eliminar_persona.setString(1, cedula);
                eliminar_persona.executeUpdate();
                eliminar_persona.close();
            }

            resultado = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        return resultado;
    }//Fin de la funcion eliminar cliente    


    public boolean eliminarEmpleado(String codigo) {
        boolean resultado = false;
        Integer id=0;
        try {
            String elicliente = "DELETE FROM TBL_EMPLEADO WHERE TBL_EMPLEADO.emp_codigo = ?";
            try (PreparedStatement eliminarEmpleado = conectarMySQL.conectarMySQL().prepareStatement(elicliente)) {
                eliminarEmpleado.setString(1, codigo);
                eliminarEmpleado.executeUpdate();
                eliminarEmpleado.close();
                
                return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }//Fin de la funcion eliminar cliente

   public boolean eliminarProvedor(String codigo) {
        boolean resultado = false;
        Integer id=0;
        try {
            String elicliente = "DELETE FROM TBL_PROVEDOR WHERE TBL_PROVEDOR.PROV_CODIGO = ?";
            try (PreparedStatement eliminarEmpleado = conectarMySQL.conectarMySQL().prepareStatement(elicliente)) {
                eliminarEmpleado.setString(1, codigo);
                eliminarEmpleado.executeUpdate();
                eliminarEmpleado.close();
                
                return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }//Fin de la funcion eliminar cliente

 public boolean eliminarInventario(Integer cedula, String codigo) {
        boolean resultado = false;
        String eliproducto = "DELETE FROM TBL_PRODUCTO WHERE PROD_CODIGO = ?";
        String eliinvetario = "DELETE FROM TBL_INVENTARIO WHERE PROD_ID= ?";
        try {
            try (PreparedStatement eliminarProucto = conectarMySQL.conectarMySQL().prepareStatement(eliproducto)) {
                eliminarProucto.setString(1, codigo);
                eliminarProucto.executeUpdate();
                eliminarProucto.close();
            }
            try (PreparedStatement eliminarInventa = conectarMySQL.conectarMySQL().prepareStatement(eliinvetario)) {
                eliminarInventa.setInt(1, cedula);
                eliminarInventa.executeUpdate();
                eliminarInventa.close();
            }

            resultado = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        return resultado;
    }//Fin de la funcion eliminar cliente   



}
