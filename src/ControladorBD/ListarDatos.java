package ControladorBD;

import Ventanas.Principal;
import static Ventanas.Principal.lblFecha;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListarDatos {

    //Instancias de otras clases
    ConectarMySQL conectarMySQL = new ConectarMySQL();
    //Variables a usar
    Statement sentencia;
    ResultSet rs = null;
    DefaultTableModel modeloTabla = null;
    Object[] registro = null;
    //Principal principal = new Principal();

    public DefaultTableModel listadoClientes(JTable mod) {

        modeloTabla = (DefaultTableModel) mod.getModel();
        registro = new Object[8];

        try {
            sentencia = conectarMySQL.conectarMySQL().createStatement();
            rs = sentencia.executeQuery("SELECT "
                    + "CLI.CLIE_ID, "
                    + "CLI.clie_codigo,"
                    + "PR.PER_ID,"
                    + "PR.PER_CED,"
                    + "PR.PER_NOMBRE,"
                    + "PR.PER_APELLIDO,"
                    + "PR.PER_DIRECCION,"
                    + "PR.PER_TELF, "
                    + "PR.PER_CELL,"
                    + "PR.PER_EMAIL "
                    + "FROM TBL_PERSONA PR, TBL_CLIENTE CLI WHERE PR.PER_ID=CLI.PER_ID ORDER BY PR.per_apellido ASC;");

            while (rs.next()) {
                registro[0] = rs.getString(2);
                registro[1] = rs.getString(4);
                registro[2] = rs.getString(5);
                registro[3] = rs.getString(6);
                registro[4] = rs.getString(7);
                registro[5] = rs.getString(8);
                registro[6] = rs.getString(9);
                registro[7] = rs.getString(10);
                //registro[8] = rs.getString(9);

                modeloTabla.addRow(registro);
            }
            conectarMySQL.cerrarConexion();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "NO SE PUEDEN OBTENER LOS DATOS DE LOS CLIENTES PARA EL LISTADO");
        }

        return modeloTabla;
    }//Fin de la funcion listadoClientes    

    public Persona recuperarPersona(String cedula) {
        Persona persona = new Persona();
        try {
            sentencia = conectarMySQL.conectarMySQL().createStatement();
            rs = sentencia.executeQuery("SELECT "
                    + "CLI.CLIE_ID, "
                    + "CLI.clie_codigo,"
                    + "PR.PER_ID,"
                    + "PR.PER_CED,"
                    + "PR.PER_NOMBRE,"
                    + "PR.PER_APELLIDO,"
                    + "PR.PER_DIRECCION,"
                    + "PR.PER_TELF, "
                    + "PR.PER_CELL,"
                    + "PR.PER_EMAIL "
                    + "FROM TBL_PERSONA PR, TBL_CLIENTE CLI WHERE PR.PER_ID=CLI.PER_ID AND PR.PER_CED='" + cedula + "' ORDER BY PR.per_apellido ASC;");

            rs.next();
            persona.setCedula(rs.getString(4));
            persona.setNombre(rs.getString(5));
            persona.setApellido(rs.getString(6));
            persona.setDireccion(rs.getString(7));
            persona.setTelefono(rs.getString(8));
            persona.setCelular(rs.getString(9));
            persona.setEmail(rs.getString(10));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "NO SE PUEDEN OBTENER LOS DATOS DE LOS CLIENTES PARA EL LISTADO");
        }

        return persona;
    }//Fin de la funcion listadoClientes    

    public DefaultTableModel listadoEmpleados(JTable mod) {

        modeloTabla = (DefaultTableModel) mod.getModel();
        registro = new Object[10];

        try {
            sentencia = conectarMySQL.conectarMySQL().createStatement();

            rs = sentencia.executeQuery("SELECT "
                    + "EMP.EMP_CODIGO, "
                    + "PER.PER_CED, "
                    + "PER.PER_NOMBRE, "
                    + "PER.PER_APELLIDO, "
                    + "PER.PER_DIRECCION, "
                    + "PER.PER_TELF, "
                    + "PER.PER_CELL, "
                    + "PER.PER_EMAIL, "
                    + "EMP.EMP_CARGO, "
                    + "EMP.EMP_PASSWORD "
                    + "FROM TBL_PERSONA PER, TBL_EMPLEADO EMP "
                    + "WHERE PER.PER_ID=EMP.PER_ID ORDER BY PER.PER_CED");
            while (rs.next()) {
                registro[0] = rs.getString(1);//CODIGO
                registro[1] = rs.getString(2);//CEDULA
                registro[2] = rs.getString(3);//NOMBRE
                registro[3] = rs.getString(4);//APELLIDO
                registro[4] = rs.getString(5);
                registro[5] = rs.getString(6);
                registro[6] = rs.getString(7);
                registro[7] = rs.getString(8);
                registro[8] = rs.getString(9);
                registro[9] = rs.getString(10);

                modeloTabla.addRow(registro);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "NO SE PUEDEN OBTENER LOS DATOS DE LOS EMPLEADOS PARA EL LISTADO");
        }

        return modeloTabla;
    }//Fin de la funcion listadoClientes

    public DefaultTableModel listadoProveedor(JTable mod) {

        modeloTabla = (DefaultTableModel) mod.getModel();
        registro = new Object[8];

        try {
            sentencia = conectarMySQL.conectarMySQL().createStatement();

            rs = sentencia.executeQuery("SELECT "
                    + "* "
                    + "FROM TBL_PROVEDOR PROV");

            while (rs.next()) {
                registro[0] = rs.getString(2);
                registro[1] = rs.getString(3);
                registro[2] = rs.getString(4);
                registro[3] = rs.getString(5);
                registro[4] = rs.getString(6);
                registro[5] = rs.getString(7);
                registro[6] = rs.getString(8);
                registro[7] = rs.getString(9);
              
                modeloTabla.addRow(registro);
            }
            conectarMySQL.cerrarConexion();
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return modeloTabla;
    }//Fin de la funcion listadoClientes

    public DefaultTableModel listadoProductos(JTable mod) {

        modeloTabla = (DefaultTableModel) mod.getModel();
        registro = new Object[5];

        try {
            sentencia = conectarMySQL.conectarMySQL().createStatement();

            rs = sentencia.executeQuery("SELECT "
                    + "* "
                    + "FROM TBL_PRODUCTO PROD");

            while (rs.next()) {
                registro[0] = rs.getString(2);
                registro[1] = rs.getString(3);
                registro[2] = rs.getString(4);
                registro[3] = rs.getString(5);
                registro[4] = rs.getString(6);

                modeloTabla.addRow(registro);
            }
            conectarMySQL.cerrarConexion();
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return modeloTabla;
    }//Fin de la funcion listadoProductos
    
     public DefaultTableModel listadoCompras(JTable mod) {

        modeloTabla = (DefaultTableModel) mod.getModel();
        registro = new Object[7];

        try {
            sentencia = conectarMySQL.conectarMySQL().createStatement();

            rs = sentencia.executeQuery("SELECT "
                    + "* "
                    + "FROM TBL_COMPRAPROVEDOR COMPP");

            while (rs.next()) {
                registro[0] = rs.getString(2);
                registro[1] = rs.getString(3);
                registro[2] = rs.getDate(4);
                registro[3] = rs.getDouble(5);
                registro[4] = rs.getInt(6);
                registro[5] = rs.getDate(7);
                //registro[6] = principal.lblFecha.getText();
              
                modeloTabla.addRow(registro);
            }
            conectarMySQL.cerrarConexion();
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return modeloTabla;
    }//Fin de la funcion listadoCompra

    
    
    
}//Fin de la clase ListarDatos
