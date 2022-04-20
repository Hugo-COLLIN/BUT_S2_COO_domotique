import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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

    /*
    @Test
    void test_Telecommande_constructeurVide()
    {
        assertNull(telecommande.lampes, "doit etre null");
    }
     */

    @Test
    void test_ajouterLampe_telecVide ()
    {
        Lampe l1 = new Lampe("Cuisine");
        telecommande.ajouterLampe(l1);

        for (Lampe l : telecommande.lampes)
        {
            assertTrue(l.equals(l1), "doit etre vrai");
        }
        
    }

    @Test
    void test_ajouterLampe_telec1Elem ()
    {
        //Initialisation
        List<Lampe> lTest = new ArrayList<Lampe>();
        lTest.add(new Lampe("Cuisine"));
        lTest.add(new Lampe("Salon"));

        for (int i = 0 ; i < lTest.size() ; i ++)
        {
            telecommande.ajouterLampe(lTest.get(i));
            assertTrue(telecommande.lampes.get(i).equals(lTest.get(i)));
        }


        /*
        Lampe l1 = new Lampe("Cuisine");
        telecommande.ajouterLampe(l1);



        for (Lampe l : telecommande.lampes)
        {
            assertTrue(l.equals(l1), "doit etre vrai");
        }
        */
    }

    // REDEFINIR LA METHODE EQUALS DANS LAMPE ?


    /**
     * Test de la methode activerLampe
     * a la position 0 de la liste
     */
    @Test
    void test_activerLampe_pos0() {
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
    void test_activerLampe_pos1() {
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
    void test_desactiverLampe() {
    }

    @Test
    void test_activerTout() {
    }

    @Test
    void test_testToString() {
    }
}