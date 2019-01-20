public class Fach {
   
	//variablen
	private String name;
    private Integer wochenstunden;
    private Raumtyp raumanforderung;

    //konstruktoren
    public Fach(String NAME, int wochenst, Raumtyp raumanf) {
    	name = NAME;
    	wochenstunden = wochenst;
    	raumanforderung = raumanf;
    	
    }
    
    
    
    
    //methoden
    public String getName() {
        return name;
    }

    public Integer getWochenstunden() {
        return wochenstundenn;
    }
    
    public Raumtyp getRaumanforderungen() {
    	return raumanforderung;
    }
    
    public void setName(String name) {
		this.name = name;
	}
    
    public void setRaumanforderung(Raumtyp raumanforderung) {
		this.raumanforderung = raumanforderung;
	}
    
    public void setWochenstunden(Integer wochenstunden) {
		this.wochenstunden = wochenstunden;
	}
   
}
