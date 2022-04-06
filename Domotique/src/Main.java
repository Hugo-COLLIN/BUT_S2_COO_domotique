import java.util.Scanner;

/**
 * classe qui cree des lampes et une telecommande associee.
 */

public class Main {

	public static void main(String args[]) {
		// la telecommande vide
		Telecommande t = new Telecommande();

		// ajoute des objets
		// utilisation de refactor (extract method)
		// pour rendre le code plus clair
		ajouter4Lampes(t);

		// test d'activation
		t.activerLampe(1);
		t.activerLampe(3);
		System.out.println(t);

		// gestion du menu
		lancerMenu(t);
	}

	/**
	 * menu qui permet de manipuler une telecommande
	 * 
	 * @param t
	 *            telecommande a manipuler
	 */
	private static void lancerMenu(Telecommande t) {
		System.out.println(t);
		Scanner sc = new Scanner(System.in);
		
		boolean fini=false;
		
		// tant qu'il y a des commandes
		while (!fini) {
			
			// demande lampe et commande
			System.out.println("entrer le numero de la lampe");
			int choix = sc.nextInt();
			System.out.println("entrer commande (+/-/exit)");
			String com = sc.nextLine();
			com = sc.nextLine();

			// si la commande est +, on active
			if (com.equals("+")) {
				System.out.println("== activer "+choix+"==");
				t.activerLampe(choix);
			}
			// si la commande est - on descactive
			else if (com.equals("-")) {
				System.out.println("== desactiver "+choix+"==");
				t.desactiverLampe(choix);
			}
			// si la commande est exit, on arrete
			else if (com.equals("exit")) {
				System.out.println("== Fin du programme == ");
				fini=true;
			}
			// commande non reconnue
			else {
				System.out.println("commande inconnue");
			}
			
			//affiche l'etat de le telecommande
			System.out.println(t);
		}
		sc.close();
	}

	/**
	 * creation des objets et ajout dans la telecommande
	 * 
	 * @param t
	 *            telecommande dans lequelle on ajoute 4 lampes
	 */
	private static void ajouter4Lampes(Telecommande t) {
		Lampe l1 = new Lampe("Lampe1");
		t.ajouterLampe(l1);

		Lampe l2 = new Lampe("Lampe2");
		t.ajouterLampe(l2);

		Lampe l3 = new Lampe("Lampe3");
		t.ajouterLampe(l3);

		Lampe l4 = new Lampe("Lampe4");
		t.ajouterLampe(l4);
	}

}
