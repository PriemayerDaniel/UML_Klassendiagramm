

public class Adresse {
	
	//variablen
    private String ort;
    private String straﬂe;
    private Integer hausnummer;
    private Integer plz;

    //konstruktoren
    public Adresse(String ORT, String str, Integer hnummer, Integer PLZ) {
    	ort = ORT;
    	straﬂe = str;
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

    public String getStraﬂe() {
        return straﬂe;
    }
    
    public void printAdresse() {
    	System.out.println("Ort:"+ort);
    	System.out.println("Straﬂe:"+straﬂe);
    	System.out.println("Hausnummer:"+hausnummer);
    	System.out.println("Postleitzahl:"+plz);
  
    }
    
}

