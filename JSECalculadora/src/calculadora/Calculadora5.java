package calculadora;

import servicios.*;

public class Calculadora5 extends javax.swing.JFrame {

    char operador;
    Double nro1 = 0.0;
    CalcuService servicio; //Variable de instancia
// esto es un constructor: tiene el mismo nombre de la Clase, publico
// el 1er método que se ejecuta en una Clase

    public Calculadora5() {
        servicio = new CalcuService();
        initComponents();
        this.setLocationRelativeTo(null);//centrar el JFrame
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpResultado = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtHistorial = new javax.swing.JTextArea();
        txtResul = new javax.swing.JTextField();
        jpNumeros = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnTodo = new javax.swing.JButton();
        btnLimpiarR = new javax.swing.JButton();
        btnLimpiarUno = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        jpOperadores = new javax.swing.JPanel();
        btnSuma = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnProducto = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnRaiz = new javax.swing.JButton();
        jpAlgoritmos = new javax.swing.JPanel();
        btnPrimo = new javax.swing.JButton();
        btnFactorial = new javax.swing.JButton();
        btnPerfecto = new javax.swing.JButton();
        btnFibonacci = new javax.swing.JButton();
        btnCantPrimos = new javax.swing.JButton();
        btnFactorial4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpResultado.setBackground(new java.awt.Color(255, 255, 255));

        txtHistorial.setColumns(20);
        txtHistorial.setRows(5);
        jScrollPane1.setViewportView(txtHistorial);

        txtResul.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtResul.setForeground(new java.awt.Color(0, 51, 153));
        txtResul.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jpResultadoLayout = new javax.swing.GroupLayout(jpResultado);
        jpResultado.setLayout(jpResultadoLayout);
        jpResultadoLayout.setHorizontalGroup(
            jpResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(txtResul))
                .addContainerGap())
        );
        jpResultadoLayout.setVerticalGroup(
            jpResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtResul, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpNumeros.setBackground(new java.awt.Color(204, 255, 204));

        btn1.setBackground(new java.awt.Color(255, 153, 153));
        btn1.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        btn1.setText("1");
        btn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(255, 153, 153));
        btn2.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        btn2.setText("2");
        btn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(255, 153, 153));
        btn3.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        btn3.setText("3");
        btn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(255, 153, 153));
        btn4.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        btn4.setText("4");
        btn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(255, 153, 153));
        btn5.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        btn5.setText("5");
        btn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(255, 153, 153));
        btn6.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        btn6.setText("6");
        btn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btnTodo.setBackground(new java.awt.Color(255, 153, 153));
        btnTodo.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        btnTodo.setForeground(new java.awt.Color(255, 51, 51));
        btnTodo.setText("CE");
        btnTodo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodoActionPerformed(evt);
            }
        });

        btnLimpiarR.setBackground(new java.awt.Color(255, 153, 153));
        btnLimpiarR.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        btnLimpiarR.setText("C");
        btnLimpiarR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimpiarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarRActionPerformed(evt);
            }
        });

        btnLimpiarUno.setBackground(new java.awt.Color(255, 153, 153));
        btnLimpiarUno.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        btnLimpiarUno.setForeground(new java.awt.Color(204, 0, 51));
        btnLimpiarUno.setText("x");
        btnLimpiarUno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimpiarUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarUnoActionPerformed(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(255, 153, 153));
        btn0.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        btn0.setText("0");
        btn0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(255, 153, 153));
        btn7.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        btn7.setText("7");
        btn7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(255, 153, 153));
        btn8.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        btn8.setText("8");
        btn8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(255, 153, 153));
        btn9.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        btn9.setText("9");
        btn9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpNumerosLayout = new javax.swing.GroupLayout(jpNumeros);
        jpNumeros.setLayout(jpNumerosLayout);
        jpNumerosLayout.setHorizontalGroup(
            jpNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNumerosLayout.createSequentialGroup()
                .addGroup(jpNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpNumerosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnLimpiarR, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpNumerosLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jpNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(jpNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiarUno, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpNumerosLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn1, btn4, btn7, btnTodo});

        jpNumerosLayout.setVerticalGroup(
            jpNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpNumerosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiarR, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiarUno, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpNumerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpNumerosLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn1, btn4, btn7, btnTodo});

        jpOperadores.setBackground(new java.awt.Color(255, 204, 204));

        btnSuma.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btnSuma.setForeground(new java.awt.Color(0, 51, 255));
        btnSuma.setText("+");
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });

        btnResta.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnResta.setForeground(new java.awt.Color(0, 51, 255));
        btnResta.setText("-");
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });

        btnProducto.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnProducto.setForeground(new java.awt.Color(0, 51, 255));
        btnProducto.setText("*");
        btnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoActionPerformed(evt);
            }
        });

        btnDivision.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnDivision.setForeground(new java.awt.Color(0, 51, 255));
        btnDivision.setText("/");
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });

        btnIgual.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnIgual.setForeground(new java.awt.Color(0, 51, 255));
        btnIgual.setText("=");
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btnRaiz.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnRaiz.setForeground(new java.awt.Color(0, 51, 255));
        btnRaiz.setText("R");
        btnRaiz.setToolTipText("Raiz cuadrado de un número");
        btnRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpOperadoresLayout = new javax.swing.GroupLayout(jpOperadores);
        jpOperadores.setLayout(jpOperadoresLayout);
        jpOperadoresLayout.setHorizontalGroup(
            jpOperadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpOperadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpOperadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpOperadoresLayout.createSequentialGroup()
                        .addGroup(jpOperadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSuma)
                            .addComponent(btnResta))
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpOperadoresLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jpOperadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpOperadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnRaiz)
                                .addGroup(jpOperadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnProducto, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnDivision, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(btnIgual, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );

        jpOperadoresLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDivision, btnIgual, btnProducto, btnRaiz, btnResta, btnSuma});

        jpOperadoresLayout.setVerticalGroup(
            jpOperadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpOperadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSuma)
                .addGap(4, 4, 4)
                .addComponent(btnResta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDivision)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRaiz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIgual)
                .addGap(18, 18, 18))
        );

        jpOperadoresLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDivision, btnIgual, btnProducto, btnRaiz, btnResta, btnSuma});

        jpAlgoritmos.setBackground(new java.awt.Color(255, 255, 204));

        btnPrimo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnPrimo.setText("Primo");
        btnPrimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimoActionPerformed(evt);
            }
        });

        btnFactorial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnFactorial.setText("Factorial");
        btnFactorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactorialActionPerformed(evt);
            }
        });

        btnPerfecto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnPerfecto.setText("Perfecto");
        btnPerfecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfectoActionPerformed(evt);
            }
        });

        btnFibonacci.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnFibonacci.setText("Fibonnacci");
        btnFibonacci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFibonacciActionPerformed(evt);
            }
        });

        btnCantPrimos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCantPrimos.setText("CantPrimos");
        btnCantPrimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCantPrimosActionPerformed(evt);
            }
        });

        btnFactorial4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnFactorial4.setText("SumaCif.");
        btnFactorial4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactorial4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpAlgoritmosLayout = new javax.swing.GroupLayout(jpAlgoritmos);
        jpAlgoritmos.setLayout(jpAlgoritmosLayout);
        jpAlgoritmosLayout.setHorizontalGroup(
            jpAlgoritmosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAlgoritmosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpAlgoritmosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPrimo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFactorial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPerfecto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFibonacci, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCantPrimos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFactorial4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jpAlgoritmosLayout.setVerticalGroup(
            jpAlgoritmosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAlgoritmosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPrimo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFactorial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPerfecto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFibonacci)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCantPrimos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFactorial4)
                .addContainerGap(259, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jpOperadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jpAlgoritmos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jpNumeros, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpOperadores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jpAlgoritmos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        txtResul.setText(txtResul.getText() + btn0.getText());
        txtHistorial.setText(txtHistorial.getText() + btn0.getText());
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodoActionPerformed
        txtHistorial.setText("");
    }//GEN-LAST:event_btnTodoActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        txtResul.setText(txtResul.getText() + btn7.getText());
        txtHistorial.setText(txtHistorial.getText() + btn7.getText());
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        txtResul.setText(txtResul.getText() + btn8.getText());
        txtHistorial.setText(txtHistorial.getText() + btn8.getText());
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        txtResul.setText(txtResul.getText() + btn9.getText());
        txtHistorial.setText(txtHistorial.getText() + btn9.getText());
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        txtResul.setText(txtResul.getText() + btn4.getText());
        txtHistorial.setText(txtHistorial.getText() + btn4.getText());
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        txtResul.setText(txtResul.getText() + btn5.getText());
       txtHistorial.setText(txtHistorial.getText() + btn5.getText());
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        txtResul.setText(txtResul.getText() + btn6.getText());
        txtHistorial.setText(txtHistorial.getText() + btn6.getText());
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        txtResul.setText(txtResul.getText() + btn1.getText());
        txtHistorial.setText(txtHistorial.getText() + btn1.getText());
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        txtResul.setText(txtResul.getText() + btn2.getText());
        txtHistorial.setText(txtHistorial.getText() + btn2.getText());
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        txtResul.setText(txtResul.getText() + btn3.getText());
        txtHistorial.setText(txtHistorial.getText() + btn3.getText());
    }//GEN-LAST:event_btn3ActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        operador = '+';
        nro1 = Double.parseDouble(txtResul.getText());
        txtHistorial.setText(txtHistorial.getText() + " + ");
        txtResul.setText("");
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        operador = '-';
        nro1 = Double.parseDouble(txtResul.getText());
        txtHistorial.setText(txtHistorial.getText() + " - ");
        txtResul.setText("");
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed
        operador = '*';
        nro1 = Double.parseDouble(txtResul.getText());
        txtHistorial.setText(txtHistorial.getText() + " * ");
        txtResul.setText("");
    }//GEN-LAST:event_btnProductoActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        operador = '/';
        nro1 = Double.parseDouble(txtResul.getText());
        txtHistorial.setText(txtHistorial.getText() + " / ");
        txtResul.setText("");
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        Double nro2 = Double.parseDouble(txtResul.getText());
        txtResul.setText(String.valueOf(servicio.operar(nro1, nro2, operador)));
        txtHistorial.setText(txtHistorial.getText() + " = " + txtResul.getText());
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnLimpiarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarRActionPerformed
        txtResul.setText("");
        String cadena = txtHistorial.getText();
        txtHistorial.setText(cadena.substring(0, cadena.length() - 1));

    }//GEN-LAST:event_btnLimpiarRActionPerformed

    private void btnLimpiarUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarUnoActionPerformed
        String cadena = txtResul.getText();
