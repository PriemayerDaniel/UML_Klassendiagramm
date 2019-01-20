import java.util.ArrayList;

public class Abteilung {
    private String kuerzel;
    private String name;


    public ArrayList<Lehrer> lliste;
    public ArrayList<Klasse> kliste;

    public Lehrer abteilungsvorstand;
    public Schueler abteilungssprecher;
    public Schule schule;

    public ArrayList<Belegung> bliste;
    public ArrayList<Raum> rliste;


    public Abteilung(String name, String kuerzel, Schule schule){

        this.name = name;
        this.kuerzel = kuerzel;
        this.schule = schule;
        lliste = new ArrayList<Lehrer>();
        kliste = new ArrayList<Klasse>();
        bliste = new ArrayList<Belegung>();
        rliste = new ArrayList<Raum>();

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

    public boolean addKlasse(Klasse klasse){
        return this.kliste.add(klasse);
    }

    public void setAbteilungssprecher(Schueler abteilungssprecher) {
        this.abteilungssprecher = abteilungssprecher;
    }

    public boolean setAbteilungsvorstand(Lehrer kandidat){

        if(schule.direktor.svnr == kandidat.svnr){
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
