import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/hotel_db";
        String dbUser = "root";
        String dbPassword = "iambatman@hari$h_2oo4"; // Replace with your MySQL password

        try {
            Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
            if (connection != null) {
                System.out.println("✅ JDBC Connection Successful!");
                connection.close();
            }
        } catch (SQLException e) {
            System.out.println("❌ Connection Failed!");
            e.printStackTrace();
        }
    }
}
