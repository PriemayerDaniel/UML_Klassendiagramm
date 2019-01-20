import java.util.ArrayList;

public class Raum {
    
	
	//variablen
	private String raumnummer;
    private int maxsitzplaetze;
    private Raumtyp raumtyp;
    public Klasse Stammklasse;
    //private Hashtable<Sting, Belegung> blegung = new Hashtable<String, Belegung>();

    //konstruktoren
    
    public Raum(String raumN, int maxsitzpl, Raumtyp raumt, Klasse Stammkl) {
    	raumnummer = raumN;
    	maxsitzplaetze = maxsitzpl;
    	raumtyp = raumt;
    	Stammklasse = Stammkl;
    }
    
    
    
    //methoden
    	
    public int getMaxsitzplaetze() {
        return maxsitzplaetze;
    }

    public String getRaumnummer() {
        return raumnummer;
    }
    
    public Raumtyp getRaumtyp() {
    	return raumtyp;
    }
    
    public void exportBelegung() {
    	
    	for(int tag = 1; tag <= 7; tag++) {
    		
    		for(int stunde = 1; stunde <=10; stunde ++) {
    			  
    			
    		}
    	}
    }
    
    public Belegung getBelegung(DayOfWeek tag, int )
    
    
   // ArrayList<Fach> Faecher = new ArrayList<Fach>();
}
