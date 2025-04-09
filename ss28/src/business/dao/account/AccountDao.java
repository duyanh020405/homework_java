package business.dao.account;

import java.util.List;

public interface AccountDao <T>{
    List<T> findAll();
    T save(T t);
    T update(T t);
    boolean delete(T t);
    int fundsTransfer(int accSenderId, String accSenderName, int accReceiverId, String accReceiverName, double amount);
    T findById(int id);

}
