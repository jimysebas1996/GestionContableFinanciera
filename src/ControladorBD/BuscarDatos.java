package ControladorBD;

import Ventanas.Principal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class BuscarDatos {

    //Instancias de otras clases
    ConectarMySQL conectarMySQL = new ConectarMySQL();

    //Variables para el trabajo de sentencias
    Statement sentencia;
    boolean personaExistente;
    //Variable para mantener datos en cache
    ResultSet rs = null;

    //Principal principal = new Principal();
    public DefaultTableModel buscarClientePorCedula(String cedula, JTable mod) {

        DefaultTableModel modelo = (DefaultTableModel) mod.getModel();
        Object[] registro = new Object[8];

        try {
            //Conexion con la base de datos y preparacion de la variable para consultas
            sentencia = conectarMySQL.conectarMySQL().createStatement();

            //Preparacion de la consulta sql para la busqueda con LIKE
            String filtro = "" + cedula + "%";
            //Consulta parametrizada lista en un string
            String sql = "SELECT CLI.CLIE_CODIGO, PR.PER_CED, PR.PER_NOMBRE, PR.PER_APELLIDO, "
                    + "PR.PER_DIRECCION,PR.PER_TELF, PR.PER_CELL,"
                    + "PR.PER_EMAIL FROM TBL_CLIENTE CLI, TBL_PERSONA PR "
                    + "WHERE CLI.PER_ID = PR.PER_ID AND PR.PER_CED LIKE " + '"' + filtro + '"' + " ORDER BY PR.per_apellido ASC";
            PreparedStatement consulta = conectarMySQL.conectarMySQL().prepareStatement(sql);
            //Ejecucion de la consulta sql
            rs = consulta.executeQuery();
            //Lectura de los registros guardados en el ResultSet
            while (rs.next()) {
                registro[0] = rs.getString(1);
                registro[1] = rs.getString(2);
                registro[2] = rs.getString(3);
                registro[3] = rs.getString(4);
                registro[4] = rs.getString(5);
                registro[5] = rs.getString(6);
                registro[6] = rs.getString(7);
                registro[7] = rs.getString(8);
                modelo.addRow(registro);
            }//Rrecorrido del rs, tambien la creacion del DefaultTableModel para la tabla de busqueda
            mod.setModel(modelo);
            rs.close();
            conectarMySQL.cerrarConexion();
        } //Fin de la funcion buscar-cliente //Fin de la funcion buscar-cliente //Fin de la funcion buscar-cliente //Fin de la funcion buscar-cliente
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }

        return modelo;
    }//Fin de la funcion buscar_cliente  

    public DefaultTableModel buscarClientePorNombre(String nombres, JTable mod) {

        DefaultTableModel modelo = (DefaultTableModel) mod.getModel();
        Object[] registro = new Object[8];

        try {
            //Conexion con la base de datos y preparacion de la variable para consultas
            sentencia = conectarMySQL.conectarMySQL().createStatement();

            //Preparacion de la consulta sql para la busqueda con LIKE
            String filtro = "" + nombres + "%";
            //Consulta parametrizada lista en un string
            String sql = "SELECT CLI.CLIE_CODIGO, PR.PER_CED, PR.PER_NOMBRE, PR.PER_APELLIDO, "
                    + "PR.PER_DIRECCION,PR.PER_TELF, PR.PER_CELL,"
                    + "PR.PER_EMAIL FROM TBL_CLIENTE CLI, TBL_PERSONA PR "
                    + "WHERE CLI.PER_ID = PR.PER_ID AND PR.PER_NOMBRE LIKE " + '"' + filtro + '"' + " ORDER BY PR.per_apellido ASC";
            PreparedStatement consulta = conectarMySQL.conectarMySQL().prepareStatement(sql);
            //Ejecucion de la consulta sql
            rs = consulta.executeQuery();
            //Lectura de los registros guardados en el ResultSet
            while (rs.next()) {
                registro[0] = rs.getString(1);
                registro[1] = rs.getString(2);
                registro[2] = rs.getString(3);
                registro[3] = rs.getString(4);
                registro[4] = rs.getString(5);
                registro[5] = rs.getString(6);
                registro[6] = rs.getString(7);
                registro[7] = rs.getString(8);
                modelo.addRow(registro);
            }//Rrecorrido del rs, tambien la creacion del DefaultTableModel para la tabla de busqueda
            mod.setModel(modelo);
            rs.close();
            conectarMySQL.cerrarConexion();
        } //Fin de la funcion buscar-cliente //Fin de la funcion buscar-cliente //Fin de la funcion buscar-cliente //Fin de la funcion buscar-cliente
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }

        return modelo;
    }//Fin de la funcion buscar_cliente  

    public DefaultTableModel buscarClientePorApellidos(String apellidos, JTable mod) {

        DefaultTableModel modelo = (DefaultTableModel) mod.getModel();
        Object[] registro = new Object[8];

        try {
            //Conexion con la base de datos y preparacion de la variable para consultas
            sentencia = conectarMySQL.conectarMySQL().createStatement();
            String filtro = "" + apellidos + "%";

            //Consulta parametrizada lista en un string
            String sql = "SELECT "
                    + "CLI.CLIE_CODIGO, "
                    + "PR.PER_CED, "
                    + "PR.PER_NOMBRE, "
                    + "PR.PER_APELLIDO, "
                    + "PR.PER_DIRECCION,"
                    + "PR.PER_TELF, "
                    + "PR.PER_CELL,"
                    + "PR.PER_EMAIL "
                    + "FROM TBL_CLIENTE CLI, TBL_PERSONA PR "
                    + "WHERE CLI.PER_ID = PR.PER_ID AND PR.PER_APELLIDO LIKE " + '"' + filtro + '"' + " ORDER BY PR.per_apellido ASC";
            PreparedStatement consulta = conectarMySQL.conectarMySQL().prepareStatement(sql);
            //Ejecucion de la consulta sql
            rs = consulta.executeQuery();
            //Lectura de los registros guardados en el ResultSet
            while (rs.next()) {
                registro[0] = rs.getString(1);
                registro[1] = rs.getString(2);
                registro[2] = rs.getString(3);
                registro[3] = rs.getString(4);
                registro[4] = rs.getString(5);
                registro[5] = rs.getString(6);
                registro[6] = rs.getString(7);
                registro[7] = rs.getString(8);
                modelo.addRow(registro);
            }//Rrecorrido del rs, tambien la creacion del DefaultTableModel para la tabla de busqueda
            mod.setModel(modelo);
            rs.close();
            conectarMySQL.cerrarConexion();

        } //Fin de la funcion buscar-cliente //Fin de la funcion buscar-cliente //Fin de la funcion buscar-cliente //Fin de la funcion buscar-cliente
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }

        return modelo;
    }//Fin de la funcion buscar_cliente

