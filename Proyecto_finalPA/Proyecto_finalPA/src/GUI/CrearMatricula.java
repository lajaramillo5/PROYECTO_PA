/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BL.BLAlumno;
import BL.BLAnio;
import BL.BLGrado;
import BL.BLMatricula;
import BL.BLRepresentante;
import clases.AñoLectivo;
import clases.Estudiante;
import clases.Grado;
import clases.Matricula;
import clases.Paralelo;
import clases.Representante;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexis Montoya
 */
public class CrearMatricula extends javax.swing.JFrame {

    BLAlumno blestu = new BLAlumno();
    Estudiante estu = new Estudiante();
    BLRepresentante blrepre = new BLRepresentante();
    Representante repres = new Representante();
    BLAnio blanio = new BLAnio();
    AñoLectivo anio = new AñoLectivo();
    BLGrado blgra = new BLGrado();
    Grado grado = new Grado();
    BLMatricula blmatri = new BLMatricula();
    Matricula matri = new Matricula();

    public CrearMatricula() throws ClassNotFoundException, SQLException {
        initComponents();
        ListarAños();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        celrepre = new javax.swing.JTextField();
        celest = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Matriculacion");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 11, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Cedula Representante:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 58, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Cedula Estudiante:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 96, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Año_Lectivo:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 134, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Grado:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 172, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 134, -1, -1));

        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 172, -1, -1));

        celrepre.setBackground(new java.awt.Color(0, 0, 0));
        celrepre.setForeground(new java.awt.Color(255, 255, 255));
        celrepre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                celrepreKeyTyped(evt);
            }
        });
        jPanel1.add(celrepre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 58, 90, -1));

        celest.setBackground(new java.awt.Color(0, 0, 0));
        celest.setForeground(new java.awt.Color(255, 255, 255));
        celest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celestActionPerformed(evt);
            }
        });
        celest.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                celestKeyTyped(evt);
            }
        });
        jPanel1.add(celest, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 96, 90, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void ListarAños() throws ClassNotFoundException, SQLException {
        ArrayList<AñoLectivo> lstanios = new ArrayList<>();
        DefaultComboBoxModel dlm = new DefaultComboBoxModel();
        lstanios = blanio.ConsultaLista();
        AñoLectivo objp = new AñoLectivo();
        dlm.addElement(objp);
        for (AñoLectivo p : lstanios) {
            dlm.addElement(p);
        }
        this.jComboBox1.setModel(dlm);
    }

    public void ListarGrados() throws ClassNotFoundException, SQLException {
        ArrayList<Grado> lstgeados = new ArrayList<>();
         int anios = this.jComboBox1.getSelectedIndex();

        anio.setIdaño(anios);
        lstgeados = blgra.ConsultaLista(anio);
        DefaultComboBoxModel dlm = new DefaultComboBoxModel();
        Grado objp = new Grado("Grado",new Paralelo("Paralelo"));
        dlm.addElement(objp);
        for (Grado p : lstgeados) {
            dlm.addElement(p);
        }
        this.jComboBox2.setModel(dlm);
    }

    public boolean validar() {
        if (celest.getText().equals("") && celrepre.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "c", "Asignatura", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        try {
            return true;
        } catch (NullPointerException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "algun dato esta con el formato incorrecto", "Asignatura", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }

    }

    private void limpiar() {
        this.celest.setText("");
        this.celrepre.setText("");

    }

    private void crearMatricula() throws ClassNotFoundException, SQLException {
        estu.setCedula(this.celest.getText());
        try {
            int x = blestu.Consultar_id(estu);
            estu.setCodigoCarnet(x);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CrearMatricula.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CrearMatricula.class.getName()).log(Level.SEVERE, null, ex);
        }
        repres.setCedula(this.celrepre.getText());
        try {
            int y = blrepre.Consultar_id(repres);
            repres.setCodigoCarnet(y);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CrearMatricula.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CrearMatricula.class.getName()).log(Level.SEVERE, null, ex);
        }
        int grados = this.jComboBox2.getSelectedIndex();

        grado.setId(grados);
        int anios = this.jComboBox1.getSelectedIndex();

        anio.setIdaño(anios);

        if (validar()) {
            matri.setAnio(anio);
            matri.setEstu(estu);
            matri.setRepre(repres);
            matri.setGrado(grado);
            blmatri.RegistrarMatricula(matri);
            JOptionPane.showMessageDialog(this, "Se creo la matricula", "Crear Matricula", JOptionPane.INFORMATION_MESSAGE);
            limpiar();

        } else {
            JOptionPane.showMessageDialog(this, "No se pudo Crear la Asignatura", "crear Matricula", JOptionPane.WARNING_MESSAGE);
        }

    }

    private void celestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_celestActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        try {
            // TODO add your handling code here:
            ListarGrados();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CrearMatricula.class
                    .getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(CrearMatricula.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            crearMatricula();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CrearMatricula.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CrearMatricula.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void celrepreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_celrepreKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "ingrese solo numeros");
        }
    }//GEN-LAST:event_celrepreKeyTyped

    private void celestKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_celestKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "ingrese solo numeros");
        }
    }//GEN-LAST:event_celestKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         GUISecretaria secre = new GUISecretaria();
                secre.setEnabled(true);
                secre.setVisible(true);
                dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         InicioSecion inicio = new InicioSecion();
                inicio.setEnabled(true);
                inicio.setVisible(true);
                dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CrearMatricula.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearMatricula.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearMatricula.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearMatricula.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CrearMatricula().setVisible(true);

                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(CrearMatricula.class
                            .getName()).log(Level.SEVERE, null, ex);

                } catch (SQLException ex) {
                    Logger.getLogger(CrearMatricula.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField celest;
    private javax.swing.JTextField celrepre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}