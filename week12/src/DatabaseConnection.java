import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/se3317-lab12";
    private static final String USER = "root";
    private static final String PASSWORD = "12345678";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void initializeDatabase() {
        String createDB = "CREATE DATABASE IF NOT EXISTS student_db;";
        String useDB = "USE student_db;";
        String createTable = """
                CREATE TABLE IF NOT EXISTS students (
                    student_id VARCHAR(20) PRIMARY KEY,
                    first_name VARCHAR(50) NOT NULL,
                    last_name VARCHAR(50) NOT NULL,
                    email VARCHAR(100) UNIQUE NOT NULL,
                    phone VARCHAR(15),
                    date_of_birth DATE,
                    gender VARCHAR(10),
                    address TEXT,
                    course VARCHAR(50),
                    semester VARCHAR(20),
                    registration_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
                );
                """;

        try (Connection conn = new DatabaseConnection().getConnection();
             Statement stmt = conn.createStatement()) {
            stmt.execute(createDB);
            stmt.execute(useDB);
            stmt.execute(createTable);
            System.out.println("Database initialized successfully");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "Database initialization failed: " + e.getMessage(),
                    "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
