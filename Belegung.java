
public class Belegung {
	
	//variablen
	private int unterrichtseinheit;
	//??????
	private Lehrer lehrer;
	private Klasse klasse;
	private Unterrichtstag unterrichtstag;
	private Raum raum;
	private Fach fach;
	
	
	//konstruktoren
	public Belegung(int unterrichtseinh, Klasse kl, Unterrichtstag unterrichtst, Lehrer lehr, Raum RAUM, Fach FACH) {
		unterrichtstag = unterrichtst;
		unterrichtseinheit = unterrichtseinh;
		klasse = kl;
		lehrer = lehr;
		raum = RAUM;
		fach = FACH;
	}
	
	
	//methoden
	public Klasse getKlasse() {
		return klasse;
	}
	
	public Lehrer getLehrer() {
		return lehrer;
	}
	
	public Unterrichtstag getWochentag() {
		return unterrichtstag; 
	}
	
}
