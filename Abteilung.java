import java.util.ArrayList;

public class Abteilung {
    private String kuerzel;
    private String name;


    public ArrayList<Lehrer> lliste;
    public ArrayList<Klasse> kliste;

    public Lehrer abteilungsvorstand;
    public Schueler abteilungssprecher;
    public Schule schule;


    public Abteilung(String name, String kuerzel, Schule schule){

        this.name = name;
        this.kuerzel = kuerzel;
        this.schule = schule;
        lliste = new ArrayList<Lehrer>();
        kliste = new ArrayList<Klasse>();


    }




    public String getName() {

        return name;
    }


    public String getKuerzel() {

        return kuerzel;
    }



    public ArrayList<Schueler> getSchueler() {

        ArrayList<Schueler> aschueler = new ArrayList<Schueler>();

        for(Klasse ki : getKlassen())
        {
            aschueler.addAll(ki.getSchueler());
        }

        return aschueler;

    }

    private ArrayList<Klasse> getKlassen() {

        return kliste;

    }

    public boolean addLehrer(Lehrer l){

        return this.lliste.add(l);
    }

    public void setAbteilungssprecher(Schueler abteilungssprecher) {
        this.abteilungssprecher = abteilungssprecher;
    }

    public boolean setAbteilungsvorstand(Lehrer kandidat){

        if(schule.direktor  == kandidat){
            return false;
        }


        for(Abteilung abt : schule.abteilungen)
        {
            if(abt.abteilungsvorstand == kandidat)
                return false;
        }

        abteilungsvorstand = kandidat;
        return true;
    }
}
