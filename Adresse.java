

public class Adresse {
    private String ort;
    private String straße;
    private Integer hausnummer;
    private Integer plz;

    public Integer getHausnummer() {
        return hausnummer;
    }

    public Integer getPlz() {
        return plz;
    }

    public String getOrt() {
        return ort;
    }

    public String getStraße() {
        return straße;
    }
    
    public void printAdresse() {
    	System.out.println("Ort:"+ort);
    	System.out.println("Straße:"+straße);
    	System.out.println("Hausnummer:"+hausnummer);
    	System.out.println("Postleitzahl:"+plz);
  
    }
    
}

