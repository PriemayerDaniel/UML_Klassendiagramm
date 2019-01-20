enum Unterrichtstagenum{
	MONTAG,
	DIENSTAG,
	MITTWOCH,
	DONNERSTAG,
	FREITAG;
}


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
	public Belegung(int unterrichtseinh, Klasse kl, Unterrichtstag unterrichtst, Lehrer lehr, Raum raum, Fach fach) {
		unterrichtstag = unterrichtst;
		unterrichtseinheit = unterrichtseinh;
		klasse = kl;
		lehrer = lehr;
		this.raum = raum;
		this.fach = fach;
	}


	public Belegung(int unterrichtseinh, Klasse kl, Lehrer lehr, Raum raum, Fach fach) {
		unterrichtseinheit = unterrichtseinh;
		klasse = kl;
		lehrer = lehr;
		this.raum = raum;
		this.fach = fach;
	}
	
	//methoden
	public Klasse getKlasse() {
		return klasse;
	}
	
	public Lehrer getLehrer() {
		return lehrer;
	}

	public Fach getFach() {
		return fach;
	}

	public Unterrichtstag getWochentag() {
		return unterrichtstag; 
	}
	
}
