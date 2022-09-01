public class Datum {
    int tag;
    int monat;
    int jahr;

    // Konstruktor parsed String in Datum-Objekt
    public Datum(String date)   {
        this.tag = Integer.parseInt(date.substring(0,2)); // Trenne Tag von '14.02.20' und wandle in Zahl um
        this.monat = Integer.parseInt(date.substring(3,5)); // s.O.
        this.jahr = Integer.parseInt(date.substring(6,8)); // s.O.
    }

}
