package dao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("daoProd")
@Profile("prod")
public class DaoImplProd implements IDao {
    @Override
    public double getValue() {
        return 100.0;
    }
}