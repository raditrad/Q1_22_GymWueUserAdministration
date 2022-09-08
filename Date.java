public class Date {
    int day;
    int month;
    int year;

    // Konstruktor parsed String in Datum-Objekt
    public Date(String date)   {
        this.tag = Integer.parseInt(date.substring(0,2)); // Trenne Tag von '14.02.20' und wandle in Zahl um
        this.monat = Integer.parseInt(date.substring(3,5)); // s.O.
        this.jahr = Integer.parseInt(date.substring(6,8)); // s.O.
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
