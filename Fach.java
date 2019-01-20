public class Fach {
   
	//variablen
	private String name;
    private Integer wochenstunden;
    private String raumanforderung;

    //konstruktoren
    public Fach(String name, int wochenst, String raumanf) {
    	this.name = name;
    	wochenstunden = wochenst;
    	raumanforderung = raumanf;
    	
    }
    
    
    
    
    //methoden
    public String getName() {
        return name;
    }

    public Integer getWochenstunden() {
        return wochenstunden;
    }
    
    public String getRaumanforderungen() {
    	return raumanforderung;
    }
    
    public void setName(String name) {
		this.name = name;
	}
    
    public void setRaumanforderung(String raumanforderung) {
		this.raumanforderung = raumanforderung;
	}
    
    public void setWochenstunden(Integer wochenstunden) {
		this.wochenstunden = wochenstunden;
	}
   
}
