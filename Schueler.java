import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Schueler extends Person implements Comparable<Schueler>{
    protected Integer katalognummer;    //damit man in Klasse mit addSchueler darauf zurgreifen kann - statt setter verwendet
    private LocalDate eintrittsdatum;

    DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public Klasse klasse;

    public Schueler(Long svnr, String vname, String nname, String gd, String email, Adresse wohnort, String ed){

        super(svnr, vname, nname, gd, email, wohnort);
        eintrittsdatum = LocalDate.parse(ed,dateformat);

    }

    @Override
    public int compareTo(Schueler o){               //comparable interface fürs sortieren vom TreeSet -> Klassenliste in alphabetischer Reihenfolge

        return this.nname.compareTo(o.nname);

    }

    public LocalDate getEintrittsdatum() {
        return eintrittsdatum;
    }

    public Integer getKatalognummer() {
        return katalognummer;
    }

    public boolean isEigenberechtigt() {
        LocalDate zdate = LocalDate.now();

        if(geburtsdatum.isBefore(zdate.minusYears(18))){
            return true;
        }
        else{
            return false;
        }

    }



}