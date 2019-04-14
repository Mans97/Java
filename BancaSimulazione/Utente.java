package BancaSimulazione;

public class Utente extends ContoCorrente{
	protected String nome;
	protected String cognome;
	protected String username;
	private String password;
	protected boolean business;
	
	public Utente(double saldoIniziale, String nome, String cognome,String username, String password, boolean business)
	{
		super(saldoIniziale);
		this.nome= nome;
		this.cognome = cognome;
		this.username = username;
		this.password = password;
		this.business = business;
	}
	
	protected String getNome()
	{
		return nome;
	}
	
	protected String getCognome()
	{
		return cognome;
	}
	
	protected String getPassword()
	{
		return password;
	}
	
	protected String getUsername()
	{
		return username;
	}

	@Override
	public String toString() {
		return "Utente nome=" + nome + ", cognome=" + cognome + ", username=" + username + ", password=" + password
				+ ", ID: " + getID();
	}
	
}
