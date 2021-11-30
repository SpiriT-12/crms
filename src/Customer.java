/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prave
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Customer extends javax.swing.JFrame {

    /**
     * Creates new form Customer
     */
    public Customer() {
        initComponents();
        autoGenCustomerId();
        updateTable();
    }
    
    
    Connection con;
    PreparedStatement pst;
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
        RentCarBtn = new javax.swing.JButton();
        ReturnCarBtn = new javax.swing.JButton();
        LogoutBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        label = new javax.swing.JLabel();
        tbCustomerId = new javax.swing.JTextField();
        label1 = new javax.swing.JLabel();
        tbCustomerName = new javax.swing.JTextField();
        label2 = new javax.swing.JLabel();
        tbMobile = new javax.swing.JTextField();
        label3 = new javax.swing.JLabel();
        tbEmail = new javax.swing.JTextField();
        label4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taAddress = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCustomers = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customers");

        jPanel1.setBackground(new java.awt.Color(216, 223, 255));

        ManageCarBtn.setText("Manage Cars");
        ManageCarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageCarBtnActionPerformed(evt);
            }
        });

        RentCarBtn.setText("Rent Car");
        RentCarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RentCarBtnActionPerformed(evt);
            }
        });

        ReturnCarBtn.setText("Return Car");
        ReturnCarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnCarBtnActionPerformed(evt);
            }
        });

        LogoutBtn.setText("Logout");
        LogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 34, 205));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Customers");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReturnCarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RentCarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ManageCarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(67, 67, 67)
                .addComponent(ManageCarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(RentCarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(ReturnCarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Customer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Symbol", 0, 12))); // NOI18N

        label.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setText("Customer ID");

        tbCustomerId.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        tbCustomerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbCustomerIdActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label1.setText("Customer Name");

        tbCustomerName.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N

        label2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label2.setText("Mobile");

        tbMobile.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N

        label3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        label3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label3.setText("Email");

        tbEmail.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N

        label4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label4.setText("Address");

        taAddress.setColumns(20);
        taAddress.setRows(5);
        jScrollPane2.setViewportView(taAddress);

        jButton1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tbCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tbMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbEmail)))
                .addGap(30, 30, 30))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );

        tableCustomers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Id", "Name", "Mobile", "Email", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableCustomers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCustomersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCustomers);
        if (tableCustomers.getColumnModel().getColumnCount() > 0) {
            tableCustomers.getColumnModel().getColumn(0).setResizable(false);
            tableCustomers.getColumnModel().getColumn(0).setPreferredWidth(22);
            tableCustomers.getColumnModel().getColumn(1).setResizable(false);
            tableCustomers.getColumnModel().getColumn(1).setPreferredWidth(25);
            tableCustomers.getColumnModel().getColumn(2).setResizable(false);
            tableCustomers.getColumnModel().getColumn(2).setPreferredWidth(25);
            tableCustomers.getColumnModel().getColumn(3).setResizable(false);
            tableCustomers.getColumnModel().getColumn(3).setPreferredWidth(60);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtnActionPerformed
        // TODO add your handling code here:
        login lin = new login();
        this.hide();
        lin.setVisible(true);
        
        
        
    }//GEN-LAST:event_LogoutBtnActionPerformed

    private void ManageCarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageCarBtnActionPerformed
        // TODO add your handling code here:
        
        ManageCars mc = new ManageCars();
        this.hide();
        mc.setVisible(true); 
    }//GEN-LAST:event_ManageCarBtnActionPerformed

    private void RentCarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RentCarBtnActionPerformed
        // TODO add your handling code here:
        RentCar rent = new RentCar();
        this.hide();
        rent.setVisible(true);
    }//GEN-LAST:event_RentCarBtnActionPerformed

    private void ReturnCarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnCarBtnActionPerformed
        // TODO add your handling code here:
        ReturnCar rtn = new ReturnCar();
        this.hide();
        rtn.setVisible(true);
    }//GEN-LAST:event_ReturnCarBtnActionPerformed

    private void tableCustomersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCustomersMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_tableCustomersMouseClicked

    private void tbCustomerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbCustomerIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbCustomerIdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         try {   
            String customerid =tbCustomerId.getText();
            String name =tbCustomerName.getText();
            String mobile =tbMobile.getText();
            String email =tbEmail.getText();
            String address =taAddress.getText();  
              
       
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/crms","root","");
            pst = con.prepareStatement("insert into customer (customer_id,customer_name,mobile,email,address)values(?,?,?,?,?)");
            pst.setString(1,customerid);
            pst.setString(2,name);
            pst.setString(3,mobile); 
            pst.setString(4,email); 
            pst.setString(5,address); 
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "New Customer Added Sucsessfully !!!!");
            
             tbCustomerName.setText("");
             taAddress.setText("");
             tbMobile.setText("");
             tbEmail.setText("");
                tbCustomerName.requestFocus();
             autoGenCustomerId();
             updateTable();
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateTable()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/crms","root","");
            pst = con.prepareStatement("select * from customer");
            ResultSet Rs = pst.executeQuery();
            
            ResultSetMetaData smd = Rs.getMetaData();
            int count = smd.getColumnCount();
            
            DefaultTableModel dtf = (DefaultTableModel)tableCustomers.getModel();
            dtf.setRowCount(0);
            
            while(Rs.next())
            {
                Vector v = new Vector();
                
                for(int i=1; i<=count;i++)
                {
                    v.add(Rs.getString("customer_id"));
                    v.add(Rs.getString("customer_name"));
                    v.add(Rs.getString("mobile"));
                    v.add(Rs.getString("email"));
                    v.add(Rs.getString("address"));
                }
                dtf.addRow(v);
            }
            
            
            
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ManageCars.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
        
    public void autoGenCustomerId()
    {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/crms","root","");
            Statement s = con.createStatement();
            
            ResultSet rs = s.executeQuery("select  Max(customer_id) from customer");
            rs.next();
            rs.getString("Max(customer_id)");
            
            if(rs.getString("Max(customer_id)")==null)
            {               
                tbCustomerId.setText("1001");             
            }
            else
            {
                long id =  Long.parseLong(rs.getString("Max(customer_id)"));
                id++;
                tbCustomerId.setText(String.format("%03d", id));                
            }     
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Customer().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogoutBtn;
    private javax.swing.JButton ManageCarBtn;
    private javax.swing.JButton RentCarBtn;
    private javax.swing.JButton ReturnCarBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JTextArea taAddress;
    private javax.swing.JTable tableCustomers;
    private javax.swing.JTextField tbCustomerId;
    private javax.swing.JTextField tbCustomerName;
    private javax.swing.JTextField tbEmail;
    private javax.swing.JTextField tbMobile;
    // End of variables declaration//GEN-END:variables
}