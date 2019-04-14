package BancaSimulazione;
import java.util.Scanner;

public class TerminaleSportello{
	public static int IDterminale;
	protected int ultimoID;
	Utente[] users = new Utente[4];
	public Utente loggato;
	
	public TerminaleSportello(Utente[] users) {
		this.users = users;
		ultimoID = IDterminale;
		IDterminale++;
	}
	
	protected boolean accedi()
	{
		boolean flag = false;
		String user, pass; 
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci username: ");
		user = input.nextLine();
		System.out.println("Inserisci password: ");
		pass = input.nextLine();
		input.close();
		for (Utente x : users)
		{
			if(user.equals(x.getUsername()) && pass.equals(x.getPassword()) && flag == false)
				{
					flag=true;
					loggato = x;
				}
		}
		return flag;
	}
	
	protected Utente getLoggato()
	{
		return loggato;
	}
}