///////////////////BUSQUEDAS DE EMPLEADOS////////////////////////////
    public DefaultTableModel buscarEmpleadoCedula(String cedula, JTable mod) {
        DefaultTableModel modelo = (DefaultTableModel) mod.getModel();
        Object[] registro = new Object[10];
        //datoExistente = false;
        try {

            //Conexion con la base de datos y preparacion de la variable para consultas
            sentencia = conectarMySQL.conectarMySQL().createStatement();

            //Preparacion de la consulta sql para la busqueda con LIKE
            String filtro = "" + cedula + "%";
            //Consulta parametrizada lista en un string
            String sql = "SELECT EM.EMP_CODIGO, PR.PER_CED, PR.PER_NOMBRE, PR.PER_APELLIDO, "
                    + "PR.PER_DIRECCION,PR.PER_TELF, PR.PER_CELL,"
                    + "PR.PER_EMAIL ,EM.EMP_CARGO,EM.EMP_PASSWORD FROM TBL_EMPLEADO EM, TBL_PERSONA PR "
                    + "WHERE EM.PER_ID = PR.PER_ID AND PR.PER_CED LIKE " + '"' + filtro + '"' + " ORDER BY PR.per_apellido ASC";
            PreparedStatement consulta = conectarMySQL.conectarMySQL().prepareStatement(sql);
            //Ejecucion de la consulta sql
            rs = consulta.executeQuery();
            //Lectura de los registros guardados en el ResultSet

            //datoExistente = true;
            while (rs.next()) {
                registro[0] = rs.getString(1);
                registro[1] = rs.getString(2);
                registro[2] = rs.getString(3);
                registro[3] = rs.getString(4);
                registro[4] = rs.getString(5);
                registro[5] = rs.getString(6);
                registro[6] = rs.getString(7);
                registro[7] = rs.getString(8);
                registro[8] = rs.getString(9);
                registro[9] = rs.getString(10);
                modelo.addRow(registro);
            }

            mod.setModel(modelo);
            rs.close();
            conectarMySQL.cerrarConexion();
        } //Fin de la funcion buscar-cliente //Fin de la funcion buscar-cliente //Fin de la funcion buscar-cliente //Fin de la funcion buscar-cliente
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }

        return modelo;
    }//Fin de la funcion buscar_cliente  

    public DefaultTableModel buscarEmpleadoNombres(String nombres, JTable mod) {

        DefaultTableModel modelo = (DefaultTableModel) mod.getModel();
        Object[] registro = new Object[10];

        try {
            //Conexion con la base de datos y preparacion de la variable para consultas
            sentencia = conectarMySQL.conectarMySQL().createStatement();

            //Consulta parametrizada lista en un string
            String sql = "SELECT "
                    + "PERS.PERS_ID, "
                    + "EMP.EMPLE_CODIGO, "
                    + "PERS.PERS_CEDULA, "
                    + "PERS.PERS_NOMBRES, "
                    + "PERS.PERS_APELLIDOS, "
                    + "PERS.PERS_TELEFONO1, "
                    + "PERS.PERS_TELEFONO2, "
                    + "PERS.PERS_DIRECCION, "
                    + "PERS.PERS_CORREO_ELECTRONICO, "
                    + "EMP.EMPLE_CARGO "
                    + "FROM "
                    + "TBL_PERSONA PERS, TBL_EMPLEADOS EMP "
                    + "WHERE "
                    + "PERS.PERS_ID=EMP.PERS_ID AND PERS.PERS_NOMBRES LIKE ?";
            //Preparacion de la consulta sql para la busqueda con LIKE
            PreparedStatement consulta = conectarMySQL.conectarMySQL().prepareStatement(sql);
            consulta.setString(1, "%" + nombres + "%");
            //Ejecucion de la consulta sql
            rs = consulta.executeQuery();
            //Lectura de los registros guardados en el ResultSet
            while (rs.next()) {
                registro[0] = rs.getInt(1);
                registro[1] = rs.getString(2);
                registro[2] = rs.getString(3);
                registro[3] = rs.getString(4);
                registro[4] = rs.getString(5);
                registro[5] = rs.getString(6);
                registro[6] = rs.getString(7);
                registro[7] = rs.getString(8);
                registro[8] = rs.getString(9);
                registro[9] = rs.getString(10);

                modelo.addRow(registro);
            }//Rrecorrido del rs, tambien la creacion del DefaultTableModel para la tabla de busqueda

        } //Fin de la funcion buscar-cliente //Fin de la funcion buscar-cliente //Fin de la funcion buscar-cliente //Fin de la funcion buscar-cliente
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }

        return modelo;
    }//Fin de la funcion buscar_empleados por nombres

    public DefaultTableModel buscarEmpleadoApellidos(String apellidos, JTable mod) {

        DefaultTableModel modelo = (DefaultTableModel) mod.getModel();
        Object[] registro = new Object[10];

        try {
            //Conexion con la base de datos y preparacion de la variable para consultas
            sentencia = conectarMySQL.conectarMySQL().createStatement();

            //Consulta parametrizada lista en un string
            String sql = "SELECT "
                    + "PERS.PERS_ID, "
                    + "EMP.EMPLE_CODIGO, "
                    + "PERS.PERS_CEDULA, "
                    + "PERS.PERS_NOMBRES, "
                    + "PERS.PERS_APELLIDOS, "
                    + "PERS.PERS_TELEFONO1, "
                    + "PERS.PERS_TELEFONO2, "
                    + "PERS.PERS_DIRECCION, "
                    + "PERS.PERS_CORREO_ELECTRONICO, "
                    + "EMP.EMPLE_CARGO "
                    + "FROM "
                    + "TBL_PERSONA PERS, TBL_EMPLEADOS EMP "
                    + "WHERE "
                    + "PERS.PERS_ID=EMP.PERS_ID AND PERS.PERS_APELLIDOS LIKE ?";

            //Preparacion de la consulta sql para la busqueda con LIKE
            PreparedStatement consulta = conectarMySQL.conectarMySQL().prepareStatement(sql);
            consulta.setString(1, "%" + apellidos + "%");
            //Ejecucion de la consulta sql
            rs = consulta.executeQuery();
            //Lectura de los registros guardados en el ResultSet
            while (rs.next()) {
                registro[0] = rs.getInt(1);
                registro[1] = rs.getString(2);
                registro[2] = rs.getString(3);
                registro[3] = rs.getString(4);
                registro[4] = rs.getString(5);
                registro[5] = rs.getString(6);
                registro[6] = rs.getString(7);
                registro[7] = rs.getString(8);
                registro[8] = rs.getString(9);
                registro[9] = rs.getString(10);

                modelo.addRow(registro);
            }//Rrecorrido del rs, tambien la creacion del DefaultTableModel para la tabla de busqueda

        } //Fin de la funcion buscar-cliente //Fin de la funcion buscar-cliente //Fin de la funcion buscar-cliente //Fin de la funcion buscar-cliente
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }

        return modelo;
    }//Fin de la funcion buscar_empleadopor apellido

