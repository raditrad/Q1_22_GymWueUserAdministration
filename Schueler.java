public class Schueler  {
    
    String vorname;
    String nachname;
    String email;
    String username;
    Datum geb;
    

    public Schueler(String v, String n, Datum g) {
        this.vorname = v;
        this.nachname = n;
        this.geb = g;
    }
    
    public void printData()	{
			System.out.println(this.nachname+", "+this.vorname+"!");
	}   
}
