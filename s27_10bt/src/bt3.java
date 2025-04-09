import java.sql.*;
import java.util.Scanner;

public class bt3 {
    private static final String URL = "jdbc:mysql://localhost:3306/my_db_3";
    private static final String USER = "root";
    private static final String PASSWORD = "MatKhauMoi123!";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ID nhân viên cần cập nhật: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập lương mới: ");
        double newSalary = Double.parseDouble(scanner.nextLine());
        updateSalary(id, newSalary);
    }

    public static void updateSalary(int id, double newSalary) {
        String sql = "UPDATE my_db_3.employees SET salary = ? WHERE id = ?";
        try (
                Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
                PreparedStatement ps = conn.prepareStatement(sql)
        ) {
            ps.setDouble(1, newSalary);
            ps.setInt(2, id);
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println(" Cập nhật lương thành công!");
            }
            else {
                System.out.println(" Không tìm thấy nhân viên với ID: " + id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