///////////////////BUSQUEDAS DE PROVEEDORES////////////////////////////
    public DefaultTableModel buscarProveedorCodigo(String cedula, JTable mod) {

        DefaultTableModel modelo = (DefaultTableModel) mod.getModel();
        Object[] registro = new Object[10];

        try {
            //Conexion con la base de datos y preparacion de la variable para consultas
            sentencia = conectarMySQL.conectarMySQL().createStatement();

            //Consulta parametrizada lista en un string
            String sql = "SELECT "
                    + "* "
                    + "FROM "
                    + "TBL_PROVEDOR PROV "
                    + "WHERE "
                    + "PROV_RUC_CEDULA LIKE ?";

            //Preparacion de la consulta sql para la busqueda con LIKE
            PreparedStatement consulta = conectarMySQL.conectarMySQL().prepareStatement(sql);
            consulta.setString(1, "%" + cedula + "%");
            //Ejecucion de la consulta sql
            rs = consulta.executeQuery();
            //Lectura de los registros guardados en el ResultSet
            while (rs.next()) {
                registro[0] = rs.getString(2);
                registro[1] = rs.getString(3);
                registro[2] = rs.getString(4);
                registro[3] = rs.getString(5);
                registro[4] = rs.getString(6);
                registro[5] = rs.getString(7);
                registro[6] = rs.getString(8);
                registro[7] = rs.getString(9);

                modelo.addRow(registro);
            }//Rrecorrido del rs, tambien la creacion del DefaultTableModel para la tabla de busqueda

        } //Fin de la funcion buscar-cliente //Fin de la funcion buscar-cliente //Fin de la funcion buscar-cliente //Fin de la funcion buscar-cliente
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }

        return modelo;
    }//Fin de la funcion buscar_proveedor por cedula  

    public DefaultTableModel buscarProveedorNombres(String nombres, JTable mod) {

        DefaultTableModel modelo = (DefaultTableModel) mod.getModel();
        Object[] registro = new Object[10];

        try {
            //Conexion con la base de datos y preparacion de la variable para consultas
            sentencia = conectarMySQL.conectarMySQL().createStatement();

            //Consulta parametrizada lista en un string
            String sql = "SELECT "
                    + "* "
                    + "FROM "
                    + "TBL_PROVEEDORES PROV "
                    + "WHERE "
                    + "PROV_NOMBRE LIKE ?";
            //Preparacion de la consulta sql para la busqueda con LIKE
            PreparedStatement consulta = conectarMySQL.conectarMySQL().prepareStatement(sql);
            consulta.setString(1, "%" + nombres + "%");
            //Ejecucion de la consulta sql
            rs = consulta.executeQuery();
            //Lectura de los registros guardados en el ResultSet
            while (rs.next()) {
                registro[0] = rs.getInt(1);
                registro[1] = rs.getString(2);
                registro[2] = rs.getString(3);
                registro[3] = rs.getString(4);
                registro[4] = rs.getString(5);
                registro[5] = rs.getString(6);
                registro[6] = rs.getString(7);
                registro[7] = rs.getString(8);
                registro[8] = rs.getString(9);
                registro[9] = rs.getString(10);

                modelo.addRow(registro);
            }//Rrecorrido del rs, tambien la creacion del DefaultTableModel para la tabla de busqueda

        } //Fin de la funcion buscar-cliente //Fin de la funcion buscar-cliente //Fin de la funcion buscar-cliente //Fin de la funcion buscar-cliente
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }

        return modelo;
    }//Fin de la funcion buscar_proveedor por nombre

