package studente;

public class Persona {
	public String nome,cognome,data,indirizzo;
	
	public Persona(String n, String c)
	{
		Character.toUpperCase(n.charAt(0));
		Character.toUpperCase(c.charAt(0));
		nome=n;
		cognome=c;
		
	}
	
	public boolean confronto(Persona p)
	{
		if(nome==p.nome&&cognome==p.cognome)
			return true;
		else return false;
	}
	
	public String toString()
	{
		return (nome+" "+cognome+" "+data+" "+indirizzo);
	}

}
