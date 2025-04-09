package business.config;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    private static final String URL = "jdbc:mysql://localhost:3306/banking_a";
    private static final String USER = "root";
    private static final String PASSWORD = "MatKhauMoi123!";
    public static Connection openConnection() {
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(URL, USER, PASSWORD);

        }catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void closeConnection(Connection conn , CallableStatement cs) {
        if(conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        if(cs != null) {
            try {
                cs.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
