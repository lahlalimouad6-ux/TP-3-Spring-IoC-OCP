package test;

import metier.IMetier;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import config.AppConfig;
import static org.junit.Assert.assertEquals;

public class OcpSelectionTest {

    @Test
    public void testDaoImplParDefaut() {
        AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);
        IMetier metier = context.getBean(IMetier.class);
        
        // Si dao.target=dao, le résultat doit être 200.0
        assertEquals(200.0, metier.calcul(), 0.001);
        
        context.close();
    }
}