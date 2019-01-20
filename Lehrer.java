import java.util.ArrayList;

public class Lehrer extends Mitarbeiter{
    private String kuerzel;

    public ArrayList<Fach> fliste;


    public Lehrer(Long svnr, String vname, String nname, String gd, String email, Adresse wohnort, String kuerzel){

        super(svnr, vname, nname, gd, email, wohnort);
        this.kuerzel = kuerzel;

    }


    public String getKuerzel() {
        return kuerzel;
    }

}
