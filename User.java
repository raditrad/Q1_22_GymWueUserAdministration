public class User  {
    
    String firstName;
    String lastName;
    String mail;
    String username;
    Datum dayOfBirth;
    

    public User(String fn, String ln, Datum dob) {
        this.firstName = v;
        this.lastName = n;
        this.dayOfBirth = dob;
    }
    
    public void printData()	{
	System.out.println(this.lastName+", "+this.firstName+"!");
}   
}