///////////////////BUSQUEDAS DE PRODUCTOS////////////////////////////
    public DefaultTableModel buscarProductoNombre(String nombre, JTable mod) {

        DefaultTableModel modelo = (DefaultTableModel) mod.getModel();
        Object[] registro = new Object[5];

        try {
            //Conexion con la base de datos y preparacion de la variable para consultas
            sentencia = conectarMySQL.conectarMySQL().createStatement();

            //Consulta parametrizada lista en un string
            String sql = "SELECT "
                    + "* "
                    + "FROM "
                    + "TBL_PRODUCTO PROD "
                    + "WHERE "
                    + "PROD_NOMBRE LIKE ?";

            //Preparacion de la consulta sql para la busqueda con LIKE
            PreparedStatement consulta = conectarMySQL.conectarMySQL().prepareStatement(sql);
            consulta.setString(1, "%" + nombre + "%");
            //Ejecucion de la consulta sql
            rs = consulta.executeQuery();
            //Lectura de los registros guardados en el ResultSet
            while (rs.next()) {
                registro[0] = rs.getString(2);
                registro[1] = rs.getString(3);
                registro[2] = rs.getString(4);
                registro[3] = rs.getString(5);
                registro[4] = rs.getString(6);

                modelo.addRow(registro);
            }//Rrecorrido del rs, tambien la creacion del DefaultTableModel para la tabla de busqueda

        } //Fin de la funcion buscar-cliente //Fin de la funcion buscar-cliente //Fin de la funcion buscar-cliente //Fin de la funcion buscar-cliente
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }

        return modelo;
    }//Fin de la funcion buscar_proveedor por cedula  

    public DefaultTableModel buscarCompraNombre(String nombre, JTable mod) {

        DefaultTableModel modelo = (DefaultTableModel) mod.getModel();
        Object[] registro = new Object[7];

        try {
            //Conexion con la base de datos y preparacion de la variable para consultas
            sentencia = conectarMySQL.conectarMySQL().createStatement();

            //Consulta parametrizada lista en un string
            String sql = "SELECT "
                    + "* "
                    + "FROM "
                    + "TBL_COMPRAPROVEDOR "
                    + "WHERE "
                    + "COMPP_DESCRIPCION LIKE ?";

            //Preparacion de la consulta sql para la busqueda con LIKE
            PreparedStatement consulta = conectarMySQL.conectarMySQL().prepareStatement(sql);
            consulta.setString(1, "%" + nombre + "%");
            //Ejecucion de la consulta sql
            rs = consulta.executeQuery();
            //Lectura de los registros guardados en el ResultSet
            while (rs.next()) {
               registro[0] = rs.getString(2);
                registro[1] = rs.getString(3);
                registro[2] = rs.getDate(4);
                registro[3] = rs.getDouble(5);
                registro[4] = rs.getInt(6);
                registro[5] = rs.getDate(7);
                //registro[6] = principal.lblFecha.getText();

                modelo.addRow(registro);
            }//Rrecorrido del rs, tambien la creacion del DefaultTableModel para la tabla de busqueda

        } //Fin de la funcion buscar-cliente //Fin de la funcion buscar-cliente //Fin de la funcion buscar-cliente //Fin de la funcion buscar-cliente
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }

        return modelo;
    }//Fin de la funcion busqueda compra por nombre

    public DefaultTableModel buscarProductoDescripcion(String descripcion, JTable mod) {

        DefaultTableModel modelo = (DefaultTableModel) mod.getModel();
        Object[] registro = new Object[6];

        try {
            //Conexion con la base de datos y preparacion de la variable para consultas
            sentencia = conectarMySQL.conectarMySQL().createStatement();

            //Consulta parametrizada lista en un string
            String sql = "SELECT "
                    + "* "
                    + "FROM "
                    + "TBL_PRODUCTO PROD "
                    + "WHERE "
                    + "PROD_DESCRIPCION LIKE ?";
            //Preparacion de la consulta sql para la busqueda con LIKE
            PreparedStatement consulta = conectarMySQL.conectarMySQL().prepareStatement(sql);
            consulta.setString(1, "%" + descripcion + "%");
            //Ejecucion de la consulta sql
            rs = consulta.executeQuery();
            //Lectura de los registros guardados en el ResultSet
            while (rs.next()) {
                registro[0] = rs.getString(2);
                registro[1] = rs.getString(3);
                registro[2] = rs.getString(4);
                registro[3] = rs.getString(5);
                registro[4] = rs.getString(6);
                modelo.addRow(registro);
            }//Rrecorrido del rs, tambien la creacion del DefaultTableModel para la tabla de busqueda

        } //Fin de la funcion buscar-cliente //Fin de la funcion buscar-cliente //Fin de la funcion buscar-cliente //Fin de la funcion buscar-cliente
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }

        return modelo;
    }//Fin de la funcion buscar_proveedor por nombre

   
    ////////////////BUSQUEDAS PARA LA FACTURA ///////////////////////////
    public String[] bscar_prodcodigo(String codigo) {
        String[] registro = new String[7];
        try {
            //Conexion con la base de datos y preparacion de la variable para consultas
            sentencia = conectarMySQL.conectarMySQL().createStatement();

            //Consulta parametrizada lista en un string
            String sql = "SELECT "
                    + "* "
                    + "FROM "
                    + "TBL_PRODUCTOS PROD "
                    + "WHERE "
                    + "PROD_CODIGO = ?";

            //Preparacion de la consulta sql para la busqueda con LIKE
            PreparedStatement consulta = conectarMySQL.conectarMySQL().prepareStatement(sql);
            consulta.setString(1, codigo);
            //Ejecucion de la consulta sql
            rs = consulta.executeQuery();
            //Lectura de los registros guardados en el ResultSet
            rs.next();
            registro[0] = "" + rs.getInt(1);
            registro[1] = rs.getString(2);
            registro[2] = rs.getString(3);
            registro[3] = "" + rs.getDouble(4);
            registro[4] = "" + rs.getInt(5);
            registro[5] = "" + rs.getInt(6);
            registro[6] = rs.getString(7);
        } //Fin de la funcion buscar-cliente //Fin de la funcion buscar-cliente //Fin de la funcion buscar-cliente //Fin de la funcion buscar-cliente
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }

        return registro;
    }//Fin de la funcion buscar_proveedor por cedula  

    public String[] bscar_registro_cliente(String cedula) {

        String[] registro = new String[8];
        try {
            //Conexion con la base de datos y preparacion de la variable para consultas
            sentencia = conectarMySQL.conectarMySQL().createStatement();

            //Consulta parametrizada lista en un string
            String sql = "SELECT PR.PER_ID, PR.PER_CED, PR.PER_NOMBRE, PR.PER_APELLIDO, "
                    + "PR.PER_DIRECCION,PR.PER_TELF, PR.PER_CELL,"
                    + "PR.PER_EMAIL FROM TBL_PERSONA PR "
                    + "WHERE "
                    + "PR.PER_CED = ? "
                    + "AND CLI.PER_ID = PR.PER_ID";

            //Preparacion de la consulta sql para la busqueda con LIKE
            PreparedStatement consulta = conectarMySQL.conectarMySQL().prepareStatement(sql);
            consulta.setString(1, cedula);

            //Ejecucion de la consulta sql
            rs = consulta.executeQuery();
            rs.next();
            registro[0] = "" + rs.getInt(1);
            registro[1] = rs.getString(2);
            registro[3] = rs.getString(3);
            registro[4] = rs.getString(4);
            registro[5] = rs.getString(5);
            registro[6] = rs.getString(6);
            registro[7] = rs.getString(7);
            //Lectura de los registros guardados en el ResultSet
        } //Fin de la funcion buscar-cliente //Fin de la funcion buscar-cliente //Fin de la funcion buscar-cliente //Fin de la funcion buscar-cliente
        catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "ERROR: DEBE INGRESAR 10 DIGITOS PARA LA CEDULA O 13 PARA EL RUC");
        }

        return registro;
    }//Fin de la funcion buscar_cliente

    public String buscar_empleado_cedula(String cedula) {
        String nombre_empleado = null;

        try {
            //Conexion con la base de datos y preparacion de la variable para consultas
            sentencia = conectarMySQL.conectarMySQL().createStatement();

            //Consulta parametrizada lista en un string
            String sql = "SELECT "
                    + "PER.PERS_NOMBRES, PER.PERS_APELLIDOS "
                    + "FROM "
                    + "TBL_EMPLEADOS EMP, TBL_PERSONA PER "
                    + "WHERE "
                    + "EMP.PERS_ID = PER.PERS_ID AND PER.PERS_CEDULA = ?";

            //Preparacion de la consulta sql para la busqueda con LIKE
            PreparedStatement consulta = conectarMySQL.conectarMySQL().prepareStatement(sql);
            consulta.setString(1, cedula);
            //Ejecucion de la consulta sql
            rs = consulta.executeQuery();
            //Lectura de los registros guardados en el ResultSet
            rs.next();
            nombre_empleado = rs.getString(1) + " " + rs.getString(2);
            System.out.println(nombre_empleado);
        } //Fin de la funcion buscar-cliente //Fin de la funcion buscar-cliente //Fin de la funcion buscar-cliente //Fin de la funcion buscar-cliente
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }

        return nombre_empleado;
    }//Fin de la funcion buscar empleado cedula
}//Fin de la clase BuscarDatos
