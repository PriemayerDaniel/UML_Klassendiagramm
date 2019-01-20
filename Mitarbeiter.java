import java.util.Date;

public abstract class  Mitarbeiter extends  Person {
    protected static Integer anzahl = 0;


    public Mitarbeiter(Long svnr, String vname, String nname, String gd, String email, Adresse wohnort) {

        super(svnr, vname, nname, gd, email, wohnort);
        anzahl = anzahl+1;
    }


    public static Integer getAnzahl() {
        return anzahl;
    }

}

