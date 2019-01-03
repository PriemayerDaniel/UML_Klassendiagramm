import java.util.Date;

public abstract class Person {
    protected Long svnr;            //protected dass man darauf zugreifen kann
    protected String vname;
    protected String nname;
    protected Date geburtsdatum;
    protected String email;

    public Long getSvnr() {
        return svnr;
    }

    public String getVname() {
        return vname;
    }

    public String getNname() {
        return nname;
    }

    public Date getGeburtsdatum() {
        return geburtsdatum;
    }

    public String getEmail() {
        return email;
    }


}
