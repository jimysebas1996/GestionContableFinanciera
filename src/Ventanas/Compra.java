package Ventanas;

import ControladorBD.ActualizarDatos;
import ControladorBD.BuscarDatos;
import ControladorBD.EliminarDato;
import ControladorBD.GuardarDatos;
import ControladorBD.ListarDatos;
import Validaciones.Validaciones;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Compra extends javax.swing.JPanel {

    Boolean aviso_correo = false;
    Calendar calendadrio = Calendar.getInstance();
    ListarDatos listarDatos = new ListarDatos();
    GuardarDatos guardarDatos = new GuardarDatos();
    BuscarDatos buscarDatos = new BuscarDatos();
    ActualizarDatos actualizarDatos = new ActualizarDatos();
    EliminarDato eliminarDato = new EliminarDato();
    Validaciones validarCedulaRUC;
    Icon iconoError;
    Icon iconoCheck;
    int contador;
    String dia;
    String mes;
    String anio;

    public Compra() {
        initComponents();
        tblCLientes.setModel(listarDatos.listadoClientes(tblCLientes));
        iconoCheck = new ImageIcon(getClass().getResource("/ICONOS/CheckIcono.png"));
        iconoError = new ImageIcon(getClass().getResource("/ICONOS/ErrorIcono.png"));
        contador = 0;

        dia = Integer.toString(calendadrio.get(Calendar.DATE));
        if (Integer.parseInt(dia) < 10) {
            dia = "0" + dia;
        };
        mes = Integer.toString(calendadrio.get(Calendar.MONTH));
        anio = Integer.toString(calendadrio.get(Calendar.YEAR));
        
        System.out.println(dia+"-"+mes+"-"+anio);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        tbpnlPersona = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCLientes = new javax.swing.JTable();
        btnNuevaCompra = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnActualizaListado = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtCodigoCompra = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        txtFechaIngreso = new javax.swing.JTextField();
        txtFechaCaducidad = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtProveedor = new javax.swing.JTextField();
        txtProducto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lblMensajes = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblResultado = new javax.swing.JTable();
        btnBuscarCliente = new javax.swing.JButton();
        btnModificarCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        rbtCedula = new javax.swing.JRadioButton();
        rbtNombres = new javax.swing.JRadioButton();
        rbtApellidos = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("COMPRA");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tblCLientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CODIGO", "CEDULA", "NOMBRES", "APELLIDOS", "TELF 1", "TELF 2", "DIRECCION", "CORREO ELECTRONICO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCLientes.setEnabled(false);
        tblCLientes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblCLientes);

        btnNuevaCompra.setBackground(new java.awt.Color(0, 0, 0));
        btnNuevaCompra.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/icono_nuevo_dato_50px.png"))); // NOI18N
        btnNuevaCompra.setText("NUEVO CLIENTE");
        btnNuevaCompra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevaCompra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuevaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaCompraActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/icono_buscar_persona_50px.png"))); // NOI18N
        btnBuscar.setText("BUSCAR CLIENTE");
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/icono_eliminar_dato_50px.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR CLIENTE");
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(0, 0, 0));
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/icono_editar_dato_50px.png"))); // NOI18N
        btnModificar.setText("MODIFICAR CLIENTE");
        btnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnActualizaListado.setBackground(new java.awt.Color(0, 0, 0));
        btnActualizaListado.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizaListado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/icono_actualizar_datos_50px.png"))); // NOI18N
        btnActualizaListado.setText("ACTUALIZAR LISTADO");
        btnActualizaListado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnActualizaListado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnActualizaListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizaListadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(btnNuevaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModificar)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addGap(18, 18, 18)
                .addComponent(btnActualizaListado, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(488, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizaListado, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE))
        );

        tbpnlPersona.addTab("COMPRAS", jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        txtCodigoCompra.setEditable(false);
        txtCodigoCompra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCodigoCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoCompraActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Codigo");

        lblCodigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCodigo.setText("cod");

        txtDescripcion.setEditable(false);
        txtDescripcion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDescripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDescripcionMouseClicked(evt);
            }
        });
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyTyped(evt);
            }
        });

        txtFechaIngreso.setEditable(false);
        txtFechaIngreso.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtFechaIngreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaIngresoKeyTyped(evt);
            }
        });

        txtFechaCaducidad.setEditable(false);
        txtFechaCaducidad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtFechaCaducidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFechaCaducidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaCaducidadKeyTyped(evt);
            }
        });

        txtCantidad.setEditable(false);
        txtCantidad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Precio");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Fecha Ingreso");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Cantidad");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Proveedor");

        txtProveedor.setEditable(false);
        txtProveedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProveedorKeyTyped(evt);
            }
        });

        txtProducto.setEditable(false);
        txtProducto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtProducto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtProductoFocusLost(evt);
            }
        });
        txtProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductoActionPerformed(evt);
            }
        });
        txtProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProductoKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Descripcion");

        lblMensajes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMensajes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensajes.setText("MENSAJES");

        btnGuardar.setBackground(new java.awt.Color(0, 0, 0));
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/icono_guardar_dato_50px.png"))); // NOI18N
        btnGuardar.setText("GUARDAR COMPRA A PROVEEDOR");
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        tblResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CEDULA", "NOMBRES", "APELLIDOS", "TELEFONO 1", "TELEFONO 2", "DIRECCION", "EMAIL"
            }
        ));
        tblResultado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblResultadoMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblResultado);

        btnBuscarCliente.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/icono_buscar_persona_100px.png"))); // NOI18N
        btnBuscarCliente.setText("BUSCAR CLIENTE");
        btnBuscarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscarCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        btnModificarCliente.setBackground(new java.awt.Color(0, 0, 0));
        btnModificarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/icono_editar_dato_100px.png"))); // NOI18N
        btnModificarCliente.setText("MODIFICAR CLIENTE");
        btnModificarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificarCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarClienteActionPerformed(evt);
            }
        });

        btnEliminarCliente.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/icono_eliminar_dato_100px.png"))); // NOI18N
        btnEliminarCliente.setText("ELIMINAR CLIENTE");
        btnEliminarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminarCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });

        rbtCedula.setBackground(new java.awt.Color(255, 255, 255));
        rbtCedula.setText("BUSCAR POR CÉDULA");
        rbtCedula.setEnabled(false);
        rbtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtCedulaActionPerformed(evt);
            }
        });

        rbtNombres.setBackground(new java.awt.Color(255, 255, 255));
        rbtNombres.setText("BUSCAR POR NOMBRES");
        rbtNombres.setEnabled(false);
        rbtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtNombresActionPerformed(evt);
            }
        });

        rbtApellidos.setBackground(new java.awt.Color(255, 255, 255));
        rbtApellidos.setText("BUSCAR POR APELLIDOS");
        rbtApellidos.setEnabled(false);
        rbtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtApellidosActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Fecha Caducidad");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Producto");

        txtPrecio.setEditable(false);
        txtPrecio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMensajes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtProveedor))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtProducto))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(txtDescripcion)
                                                    .addComponent(txtFechaIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                                    .addComponent(txtCodigoCompra))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(rbtApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                                    .addComponent(rbtNombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(rbtCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(txtFechaCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(152, 152, 152)
                                                .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(31, 31, 31)))
                        .addGap(237, 237, 237))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModificarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(293, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(rbtCedula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtNombres)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtApellidos))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCodigoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFechaCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblMensajes)
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tbpnlPersona.addTab("DATOS DE COMPRA", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbpnlPersona)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbpnlPersona)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped

        if (txtDescripcion.getText().length() >= 75) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SOLO SE PUEDE INGRESAR UN MAXIMO DE 75 LETRAS EN LA DESCRIPCION DEL PRODUCTO", "ERROR !!!..", JOptionPane.INFORMATION_MESSAGE, iconoError);
        } else {
            lblMensajes.setText("");
        }
    }//GEN-LAST:event_txtDescripcionKeyTyped

    private void txtFechaIngresoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaIngresoKeyTyped
        if (txtFechaIngreso.getText().length() >= 75) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SOLO SE PUEDE INGRESAR UN MAXIMO DE 75 LETRAS EN EL APELLIDO DEL CLIENTE", "ERROR !!!..", JOptionPane.INFORMATION_MESSAGE, iconoError);
        } else {
            lblMensajes.setText("");
        }
    }//GEN-LAST:event_txtFechaIngresoKeyTyped

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        //Validacion de solo numeros       
        if ((evt.getKeyChar() < '0' || evt.getKeyChar() > '9') && evt.getKeyChar() != (char) KeyEvent.VK_BACK_SPACE) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SOLO SE PUEDE INGRESAR NÚMEROS PARA EL TELEFONO DEL CLIENTE", "ERROR !!!..", JOptionPane.INFORMATION_MESSAGE, iconoError);
        } else if (txtCantidad.getText().length() >= 10) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SOLO SE PUEDE INGRESAR UN MAXIMO DE 10 NUMEROS EN EL TELEFONO DEL CLIENTE", "ERROR !!!..", JOptionPane.INFORMATION_MESSAGE, iconoError);
        } else {
            lblMensajes.setText("");
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtFechaCaducidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaCaducidadKeyTyped
        //Validacion de solo numeros       
        if ((evt.getKeyChar() < '0' || evt.getKeyChar() > '9') && evt.getKeyChar() != (char) KeyEvent.VK_BACK_SPACE) {
            evt.consume();

            JOptionPane.showMessageDialog(null, "SOLO SE PUEDE INGRESAR NÚMEROS PARA EL CELULAR DEL CLIENTE", "ERROR !!!..", JOptionPane.INFORMATION_MESSAGE, iconoError);
        } else if (txtFechaCaducidad.getText().length() >= 10) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SOLO SE PUEDE INGRESAR UN MAXIMO DE 10 NUMEROS EN EL CELULAR DEL CLIENTE", "ERROR !!!..", JOptionPane.INFORMATION_MESSAGE, iconoError);
        } else {
            lblMensajes.setText("");
        }
    }//GEN-LAST:event_txtFechaCaducidadKeyTyped

    private void txtProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProveedorKeyTyped
        if (txtProveedor.getText().length() >= 250) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SOLO SE PUEDE INGRESAR UN MAXIMO DE 250 LETRAS EN LA DIRECCION DEL CLIENTE", "ERROR !!!..", JOptionPane.INFORMATION_MESSAGE, iconoError);
        } else {
            lblMensajes.setText("");
        }
    }//GEN-LAST:event_txtProveedorKeyTyped

    private void txtProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductoKeyTyped
        if (txtProducto.getText().length() >= 75) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "SOLO SE PUEDE INGRESAR UN MAXIMO DE 75 CARACTERES EN EL CORREO DEL CLIENTE", "ERROR !!!..", JOptionPane.INFORMATION_MESSAGE, iconoError);
        } else {
            lblMensajes.setText("");
        }
    }//GEN-LAST:event_txtProductoKeyTyped

    private void txtProductoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProductoFocusLost

    }//GEN-LAST:event_txtProductoFocusLost

    private void btnNuevaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaCompraActionPerformed
        //Mensaje de ingresra cliente
        JOptionPane.showMessageDialog(null, "INGRESE TODOS LOS DATOS REQUERIDOS PARA GUARDAR LOS DATOS DEL CLIENTE", "ATENCION !!!..", JOptionPane.INFORMATION_MESSAGE, iconoError);

        //Activacion de Controles para el ingreso de datos del nuevo cliente
        txtCodigoCompra.setEditable(true);
        txtDescripcion.setEditable(true);
        txtFechaIngreso.setEditable(true);
        txtPrecio.setEditable(true);
        txtCantidad.setEditable(true);
        txtFechaCaducidad.setEditable(true);
        txtProveedor.setEditable(true);
        txtProducto.setEditable(true);

        btnBuscarCliente.setVisible(false);
        btnModificarCliente.setVisible(false);
        btnEliminarCliente.setVisible(false);
        btnGuardar.setVisible(true);

        txtCodigoCompra.setText("");
        txtDescripcion.setText("");
        txtFechaIngreso.setText("");
        txtCantidad.setText("");
        txtFechaCaducidad.setText("");
        txtProveedor.setText("");
        txtProducto.setText("");

        rbtCedula.setEnabled(false);
        rbtNombres.setEnabled(false);
        rbtApellidos.setEnabled(false);

        tbpnlPersona.setSelectedIndex(1);

    }//GEN-LAST:event_btnNuevaCompraActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        guardarDatos.guardar_Compra(null, txtCodigoCompra.getText(), txtDescripcion.getText(), null, Double.parseDouble(txtPrecio.getText()), Integer.parseInt(txtCantidad.getText()), Integer.parseInt(txtProducto.getText()), Integer.parseInt(txtProveedor.getText()), null);
        txtCantidad.setEditable(false);
        txtCodigoCompra.setEditable(false);
        txtDescripcion.setEditable(false);
        txtFechaCaducidad.setEditable(false);
        txtFechaIngreso.setEditable(false);
        txtPrecio.setEditable(false);
        txtProducto.setEditable(false);
        txtProveedor.setEditable(false);

        txtCantidad.setText("");
        txtCodigoCompra.setText("");
        txtDescripcion.setText("");
        txtFechaCaducidad.setText("");
        txtFechaIngreso.setText("");
        txtPrecio.setText("");
        txtProducto.setText("");
        txtProveedor.setText("");

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizaListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizaListadoActionPerformed
        DefaultTableModel tb = (DefaultTableModel) tblCLientes.getModel();
        int a = tblCLientes.getRowCount() - 1;

        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount() - 1);
        }
        tblCLientes.setModel(listarDatos.listadoClientes(tblCLientes));
    }//GEN-LAST:event_btnActualizaListadoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        JOptionPane.showMessageDialog(null, "LA BUSQUEDA SE REALIZA POR CEDULA, NOMBRES O APELLIDOS", "ATENCION !!!..", JOptionPane.INFORMATION_MESSAGE, iconoCheck);

        tbpnlPersona.setSelectedIndex(1);

        btnGuardar.setVisible(false);
        btnModificarCliente.setVisible(false);
        btnEliminarCliente.setVisible(false);

        txtCodigoCompra.setEditable(true);
        txtDescripcion.setEditable(true);
        txtFechaIngreso.setEditable(true);

        txtCodigoCompra.setText("");
        txtDescripcion.setText("");
        txtFechaIngreso.setText("");

        rbtCedula.setEnabled(true);
        rbtNombres.setEnabled(true);
        rbtApellidos.setEnabled(true);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        if (rbtCedula.isSelected()) {
            tblResultado.setModel(buscarDatos.buscarClientePorCedula(txtCodigoCompra.getText(), tblResultado));
        } else if (rbtNombres.isSelected()) {
            rbtCedula.setSelected(false);
            rbtApellidos.setSelected(false);
            tblResultado.setModel(buscarDatos.buscarClientePorNombre(txtDescripcion.getText(), tblResultado));
        } else if (rbtApellidos.isSelected()) {
            rbtCedula.setSelected(false);
            rbtNombres.setSelected(false);
            tblResultado.setModel(buscarDatos.buscarClientePorApellidos(txtFechaIngreso.getText(), tblResultado));
        } else {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UN CRITERIO DE BUSQUEDA", "ATENCION !!!..", JOptionPane.INFORMATION_MESSAGE, iconoError);
        }
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarClienteActionPerformed
//        if (actualizarDatos.actualizarCliente(txtCodigoCompra.getText(), txtDescripcion.getText(), txtFechaIngreso.getText(), txtCantidad.getText(), txtFechaCaducidad.getText(), txtProveedor.getText(), txtProducto.getText())) {
//            JOptionPane.showMessageDialog(null, "EL CLIENTE SE HA MODIFICADO CORRECTAMENTE", "MENSAJE", JOptionPane.INFORMATION_MESSAGE, iconoCheck);
//        } else {
//            JOptionPane.showMessageDialog(null, "NO SE HA PODIDO MODIFICAR EL REGISTRO", "ERROR !!!..", JOptionPane.INFORMATION_MESSAGE, iconoError);
//
//        }
    }//GEN-LAST:event_btnModificarClienteActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
