package dao;

import org.springframework.stereotype.Component;

@Component("daoFile")
public class DaoFile implements IDao {
    @Override
    public double getValue() {
        System.out.println("[DAO] Lecture depuis un fichier local");
        return 180.0;
    }
}