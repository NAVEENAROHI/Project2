import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Project1{
    public static void main(String[] args){
        String URL="jdbc:mysql://localhost:3306/Students";
        String USER="root";
        String PASSWORD="Nave10@9";
        try{
            Connection con=DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("Success");
            Statement selectStatement=con.createStatement();
             //create table
             String createTableSQL="CREATE TABLE Employee(" 
             +"BillingId INT AUTO_INCREMENT PRIMARY KEY,"
             +"Customer_Name VARCHAR(20) NOT NULL,"
             +"Product_Name VARCHAR(18) NOT NULL,"
             +"Purchase_Type VARCHAR(30) NOT NULL,"
             +"Purchase_date DATE NOT NULL"+")";
             selectStatement.executeUpdate(createTableSQL);
             System.out.println("Table created successfully");
             
            }
        catch(SQLException e){
            System.out.println(e);
        }
    }
}