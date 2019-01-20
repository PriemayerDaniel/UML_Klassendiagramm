import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Klasse {
    private String bezeichnung;
    private Integer schulstufe;

    public Raum stammklasse;
    public Schueler klassensprecher;
    private Lehrer klassenvorstand;
    private Abteilung abteilung;

    public Set<Schueler> schuelerSet;


    public Klasse(String bez, int sstf) {
        bezeichnung = bez;
        schulstufe = sstf;

        schuelerSet = new TreeSet<>();

    }

    public Klasse(String bez, int sstf, Lehrer kv, Schueler s, Raum stk, Abteilung abt, Schueler ksp){
        bezeichnung = bez;
        schulstufe = sstf;

        klassenvorstand = kv;

        schuelerSet = new TreeSet<>();
        schuelerSet.add(s);

        stammklasse = stk;
        abteilung = abt;
        setKlassensprecher(ksp);

    }

    public String getBezeichnung() {
        return bezeichnung;
    }
    public Integer getSchulstufe() {
        return schulstufe;
    }

    public float getDurchschnittsalter(){
        int dalter = 0;
        int z = 0;
        LocalDate today = LocalDate.now();

        for (Schueler is : schuelerSet) {

            LocalDate birthDate = is.getGeburtsdatum();
            dalter += Period.between(birthDate, today).getYears();
            z++;

        }

        return ((float) dalter / (float) z);

    }

    public boolean setKlassensprecher(Schueler klassensprecher) {


        boolean b = false;

        for(Schueler is : schuelerSet){
            if(is == klassensprecher){
                b = true;
            }
        }

        if(b) {
            this.klassensprecher = klassensprecher;
            return b;
        }

        return false;
    }


    public boolean addSchueler(Schueler schueler) {
        int knr = 1;

        if(schuelerSet.size() >= 36){
            return false;
        }

        schuelerSet.add(schueler);

        for(Schueler is : schuelerSet){
            is.katalognummer = knr;
            knr++;
        }

        return true;
    }

    public Set<Schueler> getSchueler() {
        return schuelerSet;
    }



    /*public static void main(String[] args) {

        Klasse k = new Klasse();



        k.addSchueler(new Schueler(34123L, "Daniel", "Priemi", "10.12.2000", "dafdsyköljföaksljdf@priemfotz.at","12.12.2018"));
        k.addSchueler(new Schueler(123123L, "Simon", "Brait", "19.12.2005", "simonsadgfsdfg@gsagasgd","10.12.2015"));
        k.addSchueler(new Schueler(123123L, "Simon", "Casd", "19.12.2004", "simonsadgfsdfg@gsagasgd","10.12.2015"));
        k.addSchueler(new Schueler(123123L, "Simon", "Anasdf", "19.12.2002", "simonsadgfsdfg@gsagasgd","10.12.2015"));


        for(Schueler is : k.schuelerSet){
            System.out.println(is.nname);
            System.out.println(is.katalognummer);
        }

        float alter = k.getDurchscnittsalter();

        System.out.println(alter);

    }*/
}