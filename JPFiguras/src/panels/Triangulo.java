package panels;

public class Triangulo extends javax.swing.JPanel {


    public Triangulo() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbCalcular = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblPerimetro = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtBase = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblArea = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(700, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbCalcular.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbCalcular.setText("Calcular");
        jbCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCalcularActionPerformed(evt);
            }
        });
        add(jbCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 255));
        jLabel6.setText("Perimetro");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, -1, -1));

        lblPerimetro.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblPerimetro.setForeground(new java.awt.Color(0, 51, 255));
        lblPerimetro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPerimetro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        add(lblPerimetro, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 90, 30));

        txtAltura.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtAltura.setForeground(new java.awt.Color(255, 0, 51));
        txtAltura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAltura.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(txtAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 130, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Altura");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        txtBase.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtBase.setForeground(new java.awt.Color(255, 0, 51));
        txtBase.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBase.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(txtBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 130, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("Base");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("Area");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, -1, -1));

        lblArea.setBackground(new java.awt.Color(255, 255, 255));
        lblArea.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblArea.setForeground(new java.awt.Color(255, 255, 255));
        lblArea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        add(lblArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 80, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/triangulo.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jbCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCalcularActionPerformed
        double altura = Double.parseDouble(txtAltura.getText());
        double base = Double.parseDouble(txtBase.getText());
        double hipo = Math.sqrt(Math.pow(altura,2) + Math.pow(base,2));
        lblArea.setText(String.valueOf(altura * base));
        lblPerimetro.setText(String.valueOf(2*hipo + base));        // TODO add your handling code here:
    }//GEN-LAST:event_jbCalcularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbCalcular;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblPerimetro;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtBase;
    // End of variables declaration//GEN-END:variables
}
