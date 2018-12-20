package ControladorBD;

import Objetos.objFactCabecera;
import Ventanas.Compra;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class GuardarDatos {

    //Instancia de otras clases
    ConectarMySQL conectarMySQL = new ConectarMySQL();
    ListarDatos listarDatos = new ListarDatos();
    Statement sentencia;
    ResultSet rs = null;
    GenerarCodigo generarCodigo = new GenerarCodigo();
    objFactCabecera oFactCabecera = new objFactCabecera();
    Icon iconoCheck = new ImageIcon(getClass().getResource("/ICONOS/CheckIcono.png"));
    Icon iconoError = new ImageIcon(getClass().getResource("/ICONOS/ErrorIcono.png"));

    public boolean guardar_cliente(String codigo, String cedula, String nombres, String apellidos, String tlf1, String tlf2, String direccion, String email) {
        String insert_persona = "INSERT INTO TBL_PERSONA (PER_ID, PER_CED, PER_NOMBRE, PER_APELLIDO, PER_DIRECCION, PER_TELF, PER_CELL,PER_EMAIL) VALUES (?,?,?,?,?,?,?,?)";
        String insert_cliente = "INSERT INTO TBL_CLIENTE (CLIE_ID,CLIE_CODIGO,PER_ID)VALUES (?,?,?);";
       
       try {
            //Ejecucion del insert para la tabla persona
            PreparedStatement insert_tblpersona = conectarMySQL.conectarMySQL().prepareStatement(insert_persona);
            insert_tblpersona.setInt(1, 0);
            insert_tblpersona.setString(2, cedula);
            insert_tblpersona.setString(3, nombres);
            insert_tblpersona.setString(4, apellidos);
            insert_tblpersona.setString(5, tlf1);
            insert_tblpersona.setString(6, tlf2);
            insert_tblpersona.setString(7, direccion);
            insert_tblpersona.setString(8, email);
            insert_tblpersona.execute();

            //Obtencion del id de persona para la tabla de clientes
            this.sentencia = conectarMySQL.conectarMySQL().createStatement();
            rs = sentencia.executeQuery("SELECT PER.PER_ID FROM TBL_PERSONA PER WHERE PER.PER_CED='" + cedula + "';");
            rs.next();

            if (rs != null) {
                //Ejecucion del insert para la tabla clientes
                PreparedStatement insert_tblclientes = conectarMySQL.conectarMySQL().prepareStatement(insert_cliente);
                insert_tblclientes.setInt(1, 0);
                insert_tblclientes.setString(2, codigo);
                insert_tblclientes.setInt(3, rs.getInt(1));
                insert_tblclientes.execute();
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }
    }//Fin de la funcion guardar_cliente

    public boolean guardarActEmpleado(String cargo, String password, String cedula, String codigoEmpleado) {

        Integer idPersona = 0;
        try {
            this.sentencia = conectarMySQL.conectarMySQL().createStatement();

            rs = sentencia.executeQuery("SELECT PER.PER_ID,PER.PER_NOMBRE,PER.PER_APELLIDO,PER.PER_DIRECCION, PER.PER_TELF, PER.PER_CELL,PER.PER_EMAIL  FROM TBL_PERSONA PER WHERE PER.PER_CED='" + cedula + "'");

            while (rs.next()) {
                idPersona = rs.getInt(1);
                System.out.println(idPersona);
                String actualizarPersona = "UPDATE TBL_PERSONA SET PER_ID =?,PER_CED= ?,PER_NOMBRE = ?,PER_APELLIDO = ?,PER_DIRECCION= ?, PER_TELF  = ?, PER_CELL = ?,PER_EMAIL = ? WHERE PER_CED= '" +  cedula+ "'";

                //Ejecucion del insert para la tabla persona
                PreparedStatement insert_tblpersona = conectarMySQL.conectarMySQL().prepareStatement(actualizarPersona);
                insert_tblpersona.setInt(1, rs.getInt(1));
                insert_tblpersona.setString(2, cedula);
                insert_tblpersona.setString(3, rs.getString(2));
                insert_tblpersona.setString(4, rs.getString(3));
                insert_tblpersona.setString(5, rs.getString(4));
                insert_tblpersona.setString(6, rs.getString(5));
                insert_tblpersona.setString(7, rs.getString(6));
                insert_tblpersona.setString(8, rs.getString(7));
                insert_tblpersona.execute();
            } 
            //Obtencion del id de persona para la tabla de persona
            String insertEmpleado = "INSERT INTO TBL_EMPLEADO VALUES (?,?,?,?,?)";
            PreparedStatement insertTblEmpleado = conectarMySQL.conectarMySQL().prepareStatement(insertEmpleado);
            insertTblEmpleado.setInt(1, 0);
            insertTblEmpleado.setString(2, codigoEmpleado);
            insertTblEmpleado.setString(3, cargo);
            insertTblEmpleado.setString(4, password);
            insertTblEmpleado.setInt(5, idPersona);
            insertTblEmpleado.execute();
            
            
            
            
            return true;
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }
    }//Fin de la funcion guardar_empleado
 public boolean guardarPerEmpleado(String codigo, String cedula, String nombres, String apellidos, String tlf1, String tlf2, String direccion, String email,String cargo,String password,String codigoCliente) {
        String insert_persona = "INSERT INTO TBL_PERSONA (PER_ID, PER_CED, PER_NOMBRE, PER_APELLIDO, PER_DIRECCION, PER_TELF, PER_CELL,PER_EMAIL) VALUES (?,?,?,?,?,?,?,?)";
        String insert_empleado = "INSERT INTO TBL_EMPLEADO (EMP_ID,EMP_CODIGO,EMP_CARGO,EMP_PASSWORD,PER_ID)VALUES (?,?,?,?,?);";

       try {
            //Ejecucion del insert para la tabla persona
            PreparedStatement insert_tblpersona = conectarMySQL.conectarMySQL().prepareStatement(insert_persona);
            insert_tblpersona.setInt(1, 0);
            insert_tblpersona.setString(2, cedula);
            insert_tblpersona.setString(3, nombres);
            insert_tblpersona.setString(4, apellidos);
            insert_tblpersona.setString(5, tlf1);
            insert_tblpersona.setString(6, tlf2);
            insert_tblpersona.setString(7, direccion);
            insert_tblpersona.setString(8, email);
            insert_tblpersona.execute();

            //Obtencion del id de persona para la tabla de clientes
            this.sentencia = conectarMySQL.conectarMySQL().createStatement();
            rs = sentencia.executeQuery("SELECT PER.PER_ID FROM TBL_PERSONA PER WHERE PER.PER_CED='" + cedula + "';");
            rs.next();
            if (rs != null) {
                //Ejecucion del insert para la tabla clientes
                PreparedStatement insert_tblempleado = conectarMySQL.conectarMySQL().prepareStatement(insert_empleado);
                insert_tblempleado.setInt(1, 0);
                insert_tblempleado.setString(2, codigo);
                insert_tblempleado.setString(3, cargo);
                insert_tblempleado.setString(4, password);
                insert_tblempleado.setInt(5, rs.getInt(1));
                insert_tblempleado.execute();
                
             String insert_cliente = "INSERT INTO TBL_CLIENTE (CLIE_ID,CLIE_CODIGO,PER_ID)VALUES (?,?,?);";
            PreparedStatement insert_tblclientes = conectarMySQL.conectarMySQL().prepareStatement(insert_cliente);
           
                insert_tblclientes.setInt(1, rs.getInt(1));
                insert_tblclientes.setString(2, codigoCliente);
                insert_tblclientes.setInt(3, rs.getInt(1));
                insert_tblclientes.execute();
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }
    }//Fin de la funcion guardar_cliente

    
    
   public boolean guardar_proveedor(String codigo,String ruc_cedula,String empresa, String direccion, String telefono,String celular, String email,String tipo){
        String insert_proveedor = "INSERT INTO TBL_PROVEDOR (PROV_ID, PROV_CODIGO,PROV_RUC_CEDULA,PROV_EMPRESA,PROV_TIPO,PROV_DIRECCION,PROV_TELF,PROV_CELULAR,PROV_EMAIL) VALUES (?,?,?,?,?,?,?,?,?)";

        try {
            //Ejecucion del insert para la tabla persona
            
            PreparedStatement insert_tblproveedor = conectarMySQL.conectarMySQL().prepareStatement(insert_proveedor);
                    insert_tblproveedor.setInt(1, 0);
                    insert_tblproveedor.setString(2, codigo);
                    insert_tblproveedor.setString(3, ruc_cedula);                    
                    insert_tblproveedor.setString(4, empresa);
                    insert_tblproveedor.setString(5, tipo);
                    insert_tblproveedor.setString(6, direccion);
                    insert_tblproveedor.setString(7, telefono);
                     insert_tblproveedor.setString(8, celular);
                    insert_tblproveedor.setString(9, email);
            insert_tblproveedor.execute();            
            insert_tblproveedor.close();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }
        
    }//Fin de la funcion guardar_proveedor//Fin de la funcion guardar_proveedor
public boolean guardar_producto(String codigo,String nombre,String descripcion, String marca, Double precio){

           try {
            //Ejecucion del insert para la tabla persona
            String insert_producto = "INSERT INTO TBL_PRODUCTO (PROD_ID, PROD_CODIGO,PROD_NOMBRE,PROD_DESCRIPCION,PROD_MARCA,PROD_PRECIO) VALUES (?,?,?,?,?,?)";
      
            PreparedStatement insert_tblproducto = conectarMySQL.conectarMySQL().prepareStatement(insert_producto);
                    insert_tblproducto.setInt(1, 0);
                    insert_tblproducto.setString(2, codigo);
                    insert_tblproducto.setString(3, nombre);                    
                    insert_tblproducto.setString(4, descripcion);
                    insert_tblproducto.setString(5, marca);
                    insert_tblproducto.setDouble(6, precio);                   
            insert_tblproducto.execute();            
            insert_tblproducto.close();
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }   
        return true;
    }//Fin de la funcion guardar_producto


public boolean guardarInventario(String codigo) {
int i;
String codigoInventario="";
try {
              
            this.sentencia = conectarMySQL.conectarMySQL().createStatement();
            rs = sentencia.executeQuery("SELECT PRO.PROD_ID FROM TBL_PRODUCTO PRO WHERE PRO.PROD_CODIGO='"+codigo+"'");
            rs.next();
            
            String insert_inventario = "INSERT INTO TBL_INVENTARIO (inv_id, inv_codigo, inv_cantidad_existente,inv_fecha_ingreso,fecha_caducidad, compp_id, prod_id) VALUES (?, ?,? ,?, ?, ?,?)";
             codigoInventario=generarCodigo.generarIDInventario();
            PreparedStatement insert_tblinventario = conectarMySQL.conectarMySQL().prepareStatement(insert_inventario);
               insert_tblinventario.setInt(1, 0);
               insert_tblinventario.setString(2,codigoInventario);
               insert_tblinventario.setInt(3,0);
               insert_tblinventario.setDate(4,null);
               insert_tblinventario.setDate(5,null);
               insert_tblinventario.setInt(6,0);
               insert_tblinventario.setInt(7,rs.getInt(1));                       
                insert_tblinventario.execute();
                JOptionPane.showMessageDialog(null, "Inventario");
                 return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudo ingresar");
            return false;
        }
}

    public void guardar_Compra(Integer id, String codigo, String descripcion, Date fechaIngreso, Double precio, Integer cantidad, Integer prod_id, Integer prov_id, Date fechaCaducidad) {
        String insertCompra = "INSERT INTO TBL_COMPRAPROVEDOR (COMPP_ID, COMPP_CODIGO, COMPP_DESCRIPCION,COMPP_FECHA_INGRESO,COMPP_PRECIO_PRODUCTO, COMPP_CANTIDAD_PRODUCTO, PROD_ID, PROV_ID,) VALUES (?,?,?,?,?,?,?,?,?)";
        try {

            //Obtencion del id de persona para la tabla de clientes
            this.sentencia = conectarMySQL.conectarMySQL().createStatement();
            rs = sentencia.executeQuery("SELECT pro.prod_codigo , prv.prod_codigo FROM TBL_PRODUCTO pro, TBL_PROVEDOR prv WHERE pro.prod_codigo ='" + prod_id + "' AND prv.prov_codigo= '" + prov_id + "'");
            rs.next();

            //Ejecucion del insert para la tabla de productos
            //Ejecucion del insert para la tabla de productos
            PreparedStatement insert_tblCompra = conectarMySQL.conectarMySQL().prepareStatement(insertCompra);
            insert_tblCompra.setInt(1, 0);
            insert_tblCompra.setString(2, codigo);
            insert_tblCompra.setString(3, descripcion);
            insert_tblCompra.setString(4, fechaIngreso.toString());
            insert_tblCompra.setInt(6, cantidad);
            insert_tblCompra.setString(7, rs.getString(0));
            insert_tblCompra.setString(8, rs.getString(1));
            insert_tblCompra.setString(9, fechaCaducidad.toString());
            insert_tblCompra.execute();
            System.out.println("holaaa");
            if (rs != null) {
                System.out.println("ENTRE");
                //Ejecucion del insert para la tabla clientes
                Compra compra = new Compra();
                this.sentencia = conectarMySQL.conectarMySQL().createStatement();
                rs = sentencia.executeQuery("Update TBL_PRODUCTO Set TBL_PRODUCTO.prod_precio='" + precio + "' Where TBL_PRODUCTO.prod_codigo='" + compra.txtProducto.getText() + "'");
                rs.next();
                JOptionPane.showMessageDialog(null, "LA COMPRA SE HA GUARDADO CORRECTAMENTE", "MENSAJE", JOptionPane.INFORMATION_MESSAGE, iconoCheck);
            } else {
                JOptionPane.showMessageDialog(null, "LA COMPRA NO SE HA GUARDADO EN LA BASE DE DATOS", "ERROR !!!..", JOptionPane.INFORMATION_MESSAGE, iconoError);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//Fin de la funcion guardar_cliente

    public void guardar_factura(objFactCabecera cabecera) {

    }//Fin de la funcion guardar factura

    public void guardar_factura(Integer facturaId, String codigo, Date fecha, Double facturaSubtotal, Double IVA, Integer descuento, Double totalDescuento, Double facturaTotal, String clienteCodigo, String empleadoCodigo, Integer detalleId) {
        String insert_factura = "INSERT INTO TBL_FACTURA (FAC_ID, FAC_CODIGO, FAC_FECHA, FAC_SUBTOTAL, FAC_IVA, FAC_DESCUENTO, FAC_TOTAL_DESCUENTO,FAC_TOTAL,CLIE_CODIGO,EMP_CODIGO,DET_ID) VALUES (?,?,?,?,?,?,?)";
        try {

            //Obtencion del id de persona para la tabla de clientes
            this.sentencia = conectarMySQL.conectarMySQL().createStatement();
            rs = sentencia.executeQuery("SELECT CL.CLIE_CODIGO FROM TBL_PERSONA PR, TBL_CLIENTE CL WHERE PR.per_ced='" + clienteCodigo + "'");

            rs.next();
            //Ejecucion del insert para la tabla de productos
            PreparedStatement insert_tblfactura = conectarMySQL.conectarMySQL().prepareStatement(insert_factura);
            insert_tblfactura.setInt(1, 0);
            insert_tblfactura.setString(2, codigo);
            insert_tblfactura.setDate(3, fecha);
            insert_tblfactura.setDouble(4, facturaSubtotal);
            insert_tblfactura.setDouble(5, IVA);
            insert_tblfactura.setInt(5, descuento);
            insert_tblfactura.setDouble(5, totalDescuento);
            insert_tblfactura.setDouble(5, facturaTotal);
            insert_tblfactura.setString(6, rs.getString(0));
            insert_tblfactura.setString(7, "PD" + rs.getInt(1) + "XT");
            insert_tblfactura.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//Fin de la funcion guardar factura
    
    
    
    public boolean guardar_compra(String codigo,String descripcion,Date fechaIngreso,Double precio,Integer cantidad,String prov_codigo,String prod_codigo,Date fechaCaducidad) {
        
        String insert_compra = "INSERT INTO TBL_COMPRAPROVEDOR (COMPP_ID, COMPP_CODIGO, COMPP_DESCRIPCION,COMPP_FECHA_INGRESO,COMPP_PRECIO_PRODUCTO, COMPP_CANTIDAD_PRODUCTO,PROD_ID,PROV_ID,FECHA_CADUCIDAD) VALUES (?,?,?,?,?,?,?,?,?)";
             try {
            //Ejecucion del insert para la tabla de productos
            PreparedStatement insert_tblcompra = conectarMySQL.conectarMySQL().prepareStatement(insert_compra);
                    insert_tblcompra.setInt(1, 0);
                    insert_tblcompra.setString(2, codigo);
                    insert_tblcompra.setString(3, descripcion);
                    insert_tblcompra.setDate(4, fechaIngreso);
                    insert_tblcompra.setDouble(5, precio);
                    insert_tblcompra.setInt(6, cantidad);
                    
                    this.sentencia = conectarMySQL.conectarMySQL().createStatement();
           rs = sentencia.executeQuery("SELECT PRO.PROD_ID,PRV.PROV_ID FROM TBL_PRODUCTO PRO, TBL_PROVEDOR PRV WHERE PRO.PROD_CODIGO= '"+prod_codigo+"' AND PRV.PROV_CODIGO='"+prov_codigo+"'");         
            rs.next();                         
                    insert_tblcompra.setInt(7, rs.getInt(1));
                    insert_tblcompra.setInt(8, rs.getInt(2));
                    insert_tblcompra.setDate(9, fechaCaducidad );                
            insert_tblcompra.execute();  
            JOptionPane.showMessageDialog(null, "COMPRA GUARDADO EXITOSAMENTE");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }        
       return true;
             
    }

}
