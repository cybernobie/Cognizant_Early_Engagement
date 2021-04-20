import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {
    private static Connection connection = null;
    private static Properties properties = new Properties();

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        try {
            FileInputStream fileInputStream = new FileInputStream("database.properties");
            properties.load(fileInputStream);

            Class.forName(properties.getProperty("DB_DRIVER_CLASS"));

            connection = DriverManager.getConnection(
                    properties.getProperty("DB_URL"),
                    properties.getProperty("DB_USERNAME"),
                    properties.getProperty("DB_PASSWORD")
            );
        } catch (IOException e) {
            e.printStackTrace();
        }

        return connection;
    }
}