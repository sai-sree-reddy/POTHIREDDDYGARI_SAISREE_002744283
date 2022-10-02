/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.EmployeeHistory;
import model.Person;

/**
 *
 * @author Sonur
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    EmployeeHistory history;
    Person person;
    public ViewJPanel(EmployeeHistory history) {
        initComponents();
        
        this.history=history;
        this.person=person;
        Person person=new Person();
        populateTable();
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ViewButton = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        numemployeeid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        numage = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        Searchfeild = new javax.swing.JTextField();
        txtgender = new javax.swing.JLabel();
        gender = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtstartdate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtlabel = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtteaminfo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtpositiontitel = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtcellphone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        employeeidradiobtn = new javax.swing.JRadioButton();
        updatebtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 411, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Employee ID", "Age", "Gender", "Start Date", "Level", "Team Info", "Position title", "Cell Phone number", "Email Address"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 750, 190));

        ViewButton.setText("View");
        ViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewButtonActionPerformed(evt);
            }
        });
        add(ViewButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel3.setText("Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 120, 16));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel4.setText("Employee ID:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 76, -1));

        numemployeeid.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        numemployeeid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numemployeeidActionPerformed(evt);
            }
        });
        add(numemployeeid, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 120, 16));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        jLabel5.setText("Age:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 48, -1));

        numage.setFont(new java.awt.Font("Segoe UI", 0, 9)); // NOI18N
        numage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numageActionPerformed(evt);
            }
        });
        add(numage, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));

        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        Searchfeild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchfeildActionPerformed(evt);
            }
        });
        Searchfeild.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchfeildKeyReleased(evt);
            }
        });
        add(Searchfeild, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 160, -1));

        txtgender.setText("Gender");
        add(txtgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));
        add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, -1, -1));

        jLabel2.setText("Start date");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));
        add(txtstartdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, -1, -1));

        jLabel6.setText("Level");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));
        add(txtlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, -1, -1));

        jLabel7.setText("Team Info");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, -1));
        add(txtteaminfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, -1, -1));

        jLabel8.setText("Poisition title");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, -1, -1));
        add(txtpositiontitel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, -1, -1));

        jLabel9.setText("Cell Phone");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, -1, -1));
        add(txtcellphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, -1, -1));

        jLabel10.setText("email Adrress");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, -1, -1));
        add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, -1, -1));

        employeeidradiobtn.setText("employeeid");
        employeeidradiobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeidradiobtnActionPerformed(evt);
            }
        });
        add(employeeidradiobtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, -1, -1));

        updatebtn.setText("Update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void numemployeeidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numemployeeidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numemployeeidActionPerformed

    private void numageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numageActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
       //Delet action 
       
       int selectedrow=jTable1.getSelectedRow();
       if(selectedrow <0){
           
           JOptionPane.showMessageDialog(this, "Please select row to delete");
           return;
        
       }
       
        DefaultTableModel tablemodel=(DefaultTableModel)jTable1.getModel();
      
    Person selectedemployee=(Person)tablemodel.getValueAt( selectedrow, 0);

   history.deleteemployee(selectedemployee);   
          JOptionPane.showMessageDialog(this, "Employee Information is deleted");
        populateTable();
  
  
// TODO add your handling code here:
    }//GEN-LAST:event_DeleteActionPerformed

    private void SearchfeildKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchfeildKeyReleased
       
         DefaultTableModel tablemodel=(DefaultTableModel)jTable1.getModel();
         String searchtxt=Searchfeild.getText().toLowerCase();
         TableRowSorter<DefaultTableModel> tsr=new TableRowSorter<DefaultTableModel>(tablemodel);
         jTable1.setRowSorter(tsr);
         tsr.setRowFilter(RowFilter.regexFilter(searchtxt));
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchfeildKeyReleased

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchActionPerformed

    private void SearchfeildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchfeildActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchfeildActionPerformed

    private void ViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewButtonActionPerformed
         
          int selectedrow=jTable1.getSelectedRow();
       if(selectedrow <0){
           
           JOptionPane.showMessageDialog(this, "Please select row to delete");
           return;
        
       }
       
        DefaultTableModel tablemodel=(DefaultTableModel)jTable1.getModel();
      
    Person selectedemployee=(Person)tablemodel.getValueAt( selectedrow, 0);
    
    txtName.setText(selectedemployee.getName());
    txtcellphone.setText(selectedemployee.getCellphonenumber());
    txtemail.setText(selectedemployee.getEmailaddress());
    txtgender.setText(selectedemployee.getGender());
    txtlabel.setText(selectedemployee.getLevel());
    txtpositiontitel.setText(selectedemployee.getPositiontitle());
    txtteaminfo.setText(selectedemployee.getTeaminfo());
    
// TODO add your handling code here:
    }//GEN-LAST:event_ViewButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        //After mouse click 
        //update
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void employeeidradiobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeidradiobtnActionPerformed
           
        /*
         DefaultTableModel tablemodel=(DefaultTableModel)jTable1.getModel();
         
         String searchtxt=Searchfeild.getText().toLowerCase();
         TableRowSorter<DefaultTableModel> tsr=new TableRowSorter<DefaultTableModel>(tablemodel);
         jTable1.setRowSorter(tsr);
         tsr.setRowFilter(RowFilter.regexFilter(searchtxt));
*/
         
// TODO add your handling code here:
    }//GEN-LAST:event_employeeidradiobtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed

         int selectedrow=jTable1.getSelectedRow();
       if(selectedrow <0){
           
           JOptionPane.showMessageDialog(this, "Please select row to delete");
           return;
        
       }
       
        DefaultTableModel tablemodel=(DefaultTableModel)jTable1.getModel();
      
    Person selectedemployee=(Person)tablemodel.getValueAt( selectedrow, 0);
    
    String name= txtName.getText();
    String gender=txtgender.getText();
    
    //history.deleteemployee(selectedemployee); 
    Person psn=new Person();
    psn.setGender(gender);
    psn.setName(name);
    
    history.addupdatedemployee(psn);
    tablemodel.setValueAt(name,jTable1.getSelectedRow(),0);
      tablemodel.setValueAt(gender,jTable1.getSelectedRow(),3);
      
     
    
     

   
    
    
    
        // TODO add your handling code here:
    }//GEN-LAST:event_updatebtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton Search;
    private javax.swing.JTextField Searchfeild;
    private javax.swing.JButton ViewButton;
    private javax.swing.JRadioButton employeeidradiobtn;
    private javax.swing.JTextField gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField numage;
    private javax.swing.JTextField numemployeeid;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtcellphone;
    private javax.swing.JTextField txtemail;
    private javax.swing.JLabel txtgender;
    private javax.swing.JTextField txtlabel;
    private javax.swing.JTextField txtpositiontitel;
    private javax.swing.JTextField txtstartdate;
    private javax.swing.JTextField txtteaminfo;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
 
    private void populateTable() {
        
        DefaultTableModel tablemodel=(DefaultTableModel)jTable1.getModel();
        tablemodel.setRowCount(0);
        
        for(Person ps : history.getHistory()){
            Object[] row=new Object[10];
            row[3]=ps.getAge();
            row[1]=ps.getCellphonenumber();
            row[9]=ps.getEmailaddress();
            row[2]=ps.getEmployeeid();
            row[4]=ps.getGender();
            row[6]=ps.getLevel();
            row[5]=ps.getStartdate();
            row[0]=ps;
            row[8]=ps.getPositiontitle();
            //row[9]=ps.getStartdate()
            row[7]=ps.getTeaminfo();
           
            tablemodel.addRow(row);
            
        }
        
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
