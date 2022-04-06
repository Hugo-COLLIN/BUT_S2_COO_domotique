import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelecommandeTest {

    @Test
    void test_ajouterLampe_constructeurVide()
    {
        Telecommande t = new Telecommande();
        assertEquals();
    }

    /**
     * Test de la methode activerLampe
     * a la position 0 de la liste
     */
    @Test
    void activerLampe_pos0() {
        // Initialisation des valeurs
        Telecommande t = new Telecommande();
        Lampe p = new Lampe("LampeTest");
        t.ajouterLampe(p);

        // Appel de la methode
        t.activerLampe(0);

        // Test si la valeur a bien ete changer
        assertTrue(p.isAllume(), "La lampe ne s'est pas allumee");
    }

    /**
     * Test de la methode activerLampe
     * a la position 1 de la liste
     */
    @Test
    void activerLampe_pos1() {
        // Initialisation des valeurs
        Telecommande t = new Telecommande();
        Lampe p = new Lampe("LampeTest");
        t.ajouterLampe(new Lampe("LampeUseless"));
        t.ajouterLampe(p);

        // Appel de la methode
        t.activerLampe(1);

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