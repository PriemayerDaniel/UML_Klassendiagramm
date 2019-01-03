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
}

	public void printAdresse(adresse) {
		System.out.println(""+adresse.hausnummer);
		
	}

Adresse a;

a.hausnummer = 14;

print Adresse(a);