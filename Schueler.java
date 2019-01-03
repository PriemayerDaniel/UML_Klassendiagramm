import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Schueler {
    private Integer katalognummer;
    private boolean eigenberechtigt;
   // DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
    private Date eintrittsdatum;

    public Date getEintrittsdatum() {
        return eintrittsdatum;
    }

    public Integer getKatalognummer() {
        return katalognummer;
    }


}
