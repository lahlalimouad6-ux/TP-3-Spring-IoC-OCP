package metier;

public interface IMetier {
    /**
     * Effectue le traitement métier à partir des données fournies par le DAO.
     * @return le résultat du calcul
     */
    double calcul();
}
