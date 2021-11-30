
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prave
 */
public class ReturnCar extends javax.swing.JFrame {

    /**
     * Creates new form ReturnCar
     */
    public ReturnCar() {
        initComponents();
    }

    Connection con;
    PreparedStatement pst; 
    PreparedStatement pst1; 
    PreparedStatement pst2; 
    ResultSet rs;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ManageCarBtn = new javax.swing.JButton();
        CustomerBtn = new javax.swing.JButton();
        RentCarBtn = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        label = new javax.swing.JLabel();
        tbCarId = new javax.swing.JTextField();
        label1 = new javax.swing.JLabel();
        tbCustomerId = new javax.swing.JTextField();
        label2 = new javax.swing.JLabel();
        tbDate = new javax.swing.JTextField();
        label3 = new javax.swing.JLabel();
        tbDaysLate = new javax.swing.JTextField();
        label4 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        tbFine = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Return Car");

        jPanel1.setBackground(new java.awt.Color(216, 223, 255));

        ManageCarBtn.setText("Manage Cars");
        ManageCarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageCarBtnActionPerformed(evt);
            }
        });

        CustomerBtn.setText("Customers");
        CustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerBtnActionPerformed(evt);
            }
        });

        RentCarBtn.setText("Rent Car");
        RentCarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RentCarBtnActionPerformed(evt);
            }
        });

        jButton4.setText("Logout");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 34, 205));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Return Car");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RentCarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CustomerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ManageCarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(94, 94, 94)
                .addComponent(ManageCarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(CustomerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(RentCarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rent Car", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Symbol", 0, 12))); // NOI18N

        label.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setText("Car ID");

        tbCarId.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        tbCarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbCarIdActionPerformed(evt);
            }
        });
        tbCarId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbCarIdKeyPressed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label1.setText("Customer Id");

        tbCustomerId.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N

        label2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label2.setText("Due Date");

        tbDate.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N

        label3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        label3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label3.setText("Days Late");

        tbDaysLate.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        tbDaysLate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbDaysLateActionPerformed(evt);
            }
        });

        label4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label4.setText("Fine");

        add.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        add.setText("Return");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        tbFine.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        tbFine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbFineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(label2))
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbFine, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbDate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbDaysLate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbCarId, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbCarId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbDaysLate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbFine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        login lin = new login();
        this.hide();
        lin.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void ManageCarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageCarBtnActionPerformed
        // TODO add your handling code here:
        ManageCars mc = new ManageCars();
        this.hide();
        mc.setVisible(true);
    }//GEN-LAST:event_ManageCarBtnActionPerformed

    private void CustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerBtnActionPerformed
        // TODO add your handling code here:
        Customer cust = new Customer();
        this.hide();
        cust.setVisible(true);
    }//GEN-LAST:event_CustomerBtnActionPerformed

    private void RentCarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RentCarBtnActionPerformed
        // TODO add your handling code here:
        RentCar rent = new RentCar();
        this.hide();
        rent.setVisible(true);
    }//GEN-LAST:event_RentCarBtnActionPerformed

    private void tbFineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbFineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbFineActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:

        try {

            String carId = tbCarId.getText();
            String customerId = tbCustomerId.getText();
            String returndate = tbDate.getText();
            String latedays = tbDaysLate.getText();
            String fine = tbFine.getText();

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/crms", "root", "");

            pst = con.prepareStatement("update car set available = 'Yes' where car_no = ?  ");
            pst.setString(1, carId);
            pst.executeUpdate();

            pst1 = con.prepareStatement("Delete from rent where car_no = ?  ");
            pst1.setString(1, carId);
            pst1.executeUpdate();

            JOptionPane.showMessageDialog(this, "Update Saved !!!!");
            
            tbCarId.setText("");
            tbCustomerId.setText("");
            tbDate.setText("");
            tbDaysLate.setText("");
            tbFine.setText("");
            

        }
        catch (ClassNotFoundException | SQLException ex)
        {
            Logger.getLogger(ReturnCar.class.getName()).log(Level.SEVERE, null, ex);

        }

    }//GEN-LAST:event_addActionPerformed

    private void tbDaysLateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbDaysLateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbDaysLateActionPerformed

    private void tbCarIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbCarIdKeyPressed

        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {

            try {

                String carId =tbCarId.getText();

                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/crms","root","");
                pst = con.prepareStatement("select car_no,customer_id,due_date, DATEDIFF(now(),due_date) as elapse from rent where car_no = ? ");
                pst.setString(1,carId);
                rs = pst.executeQuery();

                if(rs.next()==false)
                {
                    JOptionPane.showMessageDialog(null, "Car No not Found !!!! \n Please Enter a Valid Car ID");
                }
                else
                {
                    String customerId = rs.getString("customer_id");
                    tbCustomerId.setText(customerId.trim());

                    String datedue = rs.getString("due_date");
                    tbDate.setText(datedue.trim());

                    String late = rs.getString("elapse");

                    int daysLate = Integer.parseInt(late);

                    if(daysLate > 0)
                    {
                        tbDaysLate.setText(late);

                        int fine = daysLate * 1000;

                        tbFine.setText(String.valueOf(fine));

                    }
                    else
                    {
                        tbDaysLate.setText("0");
                        tbFine.setText("0");

                    }

                }

            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(ReturnCar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tbCarIdKeyPressed

    private void tbCarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbCarIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbCarIdActionPerformed

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
            java.util.logging.Logger.getLogger(ReturnCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ReturnCar().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CustomerBtn;
    private javax.swing.JButton ManageCarBtn;
    private javax.swing.JButton RentCarBtn;
    private javax.swing.JButton add;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel label;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JTextField tbCarId;
    private javax.swing.JTextField tbCustomerId;
    private javax.swing.JTextField tbDate;
    private javax.swing.JTextField tbDaysLate;
    private javax.swing.JTextField tbFine;
    // End of variables declaration//GEN-END:variables
}
