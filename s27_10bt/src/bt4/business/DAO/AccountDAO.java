package bt4.business.DAO;

public interface AccountDAO <T>{
    boolean funds(int id_send , int id_receive , int amount );

}
