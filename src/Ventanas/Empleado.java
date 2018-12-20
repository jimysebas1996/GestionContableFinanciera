package Ventanas;

import ControladorBD.ActualizarDatos;
import ControladorBD.BuscarDatos;
import ControladorBD.ConectarMySQL;
import ControladorBD.EliminarDato;
import ControladorBD.GenerarCodigo;
import ControladorBD.GuardarDatos;
import ControladorBD.ListarDatos;
import ControladorBD.Persona;
import Validaciones.Validaciones;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Empleado extends javax.swing.JPanel {

    ListarDatos listarDatos = new ListarDatos();
    GuardarDatos guardarDatos = new GuardarDatos();
    BuscarDatos buscarDatos = new BuscarDatos();
    ActualizarDatos actualizarDatos = new ActualizarDatos();
    EliminarDato eliminarDato = new EliminarDato();
    GenerarCodigo generarCodigo = new GenerarCodigo();
    Validaciones validaciones;
    Icon iconoError;
    Icon iconoCheck;
    int contador;
    String cadena = "";
    boolean bandera = false;
    boolean personaExistente;
    boolean seleccionadoNuevoEmpleado = false;
    boolean seleccionadoEliminarEmpleado = false;
    boolean seleccionadoModificarEmpleado = false;
    boolean seleccionadoBuscarEmpleado = true;
    Statement sentencia;
    ResultSet rs = null;
    ConectarMySQL conectarMySQL = new ConectarMySQL();
    Persona persona;

    public Empleado() {
        initComponents();
        validaciones = new Validaciones();
        iconoCheck = new ImageIcon(getClass().getResource("/ICONOS/CheckIcono.png"));
        iconoError = new ImageIcon(getClass().getResource("/ICONOS/ErrorIcono.png"));
        contador = 0;

        tbpnlPersona.setVisible(true);
        tblEmpleados.setModel(listarDatos.listadoEmpleados(tblEmpleados));
        tbpnlPersona.setEnabledAt(1, false);
        tbpnlPersona.setTitleAt(0, "LISTA DE EMPLEADOS");
        tbpnlPersona.setTitleAt(1, "");
        tbpnlPersona.setSelectedIndex(0);
        limpiarCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSeparator4 = new javax.swing.JSeparator();
        tbpnlPersona = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleados = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        txtCedula = new javax.swing.JTextField();
        lblCodigom = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblResultado = new javax.swing.JTable();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        cbxCargo = new javax.swing.JComboBox<>();
        btnEliminarEmpleado = new javax.swing.JButton();
        btnModificarEmpleado = new javax.swing.JButton();
        btnBuscarEmpleado = new javax.swing.JButton();
        btnNuevoEmpleado = new javax.swing.JButton();
        btnListarEmpleado = new javax.swing.JButton();
        lblTituloCliente = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));

        tbpnlPersona.setBackground(new java.awt.Color(255, 255, 255));
        tbpnlPersona.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tblEmpleados.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        tblEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "CEDULA", "NOMBRES", "APELLIDOS", "DIRECCION", "TELEFONO", "CELULAR", "CORREO ELECTRONICO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmpleados.setEnabled(false);
        tblEmpleados.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblEmpleados);
        if (tblEmpleados.getColumnModel().getColumnCount() > 0) {
            tblEmpleados.getColumnModel().getColumn(0).setMinWidth(100);
            tblEmpleados.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblEmpleados.getColumnModel().getColumn(0).setMaxWidth(100);
            tblEmpleados.getColumnModel().getColumn(1).setMinWidth(130);
            tblEmpleados.getColumnModel().getColumn(1).setPreferredWidth(130);
            tblEmpleados.getColumnModel().getColumn(1).setMaxWidth(130);
            tblEmpleados.getColumnModel().getColumn(2).setMinWidth(200);
            tblEmpleados.getColumnModel().getColumn(2).setPreferredWidth(200);
            tblEmpleados.getColumnModel().getColumn(2).setMaxWidth(200);
            tblEmpleados.getColumnModel().getColumn(3).setMinWidth(200);
            tblEmpleados.getColumnModel().getColumn(3).setPreferredWidth(200);
            tblEmpleados.getColumnModel().getColumn(3).setMaxWidth(200);
            tblEmpleados.getColumnModel().getColumn(5).setMinWidth(100);
            tblEmpleados.getColumnModel().getColumn(5).setPreferredWidth(100);
            tblEmpleados.getColumnModel().getColumn(5).setMaxWidth(100);
            tblEmpleados.getColumnModel().getColumn(6).setMinWidth(100);
            tblEmpleados.getColumnModel().getColumn(6).setPreferredWidth(100);
            tblEmpleados.getColumnModel().getColumn(6).setMaxWidth(100);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1238, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );

        tbpnlPersona.addTab("LISTADO DE EMPLEADOS", jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCedula.setEditable(false);
        txtCedula.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCedula.setBorder(null);
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCedulaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaKeyReleased(evt);
            }
        });
        jPanel3.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 160, -1));

        lblCodigom.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCodigom.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodigom.setText("Codigo:");
        lblCodigom.setToolTipText("");
        jPanel3.add(lblCodigom, new org.netbeans.lib.awtextra.AbsoluteConstraints(945, 15, 134, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Cedula: ");
        jLabel4.setToolTipText("");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 80, -1));

        lblCodigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(255, 0, 0));
        lblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel3.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 10, 156, 22));

        txtNombres.setEditable(false);
        txtNombres.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNombres.setBorder(null);
        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombresKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombresKeyReleased(evt);
            }
        });
        jPanel3.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 72, 210, 20));

        txtApellidos.setEditable(false);
        txtApellidos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtApellidos.setBorder(null);
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApellidosKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidosKeyReleased(evt);
            }
        });
        jPanel3.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 210, -1));

        txtCelular.setEditable(false);
        txtCelular.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCelular.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCelular.setBorder(null);
        txtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCelularKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCelularKeyPressed(evt);
            }
        });
        jPanel3.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 168, -1));

        txtTelefono.setEditable(false);
        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTelefono.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTelefono.setBorder(null);
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyPressed(evt);
            }
        });
        jPanel3.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 124, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Telefono: ");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 100, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Apellidos:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Direccion:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 80, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("e-mail:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, -1, -1));

        txtDireccion.setEditable(false);
        txtDireccion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDireccion.setBorder(null);
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDireccionKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDireccionKeyReleased(evt);
            }
        });
        jPanel3.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 330, -1));

        txtEmail.setEditable(false);
        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtEmail.setBorder(null);
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        jPanel3.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 210, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Nombres: ");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 90, -1));

        btnGuardar.setBackground(new java.awt.Color(0, 0, 0));
        btnGuardar.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/guardarC.png"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBorder(null);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel3.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 50, 90, 90));

        btnModificar.setBackground(new java.awt.Color(0, 0, 0));
        btnModificar.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/actualizarC.png"))); // NOI18N
        btnModificar.setText("ACTUALIZAR");
        btnModificar.setBorder(null);
        btnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel3.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 50, 90, 90));

        btnEliminar.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/eliminar.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(null);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 50, 80, 90));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Celular: ");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 100, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, 210, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 150, 10));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 150, 10));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 320, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 150, 10));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 210, 10));

        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, 210, -1));

        tblResultado.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        tblResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "CEDULA", "NOMBRES", "APELLIDOS", "DIRECCION", "TELEFONO", "CELULAR", "EMAIL", "CARGO", "PASSWORD"
            }
        ));
        tblResultado.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tblResultado.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tblResultado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblResultadoMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblResultado);
        if (tblResultado.getColumnModel().getColumnCount() > 0) {
            tblResultado.getColumnModel().getColumn(0).setMinWidth(90);
            tblResultado.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblResultado.getColumnModel().getColumn(0).setMaxWidth(100);
            tblResultado.getColumnModel().getColumn(1).setMinWidth(100);
            tblResultado.getColumnModel().getColumn(1).setPreferredWidth(100);
            tblResultado.getColumnModel().getColumn(1).setMaxWidth(100);
            tblResultado.getColumnModel().getColumn(2).setMinWidth(200);
            tblResultado.getColumnModel().getColumn(2).setPreferredWidth(200);
            tblResultado.getColumnModel().getColumn(2).setMaxWidth(200);
            tblResultado.getColumnModel().getColumn(3).setMinWidth(150);
            tblResultado.getColumnModel().getColumn(3).setPreferredWidth(150);
            tblResultado.getColumnModel().getColumn(3).setMaxWidth(150);
            tblResultado.getColumnModel().getColumn(5).setMinWidth(100);
            tblResultado.getColumnModel().getColumn(5).setPreferredWidth(100);
            tblResultado.getColumnModel().getColumn(5).setMaxWidth(100);
            tblResultado.getColumnModel().getColumn(6).setMinWidth(100);
            tblResultado.getColumnModel().getColumn(6).setPreferredWidth(100);
            tblResultado.getColumnModel().getColumn(6).setMaxWidth(100);
        }

        jPanel3.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 1260, 380));

        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 210, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Cargo: ");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 70, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Contraseña: ");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 130, -1));

        txtPassword.setToolTipText("");
        txtPassword.setBorder(null);
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });
        jPanel3.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 210, 20));

        cbxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EMPLEADO", "ADMINISTRADOR", " ", " " }));
        jPanel3.add(cbxCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 210, 30));

        tbpnlPersona.addTab("DATOS DEL EMPLEADO", jPanel3);

        btnEliminarEmpleado.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminarEmpleado.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btnEliminarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/EliminarCliente.png"))); // NOI18N
        btnEliminarEmpleado.setText("Eliminar");
        btnEliminarEmpleado.setBorderPainted(false);
        btnEliminarEmpleado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminarEmpleado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEmpleadoActionPerformed(evt);
            }
        });

        btnModificarEmpleado.setBackground(new java.awt.Color(0, 0, 0));
        btnModificarEmpleado.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btnModificarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/modificarCliente.png"))); // NOI18N
        btnModificarEmpleado.setText("Modificar");
        btnModificarEmpleado.setBorderPainted(false);
        btnModificarEmpleado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificarEmpleado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModificarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarEmpleadoActionPerformed(evt);
            }
        });

        btnBuscarEmpleado.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscarEmpleado.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btnBuscarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/BuscarCliente.png"))); // NOI18N
        btnBuscarEmpleado.setText("Buscar");
        btnBuscarEmpleado.setBorderPainted(false);
        btnBuscarEmpleado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscarEmpleado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEmpleadoActionPerformed(evt);
            }
        });

        btnNuevoEmpleado.setBackground(new java.awt.Color(0, 0, 0));
        btnNuevoEmpleado.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btnNuevoEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/NuevoCliente.png"))); // NOI18N
        btnNuevoEmpleado.setText("Nuevo");
        btnNuevoEmpleado.setBorderPainted(false);
        btnNuevoEmpleado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevoEmpleado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuevoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoEmpleadoActionPerformed(evt);
            }
        });

        btnListarEmpleado.setBackground(new java.awt.Color(0, 0, 0));
        btnListarEmpleado.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btnListarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnListarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/ListarCliente.png"))); // NOI18N
        btnListarEmpleado.setText("Listar Empleados");
        btnListarEmpleado.setBorderPainted(false);
        btnListarEmpleado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnListarEmpleado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnListarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarEmpleadoActionPerformed(evt);
            }
        });

        lblTituloCliente.setBackground(new java.awt.Color(255, 255, 255));
        lblTituloCliente.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblTituloCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloCliente.setText("EMPLEADO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbpnlPersona)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(btnNuevoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnListarEmpleado)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(575, 575, 575)
                .addComponent(lblTituloCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnNuevoEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModificarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminarEmpleado))
                    .addComponent(btnListarEmpleado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tbpnlPersona)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped

        if ((evt.getKeyChar() < '0' || evt.getKeyChar() > '9') && evt.getKeyChar() != (char) KeyEvent.VK_BACK_SPACE) {
            if (evt.getKeyChar() != (char) KeyEvent.VK_ENTER) {
                JOptionPane.showMessageDialog(null, "SOLO SE PUEDE INGRESAR NÚMEROS PARA EL CELULAR", "ERROR !!!..", JOptionPane.INFORMATION_MESSAGE, iconoError);
            }

        } else if (txtCedula.getText().length() >= 13) {//Validacion del numero maximo de caracteres que se puede ingresar

            JOptionPane.showMessageDialog(null, "SOLO SE PUEDE INGRESAR UN MAXIMO DE 13 NUMEROS EN EL CAMPO CEDULA/RUC", "ERROR !!!..", JOptionPane.INFORMATION_MESSAGE, iconoError);
        }
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped
        if (txtNombres.getText().length() >= 75) {
            JOptionPane.showMessageDialog(null, "SOLO SE PUEDE INGRESAR UN MAXIMO DE 75 LETRAS EN LOS NOMBRES", "ERROR !!!..", JOptionPane.INFORMATION_MESSAGE, iconoError);
        }
    }//GEN-LAST:event_txtNombresKeyTyped

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
        if (txtApellidos.getText().length() >= 75) {
            JOptionPane.showMessageDialog(null, "SOLO SE PUEDE INGRESAR UN MAXIMO DE 75 LETRAS EN EL APELLIDO", "ERROR !!!..", JOptionPane.INFORMATION_MESSAGE, iconoError);
        }
    }//GEN-LAST:event_txtApellidosKeyTyped

    private void txtCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyTyped
        //Validacion de solo numeros       
        if ((evt.getKeyChar() < '0' || evt.getKeyChar() > '9') && evt.getKeyChar() != (char) KeyEvent.VK_BACK_SPACE) {
            if (evt.getKeyChar() != (char) KeyEvent.VK_ENTER) {
                JOptionPane.showMessageDialog(null, "SOLO SE PUEDE INGRESAR NÚMEROS PARA EL CELULAR", "ERROR !!!..", JOptionPane.INFORMATION_MESSAGE, iconoError);
            }
        } else if (txtCelular.getText().length() >= 10) {
            JOptionPane.showMessageDialog(null, "SOLO SE PUEDE INGRESAR UN MAXIMO DE 10 NUMEROS EN EL CELULAR", "ERROR !!!..", JOptionPane.INFORMATION_MESSAGE, iconoError);
        }
    }//GEN-LAST:event_txtCelularKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        if (txtDireccion.getText().length() >= 250) {
            JOptionPane.showMessageDialog(null, "SOLO SE PUEDE INGRESAR UN MAXIMO DE 250 LETRAS EN LA DIRECCION", "ERROR !!!..", JOptionPane.INFORMATION_MESSAGE, iconoError);
        }
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        if (txtEmail.getText().length() >= 75) {
            JOptionPane.showMessageDialog(null, "SOLO SE PUEDE INGRESAR UN MAXIMO DE 75 CARACTERES EN EL CORREO", "ERROR !!!..", JOptionPane.INFORMATION_MESSAGE, iconoError);
        }
    }//GEN-LAST:event_txtEmailKeyTyped

    private void btnNuevoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoEmpleadoActionPerformed

        seleccionadoNuevoEmpleado = true;
        seleccionadoModificarEmpleado = false;
        seleccionadoEliminarEmpleado = false;
        seleccionadoBuscarEmpleado = false;
        limpiarTodosCampos();
        JOptionPane.showMessageDialog(null, "INGRESE TODOS LOS DATOS", "ATENCION !!!..", JOptionPane.INFORMATION_MESSAGE, iconoError);
        txtCedula.requestFocus();
        tbpnlPersona.setVisible(true);
        tbpnlPersona.setSelectedIndex(1);
        tbpnlPersona.setTitleAt(1, "DATOS DEL EMPLEADO");
        tbpnlPersona.setTitleAt(0, "");
        tbpnlPersona.setEnabledAt(0, false);
        lblCodigo.setText(generarCodigo.generarIDEmpleado());
        //Activacion de Controles para el ingreso de datos del nuevo cliente
        activarCampos();
        btnModificar.setVisible(false);
        btnEliminar.setVisible(false);
        btnGuardar.setVisible(true);
    }//GEN-LAST:event_btnNuevoEmpleadoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (camposVacios()) {
            String ced = "";
            try {
                this.sentencia = conectarMySQL.conectarMySQL().createStatement();
                rs = sentencia.executeQuery("SELECT PER.PER_CED FROM TBL_PERSONA PER WHERE PER.PER_CED='" + txtCedula.getText() + "'");
                rs.next();
                ced = rs.getString(1);
                if (ced.equalsIgnoreCase(txtCedula.getText())) {
                    guardarDatos.guardarActEmpleado(cbxCargo.getSelectedItem().toString(), txtPassword.getText(), txtCedula.getText(), lblCodigo.getText());
                    JOptionPane.showMessageDialog(null, "EL EMPLEADO SE HA GUARDADO CORRECTAMENTE", "MENSAJE", JOptionPane.INFORMATION_MESSAGE, iconoCheck);

                } else {
                    guardarDatos.guardarPerEmpleado(lblCodigo.getText(), txtCedula.getText(), txtNombres.getText(), txtApellidos.getText(),
                            txtDireccion.getText(), txtTelefono.getText(), txtCelular.getText(), txtEmail.getText(), cbxCargo.getSelectedItem().toString(), txtPassword.getText(), generarCodigo.generarIDCliente());
                    limpiarTodosCampos();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        actualizarTablaResultado();
        limpiarCampos();
//                txtCedula.requestFocus();
//                JOptionPane.showMessageDialog(null, "SE HA GUARDADO CORRECTAMENTE", "MENSAJE", JOptionPane.INFORMATION_MESSAGE, iconoCheck);
//                lblCodigo.setText(generarCodigo.generarIDEmpleado());
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEmpleadoActionPerformed
        limpiarTodosCampos();
        activarCampos();
        seleccionadoNuevoEmpleado = false;
        seleccionadoModificarEmpleado = false;
        seleccionadoEliminarEmpleado = false;
        seleccionadoBuscarEmpleado = true;
        tbpnlPersona.setVisible(true);
        tbpnlPersona.setSelectedIndex(1);
        tbpnlPersona.setTitleAt(1, "DATOS DEL EMPLEADO");
        tbpnlPersona.setTitleAt(0, "");
        tbpnlPersona.setEnabledAt(0, false);
        txtCedula.requestFocus();
        btnModificar.setVisible(false);
        btnEliminar.setVisible(false);
        btnGuardar.setVisible(false);
    }//GEN-LAST:event_btnBuscarEmpleadoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

            if (actualizarDatos.modificarEmpleado(cbxCargo.getSelectedItem().toString(),txtPassword.getText(), txtCedula.getText(),lblCodigo.getText())) {
                 System.out.println("hola");
                JOptionPane.showMessageDialog(null, "EL EMPLEADO MODIFICADO CORRECTAMENTE", "MENSAJE", JOptionPane.INFORMATION_MESSAGE, iconoCheck);
                limpiarCampos();
             
            } else {
                JOptionPane.showMessageDialog(null, "NO SE HA PODIDO MODIFICAR EL REGISTRO", "ERROR !!!..", JOptionPane.INFORMATION_MESSAGE, iconoError);
            limpiarCampos();
            }
        
           actualizarTablaResultado();
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        if (eliminarDato.eliminarEmpleado(lblCodigo.getText())){
            JOptionPane.showMessageDialog(null, "EL REGISTRO SE HA ELIMINADO", "MENSAJE !!!..", JOptionPane.INFORMATION_MESSAGE, iconoCheck);
            actualizarTablaResultado();
            limpiarCampos();
            txtCedula.requestFocus();
        } else {
            JOptionPane.showMessageDialog(null, "NO SE HA PODIDO ELIMINAR EL REGISTRO", "ERROR !!!..", JOptionPane.INFORMATION_MESSAGE, iconoError);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarEmpleadoActionPerformed
        activarCampos();
        seleccionadoNuevoEmpleado = true;
        seleccionadoModificarEmpleado = true;
        seleccionadoEliminarEmpleado = false;
        seleccionadoBuscarEmpleado = false;
        tbpnlPersona.setVisible(true);
        tbpnlPersona.setSelectedIndex(1);
        tbpnlPersona.setTitleAt(1, "DATOS DEL EMPLEADO");
        tbpnlPersona.setTitleAt(0, "");
        tbpnlPersona.setEnabledAt(0, false);
        txtCedula.requestFocus();
        btnModificar.setVisible(true);
        btnEliminar.setVisible(false);
        btnGuardar.setVisible(false);
        limpiarTodosCampos();
    }//GEN-LAST:event_btnModificarEmpleadoActionPerformed

    private void btnEliminarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEmpleadoActionPerformed
        activarCampos();
        limpiarTodosCampos();
        seleccionadoNuevoEmpleado = false;
        seleccionadoModificarEmpleado = false;
        seleccionadoEliminarEmpleado = true;
        seleccionadoBuscarEmpleado = false;
        txtCedula.requestFocus();
        btnEliminar.setVisible(true);
        btnModificar.setVisible(false);
        btnGuardar.setVisible(false);
        tbpnlPersona.setVisible(true);
        tbpnlPersona.setSelectedIndex(1);
        tbpnlPersona.setTitleAt(1, "DATOS DEL EMPLEADO");
        tbpnlPersona.setTitleAt(0, "");
        tbpnlPersona.setEnabledAt(0, false);

    }//GEN-LAST:event_btnEliminarEmpleadoActionPerformed

    private void txtCedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyPressed
        persona = new Persona();
        txtCedula.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
                java.util.Collections.EMPTY_SET);
        if (evt.getKeyCode() == KeyEvent.VK_ENTER && txtCedula.getText().length() == 10 || txtCedula.getText().length() == 13) {
            txtNombres.requestFocus();
            persona = new Persona();
            if (validaciones.verificaCedulaRUC(txtCedula.getText())) {

                mostrarPersona();
                JOptionPane.showMessageDialog(null, "CEDULA/RUC ES CORRECTO", "MENSAJE", JOptionPane.INFORMATION_MESSAGE, iconoCheck);

            } else {
                JOptionPane.showMessageDialog(null, "EL VALOR INGRESADO EN CEDULA/RUC ES INCORRECTO", "ERROR !!!..", JOptionPane.INFORMATION_MESSAGE, iconoError);
                txtCedula.requestFocus();
            }
        }
    }//GEN-LAST:event_txtCedulaKeyPressed

    private void txtCedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyReleased
        limpiarTablaResultado();
        tblResultado.setModel(buscarDatos.buscarEmpleadoCedula(txtCedula.getText(), tblResultado));
    }//GEN-LAST:event_txtCedulaKeyReleased

    private void txtApellidosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyReleased
        convertirMayusculas(txtApellidos, txtApellidos.getCaretPosition());
