
package javaapplication3;

import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;




public class Login extends javax.swing.JFrame {
     
    long millis=System.currentTimeMillis();  
    java.sql.Date date=new java.sql.Date(millis); 
                    
    public Login() throws SQLException, ClassNotFoundException {
        initComponents();
        showProductList();
                icon();
    }
    ResultSet rs1 =null;
    Statement st1=null;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        IPName = new javax.swing.JTextField();
        IPCat = new javax.swing.JComboBox<>();
        IPPrice = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        IPAdd = new javax.swing.JButton();
        IPDelete = new javax.swing.JButton();
        IPEdit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        IPCF = new javax.swing.JComboBox<>();
        IPFilter = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        IPTable = new javax.swing.JTable();
        IPRefresh = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        IPQty = new javax.swing.JTextField();
        imgUrl = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        des = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("eres");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));
        jPanel1.setForeground(new java.awt.Color(204, 0, 0));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setForeground(new java.awt.Color(102, 255, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Stock Management");

        IPCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sport", "Casual", "Formal" }));

        jLabel2.setText("P_Name");

        jLabel3.setText("Catogory");

        jLabel4.setText("Price");

        IPAdd.setBackground(new java.awt.Color(153, 255, 153));
        IPAdd.setText("ADD PRODUCT");
        IPAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IPAddActionPerformed(evt);
            }
        });

        IPDelete.setBackground(new java.awt.Color(255, 102, 102));
        IPDelete.setText("DELETE");
        IPDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IPDeleteActionPerformed(evt);
            }
        });

        IPEdit.setBackground(new java.awt.Color(102, 102, 255));
        IPEdit.setText("MODIFY PRODUCT");
        IPEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IPEditActionPerformed(evt);
            }
        });

        jLabel5.setText("Item management");

        IPCF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sport", "Casual", "Formal" }));
        IPCF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IPCFActionPerformed(evt);
            }
        });

        IPFilter.setBackground(new java.awt.Color(153, 255, 255));
        IPFilter.setText("Filter");
        IPFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IPFilterActionPerformed(evt);
            }
        });

        IPTable.setAutoCreateRowSorter(true);
        IPTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        IPTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IPTableMouseClicked(evt);
            }
        });
        IPTable.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                IPTablePropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(IPTable);

        IPRefresh.setText("Refresh");
        IPRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IPRefreshActionPerformed(evt);
            }
        });

        jLabel6.setText("Qty");

        imgUrl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imgUrlActionPerformed(evt);
            }
        });

        jLabel7.setText("imgUrl");

        des.setColumns(20);
        des.setRows(5);
        jScrollPane2.setViewportView(des);

        jLabel8.setText("Description");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(IPDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IPEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(IPCF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(IPFilter)
                .addGap(18, 18, 18)
                .addComponent(IPRefresh)
                .addGap(156, 156, 156))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(228, 228, 228))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IPName, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(imgUrl, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(IPQty, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(IPPrice, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(IPCat, javax.swing.GroupLayout.Alignment.LEADING, 0, 170, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(IPAdd)
                        .addGap(60, 60, 60)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IPDelete)
                    .addComponent(IPEdit)
                    .addComponent(IPFilter)
                    .addComponent(IPRefresh)
                    .addComponent(IPCF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IPName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IPCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IPPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(IPQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(imgUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(IPAdd)
                        .addGap(38, 38, 38))))
        );

        jButton2.setBackground(new java.awt.Color(102, 102, 255));
        jButton2.setText("Billing");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 153));
        jButton3.setText("Log Out");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 255, 0));
        jButton5.setText("Sales");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jButton2)
                        .addGap(32, 32, 32)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void icon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
    }
    int prodId;
    private int coutProd(){
      
        try{
       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/node","root","acciojob");
          //  Connection con = DriverManager.getConnection("jdbc:mysql://db4free.net/node_verse","rajaraman","Sql@2022");
            st1 = con.createStatement();
            rs1 =st1.executeQuery("SELECT MAX(ID) FROM products");
            rs1.next();
            prodId =rs1.getInt(1)+1;
            
        }catch(SQLException e){
            
        }
        return prodId;
    }
    private void showProductList() throws SQLException, ClassNotFoundException{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/node","root","acciojob");
           // Connection con = DriverManager.getConnection("jdbc:mysql://db4free.net/node_verse","rajaraman","Sql@2022");
            Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM node.products");
            IPTable.setModel(DbUtils.resultSetToTableModel(rs));     // set result to table     
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          dispose();
               selling emp = new selling();
               emp.show();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void IPAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IPAddActionPerformed
        // TODO add your handling code here:
        if(IPName.getText().isEmpty()|| IPCat.getSelectedIndex()== -1 || IPPrice.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Hello, Some Input Missing, i will wait fix and come back");  
        }else{
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/node","root","acciojob");
) {
                   int id =coutProd();
                    PreparedStatement pst = con.prepareStatement("INSERT INTO products VALUES(?,?,?,?,?,?,?,?,?,?)"); 
                    pst.setInt(1, id);
                    pst.setString(2, IPName.getText());
                    pst.setDouble(3,Double.parseDouble( IPPrice.getText()) );
                    pst.setInt(4,Integer.parseInt(IPQty.getText()) );
                    pst.setInt(5, IPCat.getSelectedIndex());
                    pst.setString(6, imgUrl.getText());
                    pst.setString(7,des.getText());
                    pst.setDate(8, date);
                    pst.setDate(9, date);
                    pst.setInt(10,1);
                    pst.executeUpdate();
                    IPName.setText("");
                    IPPrice.setText("");
                    con.close();
                    showProductList();
                }
                JOptionPane.showMessageDialog(this,"Product Added"); ;
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_IPAddActionPerformed

    private void IPTablePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_IPTablePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_IPTablePropertyChange
    int key;
    private void IPTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IPTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) IPTable.getModel();
        int index = IPTable.getSelectedRow();
        key =Integer.parseInt(model.getValueAt(index,0).toString());
        IPName.setText(model.getValueAt(index, 1).toString());
        IPPrice.setText(model.getValueAt(index, 2).toString());
        
        imgUrl.setText(model.getValueAt(index, 5).toString());
        des.setText(model.getValueAt(index, 6).toString());
        IPQty.setText(model.getValueAt(index, 3).toString());
        
    }//GEN-LAST:event_IPTableMouseClicked

    private void IPEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IPEditActionPerformed
        // TODO add your handling code here:
               if(IPName.getText().isEmpty()|| IPCat.getSelectedIndex()== -1 || IPPrice.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Hello, Some Input Missing, i will wait fix and come back");  
        }else{
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                try (            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/node","root","acciojob");
) {
                    PreparedStatement pst = con.prepareStatement("UPDATE products SET ID=?,title=?,price=?,Qty=?,catogory=?,imgUrl=?,description=?,createdAt=?,updatedAt=?,userId=? WHERE ID = '"+key+"' ");
                    pst.setInt(1, key);
                    pst.setString(2, IPName.getText());
                    pst.setDouble(3,Double.parseDouble( IPPrice.getText()) );
                    pst.setInt(4,Integer.parseInt(IPQty.getText()) );
                    pst.setInt(5, IPCat.getSelectedIndex());
                    pst.setString(6, imgUrl.getText());
                    pst.setString(7,des.getText());
                    pst.setDate(8, date);
                    pst.setDate(9, date);
                    pst.setInt(10,1);
                    pst.executeUpdate();
                     showProductList();
                }
                JOptionPane.showMessageDialog(this,"Product Updated"); ;
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            } 
        
     }   
    }//GEN-LAST:event_IPEditActionPerformed

    private void IPDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IPDeleteActionPerformed
        // TODO add your handling code here:
                if(IPName.getText().isEmpty()|| IPCat.getSelectedIndex()== -1 || IPPrice.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Hello, Some Input Missing, i will wait fix and come back");  
        }else{
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                try (            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/node","root","acciojob");
) {
                    PreparedStatement pst = con.prepareStatement("DELETE FROM products WHERE ID = '"+key+"' ");
                   pst.executeUpdate();
                    IPName.setText("");
                    IPPrice.setText("");
                     showProductList();
                }
                JOptionPane.showMessageDialog(this,"Product Deleted"); ;
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            } 
        
     }   
    }//GEN-LAST:event_IPDeleteActionPerformed

    private void IPFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IPFilterActionPerformed
        try{// TODO add your handling code here:
         Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/node","root","Sql@2022");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/node","root","acciojob");

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM products WHERE catogory='"+IPCF.getSelectedIndex()+"'");
            IPTable.setModel(DbUtils.resultSetToTableModel(rs));
        }catch (ClassNotFoundException | SQLException e){
            System.out.print(e);
        }
    }//GEN-LAST:event_IPFilterActionPerformed

    private void IPRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IPRefreshActionPerformed
        try {
            // TODO add your handling code here:
            showProductList();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_IPRefreshActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         new userlogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        SalesList sale = new SalesList();
        sale.show();
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void IPCFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IPCFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IPCFActionPerformed

    private void imgUrlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imgUrlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imgUrlActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Login().setVisible(true);
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IPAdd;
    private javax.swing.JComboBox<String> IPCF;
    private javax.swing.JComboBox<String> IPCat;
    private javax.swing.JButton IPDelete;
    private javax.swing.JButton IPEdit;
    private javax.swing.JButton IPFilter;
    private javax.swing.JTextField IPName;
    private javax.swing.JTextField IPPrice;
    private javax.swing.JTextField IPQty;
    private javax.swing.JButton IPRefresh;
    private javax.swing.JTable IPTable;
    private javax.swing.JTextArea des;
    private javax.swing.JTextField imgUrl;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
