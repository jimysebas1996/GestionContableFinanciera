package Ventanas;

import ControladorBD.ListarDatos;
import ControladorBD.ConectarMySQL;
import Validaciones.Validaciones;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    //Variables Globales
    Button[] btnsOpciones = null;

    Icon iconoError = new ImageIcon(getClass().getResource("/ICONOS/ErrorIcono.png"));
    Icon iconoCheck = new ImageIcon(getClass().getResource("/ICONOS/CheckIcono.png"));
    Icon iconoUsuarioP = new ImageIcon(getClass().getResource("/ICONOS/UsuarioP.png"));
    Icon iconoLlavep = new ImageIcon(getClass().getResource("/ICONOS/llaveP.png"));
    //Instancias de otras clases
    Cliente cliente = new Cliente();
    Empleado empleado = new Empleado();
    Validaciones validaciones = new Validaciones();
    //Compra compra = new Compra();

    ListarDatos listarDatos = new ListarDatos();
    //GUI_Empleados empleado = new Empleado();
    ConectarMySQL conectarMySQL = new ConectarMySQL();

    String usuario;
    String contrasena;
    boolean banderaLogin;
    boolean banderaLoginAdministardor;
    Calendar calendario = new GregorianCalendar();
    int d;
    String mes;
    String anio;
    String dia;

    public Principal() {
        initComponents();

        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setSize(400, 600);
        this.setLocationRelativeTo(null);
        pnlLogin.setSize(400, 600);
        jPanel1.removeAll();
        jPanel1.add(pnlLogin);
        jPanel1.revalidate();
        jPanel1.repaint();

        d = calendario.get(Calendar.DATE);
        if (d < 10) {
            dia = "0" + d;
        }
        mes = Integer.toString(calendario.get(Calendar.MONTH));
        anio = Integer.toString(calendario.get(Calendar.YEAR));
        lblFecha.setText(anio + "-" + mes + "-" + dia);
        banderaLogin = false;
        banderaLoginAdministardor = false;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlLogin = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtContrasena = new javax.swing.JPasswordField();
        lblLlave = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtUsuario = new javax.swing.JTextField();
        lblUsuarioP = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblImagenUsuario = new javax.swing.JLabel();
        lblOlvideContrasena = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        pnlBotones = new javax.swing.JPanel();
        lblIconoEmpresa = new javax.swing.JLabel();
        lblIconoUsuario = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        lblEmpleado = new javax.swing.JLabel();
        lblIconoEmpleado = new javax.swing.JLabel();
        lblIconoProveedor = new javax.swing.JLabel();
        lblIconoProducto = new javax.swing.JLabel();
        lblProducto = new javax.swing.JLabel();
        lblIconoInventario = new javax.swing.JLabel();
        lblInventario = new javax.swing.JLabel();
        pnlContenedorPrincipal = new javax.swing.JPanel();
        pnlPaneles = new javax.swing.JPanel();
        lblFecha = new javax.swing.JLabel();
        lblUsuarioLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BC SELLER MARKET");
        getContentPane().setLayout(new java.awt.GridLayout(1, 2));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new java.awt.GridLayout(1, 2));

        pnlLogin.setBackground(new java.awt.Color(255, 255, 255));

        btnSalir.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnIngresar.setBackground(new java.awt.Color(255, 255, 255));
        btnIngresar.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnIngresarMousePressed(evt);
            }
        });
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));

        txtContrasena.setBorder(null);
        txtContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaActionPerformed(evt);
            }
        });
        txtContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContrasenaKeyTyped(evt);
            }
        });

        lblLlave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/llaveP.png"))); // NOI18N
        lblLlave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLlaveMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Contraseña:");

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));

        txtUsuario.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtUsuario.setBorder(null);

        lblUsuarioP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/UsuarioP.png"))); // NOI18N
        lblUsuarioP.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("Usuario:");

        lblImagenUsuario.setBackground(new java.awt.Color(255, 255, 255));
        lblImagenUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/Usuario.png"))); // NOI18N

        lblOlvideContrasena.setFont(new java.awt.Font("Lucida Grande", 3, 12)); // NOI18N
        lblOlvideContrasena.setText("                       Olvido su cuenta ?");
        lblOlvideContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblOlvideContrasenaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlLoginLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(lblImagenUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlLoginLayout.createSequentialGroup()
                                .addComponent(lblUsuarioP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(lblLlave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlLoginLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblOlvideContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(360, Short.MAX_VALUE))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(lblImagenUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsuarioP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLlave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblOlvideContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(326, Short.MAX_VALUE))
        );

        jPanel1.add(pnlLogin);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        pnlBotones.setBackground(new java.awt.Color(0, 0, 0));
        pnlBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIconoEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconoEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/EmpresaIcono.png"))); // NOI18N
        pnlBotones.add(lblIconoEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 199, 121));

        lblIconoUsuario.setBackground(new java.awt.Color(255, 255, 255));
        lblIconoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/ClienteIcono.png"))); // NOI18N
        lblIconoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconoUsuarioMouseClicked(evt);
            }
        });
        pnlBotones.add(lblIconoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 70, 70));

        lblCliente.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblCliente.setText("Cliente");
        pnlBotones.add(lblCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        lblEmpleado.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        lblEmpleado.setText("Empleado");
        pnlBotones.add(lblEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        lblIconoEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        lblIconoEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/EmpleadoIcono.png"))); // NOI18N
        lblIconoEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconoEmpleadoMouseClicked(evt);
            }
        });
        pnlBotones.add(lblIconoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 70, 70));

        lblIconoProveedor.setBackground(new java.awt.Color(255, 255, 255));
        lblIconoProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/ProveedorIcono.png"))); // NOI18N
        lblIconoProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconoProveedorMouseClicked(evt);
            }
        });
        pnlBotones.add(lblIconoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 70, 70));

        lblIconoProducto.setBackground(new java.awt.Color(255, 255, 255));
        lblIconoProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/ProductoIcono.png"))); // NOI18N
        lblIconoProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconoProductoMouseClicked(evt);
            }
        });
        pnlBotones.add(lblIconoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 80, 70));

        lblProducto.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblProducto.setForeground(new java.awt.Color(255, 255, 255));
        lblProducto.setText("Producto");
        pnlBotones.add(lblProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, -1, -1));

        lblIconoInventario.setBackground(new java.awt.Color(255, 255, 255));
        lblIconoInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONOS/InventarioIcono.png"))); // NOI18N
        lblIconoInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconoInventarioMouseClicked(evt);
            }
        });
        pnlBotones.add(lblIconoInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, -1, 90));

        lblInventario.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblInventario.setForeground(new java.awt.Color(255, 255, 255));
        lblInventario.setText("Inventario");
        pnlBotones.add(lblInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 620, -1, -1));

        pnlContenedorPrincipal.setBackground(new java.awt.Color(0, 0, 0));

        pnlPaneles.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pnlPanelesLayout = new javax.swing.GroupLayout(pnlPaneles);
        pnlPaneles.setLayout(pnlPanelesLayout);
        pnlPanelesLayout.setHorizontalGroup(
            pnlPanelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlPanelesLayout.setVerticalGroup(
            pnlPanelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 829, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlContenedorPrincipalLayout = new javax.swing.GroupLayout(pnlContenedorPrincipal);
        pnlContenedorPrincipal.setLayout(pnlContenedorPrincipalLayout);
        pnlContenedorPrincipalLayout.setHorizontalGroup(
            pnlContenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPaneles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlContenedorPrincipalLayout.setVerticalGroup(
            pnlContenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContenedorPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlPaneles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblFecha.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setText("20018");

        lblUsuarioLogin.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblUsuarioLogin.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlContenedorPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblUsuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 844, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlContenedorPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel4);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblIconoUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconoUsuarioMouseClicked
        pnlPaneles.removeAll();
        JOptionPane.showMessageDialog(null, "CAMPO CLIENTE SELECIONADO", "MENSAJE", JOptionPane.INFORMATION_MESSAGE, iconoCheck);
        cliente.setSize((int) pnlPaneles.getSize().getWidth(), (int) pnlPaneles.getSize().getHeight());
        pnlPaneles.add(cliente, BorderLayout.CENTER);
        pnlPaneles.revalidate();
        pnlPaneles.repaint();
    }//GEN-LAST:event_lblIconoUsuarioMouseClicked

    private void lblIconoEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconoEmpleadoMouseClicked
        if (banderaLoginAdministardor) {
            pnlPaneles.removeAll();
            empleado.setSize((int) pnlPaneles.getSize().getWidth(), (int) pnlPaneles.getSize().getHeight());
            pnlPaneles.add(empleado, BorderLayout.CENTER);
            pnlPaneles.revalidate();
            pnlPaneles.repaint();
        } else {
            JOptionPane.showMessageDialog(null, "NO POSEE PERMISO DE ADMINISTRADOR.", "ERROR !!!..", JOptionPane.INFORMATION_MESSAGE, iconoError);
        }
    }//GEN-LAST:event_lblIconoEmpleadoMouseClicked

    private void lblIconoProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconoProveedorMouseClicked
      
    }//GEN-LAST:event_lblIconoProveedorMouseClicked

    private void lblIconoProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconoProductoMouseClicked
  
 
    }//GEN-LAST:event_lblIconoProductoMouseClicked

    private void lblIconoInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconoInventarioMouseClicked
