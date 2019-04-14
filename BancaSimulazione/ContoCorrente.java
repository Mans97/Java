package BancaSimulazione;

public class ContoCorrente {
	protected double saldo;
	protected static int ID=0;
	protected int ultimoID=0;
	protected double tassofamily =0.015;
	protected double tassobusiness = 0.021;
	
	public ContoCorrente(double saldoIniziale)
	{
		saldo = saldoIniziale;
		ultimoID = ID;
		ID++;
	}
	
	protected void deposita(double somma)
	{
		saldo += somma;
	}
	
	protected void ritira(double somma)
	{
		if(somma < saldo)
		{
			saldo -= somma;
		}else
			System.out.println("Non hai abbastanza denaro.");
	}
	
	protected double getSaldo()
	{
		return saldo;
	}
	
	protected int getID()
	{
		return ultimoID;
	}
	
	protected void interessifamily(double somma)
	{
		somma += somma*tassofamily;
		System.out.println("Il tuo saldo aggiornato è: " + somma);
	}
	
	protected void interessibusiness(double somma)
	{
		somma += somma*tassobusiness;
		System.out.println("Il tuo saldo aggiornato è: " + somma);
	}
	

}
