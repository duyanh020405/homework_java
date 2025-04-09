package business.dao.account;

import business.config.ConnectionDB;
import business.modle.Account;
import business.modle.AccountStatus;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountDaoImp implements AccountDao<Account> {
    @Override
    public List<Account> findAll() {
        Connection conn = null;
        CallableStatement cs = null;
        ResultSet rs = null;
        List<Account> accounts = new ArrayList<>();
        try {
            conn = ConnectionDB.openConnection();
            cs = conn.prepareCall("{call get_all_accounts()}");
            rs = cs.executeQuery();

            while (rs.next()) {
                Account acc = new Account();
                acc.setId(rs.getInt("acc_id"));
                acc.setName(rs.getString("acc_name"));
                acc.setBalance(rs.getDouble("acc_balance"));
                acc.setStatus(AccountStatus.valueOf(rs.getString("acc_status").toUpperCase()));
                accounts.add(acc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, cs);
            try {
                if (rs != null) rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return accounts;
    }


    @Override
    public Account save(Account account) {
        Connection conn = null;
        CallableStatement cs = null;
        Account acc = null;
        try{
            conn = ConnectionDB.openConnection();
            cs = conn.prepareCall("{call create_account(?,?,?)}");
            cs.setString(1, account.getName());
            cs.setDouble(2, account.getBalance());
            cs.setString(3, account.getStatus().name());
            cs.executeUpdate();
            return account;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Account update(Account account) {
        Connection conn = null;
        CallableStatement cs = null;
        Account acc = null;
        try{
            conn = ConnectionDB.openConnection();
            cs = conn.prepareCall("{call update_account(?,?,?)}");
            cs.setInt(1, account.getId());
            cs.setString(2, account.getName());
            cs.setString(3, account.getStatus().name());
            cs.executeUpdate();
            return account;
        }
        catch(Exception e){
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public boolean delete(Account account) {
        Connection conn = null;
        CallableStatement cs = null;
        boolean result = false;

        try {
            conn = ConnectionDB.openConnection();
            cs = conn.prepareCall("{call delete_account(?)}");
            cs.setInt(1, account.getId());

            result = cs.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, cs);
        }

        return result;
    }


    @Override
    public int fundsTransfer(int accSenderId, String accSenderName, int accReceiverId, String accReceiverName, double amount) {
        /*
         * 1. Khởi tạo đối tượng Connection
         * 2. Khởi tạo đối tượng CallableStatement
         * 3. Set giá trị cho các tham số vào
         * 4. Đăng ký kiểu dữ liệu cho tham số ra
         * 5. Thực hiện gọi procedure: executeQuery(), executeUpdate(), execute()
         * 6. Xử lý các dữ liệu nhận được
         * */
        Connection conn = null;
        CallableStatement callSt = null;
        try {
            conn = ConnectionDB.openConnection();
            //set autoComit là false
            conn.setAutoCommit(false);
            callSt = conn.prepareCall("{call funds_transfer_amount(?,?,?,?,?,?)}");
            callSt.setInt(1, accSenderId);
            callSt.setString(2, accSenderName);
            callSt.setInt(3, accReceiverId);
            callSt.setString(4, accReceiverName);
            callSt.setDouble(5, amount);
            callSt.registerOutParameter(6, Types.INTEGER);
            callSt.execute();
            conn.commit();
            return callSt.getInt(6);
        } catch (SQLException e) {
            System.err.println("Có lỗi xảy ra trong quá trình chuyển khoản, dữ liệu đã được rollback");
            try {
                conn.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        } catch (Exception e) {
            System.err.println("Có lỗi không xác định khi làm việc với db: " + e.getMessage());
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return 0;
    }

    @Override
    public Account findById(int id) {
        Connection conn = null;
        CallableStatement cs = null;
        ResultSet rs = null;
        Account acc = null;

        try {
            conn = ConnectionDB.openConnection();
            cs = conn.prepareCall("{call find_account_balance_by_id(?)}");
            cs.setInt(1, id);
            rs = cs.executeQuery();

            if (rs.next()) {
                acc = new Account();
                acc.setId(rs.getInt("id"));
                acc.setName(rs.getString("acc_name"));
                acc.setBalance(rs.getDouble("acc_balance"));
                acc.setStatus(AccountStatus.valueOf(rs.getString("acc_status").toUpperCase()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            ConnectionDB.closeConnection(conn, cs);
        }

        return acc;
    }




}
