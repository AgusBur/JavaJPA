
package Main.igu;

import Main.logica.ControladorLogica;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class CargoDatos extends javax.swing.JFrame {
    
    ControladorLogica control = new ControladorLogica();


    public CargoDatos() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCargaDatos = new javax.swing.JLabel();
        btnIsbn = new javax.swing.JLabel();
        btnTitulo = new javax.swing.JLabel();
        btnEjempTotales = new javax.swing.JLabel();
        btnAnio = new javax.swing.JLabel();
        btnAutor = new javax.swing.JLabel();
        btnEditorial = new javax.swing.JLabel();
        btnEjempPrestados = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        txtIsbn = new javax.swing.JTextField();
        txtAnio = new javax.swing.JTextField();
        txtEjemTotales = new javax.swing.JTextField();
        txtEjemPrestados = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtEditorial = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 102));

        txtCargaDatos.setBackground(new java.awt.Color(255, 204, 102));
        txtCargaDatos.setFont(new java.awt.Font("Dubai Light", 1, 48)); // NOI18N
        txtCargaDatos.setForeground(new java.awt.Color(204, 51, 0));
        txtCargaDatos.setText("Cargar Datos");
        txtCargaDatos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 153), 3, true));

        btnIsbn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnIsbn.setForeground(new java.awt.Color(204, 51, 0));
        btnIsbn.setText("N° ISBN:");
        btnIsbn.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 204, 102), new java.awt.Color(255, 204, 102)));

        btnTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnTitulo.setForeground(new java.awt.Color(204, 51, 0));
        btnTitulo.setText("Título:");
        btnTitulo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 204, 102), new java.awt.Color(255, 204, 102)));

        btnEjempTotales.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEjempTotales.setForeground(new java.awt.Color(204, 51, 0));
        btnEjempTotales.setText("N° Ejempl. Totales:");
        btnEjempTotales.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 204, 102), new java.awt.Color(255, 204, 102)));

        btnAnio.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAnio.setForeground(new java.awt.Color(204, 51, 0));
        btnAnio.setText("Año:");
        btnAnio.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 204, 102), new java.awt.Color(255, 204, 102)));

        btnAutor.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAutor.setForeground(new java.awt.Color(204, 51, 0));
        btnAutor.setText("Autor:");
        btnAutor.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 204, 102), new java.awt.Color(255, 204, 102)));

        btnEditorial.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEditorial.setForeground(new java.awt.Color(204, 51, 0));
        btnEditorial.setText("Editorial:");
        btnEditorial.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 204, 102), new java.awt.Color(255, 204, 102)));

        btnEjempPrestados.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEjempPrestados.setForeground(new java.awt.Color(204, 51, 0));
        btnEjempPrestados.setText("N° Ejempl. Prestados:");
        btnEjempPrestados.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 204, 102), new java.awt.Color(255, 204, 102)));

        txtTitulo.setBackground(new java.awt.Color(255, 255, 255));
        txtTitulo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(0, 0, 0));

        txtIsbn.setBackground(new java.awt.Color(255, 255, 255));
        txtIsbn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtIsbn.setForeground(new java.awt.Color(0, 0, 0));

        txtAnio.setBackground(new java.awt.Color(255, 255, 255));
        txtAnio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtAnio.setForeground(new java.awt.Color(0, 0, 0));

        txtEjemTotales.setBackground(new java.awt.Color(255, 255, 255));
        txtEjemTotales.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtEjemTotales.setForeground(new java.awt.Color(0, 0, 0));

        txtEjemPrestados.setBackground(new java.awt.Color(255, 255, 255));
        txtEjemPrestados.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtEjemPrestados.setForeground(new java.awt.Color(0, 0, 0));

        txtAutor.setBackground(new java.awt.Color(255, 255, 255));
        txtAutor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtAutor.setForeground(new java.awt.Color(0, 0, 0));

        txtEditorial.setBackground(new java.awt.Color(255, 255, 255));
        txtEditorial.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtEditorial.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Descargas\\libreria datos (1).jpg")); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 249, Short.MAX_VALUE)
        );

        btnLimpiar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon("D:\\Descargas\\icono limpiar (2).jpg")); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnGuardar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon("D:\\Descargas\\icono guardar (2).jpg")); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnAtras.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAtras.setIcon(new javax.swing.ImageIcon("D:\\Descargas\\estaflechita.jpeg")); // NOI18N
        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(165, 165, 165))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnEditorial)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEditorial))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAutor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAutor))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnEjempPrestados)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEjemPrestados, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnEjempTotales)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEjemTotales))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnIsbn)
                                    .addComponent(btnTitulo)
                                    .addComponent(btnAnio))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTitulo)
                                    .addComponent(txtIsbn, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                                    .addComponent(txtAnio))))
                        .addGap(56, 56, 56)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(txtCargaDatos)))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(txtCargaDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnIsbn)
                            .addComponent(txtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTitulo)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAnio)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEjempTotales)
                            .addComponent(txtEjemTotales, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEjempPrestados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEjemPrestados))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAutor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEditorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEditorial)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAtras)))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        txtIsbn.setText(" ");
        txtTitulo.setText(" ");
        txtAnio.setText(" ");
        txtEjemTotales.setText(" ");
        txtEjemPrestados.setText(" ");
        txtAutor.setText(" ");
        txtEditorial.setText(" ");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        String isbn = txtIsbn.getText();
        String titulo = txtTitulo.getText();
        int anio = Integer.parseInt(txtAnio.getText());
        int ejempTotales =  Integer.parseInt(txtEjemTotales.getText());
        int ejempPrestados =  Integer.parseInt(txtEjemPrestados.getText());
        String nombreAutor = txtAutor.getText() ;
        String nombreEdito = txtEditorial.getText();

        control.guardarLibro(isbn,titulo,anio,ejempTotales,ejempPrestados,nombreAutor,nombreEdito);

        JOptionPane optionPane = new JOptionPane("Libro guardado!");
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog = optionPane.createDialog("Creación exitosa");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        Principal princ = new Principal();
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAnio;
    private javax.swing.JButton btnAtras;
    private javax.swing.JLabel btnAutor;
    private javax.swing.JLabel btnEditorial;
    private javax.swing.JLabel btnEjempPrestados;
    private javax.swing.JLabel btnEjempTotales;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel btnIsbn;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel btnTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JLabel txtCargaDatos;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtEjemPrestados;
    private javax.swing.JTextField txtEjemTotales;
    private javax.swing.JTextField txtIsbn;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
