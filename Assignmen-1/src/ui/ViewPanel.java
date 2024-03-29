/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.ArrayList;
import model.Person;

/**
 *
 * @author Sonureddy
 */
public class ViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPanel
     */
    //Employeehistory
    
    Person person;
    public ViewPanel(Person person) {
        initComponents();
        this.person=person;
        displayPerson();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        numcontact = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtmailaddress = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        numemployeeid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        numage = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtgender = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        startdate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        leveltxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtteaminfo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtpositiontitle = new javax.swing.JTextField();

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel10.setText("Cell Phone number");

        numcontact.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel11.setText("Contact info");

        txtmailaddress.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel2.setText("Name:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel12.setText("Email address:");

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel3.setText("Employee ID:");

        numemployeeid.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel4.setText("Age:");

        numage.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel5.setText("Gender:");

        txtgender.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel6.setText("Start date:");

        startdate.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel7.setText("Level:");

        leveltxt.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel8.setText("Team Info:");

        txtteaminfo.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel9.setText("Position title:");

        txtpositiontitle.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        txtpositiontitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpositiontitleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numcontact)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(leveltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(startdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtName)
                        .addComponent(numemployeeid, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtgender, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtteaminfo)
                        .addComponent(txtpositiontitle)
                        .addComponent(numage, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE))
                    .addComponent(txtmailaddress))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(numemployeeid, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(numage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(startdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(leveltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtteaminfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtpositiontitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(numcontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtmailaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtpositiontitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpositiontitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpositiontitleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField leveltxt;
    private javax.swing.JTextField numage;
    private javax.swing.JTextField numcontact;
    private javax.swing.JTextField numemployeeid;
    private javax.swing.JTextField startdate;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtgender;
    private javax.swing.JTextField txtmailaddress;
    private javax.swing.JTextField txtpositiontitle;
    private javax.swing.JTextField txtteaminfo;
    // End of variables declaration//GEN-END:variables

    private void displayPerson() {
        //rearramge this setter and getter methods
        //display in first video model
        //change the below code
        person.setAge(numage.getText());
        person.setCellphonenumber(numcontact.getText());
        person.setEmailaddress(txtmailaddress.getText());
        person.setEmployeeid(numemployeeid.getText());
        person.setGender(txtgender.getText());
        person.setLevel(leveltxt.getText());
        person.setName(txtName.getText());
        person.setPositiontitle(txtpositiontitle.getText());
        person.setStartdate(startdate.getText());
        person.setTeaminfo(txtteaminfo.getText());
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
