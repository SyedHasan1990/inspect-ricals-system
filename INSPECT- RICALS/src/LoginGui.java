import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
public class LoginGui extends javax.swing.JFrame {
 Connection c;
   Statement s;
   ResultSet RS;
   PreparedStatement ps;
    /**
     * Creates new form LoginGui
     */
    public LoginGui() throws SQLException {
        initComponents();
        c = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?zeroDateTimeBehavior=convertToNull","root","") ;
            s=c.createStatement();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        USN = new javax.swing.JTextField();
        LOGIN = new javax.swing.JButton();
        exist = new javax.swing.JButton();
        uspss = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EMAIL :");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("WELCOME TO INSPECT RICALS SYSTEM");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel3.setBackground(new java.awt.Color(204, 204, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PASSWORD :");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        LOGIN.setText("LOGIN");
        LOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGINActionPerformed(evt);
            }
        });

        exist.setText("EXIT");
        exist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                existActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(204, 204, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IR.jpg"))); // NOI18N
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel4.setBackground(new java.awt.Color(204, 204, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("FORGOT PASSWORD ?");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jLabel4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel4KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(157, 157, 157))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uspss, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(USN, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(116, 116, 116))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exist)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LOGIN)
                .addGap(149, 149, 149))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(USN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uspss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LOGIN)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exist)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGINActionPerformed
         
          LoginCheck();
  if(USN.getText().equals("") && uspss.getPassword().equals(""))
       LOGIN.setEnabled(false);
    }//GEN-LAST:event_LOGINActionPerformed

    
    
    
    public void LoginCheck()
    {
        try {
             
            RS = s.executeQuery("SELECT * from userdata ");
            
            String User = USN.getText();
             String password = new String(uspss.getPassword());
         //   String roles;
           
            
            while(RS.next()){
                String uname1 = RS.getString("user");
                String pass1=RS.getString("password");
                //RS = s.executeQuery("Select roles from userdata where user='"+uname1+"' and password='"+pass1+"' ");
                
                String role1 = RS.getString("roles");
               
               if ((User.equals(uname1)) && (password.equals(pass1))){
                   JOptionPane.showMessageDialog(null,"CONNECTED");
                 //JOptionPane.showMessageDialog(null, "Welcome To " + role1+"Admin Panel");
                 
                 if(role1.equals("admin"))
                 {
                     this.dispose();
                       JOptionPane.showMessageDialog(null, "Welcome To " + role1+" Panel");
                     systemadmin systm = new systemadmin(null,true);
                     systm.setVisible(true);
                   
                 }
                 if(role1.equals("clerk")){
                  this.dispose();
                    JOptionPane.showMessageDialog(null, "Welcome To " + role1+" Panel");
                  ClerkMenu clrmenu = new ClerkMenu(null,true);
                  clrmenu.setVisible(true);  
                
                 }
                  if(role1.equals("engineer")){
                  this.dispose();
                  JOptionPane.showMessageDialog(null, "Welcome To " + role1+" Panel");
                  ENGRMENU eng = new ENGRMENU(null,true);
                  eng.setVisible(true);  
                  
                 }
                 if(role1.equals("manager")){
                  this.dispose();
                  MANAGERMENU manage = new MANAGERMENU(null,true);
                  manage.setVisible(true);
                 }
               }
                
            }    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"NOT CONNECTED");
        }
    }
    private void existActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_existActionPerformed
       int n = JOptionPane.showConfirmDialog(null,"DO YOU WANT TO LOGOUT ?","",JOptionPane.YES_NO_OPTION);
       
       if(n==JOptionPane.YES_OPTION){
           System.exit(0);
       }
    }//GEN-LAST:event_existActionPerformed

    private void jLabel4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel4KeyPressed
      
    }//GEN-LAST:event_jLabel4KeyPressed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
         FORGOTPASSWORD forgot = new FORGOTPASSWORD(null,true);
        forgot.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

   
    public static void main(String args[]) {
        
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new LoginGui().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(LoginGui.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LOGIN;
    private javax.swing.JTextField USN;
    private javax.swing.JButton exist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField uspss;
    // End of variables declaration//GEN-END:variables
}
