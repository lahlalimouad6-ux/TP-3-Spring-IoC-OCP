package metier;

import dao.IDao;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

@Service
public class MetierMultiple implements IMetier {
    private final List<IDao> daos;
    private final Map<String, IDao> daoMap;

    public MetierMultiple(List<IDao> daos, Map<String, IDao> daoMap) {
        this.daos = daos;
        this.daoMap = daoMap;
    }

    @Override
    public double calcul() {
        // Somme de toutes les valeurs
        return daos.stream().mapToDouble(IDao::getValue).sum();
    }
}