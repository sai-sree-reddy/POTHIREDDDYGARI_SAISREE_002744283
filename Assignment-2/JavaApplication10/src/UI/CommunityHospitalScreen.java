package UI;



import Model.Hospitals;
import com.sun.net.httpserver.Headers;
import hospitalmanagementsystem.HospitalDirectory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Sonur
 */
public class CommunityHospitalScreen extends javax.swing.JFrame {

    /**
     * Creates new form AddHospital
     */
    public CommunityHospitalScreen() {
        initComponents();
       
        idTextField1.setText(String.valueOf(HospitalDirectory.arrayListLength()));
        communityTextField.setText(CommunityLoginScreen.admincom);
        hospitalHead.setText(CommunityLoginScreen.adminName);
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
        jPanel2 = new javax.swing.JPanel();
        AddHospitalBtn = new javax.swing.JButton();
        DeleteHospitalBtn = new javax.swing.JButton();
        ViewHospitalBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        ParentPanel = new javax.swing.JPanel();
        DeleteHospital = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        deleteCombo = new javax.swing.JComboBox<>();
        deleteText = new javax.swing.JTextField();
        deleteBtn = new javax.swing.JButton();
        ViewHospital = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewHospital = new javax.swing.JTable();
        AddHospital = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        communityTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        contactTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        AddNewHospitalBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        hospitalHead = new javax.swing.JTextField();
        idTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        AddHospitalBtn.setText("Add");
        AddHospitalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddHospitalBtnActionPerformed(evt);
            }
        });

        DeleteHospitalBtn.setText("Delete");
        DeleteHospitalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteHospitalBtnActionPerformed(evt);
            }
        });

        ViewHospitalBtn.setText("View");
        ViewHospitalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewHospitalBtnActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Hospital");

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ViewHospitalBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DeleteHospitalBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddHospitalBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(AddHospitalBtn)
                .addGap(28, 28, 28)
                .addComponent(DeleteHospitalBtn)
                .addGap(28, 28, 28)
                .addComponent(ViewHospitalBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(backButton)
                .addGap(173, 173, 173))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        ParentPanel.setLayout(new java.awt.CardLayout());

        DeleteHospital.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Delete by");

        deleteCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Email" }));

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DeleteHospitalLayout = new javax.swing.GroupLayout(DeleteHospital);
        DeleteHospital.setLayout(DeleteHospitalLayout);
        DeleteHospitalLayout.setHorizontalGroup(
            DeleteHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeleteHospitalLayout.createSequentialGroup()
                .addGroup(DeleteHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DeleteHospitalLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(deleteText, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DeleteHospitalLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(deleteBtn)))
                .addContainerGap(364, Short.MAX_VALUE))
        );
        DeleteHospitalLayout.setVerticalGroup(
            DeleteHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeleteHospitalLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(DeleteHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(deleteBtn)
                .addContainerGap(215, Short.MAX_VALUE))
        );

        ParentPanel.add(DeleteHospital, "card3");

        ViewHospital.setBackground(new java.awt.Color(204, 204, 255));

        viewHospital.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Hospital ID", "Hospital Name", "Hospital Email", "Contact", "Community", "Community Head", "Admin ID", "Admin Name", "Admin Email"
            }
        ));
        jScrollPane1.setViewportView(viewHospital);

        javax.swing.GroupLayout ViewHospitalLayout = new javax.swing.GroupLayout(ViewHospital);
        ViewHospital.setLayout(ViewHospitalLayout);
        ViewHospitalLayout.setHorizontalGroup(
            ViewHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
        );
        ViewHospitalLayout.setVerticalGroup(
            ViewHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
        );

        ParentPanel.add(ViewHospital, "card2");

        AddHospital.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("ID");

        jLabel8.setText("Community");

        communityTextField.setEditable(false);
        communityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityTextFieldActionPerformed(evt);
            }
        });

        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("Hospital Email");

        jLabel3.setText("Hospital Name");

        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        contactTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Hospital Contact");

        AddNewHospitalBtn.setText("ADD");
        AddNewHospitalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewHospitalBtnActionPerformed(evt);
            }
        });

        jLabel6.setText("Community Head");

        hospitalHead.setEditable(false);

        idTextField1.setEditable(false);
        idTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddHospitalLayout = new javax.swing.GroupLayout(AddHospital);
        AddHospital.setLayout(AddHospitalLayout);
        AddHospitalLayout.setHorizontalGroup(
            AddHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddHospitalLayout.createSequentialGroup()
                .addGap(0, 68, Short.MAX_VALUE)
                .addGroup(AddHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddHospitalLayout.createSequentialGroup()
                        .addGroup(AddHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(AddHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(AddHospitalLayout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(37, 37, 37))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddHospitalLayout.createSequentialGroup()
                                    .addGroup(AddHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                    .addGap(49, 49, 49)))
                            .addGroup(AddHospitalLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)))
                        .addGroup(AddHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contactTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(AddHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(idTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                .addComponent(nameTextField)
                                .addComponent(emailTextField))))
                    .addGroup(AddHospitalLayout.createSequentialGroup()
                        .addGroup(AddHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(AddHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(communityTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(hospitalHead))))
                .addContainerGap(453, Short.MAX_VALUE))
            .addGroup(AddHospitalLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(AddNewHospitalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AddHospitalLayout.setVerticalGroup(
            AddHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddHospitalLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(AddHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(contactTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(AddHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(communityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddHospitalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(hospitalHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(AddNewHospitalBtn)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        ParentPanel.add(AddHospital, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ParentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ParentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        CommunityMainScreen sm = new CommunityMainScreen();
        sm.setVisible(true);
        this.setVisible(false);
                // TODO add your handling code here:
    }//GEN-LAST:event_backButtonActionPerformed

    private void ViewHospitalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewHospitalBtnActionPerformed
        DefaultTableModel tableModel = (DefaultTableModel) viewHospital.getModel();
        tableModel.setRowCount(0);
        ArrayList<Hospitals> hospitalDir  = HospitalDirectory.arrayReturn();
        for(int i=0 ; i<HospitalDirectory.arrayListLength();i++){
            if(CommunityLoginScreen.admincom.equals(hospitalDir.get(i).community)){
            Object[] rowData = new Object[]{
                hospitalDir.get(i).id,
                hospitalDir.get(i).name,
                hospitalDir.get(i).email,
                hospitalDir.get(i).community,
                hospitalDir.get(i).contact,
                hospitalDir.get(i).head,
                hospitalDir.get(i).adminId,
                hospitalDir.get(i).adminName,
                hospitalDir.get(i).adminEmail,
                
                          };
            tableModel.addRow(rowData);}
        }
        ParentPanel.removeAll();
        ParentPanel.add(ViewHospital);
        ParentPanel.repaint();
        ParentPanel.revalidate();        // TODO add your handling code here:
    }//GEN-LAST:event_ViewHospitalBtnActionPerformed

    private void DeleteHospitalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteHospitalBtnActionPerformed
        // TODO add your handling code here:
        ParentPanel.removeAll();
        ParentPanel.add(DeleteHospital);
        ParentPanel.repaint();
        ParentPanel.revalidate();
    }//GEN-LAST:event_DeleteHospitalBtnActionPerformed

    private void AddHospitalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddHospitalBtnActionPerformed
        // TODO add your handling code here:
        ParentPanel.removeAll();
        ParentPanel.add(AddHospital);
        ParentPanel.repaint();
        ParentPanel.revalidate();
    }//GEN-LAST:event_AddHospitalBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        String deleteby = deleteCombo.getSelectedItem().toString();
        String del = deleteText.getText();
        if(del.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Fill All The Fields", "Warning",
                JOptionPane.ERROR_MESSAGE);
        }

        //check if user exists
        if (deleteby == "ID"){
            for (Hospitals hospital : HospitalDirectory.arrayReturn()) {
                if(String.valueOf(hospital.id).equals(del)){
                    System.out.println(del);
                    HospitalDirectory.arrayReturn().remove(hospital);
                    JOptionPane.showMessageDialog(this, "Hospital Successfully Deleted", "Warning",
                        JOptionPane.ERROR_MESSAGE);
                    break;
                }
            }
        }else if(deleteby == "Email"){
            for (Hospitals hospital : HospitalDirectory.arrayReturn()){
                if(hospital.email.equals(del)){
                    HospitalDirectory.arrayReturn().remove(hospital);
                    JOptionPane.showMessageDialog(this, "Hospital Successfully Deleted", "Warning",
                        JOptionPane.ERROR_MESSAGE);
                    break;
                }
            }
        }else{
            JOptionPane.showMessageDialog(this, "Hospital does not exists", "Warning",
                JOptionPane.ERROR_MESSAGE);
        }
        deleteText.setText("");
        //idAdminTextField.setText(String.valueOf(HospitalDirectory.arrayListLength()));
        idTextField1.setText(String.valueOf(HospitalDirectory.arrayListLength()));
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void communityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_communityTextFieldActionPerformed

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void contactTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactTextFieldActionPerformed

    private void AddNewHospitalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewHospitalBtnActionPerformed
        // TODO add your handling code here:
        String hospitalName = nameTextField.getText();
        String email = emailTextField.getText();
        String contact = contactTextField.getText();
        String community = communityTextField.getText();
        String Head = hospitalHead.getText();
        // String adminName = aName.getText();
        //String aEmail = adminEmail.getText();
       // String adminPassword = new String(passwordTextField.getPassword());
        String emailPattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        String phonePattern = "(0|91)?[6-9][0-9]{9}";

        String namePattern = "[a-zA-Z_ ]+";

        
        boolean exists = false;
        //check if user exists
        for (Hospitals hospital : HospitalDirectory.arrayReturn()) {
            if (hospital.email.equals(email)) {
                exists = true;
            } else {
                exists = false;
            }
        }

        System.out.println(hospitalName + email + contact  + community);

        if (exists) {
            JOptionPane.showMessageDialog(this, "User already exists", "Warning",
                JOptionPane.ERROR_MESSAGE);
        } else {
            if (hospitalName.isEmpty() || email.isEmpty() || contact.isEmpty() || community.isEmpty() ) {
                JOptionPane.showMessageDialog(this, "Please Fill All The Fields", "Warning",
                    JOptionPane.ERROR_MESSAGE);
            } else if (!hospitalName.matches(namePattern) || !community.matches(namePattern)) {
                JOptionPane.showMessageDialog(this, "Enter correct details", "Warning",
                    JOptionPane.ERROR_MESSAGE);
            } else if (!email.matches(emailPattern)) {
                JOptionPane.showMessageDialog(this, "Enter a Valid Email", "Warning",
                    JOptionPane.ERROR_MESSAGE);
            } else if (!contact.matches(phonePattern)) {
                JOptionPane.showMessageDialog(this, "Enter a Valid Phone Number", "Warning",
                    JOptionPane.ERROR_MESSAGE);
            }else {
                //when all conditions are false
                
                HospitalDirectory.addArrayListItem(HospitalDirectory.arrayListLength() , hospitalName , email, community, contact, Head ,HospitalDirectory.arrayListLength(), adminName, aEmail, adminPassword );
               // idAdminTextField.setText(String.valueOf(HospitalDirectory.arrayListLength()));
                nameTextField.setText("");
                emailTextField.setText("");
                contactTextField.setText("");
                idTextField1.setText(String.valueOf(HospitalDirectory.arrayListLength()));
                //aName.setText("");
                //adminEmail.setText("");
                //passwordTextField.setText("");
            }
        }
    }//GEN-LAST:event_AddNewHospitalBtnActionPerformed

    private void idTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(CommunityHospitalScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CommunityHospitalScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CommunityHospitalScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CommunityHospitalScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CommunityHospitalScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddHospital;
    private javax.swing.JButton AddHospitalBtn;
    private javax.swing.JButton AddNewHospitalBtn;
    private javax.swing.JPanel DeleteHospital;
    private javax.swing.JButton DeleteHospitalBtn;
    private javax.swing.JPanel ParentPanel;
    private javax.swing.JPanel ViewHospital;
    private javax.swing.JButton ViewHospitalBtn;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField communityTextField;
    private javax.swing.JTextField contactTextField;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JComboBox<String> deleteCombo;
    private javax.swing.JTextField deleteText;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField hospitalHead;
    private javax.swing.JTextField idTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTable viewHospital;
    // End of variables declaration//GEN-END:variables
}