//        limpiarTablaResultado();
//        tblResultado.setModel(buscarDatos.buscarClientePorApellidos(txtApellidos.getText(), tblResultado));

    }//GEN-LAST:event_txtApellidosKeyReleased

    private void txtNombresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyReleased
        convertirMayusculas(txtNombres, txtNombres.getCaretPosition());
//        limpiarTablaResultado();
//        tblResultado.setModel(buscarDatos.buscarClientePorApellidos(txtApellidos.getText(), tblResultado));
    }//GEN-LAST:event_txtNombresKeyReleased

    private void txtDireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyReleased
        convertirMayusculas(txtDireccion, txtDireccion.getCaretPosition());
    }//GEN-LAST:event_txtDireccionKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        int pos = txtEmail.getCaretPosition();
        String min = (txtEmail.getText()).toLowerCase();
        txtEmail.setCaretPosition(pos);
    }//GEN-LAST:event_txtEmailKeyReleased

    private void btnListarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarEmpleadoActionPerformed
        limpiarTodosCampos();
        tbpnlPersona.repaint();
        tbpnlPersona.setVisible(true);
        actualizarTablaEmpleado();
        tbpnlPersona.setEnabledAt(1, false);
        tbpnlPersona.setTitleAt(0, "LISTA DE EMPLEADOS");
        tbpnlPersona.setTitleAt(1, "");
        tbpnlPersona.setSelectedIndex(0);

    }//GEN-LAST:event_btnListarEmpleadoActionPerformed

    private void txtNombresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyPressed
        txtNombres.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
                java.util.Collections.EMPTY_SET);
        if (evt.getKeyCode() == KeyEvent.VK_ENTER && txtNombres.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "INGRESE DATOS CAMPO VACIO", "ATENCION !!!..", JOptionPane.INFORMATION_MESSAGE, iconoError);
            txtNombres.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            txtApellidos.requestFocus();
        }

    }//GEN-LAST:event_txtNombresKeyPressed

    private void txtApellidosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyPressed
        txtApellidos.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
                java.util.Collections.EMPTY_SET);
        if (evt.getKeyCode() == KeyEvent.VK_ENTER && txtApellidos.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "INGRESE DATOS CAMPO VACIO", "ATENCION !!!..", JOptionPane.INFORMATION_MESSAGE, iconoError);
            txtApellidos.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            txtTelefono.requestFocus();
        }
    }//GEN-LAST:event_txtApellidosKeyPressed

    private void txtCelularKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyPressed
        txtCelular.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
                java.util.Collections.EMPTY_SET);
        if (evt.getKeyCode() == KeyEvent.VK_ENTER && txtCelular.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "INGRESE DATOS CAMPO VACIO", "ATENCION !!!..", JOptionPane.INFORMATION_MESSAGE, iconoError);
            txtCelular.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtPassword.requestFocus();
        }
    }//GEN-LAST:event_txtCelularKeyPressed

    private void txtDireccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyPressed
        txtDireccion.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
                java.util.Collections.EMPTY_SET);
        if (evt.getKeyCode() == KeyEvent.VK_ENTER && txtNombres.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "INGRESE DATOS CAMPO VACIO", "ATENCION !!!..", JOptionPane.INFORMATION_MESSAGE, iconoError);
            txtDireccion.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtPassword.requestFocus();

        }
    }//GEN-LAST:event_txtDireccionKeyPressed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        txtEmail.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
                java.util.Collections.EMPTY_SET);
        if (evt.getKeyCode() == KeyEvent.VK_ENTER && !validaciones.validacionCorreoElectronico(txtEmail.getText())) {
            txtEmail.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtDireccion.requestFocus();
        }
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtTelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyPressed
        txtTelefono.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
                java.util.Collections.EMPTY_SET);
        if (evt.getKeyCode() == KeyEvent.VK_ENTER && txtTelefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "INGRESE DATOS CAMPO VACIO", "ATENCION !!!..", JOptionPane.INFORMATION_MESSAGE, iconoError);
            txtTelefono.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtCelular.requestFocus();
        }
    }//GEN-LAST:event_txtTelefonoKeyPressed

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        //Validacion de solo numeros
        if ((evt.getKeyChar() < '0' || evt.getKeyChar() > '9') && evt.getKeyChar() != (char) KeyEvent.VK_BACK_SPACE) {
            if (evt.getKeyChar() != (char) KeyEvent.VK_ENTER) {
                JOptionPane.showMessageDialog(null, "SOLO SE PUEDE INGRESAR NÚMEROS PARA EL TELEFONO", "ERROR !!!..", JOptionPane.INFORMATION_MESSAGE, iconoError);
            }
        } else if (txtTelefono.getText().length() >= 10) {
            JOptionPane.showMessageDialog(null, "SOLO SE PUEDE INGRESAR UN MAXIMO DE 10 NUMEROS EN EL TELEFONO", "ERROR !!!..", JOptionPane.INFORMATION_MESSAGE, iconoError);
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void tblResultadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblResultadoMouseClicked

        lblCodigo.setText((String) tblResultado.getValueAt(tblResultado.getSelectedRow(), 0));
        txtCedula.setText((String) tblResultado.getValueAt(tblResultado.getSelectedRow(), 1));
        txtNombres.setText((String) tblResultado.getValueAt(tblResultado.getSelectedRow(), 2));
        txtApellidos.setText((String) tblResultado.getValueAt(tblResultado.getSelectedRow(), 3));
        txtDireccion.setText((String) tblResultado.getValueAt(tblResultado.getSelectedRow(), 4));
        txtTelefono.setText((String) tblResultado.getValueAt(tblResultado.getSelectedRow(), 5));
        txtCelular.setText((String) tblResultado.getValueAt(tblResultado.getSelectedRow(), 6));
        txtEmail.setText((String) tblResultado.getValueAt(tblResultado.getSelectedRow(), 7));

        String cargo = "" + ((String) tblResultado.getValueAt(tblResultado.getSelectedRow(), 8));
        //System.out.println("Cargo" +cargo);
        if (cargo != null) {
            if (cargo.equalsIgnoreCase(cbxCargo.getItemAt(0))) {
                cbxCargo.setSelectedIndex(0);
            } else {
                cbxCargo.setSelectedIndex(1);
            }
            txtPassword.setText((String) tblResultado.getValueAt(tblResultado.getSelectedRow(), 9));

        } else {
            cbxCargo.setSelectedIndex(0);
            txtPassword.setText("");
        }


    }//GEN-LAST:event_tblResultadoMouseClicked

    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyTyped
        txtPassword.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
                java.util.Collections.EMPTY_SET);
        if (evt.getKeyCode() == KeyEvent.VK_ENTER && !validaciones.validacionCorreoElectronico(txtEmail.getText())) {
            txtPassword.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {          
            cbxCargo.requestFocus();
        }
    }//GEN-LAST:event_txtPasswordKeyTyped

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        cbxCargo.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
                java.util.Collections.EMPTY_SET);
        if (evt.getKeyCode() == KeyEvent.VK_ENTER && !validaciones.validacionCorreoElectronico(txtEmail.getText())) {
            cbxCargo.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtDireccion.requestFocus();           
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed
    public void limpiarTablaClientes() {
        DefaultTableModel tb = (DefaultTableModel) tblEmpleados.getModel();
        int a = tblEmpleados.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount() - 1);
        }
    }

    public void limpiarTablaResultado() {
        DefaultTableModel tb = (DefaultTableModel) tblResultado.getModel();
        int a = tblResultado.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount() - 1);
        }
    }

    public void actualizarTablaEmpleado() {
        limpiarTablaClientes();
        tblEmpleados.repaint();
        tblEmpleados.setModel(listarDatos.listadoEmpleados(tblEmpleados));
    }

    public void actualizarTablaResultado() {
        limpiarTablaResultado();
        tblResultado.repaint();
        tblResultado.setModel(listarDatos.listadoEmpleados(tblResultado));
    }

    public void mostrarPersona() {
        persona = new Persona();
        System.out.println(txtCedula.getText());
        persona = listarDatos.recuperarPersona(txtCedula.getText());
        limpiarCampos();
        txtCedula.setText(persona.getCedula());
        txtNombres.setText(persona.getNombre());
        txtApellidos.setText(persona.getApellido());
        txtTelefono.setText(persona.getTelefono());
        txtCelular.setText(persona.getCelular());
        txtDireccion.setText(persona.getDireccion());
        txtEmail.setText(persona.getEmail());
        lblCodigo.setText(generarCodigo.generarIDEmpleado());
    }

    public void limpiarTodosCampos() {
        txtCedula.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtTelefono.setText("");
        txtCelular.setText("");
        txtDireccion.setText("");
        txtEmail.setText("");
        lblCodigo.setText("");
        limpiarTablaResultado();
    }

    public void limpiarCampos() {
        txtCedula.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtTelefono.setText("");
        txtCelular.setText("");
        txtDireccion.setText("");
        txtEmail.setText("");
        lblCodigo.setText("");
        txtPassword.setText("");
    }

    public void activarCampos() {
        txtCedula.setEditable(true);
        txtNombres.setEditable(true);
        txtApellidos.setEditable(true);
        txtTelefono.setEditable(true);
        txtCelular.setEditable(true);
        txtDireccion.setEditable(true);
        txtEmail.setEditable(true);
    }

    public void activarVentanaDatosEmpleado() {
        txtCedula.setEditable(true);
        txtNombres.setEditable(true);
        txtApellidos.setEditable(true);
        txtTelefono.setEditable(true);
        txtCelular.setEditable(true);
        txtDireccion.setEditable(true);
        txtEmail.setEditable(true);
    }

    public void desactivarCampos() {
        txtCedula.setEditable(false);
        txtNombres.setEditable(false);
        txtApellidos.setEditable(false);
        txtTelefono.setEditable(false);
        txtCelular.setEditable(false);
        txtDireccion.setEditable(false);
        txtEmail.setEditable(false);
    }

    public void convertirMayusculas(javax.swing.JTextField txtTextoMayusculas, int pos) {
        cadena = (txtTextoMayusculas.getText()).toUpperCase();
        txtTextoMayusculas.setText(cadena);
        txtTextoMayusculas.setCaretPosition(pos);
        cadena = "";
    }

    public boolean camposVacios() {
        if (lblCodigo.getText().isEmpty() || txtCedula.getText().isEmpty() || txtNombres.getText().isEmpty() || txtApellidos.getText().isEmpty()
                || txtDireccion.getText().isEmpty() || txtTelefono.getText().isEmpty() || txtCelular.getText().isEmpty() || txtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "INGRESE DATOS CAMPO VACIO", "ATENCION !!!..", JOptionPane.INFORMATION_MESSAGE, iconoError);
        } else {
            return true;
        }
        return false;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarEmpleado;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarEmpleado;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnListarEmpleado;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnModificarEmpleado;
    private javax.swing.JButton btnNuevoEmpleado;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxCargo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigom;
    private javax.swing.JLabel lblTituloCliente;
    private javax.swing.JTable tblEmpleados;
    private javax.swing.JTable tblResultado;
    private javax.swing.JTabbedPane tbpnlPersona;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
