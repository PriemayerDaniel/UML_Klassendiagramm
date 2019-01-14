import java.util.ArrayList;

public class Klasse {
    private String bezeichnung;
    private Integer schulstufe;

    public Integer getSchulstufe() {
        return schulstufe;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }
    
    public Raum Stammklasse = new Raum();
    
    public Schueler Klassensprecher = new Schueler();
    
    ArrayList<Schueler> Schueler = new ArrayList<Schueler>(36);
    
    public Klasse(Schueler schueler ){ 
       Schueler.add(schueler); 
    }
}