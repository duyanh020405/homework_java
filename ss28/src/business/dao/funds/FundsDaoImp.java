package business.dao.funds;

import business.config.ConnectionDB;
import business.modle.Fund;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FundsDaoImp implements FundsDao<Fund> {
    @Override
    public List<Fund> getAllTransactionHistory() {
        Connection conn = null;
        CallableStatement cs = null;
        ResultSet rs = null;
        List<Fund> history = new ArrayList<>();

        try {
            conn = ConnectionDB.openConnection();
            cs = conn.prepareCall("{call get_all_funds()}");
            rs = cs.executeQuery();

            while (rs.next()) {
                Fund fund = new Fund();
                fund.setSenderAccountId(rs.getInt("sender_account_id"));
                fund.setSenderName(rs.getString("sender_name"));
                fund.setReceiverAccountId(rs.getInt("receiver_account_id"));
                fund.setReceiverName(rs.getString("receiver_name"));
                fund.setAmount(rs.getBigDecimal("amount"));
                fund.setTransferTime(rs.getTimestamp("transfer_time").toLocalDateTime());
                fund.setInputData(rs.getString("input_data"));
                history.add(fund);
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

        return history;
    }


    @Override
    public double getTotalTransferredAmount(LocalDate from, LocalDate to) {
        Connection conn = null;
        CallableStatement cs = null;
        ResultSet rs = null;
        double total = 0.0;

        try {
            conn = ConnectionDB.openConnection();
            cs = conn.prepareCall("{call total_transferred(?, ?)}");
            cs.setDate(1, Date.valueOf(startDate));
            cs.setDate(2, Date.valueOf(endDate));

            rs = cs.executeQuery();
            if (rs.next()) {
                total = rs.getDouble("total");
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

        return total;
    }


    @Override
    public double getTotalReceivedByAccount(int accountId) {
        Connection conn = null;
        CallableStatement cs = null;
        double totalAmount = 0;

        try {
            conn = ConnectionDB.openConnection();
            cs = conn.prepareCall("{call get_total_received_by_account(?, ?)}");

            cs.setInt(1, accountId);
            cs.registerOutParameter(2, Types.DECIMAL);

            cs.execute();
            totalAmount = cs.getDouble(2);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, cs);
        }

        return totalAmount;
    }


    @Override
    public int countSuccessfulTransactions(LocalDate startDate, LocalDate endDate) {
        Connection conn = null;
        CallableStatement cs = null;
        int count = 0;

        try {
            conn = ConnectionDB.openConnection();
            cs = conn.prepareCall("{call count_successful_transactions(?, ?, ?)}");

            cs.setDate(1, Date.valueOf(startDate));
            cs.setDate(2, Date.valueOf(endDate));
            cs.registerOutParameter(3, Types.INTEGER);

            cs.execute();
            count = cs.getInt(3);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, cs);
        }

        return count;
    }


    @Override
    public boolean transferFund(Fund fund) {
        Connection conn = null;
        CallableStatement cs = null;
        boolean result = false;

        try {
            conn = ConnectionDB.openConnection();
            cs = conn.prepareCall("{call funds_transfer_amount(?, ?, ?, ?, ?, ?)}");

            cs.setInt(1, fund.getSenderAccountId());
            cs.setInt(2, fund.getReceiverAccountId());
            cs.setString(3, fund.getSenderName());
            cs.setString(4, fund.getReceiverName());
            cs.setBigDecimal(5, fund.getAmount());
            cs.registerOutParameter(6, Types.INTEGER); // return_code

            cs.execute();

            int returnCode = cs.getInt(6);
            result = (returnCode == 1); // thành công

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, cs);
        }

        return result;
    }

}
