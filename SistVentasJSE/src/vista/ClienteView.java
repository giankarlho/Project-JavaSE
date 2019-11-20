package vista;

import controlador.ClienteC;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import service.LimitarCaracter;
import service.ReportGenerator;

public class ClienteView extends javax.swing.JFrame {

    public static String sexo = "M";
    public static int idCliente; // este será el id tomado de la tabla
    ClienteC controller;
    DefaultTableModel modeloTabla;
    String dato = "";
    int tipo = 1;

    public ClienteView() throws Exception {
        initComponents();
        this.setLocationRelativeTo(null);
        btnGroupSex.add(optFemenino);
        btnGroupSex.add(optMasculino);
        Cargar_Tabla();
        limitar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupSex = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCliente = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jpAtributos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        optMasculino = new javax.swing.JRadioButton();
        optFemenino = new javax.swing.JRadioButton();
        txtNom = new javax.swing.JTextField();
        txtApe = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        jdFecha = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jpComandos = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jtCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtCliente);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Mantenimiento de Clientes");

        jpAtributos.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nombre (s)");

        jLabel2.setBackground(new java.awt.Color(204, 255, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Apellidos");

        jLabel3.setBackground(new java.awt.Color(204, 255, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Sexo");

        jLabel4.setBackground(new java.awt.Color(204, 255, 204));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("DNI");

        optMasculino.setBackground(new java.awt.Color(204, 255, 204));
        optMasculino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        optMasculino.setSelected(true);
        optMasculino.setText("Masculino");
        optMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optMasculinoActionPerformed(evt);
            }
        });

        optFemenino.setBackground(new java.awt.Color(204, 255, 204));
        optFemenino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        optFemenino.setText("Femenino");
        optFemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optFemeninoActionPerformed(evt);
            }
        });

        txtNom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNom.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtApe.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtApe.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtDNI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDNI.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jdFecha.setForeground(new java.awt.Color(51, 0, 255));
        jdFecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jdFecha.setMaximumSize(new java.awt.Dimension(87, 25));
        jdFecha.setMinimumSize(new java.awt.Dimension(87, 25));
        jdFecha.setPreferredSize(new java.awt.Dimension(87, 25));

        jLabel6.setBackground(new java.awt.Color(204, 255, 204));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Fecha Nacimiento");

        javax.swing.GroupLayout jpAtributosLayout = new javax.swing.GroupLayout(jpAtributos);
        jpAtributos.setLayout(jpAtributosLayout);
        jpAtributosLayout.setHorizontalGroup(
            jpAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAtributosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAtributosLayout.createSequentialGroup()
                        .addGroup(jpAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(jpAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtApe, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                            .addComponent(txtNom, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                            .addComponent(txtDNI)
                            .addGroup(jpAtributosLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(optMasculino)
                                .addGap(18, 18, 18)
                                .addComponent(optFemenino))))
                    .addGroup(jpAtributosLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jdFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
            .addGroup(jpAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpAtributosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addContainerGap(313, Short.MAX_VALUE)))
        );

        jpAtributosLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtApe, txtNom});

        jpAtributosLayout.setVerticalGroup(
            jpAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAtributosLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApe, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optMasculino)
                    .addComponent(jLabel3)
                    .addComponent(optFemenino))
                .addGap(24, 24, 24))
            .addGroup(jpAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpAtributosLayout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(jLabel1)
                    .addContainerGap(219, Short.MAX_VALUE)))
        );

        jpAtributosLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtApe, txtDNI, txtNom});

        jpComandos.setBackground(new java.awt.Color(255, 204, 153));

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/guardar.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setEnabled(false);
        btnRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reportar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);
        btnModificar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnModificar.setMaximumSize(new java.awt.Dimension(113, 41));
        btnModificar.setMinimumSize(new java.awt.Dimension(113, 41));
        btnModificar.setPreferredSize(new java.awt.Dimension(113, 41));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/borrar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEliminar.setMaximumSize(new java.awt.Dimension(113, 41));
        btnEliminar.setMinimumSize(new java.awt.Dimension(113, 41));
        btnEliminar.setPreferredSize(new java.awt.Dimension(113, 41));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/impresora.png"))); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnImprimir.setMaximumSize(new java.awt.Dimension(113, 41));
        btnImprimir.setMinimumSize(new java.awt.Dimension(113, 41));
        btnImprimir.setPreferredSize(new java.awt.Dimension(113, 41));
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nuevo.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpComandosLayout = new javax.swing.GroupLayout(jpComandos);
        jpComandos.setLayout(jpComandosLayout);
        jpComandosLayout.setHorizontalGroup(
            jpComandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpComandosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpComandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpComandosLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnEliminar, btnImprimir, btnModificar, btnNuevo, btnRegistrar});

        jpComandosLayout.setVerticalGroup(
            jpComandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpComandosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpComandosLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnEliminar, btnImprimir, btnModificar, btnNuevo, btnRegistrar});

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Total Registros");

        lblTotal.setBackground(new java.awt.Color(204, 255, 204));
        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 1, true));

        lblCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jpAtributos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jpComandos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel5)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpComandos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpAtributos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void optMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optMasculinoActionPerformed
        if (optMasculino.isSelected() == true) {
            sexo = "M";
        } else {
            sexo = "F";
        }
    }//GEN-LAST:event_optMasculinoActionPerformed

    private void optFemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optFemeninoActionPerformed
        if (optFemenino.isSelected() == true) {
            sexo = "F";
        } else {
            sexo = "M";
        }
    }//GEN-LAST:event_optFemeninoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        controller = new ClienteC();
        try {
            controller.registrar();
            Cargar_Tabla();
            btnRegistrar.setEnabled(false);
        } catch (Exception e) {
            System.out.println("error en btnRegistrar " + e.getMessage());
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void jtClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtClienteMouseClicked
        try {
            int fila = jtCliente.getSelectedRow();
            if (fila >= 0) {
                btnModificar.setEnabled(true);
                btnEliminar.setEnabled(true);
                lblCodigo.setText(jtCliente.getValueAt(fila, 0).toString());
                idCliente = Integer.parseInt(jtCliente.getValueAt(fila, 0).toString());
                txtNom.setText(jtCliente.getValueAt(fila, 1).toString());
                txtApe.setText(jtCliente.getValueAt(fila, 2).toString());
                txtDNI.setText(jtCliente.getValueAt(fila, 4).toString());
                if (jtCliente.getValueAt(fila, 3).toString().equals("M")) {
                    optMasculino.setSelected(true);
                    optFemenino.setSelected(false);
                } else {
                    optFemenino.setSelected(true);
                    optMasculino.setSelected(false);
                }
                jdFecha.setDate(Date.valueOf(jtCliente.getValueAt(fila, 5).toString()));
            }
        } catch (Exception e) {
            System.out.println("Error en jtCliente " + e.getMessage());
        }
    }//GEN-LAST:event_jtClienteMouseClicked

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        btnRegistrar.setEnabled(true);
        limpiar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        controller = new ClienteC();
        try {
            controller.modificar();
            Cargar_Tabla();
            btnModificar.setEnabled(false);
        } catch (Exception e) {
            System.out.println("error en btnModificar " + e.getMessage());
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        controller = new ClienteC();
        try {
            controller.eliminar();
            Cargar_Tabla();
            btnEliminar.setEnabled(false);
            limpiar();
        } catch (Exception e) {
            System.out.println("error en btnModificar " + e.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        try {
            ReportGenerator report = new ReportGenerator();
            JasperPrint reportelleno = report.generarReporteSimplePersonal();
            JasperViewer viewer = new JasperViewer(reportelleno, false);
            viewer.setVisible(true);
        } catch (Exception e) {
            System.out.println("bntImprimir " + e.getMessage());
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void Cargar_Tabla() throws Exception {
        String columna[] = new String[]{"Nro", "Nombre", "Apellidos", "Sexo", "DNI", "Nacimiento"};
        controller = new ClienteC();
        modeloTabla = new DefaultTableModel(null, columna);
        controller.listar(modeloTabla, tipo, dato);
        jtCliente.setModel(modeloTabla);
    }

    private void limitar() {
        txtDNI.setDocument(new LimitarCaracter(txtDNI, 8));
    }

    private void limpiar() {
        txtApe.setText("");
        txtNom.setText("");
        txtDNI.setText("");
    }

    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ClienteView().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(ClienteView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.ButtonGroup btnGroupSex;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    public static com.toedter.calendar.JDateChooser jdFecha;
    private javax.swing.JPanel jpAtributos;
    private javax.swing.JPanel jpComandos;
    private javax.swing.JTable jtCliente;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JRadioButton optFemenino;
    private javax.swing.JRadioButton optMasculino;
    public static javax.swing.JTextField txtApe;
    public static javax.swing.JTextField txtDNI;
    public static javax.swing.JTextField txtNom;
    // End of variables declaration//GEN-END:variables
}
