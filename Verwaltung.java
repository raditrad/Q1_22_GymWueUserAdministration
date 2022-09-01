class Verwaltung	{
			
	public static void main(String[] args)	{	
			
			// Lege Schueler einmal an
			Schueler u1 = new Schueler("Felix","Balduin",new Datum("14.02.89"));
			Schueler u2 = new Schueler("Moni","Thor",new Datum("15.02.89"));
			Schueler u3 = new Schueler("Pups","Keks",new Datum("16.02.89"));
			Schueler u4 = new Schueler("Matt","Eagle",new Datum("17.02.89"));
			
		    // Gebe einmal beispielhaft die Daten auf der Konsole aus...
		    u1.printData();
		    u2.printData();
		    u3.printData();
		    u4.printData();
		
	}
	
	
}
