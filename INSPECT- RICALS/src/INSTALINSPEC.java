
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.util.*;
import java.util.Calendar;
import java.util.Date;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maruf
 */
public class INSTALINSPEC extends javax.swing.JDialog {

    /**
     * Creates new form INSTALINSPEC
     */
    public INSTALINSPEC(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
       
        fillComboBox();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        clntlist = new javax.swing.JComboBox<>();
        custadd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        NOR = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        englist = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        work = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        addcod = new javax.swing.JButton();
        rst = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        servicelist = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        custphn = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        bck = new javax.swing.JButton();
        appliances = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        custemail = new javax.swing.JTextField();
        statusord = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        ORD = new datechooser.beans.DateChooserCombo();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CUSTOMERS ORDER");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CLIENT :");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        clntlist.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                clntlistPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        clntlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clntlistActionPerformed(evt);
            }
        });

        custadd.setEnabled(false);
        custadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custaddActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LOCATION :");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        NOR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ROOM(S) :");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("APPLIANCE(S) :");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel6.setBackground(new java.awt.Color(51, 51, 51));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ENGINEER(S):");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        work.setColumns(20);
        work.setRows(5);
        jScrollPane1.setViewportView(work);

        jLabel7.setBackground(new java.awt.Color(51, 51, 51));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("WORK TO ACCOMPLISH :");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        addcod.setText("ADD ORDER");
        addcod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcodActionPerformed(evt);
            }
        });

        rst.setText("RESET");
        rst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rstActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(51, 51, 51));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DATE :");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        servicelist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INSTALLATION", "INSPECTION" }));

        jLabel10.setBackground(new java.awt.Color(51, 51, 51));
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("SERVICE :");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        custphn.setEnabled(false);
        custphn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custphnActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(51, 51, 51));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("PHONE :");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        bck.setText("BACK");
        bck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bckActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(51, 51, 51));
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("STATUS :");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        custemail.setEnabled(false);

        statusord.setText("Pending");
        statusord.setEnabled(false);
        statusord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusordActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(51, 51, 51));
        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("EMAIL :");
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        ORD.setFormat(1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(NOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(englist, 0, 150, Short.MAX_VALUE)
                        .addComponent(appliances)
                        .addComponent(custadd)
                        .addComponent(clntlist, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(statusord, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(custemail, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(servicelist, 0, 150, Short.MAX_VALUE)
                        .addComponent(custphn, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                    .addComponent(ORD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addcod)
                                .addGap(18, 18, 18)
                                .addComponent(rst)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addComponent(bck))
                            .addComponent(jScrollPane1))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(157, 157, 157))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(clntlist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(custadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(appliances, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(englist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(ORD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(servicelist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(custphn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(custemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(statusord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addcod)
                            .addComponent(rst)
                            .addComponent(bck))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addcodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcodActionPerformed
        
            String ClientName = clntlist.getSelectedItem().toString();
            
            String CustAddress = custadd.getText();
            String nor= NOR.getSelectedItem().toString();
            String Appliance = appliances.getText();
            String Engineer = englist.getSelectedItem().toString();
            String dor = ORD.getSelectedDate().toString();
            
           
            String Service = servicelist.getSelectedItem().toString();
            String CustPhone = custphn.getText();
            String CustEmail = custemail.getText();
            String WORK = work.getText();
            String status = statusord.getText();
            
            Connection c;
            PreparedStatement ps;
             
                try{
                    
                    c = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?zeroDateTimeBehavior=convertToNull","root","") ;
                    ps=c.prepareStatement("insert into COD (CLIENT,LOCATION,ROOM,APPLIANCES,ENGINEER,DATE,SERVICE,PHONE,EMAIL,WORK,STATUS) values (?,?,?,?,?,?,?,?,?,?,?)");
                    
                    
                    ps.setString(1,ClientName);
                    ps.setString(2,CustAddress);
                    ps.setString(3,nor);
                    ps.setString(4,Appliance);
                    ps.setString(5,Engineer);
                    ps.setString(6,ORD.getText());
                    
                    
                   
                      ps.setString(7,Service);
                       ps.setString(8,CustPhone);
                       ps.setString(9, CustEmail);
                       ps.setString(10, WORK);
                       ps.setString(11, status);
                    int i = ps.executeUpdate();
                    
                    if(i>0){
                        JOptionPane.showMessageDialog(null,"NEW ORDER ADDED !");
                    } else{
                        JOptionPane.showMessageDialog(null,"ERROR !");
                    }
                    
                }
                catch(SQLException ex){
                    JOptionPane.showMessageDialog(null,ex);
                }
            
                     
    }//GEN-LAST:event_addcodActionPerformed

    public void fillComboBox(){
        Connection c;   
        ResultSet RS1,RS2;
       // PreparedStatement s;
        
        
        try{
            
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?zeroDateTimeBehavior=convertToNull","root","") ;
            String query="select * from customerinfo";
            String query2 = "select * from engnr";
            PreparedStatement ps = c.prepareStatement(query);
            PreparedStatement ps2 = c.prepareStatement(query2);
            RS1 = ps.executeQuery();
             RS2 = ps2.executeQuery();
            
            
            while(RS1.next()){
                clntlist.addItem(RS1.getString("Name"));
                //englist.addItem(RS.getString("NAME"));
                //NOR.addItem(RS.getString("NOR"));
                
            }
            
             while(RS2.next()){
                //clntlist.addItem(RS.getString("Name"));
                englist.addItem(RS2.getString("NAME"));
                //NOR.addItem(RS.getString("NOR"));
                
            }
            
        
        
    } catch(SQLException ex){
        JOptionPane.showMessageDialog(null,ex);
        
    }
    }
    
    private void bckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bckActionPerformed
      
        this.dispose();
        ClerkMenu clrmenu = new ClerkMenu(null,true);
        clrmenu.setVisible(true);
    }//GEN-LAST:event_bckActionPerformed

    private void clntlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clntlistActionPerformed
        
         /* try{
                
        String cstlist = (String)clntlist.getSelectedItem();
        
     
       Connection c=null;   
       String query="select * from customerinfo where NAME=?";
       PreparedStatement ps = c.prepareStatement(query);
       ResultSet rs = ps.executeQuery();
       
       if(rs.next()){
             custadd.setText(rs.getString("ADDRESS"));
                 custphn.setText(rs.getString("PHONE"));
                 custemail.setText(rs.getString("EMAIL"));     
       }
       } catch(SQLException ex){
           JOptionPane.showMessageDialog(null,ex);
       }*/
       
       
       
    }//GEN-LAST:event_clntlistActionPerformed

    private void custaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custaddActionPerformed

    private void custphnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custphnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custphnActionPerformed

    private void clntlistPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_clntlistPopupMenuWillBecomeInvisible
        
        Connection c;
        String tmp = (String)clntlist.getSelectedItem();
        
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?zeroDateTimeBehavior=convertToNull","root","") ;
              String query="select * from customerinfo where NAME=?";
              PreparedStatement ps = c.prepareStatement(query);
              ps.setString(1, tmp);
              ResultSet rs = ps.executeQuery();
              while(rs.next()){
                   custadd.setText(rs.getString("ADDRESS"));
                 custphn.setText(rs.getString("PHONE"));
                 custemail.setText(rs.getString("EMAIL"));     
              }
              
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
           
    }//GEN-LAST:event_clntlistPopupMenuWillBecomeInvisible

    private void rstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rstActionPerformed
        appliances.setText("");
        work.setText("");
    }//GEN-LAST:event_rstActionPerformed

    private void statusordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusordActionPerformed

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
            java.util.logging.Logger.getLogger(INSTALINSPEC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(INSTALINSPEC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(INSTALINSPEC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(INSTALINSPEC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                INSTALINSPEC dialog = new INSTALINSPEC(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> NOR;
    private datechooser.beans.DateChooserCombo ORD;
    private javax.swing.JButton addcod;
    private javax.swing.JTextField appliances;
    private javax.swing.JButton bck;
    private javax.swing.JComboBox<String> clntlist;
    private javax.swing.JTextField custadd;
    private javax.swing.JTextField custemail;
    private javax.swing.JTextField custphn;
    private javax.swing.JComboBox<String> englist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton rst;
    private javax.swing.JComboBox<String> servicelist;
    private javax.swing.JTextField statusord;
    private javax.swing.JTextArea work;
    // End of variables declaration//GEN-END:variables
}