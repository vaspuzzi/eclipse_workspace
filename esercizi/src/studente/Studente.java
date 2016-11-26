package studente;

public class Studente extends Persona {
	
	public int matricola;
	public String corso;
	
	public Studente(String n,String c)
	{
		super(n,c);
	}
	
	public Studente(String n,String c,int mat)
	{
		super(n,c);
		matricola=mat;
	}
	
	public boolean confronto(Studente s)
	{
		if(s.matricola==matricola) return true;
		return false;
	}
	
	public String toString()
	{
		String s=Persona.class.toString();
		return (s+" "+matricola+ " "+corso);
	}

}