//        txtResul.setText(cadena.substring(2));    // esto substrae dos caracteres desde la izquierda    
//        txtResul.setText(cadena.substring(1,3)); // extrae desde el índice 1 hasta el caracter 3       
//        txtResul.setText(cadena.substring(cadena.length()-1,cadena.length()));//sólo tomar el último valor 
        txtResul.setText(cadena.substring(0, cadena.length() - 1));
        cadena = txtHistorial.getText();
        txtHistorial.setText(cadena.substring(0, cadena.length() - 1));
    }//GEN-LAST:event_btnLimpiarUnoActionPerformed

    private void btnPrimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimoActionPerformed
        txtResul.setText(AlgService.primo(Double.parseDouble(txtResul.getText())));
    }//GEN-LAST:event_btnPrimoActionPerformed

    private void btnFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactorialActionPerformed
        txtResul.setText(String.valueOf(AlgService.factorial(Double.parseDouble(txtResul.getText()))));
    }//GEN-LAST:event_btnFactorialActionPerformed

    private void btnRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizActionPerformed
        operador = 'R';
        nro1 = Double.parseDouble(txtResul.getText());
        txtHistorial.setText(txtHistorial.getText() + " sqrt ");
        txtResul.setText("");
    }//GEN-LAST:event_btnRaizActionPerformed

    private void btnPerfectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfectoActionPerformed
        txtResul.setText(String.valueOf(AlgService.perfecto(Double.parseDouble(txtResul.getText()))));
    }//GEN-LAST:event_btnPerfectoActionPerformed

    private void btnFibonacciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFibonacciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFibonacciActionPerformed

    private void btnCantPrimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCantPrimosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCantPrimosActionPerformed

    private void btnFactorial4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactorial4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFactorial4ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnCantPrimos;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnFactorial;
    private javax.swing.JButton btnFactorial4;
    private javax.swing.JButton btnFibonacci;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnLimpiarR;
    private javax.swing.JButton btnLimpiarUno;
    private javax.swing.JButton btnPerfecto;
    private javax.swing.JButton btnPrimo;
    private javax.swing.JButton btnProducto;
    private javax.swing.JButton btnRaiz;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSuma;
    private javax.swing.JButton btnTodo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpAlgoritmos;
    private javax.swing.JPanel jpNumeros;
    private javax.swing.JPanel jpOperadores;
    private javax.swing.JPanel jpResultado;
    private javax.swing.JTextArea txtHistorial;
    private javax.swing.JTextField txtResul;
    // End of variables declaration//GEN-END:variables
}
