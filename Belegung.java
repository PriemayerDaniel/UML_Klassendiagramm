
public class Belegung {
	
	//variablen
	private int unterrichtseinheit;
	//??????
	private Lehrer lehrer;
	private Klasse klasse;
	private Unterrichtstagenum unterrichtstag;
	
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
unterrichtsEinheit: int
+getWochentag(): Unterrichtstag
+getKlasse(): Klasse
+getLehrer(): Lehre