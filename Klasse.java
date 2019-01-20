import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Klasse {
    private String bezeichnung;
    private Integer schulstufe;

    public Raum stammklasse;
    public Schueler klassensprecher;
    private Lehrer klassenvorstand;
    private Abteilung abteilung;

    public Set<Schueler> schuelerSet;
    public ArrayList<Fach> fliste;

    public Belegung[][] stdp;




    public Klasse(String bez, int sstf) {
        bezeichnung = bez;
        schulstufe = sstf;

        schuelerSet = new TreeSet<>();
        fliste = new ArrayList<>();
        stdp = new Belegung[5][10];
    }

    public Klasse(String bez, int sstf, Lehrer kv, Schueler s, Raum stk, Abteilung abt, Schueler ksp){
        bezeichnung = bez;
        schulstufe = sstf;

        klassenvorstand = kv;

        schuelerSet = new TreeSet<>();
        fliste = new ArrayList<>();
        stdp = new Belegung[5][10];
        schuelerSet.add(s);

        stammklasse = stk;
        abteilung = abt;
        setKlassensprecher(ksp);

    }

    public void generateStundeplan(Fach fachvklasse){
        int i , j , day = 0, shour = 0;
        boolean fertig = false;

            for(Lehrer abteilungslehrer : abteilung.lliste){
                for(Fach fachvlehrer : abteilungslehrer.fliste){
                    if(fachvlehrer == fachvklasse){

                        int y;

                        for(i = 0; i < 5; i++) {

                            for(j = 0; j < (10-fachvklasse.getWochenstunden()+1) ; j++) {

                                if((abteilungslehrer.stdp[i][j] == null) && (this.stdp[i][j] == null)) {

                                    for(y = 1; y < fachvklasse.getWochenstunden(); y++) {
                                        if((abteilungslehrer.stdp[i][j+y] == null) && (this.stdp[i][j+y] == null)) {
                                        }
                                        else {
                                            y = 0;
                                            day = 15;
                                            shour = 15;
                                            break;
                                        }
                                    }

                                    if(y == fachvklasse.getWochenstunden()){
                                        day = i;
                                        shour = j;

                                        j = 10;
                                        i = 5;

                                    }
                                }
                            }
                        }



                        if(fachvklasse.getRaumanforderungen().equals(stammklasse.getRaumtyp())){


                            if((day != 15) && (shour != 15)){

                                /*day--;
                                shour--;*/

                                Belegung b = new Belegung(fachvklasse.getWochenstunden(), this, abteilungslehrer,stammklasse, fachvklasse);
                                abteilung.bliste.add(b);

                                for(i = shour; i < (shour +fachvklasse.getWochenstunden()); i++){
                                    abteilungslehrer.stdp[day][i] = b;
                                    this.stdp[day][i] = b;
                                    stammklasse.raumb[day][i] = b;
                                }
                                fertig = true;
                                break;
                            }

                        }
                        else{
                            for(Raum ri: abteilung.rliste){

                                if(ri.getRaumtyp() == fachvklasse.getRaumanforderungen()){



                                    for(i = 0; i < 5; i++) {

                                        for(j = 0; j < 10; j++) {

                                            if((ri.raumb[i][j] == null) && (this.stdp[i][j] == null)) {

                                                for(y = 1; y < fachvklasse.getWochenstunden(); y++) {

                                                    if((ri.raumb[i][j+y] == null) && (this.stdp[i][j+y] == null)) {
                                                    }
                                                    else {
                                                        y = 0;
                                                        day = 15;
                                                        shour = 15;
                                                        break;
                                                    }
                                                }

                                                if(y == fachvklasse.getWochenstunden()){
                                                    day = i;
                                                    shour = j;

                                                    j = 10;
                                                    i = 5;

                                                }
                                            }
                                        }
                                    }

                                    if((day != 15) && (shour != 15)){

                                        /*day--;
                                        shour--;*/

                                        Belegung b = new Belegung(fachvklasse.getWochenstunden(), this, abteilungslehrer, ri, fachvklasse);
                                        abteilung.bliste.add(b);

                                        for(i = shour; i < shour + fachvklasse.getWochenstunden(); i++){
                                            ri.raumb[day][i] = b;
                                            abteilungslehrer.stdp[day][i] = b;
                                            stdp[day][i] = b;

                                        }
                                        fertig = true;
                                        break;
                                    }

                                }



                            }


                        }

                    }
                }

                if(fertig){
                    break;
                }
            }


    }





    public boolean addFach(Fach f){
        generateStundeplan(f);
        return fliste.add(f);

    }


    public String getBezeichnung() {
        return bezeichnung;
    }
    public Integer getSchulstufe() {
        return schulstufe;
    }

    public float getDurchschnittsalter(){
        int dalter = 0;
        int z = 0;
        LocalDate today = LocalDate.now();

        for (Schueler is : schuelerSet) {

            LocalDate birthDate = is.getGeburtsdatum();
            dalter += Period.between(birthDate, today).getYears();
            z++;

        }

        return ((float) dalter / (float) z);

    }

    public boolean setKlassensprecher(Schueler klassensprecher) {


        boolean b = false;

        for(Schueler is : schuelerSet){
            if(is == klassensprecher){
                b = true;
            }
        }

        if(b) {
            this.klassensprecher = klassensprecher;
            return b;
        }

        return false;
    }


    public boolean addSchueler(Schueler schueler) {
        int knr = 1;

        if(schuelerSet.size() >= 36){
            return false;
        }

        schuelerSet.add(schueler);

        for(Schueler is : schuelerSet){
            is.katalognummer = knr;
            knr++;
        }

        return true;
    }

    public Set<Schueler> getSchueler() {
        return schuelerSet;
    }

    public void exportStundenplan(){

        System.out.println(this.getBezeichnung());

        String leftAlignFormat = "| %-6s | %-6s | %-6s | %-6s | %-6s|%n";

        System.out.format(leftAlignFormat, "Mo","Di","Mi","Do","Fr");

        for(int i = 0; i < 10; i++){
            System.out.format("---------|--------|--------|--------|--------%n");
            String Mo, Di, Mi, Do, Fr;

            try{
                Mo = stdp[0][i].getFach().getName();
            }
            catch(NullPointerException e){
                Mo = "-";
            }

            try{
                Di = stdp[1][i].getFach().getName();
            }
            catch(NullPointerException e){
                Di = "-";
            }

            try{
                Mi = stdp[2][i].getFach().getName();
            }
            catch(NullPointerException e){
                Mi = "-";
            }

            try{
                Do = stdp[3][i].getFach().getName();
            }
            catch(NullPointerException e){
                Do = "-";
            }

            try{
                Fr = stdp[4][i].getFach().getName();
            }
            catch(NullPointerException e){
                Fr = "-";
            }

            System.out.format(leftAlignFormat, Mo, Di, Mi, Do, Fr);
        }
    }



}