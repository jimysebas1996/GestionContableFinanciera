package ControladorBD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ActualizarDatos {

    //Instancia de otras clases
    ConectarMySQL conectarMySQL = new ConectarMySQL();
    ListarDatos listarDatos = new ListarDatos();
    Statement sentencia;
    ResultSet rs = null;

    public boolean actualizarCliente(Integer Id, String cedula, String nombres, String apellidos, String direccion, String telefono, String celular, String email) {
        boolean resultado = false;

        String actualizar_cliente = "UPDATE TBL_PERSONA SET PER_ID =?,PER_CED= ?,PER_NOMBRE = ?,PER_APELLIDO = ?,PER_DIRECCION= ?, PER_TELF  = ?, PER_CELL = ?,PER_EMAIL = ? WHERE PER_CED= '" + cedula + "'";
        try {
            //Obtencion del id de persona para la tabla de persona
            this.sentencia = conectarMySQL.conectarMySQL().createStatement();
            rs = sentencia.executeQuery("SELECT PER.PER_ID FROM TBL_PERSONA PER WHERE PER.PER_CED='" + cedula + "';");
            rs.next();

            try (PreparedStatement insert_tblpersona = conectarMySQL.conectarMySQL().prepareStatement(actualizar_cliente)) {
                insert_tblpersona.setInt(1, rs.getInt(1));
                insert_tblpersona.setString(2, cedula);
                insert_tblpersona.setString(3, nombres);
                insert_tblpersona.setString(4, apellidos);
                insert_tblpersona.setString(5, direccion);
                insert_tblpersona.setString(6, telefono);
                insert_tblpersona.setString(7, celular);
                insert_tblpersona.setString(8, email);
                insert_tblpersona.executeUpdate();
                insert_tblpersona.close();
                resultado = true;
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        } catch (SQLException ex) {
            Logger.getLogger(ActualizarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }//Fin de la funcion actualizarCliente

    
    
    public boolean modificarEmpleado(String cargo, String password, String cedula,String codigo){                 
        try {            
             String elicliente = "UPDATE TBL_EMPLEADO SET EMP_ID=?,EMP_CODIGO=?,EMP_CARGO=?,EMP_PASSWORD=?,PER_ID=? WHERE EMP_CODIGO = '"+codigo+"'";
            this.sentencia = conectarMySQL.conectarMySQL().createStatement();
             rs = sentencia.executeQuery("SELECT EMP.EMP_ID,EMP.EMP_CODIGO,EMP.PER_ID FROM TBL_EMPLEADO EMP WHERE EMP.EMP_CODIGO='"+codigo+"'");
             rs.next();
             try (PreparedStatement eliminarEmpleado = conectarMySQL.conectarMySQL().prepareStatement(elicliente)) {    
                eliminarEmpleado.setInt(1,rs.getInt(1));
                eliminarEmpleado.setString(2,codigo);
                eliminarEmpleado.setString(3,cargo);
                eliminarEmpleado.setString(4,password);
                eliminarEmpleado.setInt(5,rs.getInt(3));
            
                eliminarEmpleado.executeUpdate();
                 return true;
            }
        } catch (SQLException ex) {
            return false;
            
        }
    }//Fin de la funcion eliminar cliente 
    
 public boolean actualizarProveedor(String codigo, String cedula, String nombres, String direccion, String telefono, String celular, String email,String tipo) {
        boolean resultado = false;

        String actualizarProveedor = "UPDATE TBL_PROVEDOR SET PROV_ID =?,PROV_RUC_CEDULA= ?,PROV_EMPRESA = ?,PROV_DIRECCION = ?,PROV_TELF= ?, PROV_CELULAR  = ?, PROV_EMAIL = ?,PROV_TIPO = ? WHERE PROV_RUC_CEDULA= '" + cedula + "'";
        try {
            //Obtencion del id de persona para la tabla de persona
            this.sentencia = conectarMySQL.conectarMySQL().createStatement();
            rs = sentencia.executeQuery("SELECT PROV.PROV_ID FROM TBL_PROVEDOR PROV WHERE PROV.PROV_CODIGO='" + codigo + "';");
            rs.next();

            try (PreparedStatement insertProvedor = conectarMySQL.conectarMySQL().prepareStatement(actualizarProveedor)) {
                insertProvedor.setInt(1, rs.getInt(1));
                insertProvedor.setString(2, cedula);
                insertProvedor.setString(3, nombres);
                insertProvedor.setString(4, direccion);
                insertProvedor.setString(5, telefono);
                insertProvedor.setString(6, celular);
                insertProvedor.setString(7, email);
                insertProvedor.setString(8, tipo);
                insertProvedor.executeUpdate();
                insertProvedor.close();
                resultado = true;
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        } catch (SQLException ex) {
            Logger.getLogger(ActualizarDatos.class.getName()).log(Level.SEVERE, null, ex);
        return resultado;
        }
        return resultado;
    }//Fin de la funcion actualizarCliente


    public boolean actualizarProducto(String codigo, String nombre, String descripcion,String marca,Double precio) {
        boolean resultado = false;
        String actualizar_producto = "UPDATE TBL_PRODUCTO SET "
                + "PROD_ID= ?, "
                + "PROD_CODIGO = ?, "
                + "PROD_NOMBRE = ?, "
                + "PROD_DESCRIPCION = ?, "
                + "PROD_MARCA = ?, "
                + "PROD_PRECIO= ? "
                + "WHERE PROD_CODIGO= '"+codigo+"'";

        try {
            
            
            try (PreparedStatement insert_tblproductos = conectarMySQL.conectarMySQL().prepareStatement(actualizar_producto)) {
                this.sentencia = conectarMySQL.conectarMySQL().createStatement();
            rs = sentencia.executeQuery("SELECT PROD.PROD_ID FROM TBL_PRODUCTO PROD WHERE PROD.PROD_CODIGO='" + codigo + "'");
            rs.next();
            
                insert_tblproductos.setInt(1, rs.getInt(1));
                insert_tblproductos.setString(2, codigo);
                insert_tblproductos.setString(3, nombre);
                insert_tblproductos.setString(4, descripcion);
                insert_tblproductos.setString(5, marca);
                insert_tblproductos.setDouble(6, precio);
                insert_tblproductos.executeUpdate();
                insert_tblproductos.close();
                 resultado = true;
            }

           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }

        return resultado;
    }//Fin de la funcion actualizarProducto
    
    
    public boolean  actualizar_precio(String prod_codigo,Double precio) {
      
        Boolean resultado = false;

         String actualizar_precio= "Update TBL_PRODUCTO SET prod_id=?,prod_codigo=?,prod_nombre=?,prod_descripcion=?,prod_marca=?,prod_precio=? Where prod_codigo='"+prod_codigo+"'"; 
          try {  
            try (PreparedStatement insert_tblprecio = conectarMySQL.conectarMySQL().prepareStatement(actualizar_precio)) {
            this.sentencia = conectarMySQL.conectarMySQL().createStatement();
            rs = sentencia.executeQuery("SELECT PRO.PROD_ID,PRO.PROD_NOMBRE,PRO.PROD_DESCRIPCION,PRO.PROD_MARCA FROM TBL_PRODUCTO PRO WHERE PRO.PROD_CODIGO='"+prod_codigo+"'");    
            rs.next();
                insert_tblprecio.setInt(1,rs.getInt(1));  
                
                insert_tblprecio.setString(2,prod_codigo);  
                insert_tblprecio.setString(3,rs.getString(2));  
                insert_tblprecio.setString(4,rs.getString(3));  
                insert_tblprecio.setString(5,rs.getString(4)); 
                insert_tblprecio.setDouble(6,precio);                 
                insert_tblprecio.executeUpdate();
                insert_tblprecio.close();
                resultado = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        return resultado;
    }
   public boolean  actualizar_invent(Integer cantidad,String prod_codigo,String cmpp_codigo) {    
        Integer id=0;
        Integer sumaProductos=0;
     
       try { 
         this.sentencia = conectarMySQL.conectarMySQL().createStatement();
         rs = sentencia.executeQuery("SELECT PR.PROD_ID FROM TBL_PRODUCTO PR WHERE PR.PROD_CODIGO='"+prod_codigo+"'");    
         rs.next();             
     id=rs.getInt(1);
          } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
              
        }
      String actualizar_precio= "Update TBL_INVENTARIO SET inv_id=?,inv_codigo=?,inv_cantidad_existente=?,inv_fecha_ingreso=?,fecha_caducidad=?,compp_id=?,prod_id=? Where prod_id='"+id+"'"; 
       try { 
            try (PreparedStatement insert_tblprecio = conectarMySQL.conectarMySQL().prepareStatement(actualizar_precio)) {
            this.sentencia = conectarMySQL.conectarMySQL().createStatement();
            
            rs = sentencia.executeQuery("SELECT INV.INV_ID,INV.INV_CODIGO,INV.INV_CANTIDAD_EXISTENTE,CP.FECHA_CADUCIDAD,CP.COMPP_ID"
                    + ""
                    + " FROM TBL_INVENTARIO INV, TBL_COMPRAPROVEDOR CP WHERE INV.PROD_ID='"+id+"' AND CP.COMPP_CODIGO='"+cmpp_codigo+"'");    
               rs.next();
            insert_tblprecio.setInt(1,rs.getInt(1));  
                insert_tblprecio.setString(2,cmpp_codigo);  
                sumaProductos=rs.getInt(3)+cantidad;
                insert_tblprecio.setInt(3,sumaProductos); 
                insert_tblprecio.setDate(4,null);
                insert_tblprecio.setDate(5,null);  
                insert_tblprecio.setString(6,rs.getString(5)); 
                 insert_tblprecio.setInt(7,id);                              
                insert_tblprecio.executeUpdate();
                insert_tblprecio.close();
                return true;
            }
       
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }   
    } 
}//Fin de la clase ActualizarDatos
