/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BL.BLAlumno;
import BL.BLAsignatura;
import BL.BLDocente;
import BL.BLGrado;
import BL.BLNotas;
import clases.Asignatura;
import clases.Docente;
import clases.Estudiante;
import clases.Grado;
import clases.Nota;
import clases.Paralelo;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alexis Montoya
 */
public class GUINotaEstudiante extends javax.swing.JFrame {

    BLAlumno objBLAlum = new BLAlumno();
    Estudiante objAlum = new Estudiante();
    BLNotas objBLNotas = new BLNotas();
    Nota objNotas = new Nota();
    ArrayList<Nota> ArrayNotas = new ArrayList<>();
    Asignatura objAsig = new Asignatura();
    //BLAsignatura objBLAsig = new BLAsignatura();
    Estudiante objEst = new Estudiante();
    BLAsignatura objBLAsig = new BLAsignatura();
    Docente objDoc = new Docente();
    BLDocente objBLDoc = new BLDocente();
    BLGrado objBLGrado = new BLGrado();
    Grado objGra = new Grado();
    int x = 0;
    int b = 0;
    Object[] columnas = {"id", "Parcial1.1", "Parcial1.2", "Parcial1.3", "Quimestre1", "Parcial2.1", "Parcial2.2", "Parcial2.3",
        "Quimestre2", "Nota final"};

    public GUINotaEstudiante() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cedulanotas = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        combobox = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        combo2 = new javax.swing.JComboBox<>();
        btnOk = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Nota del Estudiante");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Cédula:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        cedulanotas.setBackground(new java.awt.Color(0, 0, 0));
        cedulanotas.setForeground(new java.awt.Color(255, 255, 255));
        cedulanotas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulanotasKeyTyped(evt);
            }
        });
        getContentPane().add(cedulanotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 90, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Grado");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 86, -1, -1));

        combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxActionPerformed(evt);
            }
        });
        getContentPane().add(combobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 140, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnLimpiar.setBackground(new java.awt.Color(102, 102, 102));
        btnLimpiar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnLimpiar.setText("Volver");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar);

        btnSalir.setBackground(new java.awt.Color(102, 102, 102));
        btnSalir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 190, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Asignatura:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        combo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo2ActionPerformed(evt);
            }
        });
        getContentPane().add(combo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 86, -1, -1));

        btnOk.setBackground(new java.awt.Color(102, 102, 102));
        btnOk.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        getContentPane().add(btnOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 440, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxActionPerformed
        try {
            // TODO add your handling code here:
            ListarGrados(objGra);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrarNotas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarNotas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_comboboxActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
                GuiDocentes docent = new GuiDocentes();
                docent.setVisible(true);
                docent.setEnabled(true);
                dispose();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        int res = JOptionPane.showConfirmDialog(this, "Desea salir del sistema?", "", JOptionPane.YES_NO_OPTION);
        if (res == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void combo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo2ActionPerformed
        this.jTable1.removeAll();
        try {
            // TODO add your handling code here:
            ListarNotas();
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarNotas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrarNotas.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.btnLimpiar.setVisible(true);
    }//GEN-LAST:event_combo2ActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        // TODO add your handling code here:
        objDoc.setCedula(this.cedulanotas.getText());
        try {
            x = objBLDoc.Consultar_id(objDoc);
            objDoc.setCodigoCarnet(x);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrarNotas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarNotas.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            b = objBLGrado.Consultar_id(objDoc);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrarNotas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarNotas.class.getName()).log(Level.SEVERE, null, ex);
        }

        objGra.setId(b);

        try {
            ListarAsignaturas(objDoc);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrarNotas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarNotas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnOkActionPerformed

    private void cedulanotasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulanotasKeyTyped
        // TODO add your handling code here:
          char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "ingrese solo numeros");
        }
    }//GEN-LAST:event_cedulanotasKeyTyped

    public void ListarAsignaturas(Docente doc) throws ClassNotFoundException, SQLException {
        ArrayList<Asignatura> listAsig = new ArrayList<Asignatura>();
        Asignatura objasigna = new Asignatura("Asignatura");
        listAsig = objBLAsig.ConsultaLista2(doc);
        DefaultComboBoxModel combo = new DefaultComboBoxModel();
        combo.addElement(objasigna);
        for (Asignatura z : listAsig) {
            combo.addElement(z);
        }
        this.combobox.setModel(combo);
    }

    public void ListarGrados(Grado grado) throws ClassNotFoundException, SQLException {
        ArrayList<Grado> listGrado = new ArrayList<Grado>();
        Grado objasigna = new Grado("Grado",new Paralelo("paralelo"));
        listGrado = objBLGrado.ConsultaLista2(grado);
        DefaultComboBoxModel combo = new DefaultComboBoxModel();
        combo.addElement(objasigna);
        for (Grado z : listGrado) {
            combo.addElement(z);
        }
        this.combo2.setModel(combo);
    }

    public void ListarNotas() throws SQLException, ClassNotFoundException {
            DefaultTableModel modelo = new DefaultTableModel(null, columnas);
        this.jTable1.removeAll();
        String nombre = combobox.getSelectedItem().toString();
        System.out.println(nombre);
        objAsig.setNombre(nombre);
        objAsig.setDocente(objDoc);
        int z = objBLAsig.Consultar_id(objAsig);
        objAsig.setIdasig(z);
        try {
            ArrayNotas = objBLNotas.Consultasig(objAsig);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrarNotas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RegistrarNotas.class.getName()).log(Level.SEVERE, null, ex);
        }

        // añade los objetos a la tabla
        this.jTable1.setModel(modelo);
        for (Nota ObjNota : ArrayNotas) {
            String NewValor[] = {
                String.valueOf(ObjNota.getPar11()),
                String.valueOf(ObjNota.getPar12()),
                String.valueOf(ObjNota.getPar13()),
                String.valueOf(ObjNota.getQuimestre1()),
                String.valueOf(ObjNota.getPar21()),
                String.valueOf(ObjNota.getPar22()),
                String.valueOf(ObjNota.getPar23()),
                String.valueOf(ObjNota.getQuimestre2()),
                String.valueOf(ObjNota.getNotaFinal()),
                String.valueOf(ObjNota.getEstudiante().getCodigoCarnet())};
            modelo.addRow(NewValor);
        }
        this.jTable1.repaint();

    }

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
            java.util.logging.Logger.getLogger(GUINotaEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUINotaEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUINotaEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUINotaEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUINotaEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField cedulanotas;
    private javax.swing.JComboBox<String> combo2;
    private javax.swing.JComboBox<String> combobox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}