//        if (eliminarDato.eliminar_cliente_id((int) tblResultado.getValueAt(tblResultado.getSelectedRow(), 0))) {
//            JOptionPane.showMessageDialog(null, "EL CLIENTE SE HA ELIMINADO", "MENSAJE !!!..", JOptionPane.INFORMATION_MESSAGE, iconoCheck);
//        } else {
//            JOptionPane.showMessageDialog(null, "NO SE HA PODIDO ELIMINAR EL REGISTRO", "ERROR !!!..", JOptionPane.INFORMATION_MESSAGE, iconoError);
//        }
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void rbtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtCedulaActionPerformed
        rbtApellidos.setSelected(false);
        rbtNombres.setSelected(false);
        tblResultado.setModel(buscarDatos.buscarClientePorCedula(txtCodigoCompra.getText(), tblResultado));
    }//GEN-LAST:event_rbtCedulaActionPerformed

    private void rbtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtNombresActionPerformed
        rbtApellidos.setSelected(false);
        rbtCedula.setSelected(false);
        tblResultado.setModel(buscarDatos.buscarClientePorNombre(txtDescripcion.getText(), tblResultado));
    }//GEN-LAST:event_rbtNombresActionPerformed

    private void rbtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtApellidosActionPerformed
        rbtCedula.setSelected(false);
        rbtNombres.setSelected(false);
        tblResultado.setModel(buscarDatos.buscarClientePorApellidos(txtFechaIngreso.getText(), tblResultado));
    }//GEN-LAST:event_rbtApellidosActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        JOptionPane.showMessageDialog(null, "INGRESE UN CRITERIO DE BUSQUEDA Y LUEGO SELECCIONE EL DATO EN LA TABLA PARA MODIFICARLO", "ATENCION !!!..", JOptionPane.INFORMATION_MESSAGE, iconoError);

        tbpnlPersona.setSelectedIndex(1);
        btnGuardar.setVisible(false);
        btnBuscarCliente.setVisible(false);
        btnEliminarCliente.setVisible(false);

        txtCodigoCompra.setEditable(true);
        txtDescripcion.setEditable(true);
        txtFechaIngreso.setEditable(true);

        rbtApellidos.setEnabled(true);
        rbtNombres.setEnabled(true);
        rbtCedula.setEnabled(true);

        btnBuscarCliente.setVisible(false);
        btnModificarCliente.setVisible(true);
        btnEliminarCliente.setVisible(false);
        btnGuardar.setVisible(false);

        txtCodigoCompra.setText("");
        txtDescripcion.setText("");
        txtFechaIngreso.setText("");
        txtCantidad.setText("");
        txtFechaCaducidad.setText("");
        txtProveedor.setText("");
        txtProducto.setText("");
    }//GEN-LAST:event_btnModificarActionPerformed

    private void tblResultadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblResultadoMouseClicked
        txtCodigoCompra.setText((String) tblResultado.getValueAt(tblResultado.getSelectedRow(), 1));
        txtDescripcion.setText((String) tblResultado.getValueAt(tblResultado.getSelectedRow(), 2));
        txtFechaIngreso.setText((String) tblResultado.getValueAt(tblResultado.getSelectedRow(), 3));
        txtCantidad.setText((String) tblResultado.getValueAt(tblResultado.getSelectedRow(), 4));
        txtFechaCaducidad.setText((String) tblResultado.getValueAt(tblResultado.getSelectedRow(), 5));
        txtProveedor.setText((String) tblResultado.getValueAt(tblResultado.getSelectedRow(), 6));
        txtProducto.setText((String) tblResultado.getValueAt(tblResultado.getSelectedRow(), 7));

        txtCodigoCompra.setEditable(true);
        txtDescripcion.setEditable(true);
        txtFechaIngreso.setEditable(true);
        txtCantidad.setEditable(true);
        txtFechaCaducidad.setEditable(true);
        txtProveedor.setEditable(true);
        txtProducto.setEditable(true);
    }//GEN-LAST:event_tblResultadoMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        JOptionPane.showMessageDialog(null, "INGRESE UN CRITERIO DE BUSQUEDA Y LUEGO SELECCIONE EL DATO EN LA TABLA PARA MODIFICARLO", "ATENCION !!!..", JOptionPane.INFORMATION_MESSAGE, iconoError);
        tbpnlPersona.setSelectedIndex(1);
        btnGuardar.setVisible(false);
        btnBuscarCliente.setVisible(false);
        btnEliminarCliente.setVisible(false);

        txtCodigoCompra.setEditable(true);
        txtDescripcion.setEditable(true);
        txtFechaIngreso.setEditable(true);

        rbtApellidos.setEnabled(true);
        rbtNombres.setEnabled(true);
        rbtCedula.setEnabled(true);

        btnBuscarCliente.setVisible(false);
        btnModificarCliente.setVisible(false);
        btnEliminarCliente.setVisible(true);
        btnGuardar.setVisible(false);

        txtCodigoCompra.setText("");
        txtDescripcion.setText("");
        txtFechaIngreso.setText("");
        txtCantidad.setText("");
        txtFechaCaducidad.setText("");
        txtProveedor.setText("");
        txtProducto.setText("");
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtDescripcionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDescripcionMouseClicked

    }//GEN-LAST:event_txtDescripcionMouseClicked

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped

    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtCodigoCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoCompraActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizaListado;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnModificarCliente;
    private javax.swing.JButton btnNuevaCompra;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblMensajes;
    private javax.swing.JRadioButton rbtApellidos;
    private javax.swing.JRadioButton rbtCedula;
    private javax.swing.JRadioButton rbtNombres;
    private javax.swing.JTable tblCLientes;
    private javax.swing.JTable tblResultado;
    private javax.swing.JTabbedPane tbpnlPersona;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigoCompra;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtFechaCaducidad;
    private javax.swing.JTextField txtFechaIngreso;
    private javax.swing.JTextField txtPrecio;
    public static javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtProveedor;
    // End of variables declaration//GEN-END:variables
}
