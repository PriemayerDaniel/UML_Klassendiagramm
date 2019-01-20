import java.util.ArrayList;

enum Raumtypenum{
    Klassenzimmer,
    Laborraum
}


public class Raum {
    
	
	//variablen
	private String raumnummer;
    private int maxsitzplaetze;
    private String raumtyp;
    public Klasse Stammklasse;
    public Belegung[][] raumb;


    //konstruktoren
    
    public Raum(String raumN, int maxsitzpl, String raumt) {
    	raumnummer = raumN;
    	maxsitzplaetze = maxsitzpl;
    	raumtyp = raumt;
    	raumb = new Belegung[5][10];
    }
    
    public Raum(){}
    
    //methoden
    	
    public int getMaxsitzplaetze() {
        return maxsitzplaetze;
    }

    public String getRaumnummer() {
        return raumnummer;
    }
    
    public String getRaumtyp() {
    	return raumtyp;
    }

    public void exportRaumbelegung() {

        System.out.println(this.raumnummer);

        String leftAlignFormat = "| %-6s | %-6s | %-6s | %-6s | %-6s|%n";

        System.out.format(leftAlignFormat, "Mo", "Di", "Mi", "Do", "Fr");

        for (int i = 0; i < 10; i++) {
            System.out.format("---------|--------|--------|--------|--------%n");
            String Mo, Di, Mi, Do, Fr;

            try {
                Mo = raumb[0][i].getKlasse().getBezeichnung();
            } catch (NullPointerException e) {
                Mo = "-";
            }

            try {
                Di = raumb[1][i].getKlasse().getBezeichnung();
            } catch (NullPointerException e) {
                Di = "-";
            }

            try {
                Mi = raumb[2][i].getKlasse().getBezeichnung();
            } catch (NullPointerException e) {
                Mi = "-";
            }

            try {
                Do = raumb[3][i].getKlasse().getBezeichnung();
            } catch (NullPointerException e) {
                Do = "-";
            }

            try {
                Fr = raumb[4][i].getKlasse().getBezeichnung();
            } catch (NullPointerException e) {
                Fr = "-";
            }

            System.out.format(leftAlignFormat, Mo, Di, Mi, Do, Fr);
        }
    }

    
   /* public void exportBelegung() {
    	
    	for(int tag = 1; tag <= 7; tag++) {
    		
    		for(int stunde = 1; stunde <=10; stunde ++) {
    			  
    			
    		}
    	}
    }
    
    public Belegung getBelegung(DayOfWeek tag, int )*/
    
    
   // ArrayList<Fach> Faecher = new ArrayList<Fach>();
}
