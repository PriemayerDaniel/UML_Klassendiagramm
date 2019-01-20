import java.util.ArrayList;

public class Schule {
    private String name;
    private Long schulkennzahl;
    private String schultyp;

    public Schueler schulsprecher;
    public Lehrer direktor;
    public Adresse standort;

    //public ArrayList<Schueler> sliste = new ArrayList<>();

    public ArrayList<Mitarbeiter> mliste;
    public ArrayList<Abteilung> abteilungen;

    public Schule(String name, Long skz, String styp, Lehrer direktor, Adresse standort, Abteilung abt){

        this.name = name;
        schulkennzahl = skz;
        schultyp = styp;
        this.direktor = direktor;
        this.standort = standort;

        abteilungen = new ArrayList<>();
        abteilungen.add(abt);

        mliste = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public Long getSchulkennzahl() {

        return schulkennzahl;
    }

    public String getSchultyp() {

        return schultyp;
    }


    public boolean addPersonal(Long svnr, String vname, String nname, String gd, String email){
       return mliste.add(new NichtLehrpersonal(svnr, vname, nname, gd, email));
    }

    public ArrayList<Mitarbeiter> getMitarbeiter() {

        return mliste;
    }

    public boolean setDirektor(Lehrer kandidat) {

        for(Abteilung iabt : abteilungen){
            if(iabt.abteilungsvorstand == kandidat) {
                return false;
            }
        }

        this.direktor = kandidat;
        return false;
    }

    public Abteilung addAbteilung (String name, String kuerzel){

        Abteilung zwa = new Abteilung(name, kuerzel, this);     //Zwischenabteilung weil in UML steht, dass eine Abteilung zurückggeben werden muss
        abteilungen.add(zwa);

        return zwa;
    }

    public ArrayList<Abteilung> getAbteilungen() {
        return abteilungen;
    }

    public ArrayList<Schueler> getSchueler() {

        ArrayList<Schueler> schueler = new ArrayList<Schueler>();

        for(Abteilung ai : getAbteilungen())
        {
            schueler.addAll(ai.getSchueler());
        }
        return schueler;

    }


    public int getAnzahlSchueler(){

        return getSchueler().size();
    }

    /*public static void main(String[] args) {
        Schule HTL = new Schule();

        HTL.abteilungen.add(HTL.addAbteilung("Hallo", "hlo"));
        //HTL.abteilungen.add(HTL.addAbteilung("Hallo2", "hlo2"));
        Abteilung Dani = new Abteilung("Priemfötzchen","Dani");

        HTL.abteilungen.add(Dani);
        System.out.println(HTL.abteilungen.toString());
        System.out.println("Hallo");


    }*/
}