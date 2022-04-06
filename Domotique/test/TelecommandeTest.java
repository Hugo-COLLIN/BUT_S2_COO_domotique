import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelecommandeTest {

    @Test
    void test_ajouterLampe_constructeurVide()
    {
        Telecommande t = new Telecommande();
        assertEquals();
    }

    @Test
    void activerLampe_pos0() {
        // Initialisation des valeurs
        Telecommande t = new Telecommande();
        Lampe p = new Lampe("Lampe1");
        t.ajouterLampe(p);

        // Appel de la methode
        t.activerLampe(0);

        // Test si la valeur a bien ete changer
        assertTrue(p.isAllume(), "La lampe ne s'est pas allumee");
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