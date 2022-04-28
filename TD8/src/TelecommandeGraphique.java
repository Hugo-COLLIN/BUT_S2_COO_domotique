import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * creer une interface graphique pour une telecommande
 */
public class TelecommandeGraphique {

	/**
	 * la telecommande controlee
	 */
	private Telecommande tele;

	/**
	 * constructeur d'interface
	 * 
	 * @param t
	 *            telecommande a manipuler
	 */
	public TelecommandeGraphique(Telecommande t) {
		this.tele = t;

		JFrame f = new JFrame("Telecommande Graphique");

		int n = tele.getNombre();
		JPanel contenu = creationBoutons(n);

		f.setContentPane(contenu);
		f.pack();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * creation des Boutons du panel
	 * 
	 * @param n
	 *            nombre d'appareils
	 * @return JPanel avec les boutons
	 */
	private JPanel creationBoutons(int n) {
		JPanel contenu = new JPanel();
		contenu.setLayout(new GridLayout(3, n));

		// pour chaque appareil, boutonOn
		for (int i = 0; i < n; i++) {
			JButton boutonOn = creationBoutonOn(i);
			contenu.add(boutonOn, i);
		}

		// pour chaque appareil, boutonOff
		for (int i = 0; i < n; i++) {
			JButton boutonOff = creationboutonOff(i);
			contenu.add(boutonOff, i);
		}

		// pour chaque appareil, etiquette
		for (int i = 0; i < n; i++) {
			JLabel nom = new JLabel("      App " + i + "      ");
			contenu.add(nom, i);
		}
		return contenu;
	}

	/**
	 * creation bouton qui desactive
	 * 
	 * @param i
	 *            indice appareil
	 * @return bouton qui desactive appareil i
	 */
	private JButton creationboutonOff(int i) {
		final int num = i;
		JButton boutonOff = new JButton("Off");
		boutonOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("==== eteint " + num + "====");
				tele.desactiverAppareil(num);
				System.out.println(tele);
			}
		});
		return boutonOff;
	}

	/**
	 * creation bouton qui active
	 * 
	 * @param i
	 *            indice appareil
	 * @return bouton qui active appareil i
	 */
	private JButton creationBoutonOn(int i) {
		final int num = i;
		JButton boutonOn = new JButton("On");
		boutonOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("==== allume " + num + "====");
				tele.activerAppareil(num);
				System.out.println(tele);
			}
		});
		return boutonOn;
	}

}
