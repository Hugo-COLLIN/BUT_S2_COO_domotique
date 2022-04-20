import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TelecommandeTest
{

    //Atributes
    Telecommande telecommande;


    //Methods
    @BeforeEach
    void preparation ()
    {
        telecommande = new Telecommande();
    }

    /**
     * Teste l'ajout d'une lampe a une
     * telecommande vide
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

        for (int i = 0 ; i < lTest.size() ; i ++)
        {
            telecommande.ajouterLampe(lTest.get(i));
            assertTrue(telecommande.lampes.get(i).equals(lTest.get(i)));
        }
    }

    // REDEFINIR LA METHODE EQUALS DANS LAMPE ?


    /**
     * Test que la methode activerLampe
     * allume la lampe a la position 0
     * de la liste
     */
    @Test
    void test_activerLampe_pos0()
    {
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
     * Test que la methode activerLampe
     * allume la lampe a la position 1
     * de la liste
     */
    @Test
    void test_activerLampe_pos1()
    {
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
        Telecommande t = new Telecommande();
        Lampe p = new Lampe("LampeTest");
        t.ajouterLampe(new Lampe("LampeUseless"));
        t.ajouterLampe(p);

        try
        {
            // Appel de la methode
            t.activerLampe(2);
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

    @Test
    void test_desactiverLampe()
    {
    }

    @Test
    void test_activerTout()
    {
    }

    @Test
    void test_testToString()
    {
    }
}