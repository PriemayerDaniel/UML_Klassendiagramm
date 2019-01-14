import java.util.ArrayList;

public class Lehrer extends Mitarbeiter{
    private String kuerzel;

    public ArrayList<Fach> kliste = new ArrayList<>();


    public String getKuerzel() {
        return kuerzel;
    }

}
