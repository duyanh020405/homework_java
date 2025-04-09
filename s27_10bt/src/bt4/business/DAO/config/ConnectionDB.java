package bt4.business.DAO.config;

import java.sql.CallableStatement;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    private static final String URL = "jdbc:mysql://localhost:3306/bt4_ss28";
    private static final String USER = "root";
    private static final String PASSWORD = "MatKhauMoi123!";
    public static Connection openConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return conn;
    }

    public static Connection closeConnection(Connection conn , CallableStatement call) {
        if (call != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        if (call != null) {
            try {
                call.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return conn;
    }

}
