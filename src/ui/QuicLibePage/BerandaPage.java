/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.QuicLibePage;

/**
 *
 * @author Charlos
 */
public class BerandaPage extends javax.swing.JPanel {

    /**
     * Creates new form Add
     */
    public BerandaPage() {
        initComponents();
    }
    
    public void SetData(String photo){
       
        lblText1.setText("Selamat datang di QuicLib");
        lblText2.setText("Portal literasi modern yang membawa dunia pengetahuan tepat di ujung jari Anda!");
        lblText3.setText("Temukan keajaiban membaca dengan mudah, cepat, dan menyenangkan");
        lblText4.setText("\"QuicLib - Dunia Literasi di Ujung Jari Anda!\"");
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblText1 = new javax.swing.JLabel();
        lblText2 = new javax.swing.JLabel();
        lblText3 = new javax.swing.JLabel();
        lblText4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(13, 82, 126));
        setPreferredSize(new java.awt.Dimension(850, 669));
        setLayout(null);

        lblText1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblText1.setForeground(new java.awt.Color(255, 255, 255));
        lblText1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblText1.setText("Selamat datang di QuicLib");
        lblText1.setFocusTraversalPolicyProvider(true);
        add(lblText1);
        lblText1.setBounds(290, 100, 460, 70);

        lblText2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblText2.setForeground(new java.awt.Color(255, 255, 255));
        lblText2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblText2.setText("Portal literasi modern yang membawa dunia pengetahuan tepat di ujung jari Anda!");
        add(lblText2);
        lblText2.setBounds(200, 260, 680, 30);

        lblText3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblText3.setForeground(new java.awt.Color(255, 255, 255));
        lblText3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblText3.setText("Temukan keajaiban membaca dengan mudah, cepat, dan menyenangkan");
        add(lblText3);
        lblText3.setBounds(250, 290, 590, 30);

        lblText4.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        lblText4.setForeground(new java.awt.Color(255, 255, 255));
        lblText4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblText4.setText("\"QuicLib - Dunia Literasi di Ujung Jari Anda!\"");
        add(lblText4);
        lblText4.setBounds(240, 470, 560, 40);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblText1;
    private javax.swing.JLabel lblText2;
    private javax.swing.JLabel lblText3;
    private javax.swing.JLabel lblText4;
    // End of variables declaration//GEN-END:variables

    public void toFront() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
