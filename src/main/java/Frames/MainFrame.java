/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import com.mycompany.OOP.AttendanceTracking.Attendance;
import com.mycompany.OOP.LeaveManagement.LeaveFrame;
import com.mycompany.OOP.EmployeeVerification.ViewRecordFrame;
import com.mycompany.OOP.EmployeeVerification.AddEmployeeFrame;
import com.mycompany.OOP.EmployeeVerification.DeleteRecordFrame;
import com.mycompany.OOP.PayrollCalculation.PayslipFrame;
import com.mycompany.OOP.UserManagement.LogInFrame;
import com.mycompany.OOP.EmployeeVerification.Employees;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Yennie
 */
public class MainFrame extends javax.swing.JDialog {

    /**
     * Creates new form MainFrame
     * @throws java.io.IOException
     * @throws java.io.FileNotFoundException
     * @throws com.opencsv.exceptions.CsvValidationException
     */
    public MainFrame() throws IOException, FileNotFoundException, CsvValidationException {
        initComponents();
        this.setModalityType(ModalityType.APPLICATION_MODAL);
        
        Employees employees = new Employees();     
        table1.setModel(employees.tableDetails("MotorPH Employee Data.csv"));
        setLocationRelativeTo(null);
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
        table1 = new javax.swing.JTable();
        addbtn = new javax.swing.JButton();
        payslipbtn = new javax.swing.JButton();
        leavebtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        attendancebtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        viewbtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setResizable(false);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table1.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        table1.setForeground(new java.awt.Color(51, 51, 51));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Employee No.", "Last Name", "First Name", "SSS ", "Philhealth", "TIN", "PAGIBIG"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table1.setSelectionBackground(new java.awt.Color(102, 102, 102));
        table1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        table1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(table1);
        if (table1.getColumnModel().getColumnCount() > 0) {
            table1.getColumnModel().getColumn(0).setPreferredWidth(100);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 840, 260));

