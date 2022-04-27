import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TelecommandeTest
{
    //Atributes
    private Telecommande t;
    private Lampe p;


    //Methods
    @BeforeEach
    void preparation ()
    {
        t = new Telecommande();
    }

    //ajouterLampe()
    /**
     * Teste l'ajout d'une lampe a une
     * telecommande vide
     */
    @Test
    public void test_ajouter_telecVide ()
    {
        p = new Lampe("Cuisine");
        t.ajouter(p);

        for (Controllable l : t.lampes)
        {
            assertEquals(l, p, "doit etre vrai");
        }
    }

    /**
     * Teste l'ajout d'une lampe a une
     * telecommande contenant deja 1 lampe
     */
    @Test
    public void test_ajouter_telec1Elem ()
    {
        //Initialisation
        List<Lampe> lTest = new ArrayList<Lampe>();
        lTest.add(new Lampe("Cuisine"));
        lTest.add(new Lampe("Salon"));
        
        //Ajout lampe et test
        for (int i = 0 ; i < lTest.size() ; i ++)
        {
            t.ajouter(lTest.get(i));
            assertEquals(t.lampes.get(i), lTest.get(i));
        }
    }


    //activer()
    /**
     * Test que la methode activer
     * allume la lampe a la position 0
     * de la liste
     */
    @Test
    public void test_activer_pos0 ()
    {
        // Initialisation des valeurs
        p = new Lampe("LampeTest");
        t.ajouter(p);

        // Appel de la methode
        t.activer(0);

        // Test si la valeur a bien ete changee
        assertTrue(p.isAllume(), "La lampe ne s'est pas allumee");
    }

    /**
     * Test que la methode activer
     * allume la lampe a la position 1
     * de la liste
     */
    @Test
    public void test_activer_pos1 ()
    {
        // Initialisation des valeurs
        p = new Lampe("LampeTest");
        t.ajouter(new Lampe("LampeUseless"));
        t.ajouter(p);

        // Appel de la methode
        t.activer(1);

        // Test si la valeur a bien ete changee
        assertTrue(p.isAllume(), "La lampe ne s'est pas allumee");
    }

    /**
     * Test que la methode activer
     * renvoie une erreur si la lampe
     * n'existe pas dans la liste
     */
    @Test
    public void test_activer_inexistant ()
    {
        // Initialisation des valeurs
        String res = "";
        p = new Lampe("LampeTest");
        t.ajouter(new Lampe("LampeUseless"));
        t.ajouter(p);

        try
        {
            // Appel de la methode
            t.activer(2);
        }
        catch (IndexOutOfBoundsException e)
        {
            // Recuperation du message de l'exception
            res = e.getMessage();
        }
        finally
        {
            // Verifie que l'exception a remonté le message attendu
            assertEquals("Index 2 out of bounds for length 2", res, "doit sortir une exception de dépassement");
        }
    }

    //desactiver()
    /**
     * Test que la methode desactiver
     * eteint la lampe a la position 0
     * de la liste
     */
    @Test
    public void test_desactiver_pos0 ()
    {
        // Initialisation des valeurs
        p = new Lampe("LampeTest");
        t.ajouter(p);
        t.activer(0);

        // Appel de la methode
        t.desactiver(0);

        // Test si la valeur a bien ete changee
        assertFalse(p.isAllume(), "La lampe n'est pas eteinte'");
    }

    /**
     * Test que la methode desactiver
     * eteint la lampe a la position 1
     * de la liste
     */
    @Test
    public void test_desactiver_pos1 ()
    {
        // Initialisation des valeurs
        p = new Lampe("LampeTest");
        t.ajouter(new Lampe("LampeUseless"));
        t.ajouter(p);
        t.activer(1);

        // Appel de la methode
        t.desactiver(1);

        // Test si la valeur a bien ete changee
        assertFalse(p.isAllume(), "La lampe ne s'est pas eteinte");
    }

    /**
     * Test que la methode desactiver
     * renvoie une erreur si la lampe
     * n'existe pas dans la liste
     */
    @Test
    public void test_desactiver_inexistant ()
    {
        // Initialisation des valeurs
        String res = "";
        p = new Lampe("LampeTest");
        t.ajouter(new Lampe("LampeUseless"));
        t.ajouter(p);

        try
        {
            // Appel de la methode
            t.desactiver(2);
        }
        catch (IndexOutOfBoundsException e)
        {
            // Recuperation du message de l'exception
            res = e.getMessage();
        }
        finally
        {
            // Verifie que l'exception a remonté le message attendu
            assertEquals("Index 2 out of bounds for length 2", res, "doit sortir une exception de dépassement");
        }
    }


    //activerToutLampes()
    /**
     * Test que la methode activerToutLampes
     * allume toutes les devices
     * de la liste
     */
    @Test
    public void test_activerTout_pasVide ()
    {
        // Initialisation des valeurs
        t.ajouter(new Lampe("Lampe1"));
        t.ajouter(new Lampe("Lampe2"));

        // Appel de la methode
        t.activerTout();

        // Test si la valeur a bien ete changee
        for (Controllable l : t.lampes)
        {
            assertTrue(l.isAllume(), "La lampe ne s'est pas allumee");
        }
    }

    /**
     * Test que la methode toString
     * renvoie bien la chaine attendue
     */
    @Test
    public void test_toString_ok ()
    {
        // Initialisation des valeurs
        t.ajouter(new Lampe("Lampe1"));
        t.ajouter(new Lampe("Lampe2"));
        t.activer(1);
        String res;
        String expected = "Lampe1: Off\nLampe2: On\n";

        //Appel methode
        res = t.toString();

        //Test
        assertEquals(expected, res, "Message doit etre identique");
    }
}