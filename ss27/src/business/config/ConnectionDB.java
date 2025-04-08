package business.config;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/A";
    private static final String USER_Name = "root";
    private static final String PASSWORD = "MatKhauMoi123!";
    public static Connection oppenConnection() {
        Connection conn = null;
        try{
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USER_Name, PASSWORD);

        }catch (SQLException e) {
            System.out.println("Connection Error with CSDL" + e.getMessage());
        }catch (Exception e){
            System.out.println("Connection Error with " + e.getMessage());
        }
        return conn;
    }
    public static void closeConnection(Connection conn , CallableStatement callSt) {
        if(conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static void main(String[] args) {
        Connection conn = oppenConnection();
        if(conn != null) {
            System.out.println("Thanh cong !");
        }
        else {
            System.out.println("Khong thanh cong !");
        }
    }
}
