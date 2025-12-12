import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/igosql";
    private static final String USER = "root";
    private static final String PASSWORD = "passk123";

    private static Connection connection = null;

    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            try {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Lidhja u realizua me sukses.");
            } catch (SQLException e) {
                System.out.println("Lidhja deshtoi.");
                throw e;
            }
        }
        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Lidhja perfundoi.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
