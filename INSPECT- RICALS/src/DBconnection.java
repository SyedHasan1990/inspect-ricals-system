import java.sql.*;
import javax.swing.JOptionPane;
public class DBconnection {
    public static void main(String [] args){
        Statement s;

try {
Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","Marufhasan1990") ;
JOptionPane.showMessageDialog(null,"CONNECTED");



} catch (SQLException ex){
    
JOptionPane.showMessageDialog(null,"CANNOT CONNECT !! ");

 System.out.println(ex);
    }
    }
}