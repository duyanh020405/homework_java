package bt4.service;

import bt4.business.DAO.AccountDAO;
import bt4.business.DAO.AccountDAOImp;

public class AccountServiceImp implements AccountService {
    private final AccountDAO accountDAO;

    public AccountServiceImp() {
        accountDAO = new AccountDAOImp();
    }

    @Override
    public boolean funds(int id_send, int id_receive, int amount) {
        return accountDAO.funds(id_send, id_receive, amount);
    }
}
