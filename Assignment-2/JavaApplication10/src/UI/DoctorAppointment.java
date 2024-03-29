package UI;



import Model.Appointments;
import hospitalmanagementsystem.AppointmentDirectory;
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
public class DoctorAppointment extends javax.swing.JFrame {

    /**
     * Creates new form DoctorAppointmentScreen
     */
    public DoctorAppointment() {
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

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Appointmentsgtable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        deletebasedonid = new javax.swing.JTextField();
        dltbtn = new javax.swing.JButton();
        backtomain = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Appointmentsgtable.setBackground(new java.awt.Color(255, 204, 204));
        Appointmentsgtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Booking ID", "Patient ID", "Patient Name", "Pateint Email", "Doctor Name", "Appointment For", "Booking Date", "Booking Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Appointmentsgtable);

        jLabel1.setText("Enter Booking ID to Delete:");

        deletebasedonid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebasedonidActionPerformed(evt);
            }
        });

        dltbtn.setText("Delete");
        dltbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dltbtnActionPerformed(evt);
            }
        });

        backtomain.setText("Back");
        backtomain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backtomainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(backtomain)
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deletebasedonid, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(dltbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 65, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backtomain)
                    .addComponent(jLabel1)
                    .addComponent(deletebasedonid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dltbtn))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deletebasedonidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebasedonidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deletebasedonidActionPerformed

    private void dltbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dltbtnActionPerformed
        // TODO add your handling code here:
        String del = deletebasedonid.getText();
        boolean found = false;
        if (del.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Fill All The Fields", "Warning",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            for (Appointments appointment : AppointmentDirectory.arrayReturn()) {
                if (String.valueOf(appointment.id).equals(del)) {
                    AppointmentDirectory.arrayReturn().remove(appointment);
                    JOptionPane.showMessageDialog(this, "Doctor Deleted Successfully", "Warning",
                            JOptionPane.ERROR_MESSAGE);
                    found = true;
                    break;
                } else {
                    found=false;
                    JOptionPane.showMessageDialog(this, "Appointment does not exists", "Warning",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        if(found){
            DefaultTableModel tableModel = (DefaultTableModel) Appointmentsgtable.getModel();
            
            for (int i = 0; i < Appointmentsgtable.getRowCount(); i++) {
                if(Appointmentsgtable.getValueAt(i, 0).toString().equals(del) ){
                    tableModel.removeRow(i);
                }
            }
        }
        deletebasedonid.setText("");

    }//GEN-LAST:event_dltbtnActionPerformed

    private void backtomainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backtomainActionPerformed
        // TODO add your handling code here:
        DoctorAppointment da = new DoctorAppointment();
        DoctorMainScreen dm = new DoctorMainScreen();
        da.setVisible(false);
        dm.setVisible(true);
        super.dispose();
    }//GEN-LAST:event_backtomainActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorAppointment().setVisible(true);
                
            }
        });
    }
    public void tableLoad(){
           DefaultTableModel tableModel = (DefaultTableModel) Appointmentsgtable.getModel();
        tableModel.setRowCount(0);
        ArrayList<Appointments> appointmentDirectory = AppointmentDirectory.arrayReturn();
        for (int i = 0; i < AppointmentDirectory.arrayListLength(); i++) {
            Object[] rowData = new Object[]{
                appointmentDirectory.get(i).id,
                appointmentDirectory.get(i).patientID,
                appointmentDirectory.get(i).patientName,
                appointmentDirectory.get(i).patientEmail,
                appointmentDirectory.get(i).appointmentDoctor,
                appointmentDirectory.get(i).reason,
                appointmentDirectory.get(i).date,
                appointmentDirectory.get(i).time,};
            tableModel.addRow(rowData);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Appointmentsgtable;
    private javax.swing.JButton backtomain;
    private javax.swing.JTextField deletebasedonid;
    private javax.swing.JButton dltbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
