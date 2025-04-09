package business.dao.funds;


import java.time.LocalDate;
import java.util.List;

public interface FundsDao<T> {
    List<T> getAllTransactionHistory();
    double getTotalTransferredAmount(LocalDate from, LocalDate to);
    double getTotalReceivedByAccount(int accountId);
    int countSuccessfulTransactions(LocalDate startDate, LocalDate endDate);
    boolean transferFund(T fund);
}

