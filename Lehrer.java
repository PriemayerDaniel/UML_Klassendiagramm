import java.util.ArrayList;

public class Lehrer extends Mitarbeiter {
    private String kuerzel;

    public ArrayList<Fach> fliste;
    public Belegung[][] stdp;


    public Lehrer(Long svnr, String vname, String nname, String gd, String email, Adresse wohnort, String kuerzel) {

        super(svnr, vname, nname, gd, email, wohnort);
        this.kuerzel = kuerzel;
        fliste = new ArrayList<>();
        stdp = new Belegung[5][10];

    }

    public boolean addFach(Fach f) {
        return fliste.add(f);
    }


    public String getKuerzel() {
        return kuerzel;
    }


    public void exportStundenplan() {

        System.out.println(this.kuerzel);

        String leftAlignFormat = "| %-6s | %-6s | %-6s | %-6s | %-6s|%n";

        System.out.format(leftAlignFormat, "Mo", "Di", "Mi", "Do", "Fr");

        for (int i = 0; i < 10; i++) {
            System.out.format("---------|--------|--------|--------|--------%n");
            String Mo, Di, Mi, Do, Fr;

            try {
                Mo = stdp[0][i].getKlasse().getBezeichnung();
            } catch (NullPointerException e) {
                Mo = "-";
            }

            try {
                Di = stdp[1][i].getKlasse().getBezeichnung();
            } catch (NullPointerException e) {
                Di = "-";
            }

            try {
                Mi = stdp[2][i].getKlasse().getBezeichnung();
            } catch (NullPointerException e) {
                Mi = "-";
            }

            try {
                Do = stdp[3][i].getKlasse().getBezeichnung();
            } catch (NullPointerException e) {
                Do = "-";
            }

            try {
                Fr = stdp[4][i].getKlasse().getBezeichnung();
            } catch (NullPointerException e) {
                Fr = "-";
            }

            System.out.format(leftAlignFormat, Mo, Di, Mi, Do, Fr);
        }
    }

}