import java.util.Date;

public abstract class  Mitarbeiter extends  Person {
    protected static Integer anzahl;


    public Mitarbeiter(Long svnr, String vname, String nname, String gd, String email) {

        super(svnr, vname, nname, gd, email);
        anzahl++;
    }


    public static Integer getAnzahl() {
        return anzahl;
    }

}

