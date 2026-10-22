import config.AppConfig;
import metier.IMetier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Crée le conteneur Spring
        AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

        // Récupère le bean métier
        IMetier metier = context.getBean(IMetier.class);

        // Exécute le calcul
        double resultat = metier.calcul();
        System.out.println("Résultat final : " + resultat);

        // Ferme le conteneur
        context.close();
    }
}