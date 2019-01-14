import java.util.ArrayList;

public class Schule {
    private String name;
    private Long schulkennzahl;
    private String schultyp;

    public Schueler schulsprecher;
    public Lehrer direktor;
    public Adresse standort;

    public ArrayList<Schueler> sliste = new ArrayList<>();
    public ArrayList<Mitarbeiter> mliste = new ArrayList<>();
    public ArrayList<Abteilung> abteilungen = new ArrayList<>();


    public String getName() {
        return name;
    }

    public Long getSchulkennzahl() {

        return schulkennzahl;
    }

    public String getSchultyp() {

        return schultyp;
    }

    public ArrayList<Mitarbeiter> getMliste() {

        return mliste;
    }

    public ArrayList<Schueler> getSliste() {

        return sliste;
    }

    public int getAnzahlSchueler(){

        return sliste.size();
    }

    public boolean setDirektor(Lehrer direktor) {

        try {
            this.direktor = direktor;
            return true;
        }
        catch(Exception e){
            System.out.println("Nur ein Leherer kann Direktor werden!");
            return false;
        }
    }

    public Abteilung addAbteilung (String name, String kuerzel){
        Abteilung Ferdinand = new Abteilung(name, kuerzel);

        abteilungen.add(Ferdinand);


        return Ferdinand;
    }


    public static void main(String[] args) {
        Schule HTL = new Schule();

        HTL.abteilungen.add(HTL.addAbteilung("Hallo", "hlo"));
        //HTL.abteilungen.add(HTL.addAbteilung("Hallo2", "hlo2"));
        Abteilung Dani = new Abteilung("Priemfötzchen","Dani");

        HTL.abteilungen.add(Dani);
        System.out.println(HTL.abteilungen.toString());
        System.out.println("Hallo");


    }
}