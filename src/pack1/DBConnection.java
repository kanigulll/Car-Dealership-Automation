package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/cargallery"; // Veritabanı adını değiştir
    private static final String USER = "root"; // kullanıcı adını değiştir
    private static final String PASSWORD = "root"
    		+ ""; // şifreyi değiştir

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
