package presentation;

import business.dao.funds.FundsDao;
import business.dao.funds.FundsDaoImp;
import business.config.ConnectionDB;
import business.modle.Fund;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.Scanner;

public class FundsTransferUI {
    public static void displayFundsTransferMenu() {
        try (Scanner scanner = new Scanner(System.in);
             Connection conn = ConnectionDB.openConnection()) {
            FundsDao<Fund> dao = new FundsDaoImp();

            while (true) {
                System.out.println("\n*********** FT MENU ***********");
                System.out.println("1. Lịch sử giao dịch");
                System.out.println("2. Thống kê số tiền chuyển");
                System.out.println("3. Thống kê tiền nhận theo tài khoản");
                System.out.println("4. Số giao dịch thành công");
                System.out.println("5. Thoát");
                System.out.print("Chọn: ");

                switch (scanner.nextInt()) {
                    case 1 -> dao.getAllTransactionHistory().forEach(System.out::println);
                    case 2 -> {
                        LocalDate from = inputDate(scanner, "Nhập ngày bắt đầu (YYYY-MM-DD): ");
                        LocalDate to = inputDate(scanner, "Nhập ngày kết thúc (YYYY-MM-DD): ");
                        System.out.println("Tổng tiền đã chuyển: " + dao.getTotalTransferredAmount(from, to));
                    }
                    case 3 -> {
                        System.out.print("Nhập ID tài khoản: ");
                        int accId = scanner.nextInt();
                        System.out.println("Tổng tiền đã nhận: " + dao.getTotalReceivedByAccount(accId));
                    }
                    case 4 -> {
                        LocalDate from = inputDate(scanner, "Nhập ngày bắt đầu (YYYY-MM-DD): ");
                        LocalDate to = inputDate(scanner, "Nhập ngày kết thúc (YYYY-MM-DD): ");
                        System.out.println("Số giao dịch thành công: " + dao.countSuccessfulTransactions(from, to));
                    }
                    case 5 -> {
                        System.out.println("Thoát chương trình.");
                        return;
                    }
                    default -> System.out.println("Lựa chọn không hợp lệ.");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static LocalDate inputDate(Scanner scanner, String prompt) {
        System.out.print(prompt);
        scanner.nextLine();
        return LocalDate.parse(scanner.nextLine());
    }
}
