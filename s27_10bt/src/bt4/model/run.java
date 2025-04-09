package bt4.model;

import bt4.business.DAO.AccountDAO;
import bt4.service.AccountService;
import bt4.service.AccountServiceImp;

import java.util.Scanner;

public class run {
    public static void main(String[] args) {
        AccountService accountService = new AccountServiceImp();
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
        account.inputData(scanner);

        Account account1 = new Account();
        account1.inputData(scanner);
        System.out.println("Nhap so tien muon chuyen :");
        int amount = scanner.nextInt();

        accountService.funds(account.getId(), account1.getId(),amount);




    }

}
