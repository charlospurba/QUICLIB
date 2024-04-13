/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.QuicLibePage;

/**
 *
 * @author Charlos
 */
public class AboutPage extends javax.swing.JPanel {

    /**
     * Creates new form About
     */
    public AboutPage() {
        initComponents();
    }
    
    public void SetData(String photo, String nim, String name){
        
        lblPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource(photo)));
        lblNim.setText(nim);
        lblName.setText(name);
        
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
        lblPhoto = new javax.swing.JLabel();
        lblNim = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(29, 59, 95));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("About Me");

        lblPhoto.setBackground(new java.awt.Color(255, 255, 255));
        lblPhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPhoto.setOpaque(true);

        lblNim.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblNim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNim.setText("{nim}");

        lblName.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("{name}");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1143, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(401, 401, 401)
                                .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(282, 282, 282)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNim, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(lblNim)
                .addGap(26, 26, 26)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(187, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNim;
    private javax.swing.JLabel lblPhoto;
    // End of variables declaration//GEN-END:variables

    
}
