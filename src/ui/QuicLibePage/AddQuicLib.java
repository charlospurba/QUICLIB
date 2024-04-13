/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.QuicLibePage;

import service.QuicLibService;

/**
 *
 * @author Charlos
 */
public class AddQuicLib extends javax.swing.JFrame {

    /**
     * Creates new form AddQuicLib
     */
    
    private QuicLibService quicLibService;

    public void setQuicLibService(QuicLibService quicLibService) {
        this.quicLibService = quicLibService;
    }
    
    public AddQuicLib() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblGenre = new javax.swing.JLabel();
        lblJudul = new javax.swing.JLabel();
        lblIsbn = new javax.swing.JLabel();
        txtIsbn = new javax.swing.JTextField();
        txtGenre = new javax.swing.JTextField();
        btnAddQuicLib1 = new javax.swing.JButton();
        lblJlh = new javax.swing.JLabel();
        txtJlh = new javax.swing.JTextField();
        txtJudul = new javax.swing.JTextField();
        cbxStatus = new javax.swing.JComboBox<>();
        lblStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(13, 82, 126));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add QuicLib");

        lblGenre.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblGenre.setForeground(new java.awt.Color(255, 255, 255));
        lblGenre.setText("GENRE");

        lblJudul.setBackground(new java.awt.Color(255, 255, 255));
        lblJudul.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblJudul.setForeground(new java.awt.Color(255, 255, 255));
        lblJudul.setText("JUDUL");

        lblIsbn.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblIsbn.setForeground(new java.awt.Color(255, 255, 255));
        lblIsbn.setText("ISBN");

        txtIsbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIsbnActionPerformed(evt);
            }
        });
        txtIsbn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIsbnKeyReleased(evt);
            }
        });

        txtGenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenreActionPerformed(evt);
            }
        });
        txtGenre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtGenreKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGenreKeyReleased(evt);
            }
        });

        btnAddQuicLib1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnAddQuicLib1.setForeground(new java.awt.Color(41, 124, 148));
        btnAddQuicLib1.setText("Tambah");
        btnAddQuicLib1.setToolTipText("");
        btnAddQuicLib1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAddQuicLib1MouseReleased(evt);
            }
        });
        btnAddQuicLib1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddQuicLib1ActionPerformed(evt);
            }
        });

        lblJlh.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblJlh.setForeground(new java.awt.Color(255, 255, 255));
        lblJlh.setText("JUMLAH HALAMAN");

        txtJudul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJudulActionPerformed(evt);
            }
        });
        txtJudul.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtJudulKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtJudulKeyReleased(evt);
            }
        });

        cbxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semua", "Belum Diarsipkan", "Diarsipkan" }));
        cbxStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxStatusActionPerformed(evt);
            }
        });

        lblStatus.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblStatus.setText("STATUS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                    .addComponent(txtGenre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtIsbn)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAddQuicLib1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addComponent(txtJlh)
                    .addComponent(cbxStatus, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblJlh)
                            .addComponent(lblIsbn)
                            .addComponent(lblJudul)
                            .addComponent(lblGenre)
                            .addComponent(lblStatus))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(txtJudul)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addComponent(lblIsbn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblJudul)
                .addGap(40, 40, 40)
                .addComponent(lblGenre)
                .addGap(12, 12, 12)
                .addComponent(txtGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblJlh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtJlh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(lblStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(btnAddQuicLib1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(173, 173, 173)
                    .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(305, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 323, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIsbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIsbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIsbnActionPerformed

    private void txtIsbnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIsbnKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIsbnKeyReleased

    private void txtGenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenreActionPerformed

    private void txtGenreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGenreKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenreKeyPressed

    private void txtGenreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGenreKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenreKeyReleased

    private void btnAddQuicLib1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddQuicLib1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddQuicLib1MouseReleased

    private void btnAddQuicLib1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddQuicLib1ActionPerformed

        int isbn = Integer.parseInt(txtIsbn.getText());
        String judul = txtJudul.getText();
        String genre = txtGenre.getText();
        int jlh = Integer.parseInt(txtJlh.getText());
        String cbxStat = (String) cbxStatus.getSelectedItem();
        boolean status;
        if (cbxStat.equals("Diarsipkan")) {
            status = true;
        } else {
            status = false;
        }
       quicLibService.addQuicLib(isbn, judul, genre, jlh, status);
       this.dispose();

    }//GEN-LAST:event_btnAddQuicLib1ActionPerformed

    private void txtJudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJudulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJudulActionPerformed

    private void txtJudulKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJudulKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJudulKeyPressed

    private void txtJudulKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJudulKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJudulKeyReleased

    private void cbxStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxStatusActionPerformed

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
            java.util.logging.Logger.getLogger(AddQuicLib.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddQuicLib.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddQuicLib.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddQuicLib.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddQuicLib().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddQuicLib1;
    private javax.swing.JComboBox<String> cbxStatus;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblGenre;
    private javax.swing.JLabel lblIsbn;
    private javax.swing.JLabel lblJlh;
    private javax.swing.JLabel lblJudul;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTextField txtGenre;
    private javax.swing.JTextField txtIsbn;
    private javax.swing.JTextField txtJlh;
    private javax.swing.JTextField txtJudul;
    // End of variables declaration//GEN-END:variables
}