        addbtn.setBackground(new java.awt.Color(235, 173, 25));
        addbtn.setFont(new java.awt.Font("Thonburi", 0, 12)); // NOI18N
        addbtn.setForeground(new java.awt.Color(255, 255, 255));
        addbtn.setText("Add Record");
        addbtn.setBorder(null);
        addbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddEmployee(evt);
            }
        });
        jPanel2.add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 161, 30));

        payslipbtn.setBackground(new java.awt.Color(235, 173, 25));
        payslipbtn.setFont(new java.awt.Font("Thonburi", 0, 12)); // NOI18N
        payslipbtn.setForeground(new java.awt.Color(255, 255, 255));
        payslipbtn.setText("Generate Payslip");
        payslipbtn.setBorder(null);
        payslipbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PaySlip(evt);
            }
        });
        payslipbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payslipbtnActionPerformed(evt);
            }
        });
        jPanel2.add(payslipbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, 161, 30));

        leavebtn.setBackground(new java.awt.Color(235, 173, 25));
        leavebtn.setFont(new java.awt.Font("Thonburi", 0, 12)); // NOI18N
        leavebtn.setForeground(new java.awt.Color(255, 255, 255));
        leavebtn.setText("Apply for Leave");
        leavebtn.setBorder(null);
        leavebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leavebtnMouseClicked(evt);
            }
        });
        jPanel2.add(leavebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 470, 161, 30));

        deletebtn.setBackground(new java.awt.Color(235, 173, 25));
        deletebtn.setFont(new java.awt.Font("Thonburi", 0, 12)); // NOI18N
        deletebtn.setForeground(new java.awt.Color(255, 255, 255));
        deletebtn.setText("Delete Record");
        deletebtn.setBorder(null);
        deletebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteRecord(evt);
            }
        });
        jPanel2.add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 161, 30));

        exitbtn.setBackground(new java.awt.Color(171, 2, 2));
        exitbtn.setFont(new java.awt.Font("Thonburi", 0, 12)); // NOI18N
        exitbtn.setForeground(new java.awt.Color(255, 255, 255));
        exitbtn.setText("Exit");
        exitbtn.setBorder(null);
        exitbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitbtnMouseClicked(evt);
            }
        });
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });
        jPanel2.add(exitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 550, 161, 30));

        attendancebtn.setBackground(new java.awt.Color(235, 173, 25));
        attendancebtn.setForeground(new java.awt.Color(255, 255, 255));
        attendancebtn.setText("Attendance Record");
        attendancebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendancebtnActionPerformed(evt);
            }
        });
        jPanel2.add(attendancebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 513, 160, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 620));

        viewbtn1.setBackground(new java.awt.Color(235, 173, 25));
        viewbtn1.setFont(new java.awt.Font("Thonburi", 0, 12)); // NOI18N
        viewbtn1.setForeground(new java.awt.Color(255, 255, 255));
        viewbtn1.setText("View and Update Record");
        viewbtn1.setBorder(null);
        viewbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewbtn1MouseClicked(evt);
            }
        });
        jPanel2.add(viewbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 510, 160, 30));

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

    private void DeleteRecord(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteRecord
        Employees employees = new Employees();

        try{
            String en = table1.getModel().getValueAt(table1.getSelectedRow(), 0).toString();

            employees.setemployeenum(table1.getModel().getValueAt(table1.getSelectedRow(), 0).toString());
            employees.setlastname(table1.getModel().getValueAt(table1.getSelectedRow(), 1).toString());
            employees.setfirstname(table1.getModel().getValueAt(table1.getSelectedRow(), 2).toString());
            employees.setsssnum(table1.getModel().getValueAt(table1.getSelectedRow(),3).toString());
            employees.setphnum(table1.getModel().getValueAt(table1.getSelectedRow(), 4).toString());
            employees.settin(table1.getModel().getValueAt(table1.getSelectedRow(), 5).toString());
            employees.setpgbnum(table1.getModel().getValueAt(table1.getSelectedRow(), 6).toString());

            String filename = "MotorPH Employee Data.csv";
            try {
                CSVReader csvreader = new CSVReader(new FileReader(filename));
                String[] line;

                while((line=csvreader.readNext())!=null){
                    if(line[0].equals(en)){
                        employees.setbirthday(line[3]);
                        employees.setaddress(line[4]);
                        employees.setphonenum(line[5]);
                        employees.setstatus(line[10]);
                        employees.setposition(line[11]);
                        employees.setsupervisor(line[12]);
                        employees.setbasic(line[13]);
                        employees.setriceall(line[14]);
                        employees.setphoneall(line[15]);
                        employees.setclotheall(line[16]);
                        employees.setsmrate(line[17]);
                        employees.sethourlyrate(line[18]);
                        break;
                    }
                }
                csvreader.close();

            } catch (FileNotFoundException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException | CsvValidationException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

            DeleteRecordFrame deleteframe = new DeleteRecordFrame(employees);
            deleteframe.setVisible(true);

            try {
                table1.setModel(employees.tableDetails(filename));
            } catch (IOException | CsvValidationException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        catch(ArrayIndexOutOfBoundsException ex){
            JOptionPane.showMessageDialog(this, "Select a row.", "Selection Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_DeleteRecord

    private void leavebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leavebtnMouseClicked
        Employees employees = new Employees();

        try {

            employees.setemployeenum(table1.getModel().getValueAt(table1.getSelectedRow(), 0).toString());
            employees.setlastname(table1.getModel().getValueAt(table1.getSelectedRow(), 1).toString());
            employees.setfirstname(table1.getModel().getValueAt(table1.getSelectedRow(), 2).toString());

            LeaveFrame leaveframe = new LeaveFrame(employees);
            leaveframe.setVisible(true);

        }
        catch(ArrayIndexOutOfBoundsException ex){
            JOptionPane.showMessageDialog(this, "Select a row.", "Selection Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException | CsvValidationException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_leavebtnMouseClicked

    private void PaySlip(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaySlip
        Employees employees = new Employees();

        try{
            String en = table1.getModel().getValueAt(table1.getSelectedRow(), 0).toString();

            employees.setemployeenum(table1.getModel().getValueAt(table1.getSelectedRow(), 0).toString());
            employees.setlastname(table1.getModel().getValueAt(table1.getSelectedRow(), 1).toString());
            employees.setfirstname(table1.getModel().getValueAt(table1.getSelectedRow(), 2).toString());
            employees.setsssnum(table1.getModel().getValueAt(table1.getSelectedRow(),3).toString());
            employees.setphnum(table1.getModel().getValueAt(table1.getSelectedRow(), 4).toString());
            employees.settin(table1.getModel().getValueAt(table1.getSelectedRow(), 5).toString());
            employees.setpgbnum(table1.getModel().getValueAt(table1.getSelectedRow(), 6).toString());

            String filename = "MotorPH Employee Data.csv";
            try {
                CSVReader csvreader = new CSVReader(new FileReader(filename));
                String[] line;

                while((line=csvreader.readNext())!=null){
                    if(line[0].equals(en)){
                        employees.setbirthday(line[3]);
                        employees.setaddress(line[4]);
                        employees.setphonenum(line[5]);
                        employees.setstatus(line[10]);
                        employees.setposition(line[11]);
                        employees.setsupervisor(line[12]);
                        employees.setbasic(line[13]);
                        employees.setriceall(line[14]);
                        employees.setphoneall(line[15]);
                        employees.setclotheall(line[16]);
                        employees.setsmrate(line[17]);
                        employees.sethourlyrate(line[18]);
                        break;
                    }
                }
                csvreader.close();

            } catch (FileNotFoundException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException | CsvValidationException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

            PayslipFrame payslipframe = new PayslipFrame(employees);
            payslipframe.setVisible(true);

        }
        catch(ArrayIndexOutOfBoundsException ex){
            JOptionPane.showMessageDialog(this, "Select a row.", "Selection Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_PaySlip

    private void AddEmployee(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddEmployee
        Employees employees = new Employees();
        AddEmployeeFrame addframe = new AddEmployeeFrame(employees);
        addframe.setVisible(true);
        String filename="MotorPH Employee Data.csv";

        try {
            table1.setModel(employees.tableDetails(filename));
        } catch (IOException | CsvValidationException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_AddEmployee

    private void exitbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitbtnMouseClicked
        dispose();
        LogInFrame login = new LogInFrame();
        login.setVisible(true);
    }//GEN-LAST:event_exitbtnMouseClicked

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitbtnActionPerformed

    private void payslipbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payslipbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payslipbtnActionPerformed

    private void viewbtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewbtn1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_viewbtn1MouseClicked

    private void attendancebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendancebtnActionPerformed
       Attendance attendance = new Attendance(); // Create an instance of the Attendance class
    attendance.setVisible(true); // Make the Attendance frame visible
    this.dispose(); // Close the current frame, optional depending on your requirements
    }//GEN-LAST:event_attendancebtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainFrame().setVisible(true);
                } catch (IOException | CsvValidationException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JButton attendancebtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton exitbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton leavebtn;
    private javax.swing.JButton payslipbtn;
    private javax.swing.JTable table1;
    private javax.swing.JButton viewbtn1;
    // End of variables declaration//GEN-END:variables
}
