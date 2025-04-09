package service;

import business.modle.Fund;

import java.time.LocalDate;
import java.util.List;

public class FundsServiceImp implements FundsService {
    private static final FundsServiceImp instance = new FundsServiceImp();
    @Override
    public List<Fund> getAllTransactionHistory() {
        return instance.getAllTransactionHistory();
    }

    @Override
    public double getTotalTransferredAmount(LocalDate from, LocalDate to) {
        return instance.getTotalTransferredAmount(from, to);
    }

    @Override
    public double getTotalReceivedByAccount(int accountId) {
        return instance.getTotalReceivedByAccount(accountId);
    }

    @Override
    public int countSuccessfulTransactions(LocalDate startDate, LocalDate endDate) {
        return instance.countSuccessfulTransactions(startDate, endDate);
    }

    @Override
    public boolean transferFund(Fund fund) {
        return instance.transferFund(fund);
    }
}
