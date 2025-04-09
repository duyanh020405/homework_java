package bt4.business.DAO;

import bt4.business.DAO.config.ConnectionDB;
import java.sql.CallableStatement;

import java.sql.Connection;
import java.sql.Types;

public class AccountDAOImp implements AccountDAO {

    @Override
    public boolean funds(int id_send, int id_receive, int amount) {
        Connection conn = null;
        CallableStatement stmt = null;
        try {
            conn = ConnectionDB.openConnection();
            stmt = conn.prepareCall("{call funds(?,?,?)}");
            stmt.setInt(1, id_send);
            stmt.setInt(2, id_receive);
            stmt.setInt(3, amount);
            stmt.execute();
            System.out.println("funds successful");
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }

        return false;
    }
}
