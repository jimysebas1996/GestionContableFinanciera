/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorBD;

import Objetos.objFactCabecera;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Jimmy
 */
public class GenerarCodigo {

    //Instancia de otras clases
    ConectarMySQL conectarMySQL = new ConectarMySQL();
    ListarDatos listarDatos = new ListarDatos();
    Statement sentencia;
    ResultSet rs = null;

    objFactCabecera oFactCabecera = new objFactCabecera();
    Icon iconoCheck = new ImageIcon(getClass().getResource("/ICONOS/CheckIcono.png"));
    Icon iconoError = new ImageIcon(getClass().getResource("/ICONOS/ErrorIcono.png"));

    public String generarIDCliente() {
        int codigo = 0;
        String identificador="CLI";
        String sentenciaSQL="SELECT MAX(CLIE_ID) FROM TBL_CLIENTE";
        try {
            sentencia = conectarMySQL.conectarMySQL().createStatement();
            ResultSet resultSet = sentencia.executeQuery(sentenciaSQL);
            if (resultSet.next()) {
                codigo = (resultSet.getInt(1) + 1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en generar CODIGO CLIENTE");
            e.printStackTrace();
        } finally {
            conectarMySQL.cerrarConexion();
        }
        return generarCeros(identificador, codigo);
    }

   
    public String generarIDEmpleado() {
        int codigo = 0;
        String identificador="EMP";
        String sentenciaSQL="SELECT MAX(EMP_ID) FROM TBL_EMPLEADO";
        try {
            sentencia = conectarMySQL.conectarMySQL().createStatement();
            ResultSet resultSet = sentencia.executeQuery(sentenciaSQL);
            if (resultSet.next()) {
                codigo = (resultSet.getInt(1) + 1);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en generar CODIGO EMPLEADO");
            e.printStackTrace();
        } finally {
            conectarMySQL.cerrarConexion();
        }
        return generarCeros(identificador, codigo);
    }
  
    public String generarIDProveedor() {
        int codigo = 0;
        String identificador="PRV";
        String sentenciaSQL="SELECT MAX(PROV_ID) FROM TBL_PROVEDOR";
        try {
            sentencia = conectarMySQL.conectarMySQL().createStatement();
            ResultSet resultSet = sentencia.executeQuery(sentenciaSQL);
            if (resultSet.next()) {
                codigo = (resultSet.getInt(1) + 1);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en generar CODIGO PROVEEDOR");
            e.printStackTrace();
        } finally {
            conectarMySQL.cerrarConexion();
        }
        return generarCeros(identificador, codigo);
    }
 public String generarIDProducto() {
        int codigo = 0;
        String identificador="PRD";
        String sentenciaSQL="SELECT MAX(PROD_ID) FROM TBL_PRODUCTO";
        try {
            sentencia = conectarMySQL.conectarMySQL().createStatement();
            ResultSet resultSet = sentencia.executeQuery(sentenciaSQL);
            if (resultSet.next()) {
                codigo = (resultSet.getInt(1) + 1);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en generar CODIGO PRODUCTO");
            e.printStackTrace();
        } finally {
            conectarMySQL.cerrarConexion();
        }
        return generarCeros(identificador, codigo);
    }
 public String generarIDInventario() {
        int codigo = 0;
        String identificador="INV";
        String sentenciaSQL="SELECT MAX(PROD_ID) FROM TBL_PRODUCTO";
        try {
            sentencia = conectarMySQL.conectarMySQL().createStatement();
            ResultSet resultSet = sentencia.executeQuery(sentenciaSQL);
            if (resultSet.next()) {
                codigo = (resultSet.getInt(1) + 1);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en generar CODIGO PRODUCTO");
            e.printStackTrace();
        } finally {
            conectarMySQL.cerrarConexion();
        }
        return generarCeros(identificador, codigo);
    }
 public String generarIDCompra() {
        int codigo = 0;
        String identificador="CMP";
        String sentenciaSQL="SELECT MAX(COMPP_ID) FROM TBL_COMPRAPROVEDOR";
        try {
            sentencia = conectarMySQL.conectarMySQL().createStatement();
            ResultSet resultSet = sentencia.executeQuery(sentenciaSQL);
            if (resultSet.next()) {
                codigo = (resultSet.getInt(1) + 1);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en generar CODIGO PRODUCTO");
            e.printStackTrace();
        } finally {
            conectarMySQL.cerrarConexion();
        }
        return generarCeros(identificador, codigo);
    }
    public String generarCeros(String identificador, int codigo) {
        String ceros = "";
        String numerosGenerados = "";
        int numeroDigitos = (int) (Math.log10(codigo) + 1);
        for (int i = numeroDigitos; i < 8; i++) {
            ceros = "0" + ceros;
        }
        numerosGenerados = identificador + ceros + codigo;
        return numerosGenerados;
    }
    //"SELECT MAX(prov_id) FROM TBL_PROVEEDOR)"
}
