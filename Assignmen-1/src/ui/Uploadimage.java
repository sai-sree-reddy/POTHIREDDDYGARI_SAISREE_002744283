/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Sonur
 */
public class Uploadimage extends javax.swing.JPanel {

    /**
     * Creates new form Uploadimage
     */
    public Uploadimage() {
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

        imgbtn = new javax.swing.JButton();
        imgvar = new javax.swing.JLabel();

        imgbtn.setText("upload image");
        imgbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imgbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(imgbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(imgvar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(imgbtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(imgvar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(136, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void imgbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imgbtnActionPerformed
        
       JFileChooser uploadimagefile=new JFileChooser();
       FileNameExtensionFilter ef=new FileNameExtensionFilter("IMAGES","png","jpg","jpeg");
       uploadimagefile.addChoosableFileFilter(ef);
       int opendialogue=uploadimagefile.showOpenDialog(null);
       
       if(opendialogue == JFileChooser.APPROVE_OPTION ){
           File selectedpic=uploadimagefile.getSelectedFile();
           String filepath=selectedpic.getAbsolutePath();
           
           //JOptionPane.showMessageDialog(null, filepath ");
       
           ImageIcon imgi=new ImageIcon(filepath);
           Image image=imgi.getImage().getScaledInstance(imgvar.getWidth(),imgvar.getHeight(),Image.SCALE_SMOOTH );
         imgvar.setIcon(new ImageIcon(image));
       
       }
       
       

// TODO add your handling code here:
    }//GEN-LAST:event_imgbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton imgbtn;
    private javax.swing.JLabel imgvar;
    // End of variables declaration//GEN-END:variables
}
