
public class Main {

	public static void main(String args[])
	{
		Telecommande t=new Telecommande();

		t.ajouterAppareil(new LampeAdaptateur("Lampe1"));
		t.ajouterAppareil(new HifiAdaptateur());
		t.ajouterAppareil(new ChemineeAdapter());
		t.ajouterAppareil(new TVAdaptateur());

		TelecommandeGraphique tg=new TelecommandeGraphique(t);
	}
	
}
