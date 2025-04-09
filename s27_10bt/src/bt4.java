import java.sql.*;
import java.util.Scanner;

public class bt4 {
    private static final String URL = "jdbc:mysql://localhost:3306/my_db_3";
    private static final String USER = "root";
    private static final String PASSWORD = "MatKhauMoi123!";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ID nhân viên cần tra cứu: ");
        int id = Integer.parseInt(scanner.nextLine());

        getEmployeeById(id);
    }
    public static void getEmployeeById(int id) {
        String procedureCall = "{call getEmployeeDetails(?)}";
        try (
                Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
                CallableStatement cs = conn.prepareCall(procedureCall)
        ) {
            cs.setInt(1, id);
            ResultSet rs = cs.executeQuery();
            if (rs.next()) {
                System.out.println("Thong tin cua nhan vien ");
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Tên: " + rs.getString("name"));
                System.out.println("Lương: " + rs.getDouble("salary"));
            } else {
                System.out.println(" Khong tim thay nhan vien: " );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