//        pnlPaneles.removeAll();
//        compra.setSize((int) pnlPaneles.getSize().getWidth(), (int) pnlPaneles.getSize().getHeight());
//        pnlPaneles.add(compra, BorderLayout.CENTER);
//        pnlPaneles.revalidate();
//        pnlPaneles.repaint();
    }//GEN-LAST:event_lblIconoInventarioMouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnIngresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMousePressed

        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
    }//GEN-LAST:event_btnIngresarMousePressed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        usuario = txtUsuario.getText();
        contrasena = txtContrasena.getText();
        if (accederLogin()) {
            this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            this.setLocationRelativeTo(null);
            pnlLogin.setVisible(false);
            jPanel1.remove(pnlLogin);
            jPanel4.setSize((int) jPanel1.getSize().getWidth(), (int) jPanel1.getSize().getHeight());
            jPanel1.add(jPanel4, BorderLayout.CENTER);
            jPanel1.revalidate();
            jPanel1.repaint();
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtContrasenaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContrasenaKeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            usuario = txtUsuario.getText();
            contrasena = txtContrasena.getText();
            if (accederLogin()) {
                this.setExtendedState(JFrame.MAXIMIZED_BOTH);
                this.setLocationRelativeTo(null);
                pnlLogin.setVisible(false);
                jPanel1.remove(pnlLogin);
                jPanel4.setSize((int) jPanel1.getSize().getWidth(), (int) jPanel1.getSize().getHeight());
                jPanel1.add(jPanel4, BorderLayout.CENTER);
                jPanel1.revalidate();
                jPanel1.repaint();
            }
        }
    }//GEN-LAST:event_txtContrasenaKeyTyped

    private void lblLlaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLlaveMouseClicked
