package dao;

import org.springframework.stereotype.Component;

@Component("daoApi")
public class DaoApi implements IDao {
    @Override
    public double getValue() {
        System.out.println("[DAO] Appel à l'API REST externe");
        return 220.0;
    }
}