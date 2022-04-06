import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelecommandeTest {

    //Atributes
    Telecommande telecommande;


    //Methods
    @BeforeEach
    void preparation ()
    {
        telecommande = new Telecommande();
    }

    @Test
    void test_Telecommande_constructeurVide()
    {
        assertNull(telecommande.lampes, "doit etre null");
    }

    @Test
    void test_ajouterLampe_telecommandeVide ()
    {
        Lampe l1 = new Lampe("Cuisine");
        telecommande.ajouterLampe(l1);

        for (Lampe l : telecommande.lampes)
        {
            assertTrue(l.equals(l1), "doit etre vrai");
        }
        
    }

    @Test
    void activerLampe()
    {

    }

    @Test
    void desactiverLampe() {
    }

    @Test
    void activerTout() {
    }

    @Test
    void testToString() {
    }
}