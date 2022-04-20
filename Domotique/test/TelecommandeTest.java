import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TelecommandeTest
{
    //Atributes
    Telecommande t;
    Lampe p;


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
    void test_ajouterLampe_telecVide ()
    {
        p = new Lampe("Cuisine");
        t.ajouter(p);

        for (Lampe l : t.lampes)
        {
            assertTrue(l.equals(p), "doit etre vrai");
        }
    }

    /**
     * Teste l'ajout d'une lampe a une
     * telecommande contenant deja 1 lampe
     */
    @Test
    void test_ajouterLampe_telec1Elem ()
    {
        //Initialisation
        List<Lampe> lTest = new ArrayList<Lampe>();
        lTest.add(new Lampe("Cuisine"));
        lTest.add(new Lampe("Salon"));
        
        //Ajout lampe et test
        for (int i = 0 ; i < lTest.size() ; i ++)
        {
            t.ajouter(lTest.get(i));
            assertTrue(t.lampes.get(i).equals(lTest.get(i)));
        }
    }


    //activerLampe()
    /**
     * Test que la methode activerLampe
     * allume la lampe a la position 0
     * de la liste
     */
    @Test
    void test_activerLampe_pos0()
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
     * Test que la methode activerLampe
     * allume la lampe a la position 1
     * de la liste
     */
    @Test
    void test_activerLampe_pos1()
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
     * Test que la methode activerLampe
     * renvoie une erreur si la lampe
     * n'existe pas dans la liste
     */
    @Test
    void test_activerLampe_inexistant()
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
            assertTrue(res.equals("Index 2 out of bounds for length 2") , "doit sortir une exception de dépassement");
        }
    }

    //desactiverLampe()
    /**
     * Test que la methode desactiverLampe
     * eteint la lampe a la position 0
     * de la liste
     */
    @Test
    void test_desactiverLampe_pos0()
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
     * Test que la methode desactiverLampe
     * eteint la lampe a la position 1
     * de la liste
     */
    @Test
    void test_desactiverLampe_pos1()
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
     * Test que la methode desactiverLampe
     * renvoie une erreur si la lampe
     * n'existe pas dans la liste
     */
    @Test
    void test_desactiverLampe_inexistant()
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
            assertTrue(res.equals("Index 2 out of bounds for length 2") , "doit sortir une exception de dépassement");
        }
    }


    //activerToutLampes()
    /**
     * Test que la methode activerToutLampes
     * allume toutes les lampes
     * de la liste
     */
    @Test
    void test_activerToutLampes_pasVide()
    {
        // Initialisation des valeurs
        t.ajouter(new Lampe("Lampe1"));
        t.ajouter(new Lampe("Lampe2"));

        // Appel de la methode
        t.activerTout();

        // Test si la valeur a bien ete changee
        for (Lampe l : t.lampes)
        {
            assertTrue(l.isAllume(), "La lampe ne s'est pas allumee");
        }
    }

    /**
     * Test que la methode toString
     * renvoie bien la chaine attendue
     */
    @Test
    void test_toString_ok()
    {
        // Initialisation des valeurs
        t.ajouter(new Lampe("Lampe1"));
        t.ajouter(new Lampe("Lampe2"));
        t.activer(1);
        String res;
        String expected = """
                Lampe1: Off
                Lampe2: On
                """;

        //Appel methode
        res = t.toString();

        //Test
        assertEquals(res, expected, "Message doit etre identique");
    }
}