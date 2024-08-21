import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Insert {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/Students";
        String USER = "root";
        String PASSWORD = "Nave10@9";
        try {
            Connection con = DriverManager.getConnection(URL,USER,PASSWORD);
            String insertSQL="INSERT INTO Employee(CUSTOMER_NAME, PRODUCT_NAME, PURCHASE_TYPE, PURCHASE_DATE)VALUES(?,?,?,?)";
            PreparedStatement insertStatement=con.prepareStatement(insertSQL);
            insertStatement.setString(1, "Naveena");
            insertStatement.setString(2, "Product N");
            insertStatement.setString(3, "Cash");
            insertStatement.setDate(4, java.sql.Date.valueOf("2024-08-20"));
            int rowsInserted = insertStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Insert operation completed");
            }

        } 
        catch(SQLException e){
            System.out.println(e);

        }
    }
}
