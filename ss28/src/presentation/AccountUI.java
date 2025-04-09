package presentation;

import business.modle.Account;
import business.modle.AccountStatus;
import service.AccountService;
import service.AccountServiceImp;

import java.util.List;
import java.util.Scanner;

public class AccountUI {
    public static void main(String[] args) {
        AccountService accountService = new AccountServiceImp();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("*************** ACCOUNT MENU **************");
            System.out.println("1. Danh sách tài khoản");
            System.out.println("2. Tạo tài khoản");
            System.out.println("3. Cập nhật tài khoản"); // Tên + trạng thái
            System.out.println("4. Xóa tài khoản"); // Cập nhật trạng thái là inactive
            System.out.println("5. Chuyển khoản");
            System.out.println("6. Tra cứu số dư tài khoản");
            System.out.println("7. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng nhập số hợp lệ!");
                continue;
            }

            switch (choice) {
                case 1:
                    List<Account> accounts = accountService.findAll();
                    for (Account acc : accounts) {
                        System.out.println(acc.toString());
                    }
                    break;
                case 2:
                    Account newAccount = new Account();
                    newAccount.inputData(scanner);
                    accountService.save(newAccount);
                    break;
                case 3:
                    System.out.println("Nhap id muon chinh sua :");
                    int id = Integer.parseInt(scanner.nextLine());
                    List<Account> accounts_update = accountService.findAll();
                    for (Account acc : accounts_update) {
                        if (acc.getId() == id) {
                            System.out.println("Nhap ten moi chinh sua :");
                            String name = scanner.nextLine();
                            System.out.println("Nhap status muon chinh sua :");
                            String status = scanner.nextLine();
                            if (status.equals("active") || status.equals("inactive") || status.equals("blocked")) {
                                acc.setStatus(AccountStatus.valueOf(status.toUpperCase()));
                                acc.setName(name);
                                accountService.update(acc);
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.print("Nhập ID tài khoản cần xóa: ");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    Account accToDelete = accountService.findById(deleteId);
                    if (accToDelete != null) {
                        accToDelete.setStatus(AccountStatus.INACTIVE);
                        boolean deleted = accountService.delete(accToDelete);
                        if (deleted) {
                            System.out.println("Đã cập nhật trạng thái tài khoản thành 'inactive'.");
                        } else {
                            System.out.println("Không thể cập nhật tài khoản.");
                        }
                    } else {
                        System.out.println("Không tìm thấy tài khoản với ID đã nhập.");
                    }
                    break;


                case 5:
                    fundsTransfer(scanner, accountService);
                    break;

                case 6:
                    System.out.print("Nhập ID tài khoản cần tra cứu số dư: ");
                    int idBalance = Integer.parseInt(scanner.nextLine());
                    Account accBalance = accountService.findById(idBalance);

                    if (accBalance != null) {
                        System.out.println("Tài khoản: " + accBalance.getName());
                        System.out.println("Số dư: " + accBalance.getBalance() + " VND");
                    } else {
                        System.out.println("Không tìm thấy tài khoản.");
                    }
                    break;


                case 7:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.err.println("Vui lòng chọn từ 1 đến 7.");
            }
        } while (true);
    }
    public static void fundsTransfer(Scanner scanner, AccountService accountService) {
        System.out.println("Nhập số tài khoản người gửi:");
        int accSenderId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên tài khoản người gửi:");
        String accSenderName = scanner.nextLine();
        System.out.println("Nhập số tài khoản người nhận:");
        int accReceiverId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên tài khoản người nhận:");
        String accReceiverName = scanner.nextLine();
        System.out.println("Nhập số tiền chuyển:");
        double amount = Double.parseDouble(scanner.nextLine());
        int result = accountService.fundsTransfer(accSenderId, accSenderName, accReceiverId, accReceiverName, amount);
        switch (result) {
            case 1:
                System.err.println("Thông tin tài khoản người gửi không chính xác");
                break;
            case 2:
                System.err.println("Thông tin tài khoản người nhận không chính xác");
                break;
            case 3:
                System.err.println("Số dư tài khoản không đủ để chuyển khoản");
                break;
            case 4:
                System.out.println("Chuyển khoản thành công!!!");
                break;
        }
    }
}
