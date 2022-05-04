
public class Main {

	public static void main(String args[])
	{
		Telecommande t=new Telecommande();
		
		
		LampeAdaptateur l1=new LampeAdaptateur("Lampe1");
		t.ajouterAppareil(l1);
		
		/****** A COMPLETER ******/
		// TODO
		
		TelecommandeGraphique tg=new TelecommandeGraphique(t);
		

		
	}
	
}
