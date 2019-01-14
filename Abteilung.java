import java.util.ArrayList;

public class Abteilung {
    private String kuerzel;
    private String name;


    public ArrayList<Schueler> sliste = new ArrayList<>();
    public ArrayList<Lehrer> lliste = new ArrayList<>();
    public ArrayList<Klasse> kliste = new ArrayList<>();

    public Lehrer abteilungsvorstand;
    public Schueler abteilungssprecher;


    public Abteilung(String name, String kuerzel){
        if(name.length() < 1 || kuerzel.length() < 1){
            throw new IllegalArgumentException("Name und Kuerzel müssen einen Text enthalten");
        }
        this.name = name;
        this.kuerzel = kuerzel;

    }

    public Abteilung(){}



    public String getKuerzel() {

        return kuerzel;
    }

    public String getName() {

        return name;
    }

    public void setAbteilungsvorstand(Lehrer l) {
        this.abteilungsvorstand = l;
    }

    public boolean addLehrer(Lehrer l){
        try{
            lliste.add(l);
            return true;
        }
        catch(Exception e){
            System.out.println("Es kann nur ein Lehrer hinzugefügt werden!");
            return false;
        }
    }
}
