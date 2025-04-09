package service;

import business.dao.account.AccountDao;
import business.dao.account.AccountDaoImp;
import business.modle.Account;

import java.util.List;

public class AccountServiceImp implements AccountService {
    private final AccountDao accountDao;

    public AccountServiceImp() {
        accountDao = new AccountDaoImp();
    }

    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }

    @Override
    public Account save(Account account) {
        return (Account) accountDao.save(account);
    }

    @Override
    public Account update(Account account) {
        return (Account) accountDao.update(account);
    }

    @Override
    public boolean delete(Account account) {
        return accountDao.delete(account);
    }


    @Override
    public int fundsTransfer(int accSenderId, String accSenderName, int accReceiverId, String accReceiverName, double amount) {
        return accountDao.fundsTransfer(accSenderId, accSenderName, accReceiverId, accReceiverName, amount);
    }

    @Override
    public Account findById(int id) {
        return (Account) accountDao.findById(id);
    }


}