//       boolean a=true;
//       char i;
//        if (a) {  // a es una variable boolean en true
//    txtContrasena.setEchoChar((char)0); // este método es el que hace visible el texto del jPasswordField
//    a = false;
//} else {
//    txtContrasena.setEchoChar(i); // i es el char
//    a = true;
//}
    }//GEN-LAST:event_lblLlaveMouseClicked

    private void txtContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrasenaActionPerformed

    private void lblOlvideContrasenaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblOlvideContrasenaKeyPressed

        String correoElectronico;
        correoElectronico = JOptionPane.showInputDialog(null, "Introduce tu nombre");

        if (validaciones.validacionCorreoElectronico(correoElectronico)) {
            JOptionPane.showMessageDialog(null, "   Usuario NO encontrados", "ATENCION !!!..", JOptionPane.INFORMATION_MESSAGE, iconoUsuarioP);

        }


    }//GEN-LAST:event_lblOlvideContrasenaKeyPressed
    public boolean accederLogin() {

        String cargo = "";
        String sql = "SELECT * FROM TBL_EMPLEADO E, TBL_PERSONA P WHERE P.per_id = E.per_id AND P.per_email='" + usuario + "' AND E.emp_password='" + contrasena + "'";

        if (txtUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "INGRESAR USUARIO", "USUARIO !!!..", JOptionPane.INFORMATION_MESSAGE, iconoUsuarioP);
        } else if (txtContrasena.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "INGRESAR CONTRASEÑA", "CONTRASEÑA!!!..", JOptionPane.INFORMATION_MESSAGE, iconoLlavep);
        } else {

            usuario = txtUsuario.getText();
            contrasena = txtContrasena.getText();
            try {
                //
                Statement sentencia = conectarMySQL.conectarMySQL().createStatement();
                ResultSet rs = sentencia.executeQuery(sql);

                //PARA VERIFICAR QUE USUARIO 
                while (rs.next()) {
                    cargo = rs.getString("emp_cargo");
                }
                if (cargo.equalsIgnoreCase("ADMINISTRADOR")) {
                    System.out.println("ingresado");
                    JOptionPane.showMessageDialog(null, "BIENVENIDO", "MENSAJE !!!..", JOptionPane.INFORMATION_MESSAGE, iconoCheck);
                    btnIngresar.setVisible(true);
                    lblUsuarioLogin.setText(empleado());
                    //this.setVisible(false);
                    banderaLogin = true;
                    return true;
                } else if (cargo.equalsIgnoreCase("EMPLEADO")) {
                    //this.setVisible(false);
                    lblUsuarioLogin.setText(empleado());
                    banderaLogin = true;
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "USUARIO NO VALIDO", "ERROR !!!..", JOptionPane.INFORMATION_MESSAGE, iconoError);
                    txtUsuario.requestFocus();
                    limpiar();
                    return false;
                }
            } catch (SQLException ex) {
            }
        }
        return false;
    }

    public void limpiar() {
        //PARA limpiar LOS CAMPOS DE TEXTOS
        txtUsuario.setText("");
        txtContrasena.setText("");
    }

    public String empleado() {
        String nombre = "";
        String apellido = "";
        String cargo = "";

        try {
            Statement sentencia = conectarMySQL.conectarMySQL().createStatement();
            ResultSet rs = sentencia.executeQuery("SELECT PER.PER_NOMBRE,PER.PER_APELLIDO,EM.EMP_CARGO FROM TBL_PERSONA PER, TBL_EMPLEADO EM WHERE PER.PER_ID=EM.PER_ID AND PER.per_email='" + usuario + "'");
            rs.next();
            nombre = rs.getString(1);
            apellido = rs.getString(2);
            cargo = rs.getString(3);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return cargo + ": " + nombre + " " + apellido;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblEmpleado;
    public static javax.swing.JLabel lblFecha;
    public static javax.swing.JLabel lblIconoEmpleado;
    private javax.swing.JLabel lblIconoEmpresa;
    private javax.swing.JLabel lblIconoInventario;
    private javax.swing.JLabel lblIconoProducto;
    private javax.swing.JLabel lblIconoProveedor;
    private javax.swing.JLabel lblIconoUsuario;
    private javax.swing.JLabel lblImagenUsuario;
    private javax.swing.JLabel lblInventario;
    private javax.swing.JLabel lblLlave;
    private javax.swing.JLabel lblOlvideContrasena;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lblUsuarioLogin;
    private javax.swing.JLabel lblUsuarioP;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlContenedorPrincipal;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlPaneles;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
