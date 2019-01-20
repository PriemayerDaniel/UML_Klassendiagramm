

public class Adresse {
	
	//variablen
    private String ort;
    private String stra�e;
    private Integer hausnummer;
    private Integer plz;

    //konstruktoren
    public Adresse(String ORT, String str, Integer hnummer, Integer PLZ) {
    	ort = ORT;
    	stra�e = str;
    	hausnummer = hnummer;
    	plz = PLZ;
    }
    
    
    
    //mehtoden
    public Integer getHausnummer() {
        return hausnummer;
    }

    public Integer getPlz() {
        return plz;
    }

    public String getOrt() {
        return ort;
    }

    public String getStra�e() {
        return stra�e;
    }
    
    public void printAdresse() {
    	System.out.println("Ort:"+ort);
    	System.out.println("Stra�e:"+stra�e);
    	System.out.println("Hausnummer:"+hausnummer);
    	System.out.println("Postleitzahl:"+plz);
  
    }
    
}

