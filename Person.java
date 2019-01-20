import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public abstract class Person {
    protected Long svnr;            //protected dass man darauf zugreifen kann
    protected String vname;
    protected String nname;
    protected LocalDate geburtsdatum;
    protected String email;

    DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("dd.MM.yyyy");


    public Person(Long svnr, String vname, String nname, String gd, String email){
        this.svnr = svnr;
        this.vname = vname;
        this.nname = nname;
        geburtsdatum = LocalDate.parse(gd, dateformat);
        this.email = email;
    }

    public Person (){}

    public Long getSvnr() {
        return svnr;
    }

    public String getVname() {
        return vname;
    }

    public String getNname() {
        return nname;
    }

    public LocalDate getGeburtsdatum() {
        return geburtsdatum;
    }

    public String getEmail() {
        return email;
    }
      
    public static void main(String[] args) {
    	
    ArrayList<Adresse> Wohnort = new ArrayList<Adresse>();
   
    }
   
}
