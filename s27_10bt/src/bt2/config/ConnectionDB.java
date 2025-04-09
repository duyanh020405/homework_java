package bt2.config;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    private final static String url = "jdbc:mysql://localhost:3306/bt2";
    private final static String user = "root";
    private final static String password = "MatKhauMoi123!";
    public static Connection openConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void closeConnection(Connection conn , CallableStatement cstmt ) {
        if(conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        if(cstmt != null) {
            try {
                cstmt.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
