package BancaSimulazione;
import java.util.Scanner;

public class GestioneBanca {

	public static void main(String[] args) {
		Utente logged;
		double somma = 0;
		Utente[] users = new Utente[4];
		Scanner input = new Scanner(System.in);
		Utente u1 = new Utente(10400,"Simone","Cappella","Kappapowa","1234567",true);
		Utente u2 = new Utente(500,"Marco","Scipione","Sheep","merda",true);
		Utente u3 = new Utente(700,"Luca","Verdecchia","Maverick","merdaccia",false);
		Utente u4 = new Utente(104,"Danilo","Tomassini","Goose","taglieri",false);
		users[0] = u1;
		users[1] = u2;
		users[2] = u3;
		users[3] = u4;
		TerminaleSportello spt1 = new TerminaleSportello(users);
		TerminaleSportello spt2 = new TerminaleSportello(users);
		TerminaleSportello spt3 = new TerminaleSportello(users);
		TerminaleSportello spt4 = new TerminaleSportello(users);
		//System.out.println(u1.toString());
		System.out.println("Quale terminale vuoi utilizzare?");
		System.out.println("1)");
		System.out.println("2)");
		System.out.println("3)");
		System.out.println("4)");
		//Scanner input = new Scanner(System.in);
		switch(input.nextInt())
		{
		case 1:
			if(spt1.accedi() == true)
			{
				logged = spt1.getLoggato();
				System.out.println("Che operazione desideri effettuare?");
				System.out.println("1) Ritira");
				System.out.println("2) Deposita");
				System.out.println("3) Ottieni saldo");
				System.out.println("4) Matura interessi");
				switch(input.nextInt())
				{
				case 1:
					System.out.println("Quanto vuoi ritirare?");
					somma = input.nextDouble();
					if (somma < logged.saldo)
					{
						logged.ritira(somma);
						System.out.println("Operazione effettuata con successo.");
					}else
						{
							System.out.println("Il tuo saldo non è sufficiente per effettuare l'operazione.");
						}
					somma = 0;
					break;
				case 2:
					System.out.println("Quanto vuoi depositare?");
					somma = input.nextDouble();
					logged.deposita(somma);
					somma=0;
					break;
				case 3:
					System.out.println("Il tuo saldo disponibile è: " + logged.getSaldo());
				case 4:
					if(logged.business)
					{
						logged.interessibusiness(logged.getSaldo());
					}else
						{
							logged.interessifamily(logged.getSaldo());
						}
					break;
				}
			}else 
				System.out.println("Credenziali errate!");
				break;
		}
		input.close();
	}
}
