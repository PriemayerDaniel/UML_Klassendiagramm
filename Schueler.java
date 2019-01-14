import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Schueler extends Person{
    private Integer katalognummer;
    private LocalDate eintrittsdatum;
    private boolean eigenberechtigt;

    DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public Schueler(Integer knr, String ed){

        katalognummer = knr;
        eintrittsdatum = LocalDate.parse(ed,dateformat);

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


    public static void main(String[] args) {

        DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        Schueler Dani = new Schueler(12,"12.10.2018");
        Dani.geburtsdatum = LocalDate.parse("17.05.2000",dateformat);
        System.out.println(Dani.eintrittsdatum);

        boolean probe = Dani.isEigenberechtigt();
        System.out.println(probe);

    }

}