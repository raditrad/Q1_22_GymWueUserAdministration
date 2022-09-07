public class User  {
    
    String firstName;
    String lastName;
    String mail;
    String username;
    char gender;
    Datum dayOfBirth;
    

    public User(String fn, String ln, Datum dob) {
        this.firstName = v;
        this.lastName = n;
        this.dayOfBirth = dob;
    }
    
    public void printData()	{
	System.out.println(this.lastName+", "+this.firstName+"!");
    } 
	
   public String getDDMM() { 
        String dd = ""; 
        String mm = "";
        if(this.day<10) {
            dd="0"+this.day;
        } else {
            dd=this.day+"";
        }

        if(this.month<10) {
            mm="0"+this.month;
        } else {
            mm=this.month+"";
        } 
        return dd+mm; // verkette Tag mit Monat und gebe es zurück "0401"
    }
}
