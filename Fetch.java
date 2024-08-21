import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

 

public class Fetch {

    public static void main(String[] args) {
       String URL = "jdbc:mysql://localhost:3306/Students";
       String USER = "root";
       String PASSWORD = "Nave10@9";
       try {
        Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

        // Read Operation
        String selectSQL = "SELECT * FROM Employee";
        Statement selectStatement = con.createStatement();
        ResultSet resultSet = selectStatement.executeQuery(selectSQL);

        System.out.println("Read operation results:");
        while (resultSet.next()) {
            System.out.println(" Customer Name: " + resultSet.getString("CUSTOMER_NAME") 
                + ", Product Name: " + resultSet.getString("PRODUCT_NAME") 
                + ", Purchase Type: " + resultSet.getString("PURCHASE_TYPE") 
                + ", Purchase Date: " + resultSet.getDate("PURCHASE_DATE"));
        }
    } catch (SQLException e) {
        System.out.println(e);
    }
}
}


