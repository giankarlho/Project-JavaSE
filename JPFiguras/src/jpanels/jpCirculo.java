package jpanels;

public class jpCirculo extends javax.swing.JPanel {

    public jpCirculo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblArea = new javax.swing.JLabel();
        lblDiametro = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtRadio = new javax.swing.JTextField();
        jbtnGenerar = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Área");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Diámetro");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        lblArea.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblArea.setForeground(new java.awt.Color(255, 255, 255));
        lblArea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102), 2));
        add(lblArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 110, 30));

        lblDiametro.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblDiametro.setForeground(new java.awt.Color(255, 255, 255));
        lblDiametro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDiametro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51), 2));
        add(lblDiametro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 100, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Radio");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, -1, -1));

        txtRadio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtRadio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txtRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 100, -1));

        jbtnGenerar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jbtnGenerar.setText("Generar");
        jbtnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGenerarActionPerformed(evt);
            }
        });
        add(jbtnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/circulo.png"))); // NOI18N
        add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGenerarActionPerformed
        double radio = Double.parseDouble(txtRadio.getText());
        lblArea.setText(String.valueOf(Math.PI * radio * radio));
        lblDiametro.setText(String.valueOf(Math.PI * 2 * radio));
    }//GEN-LAST:event_jbtnGenerarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbtnGenerar;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblDiametro;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JTextField txtRadio;
    // End of variables declaration//GEN-END:variables
}
