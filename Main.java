import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Schule HTL = null;

        HTL = new Schule("HTL",123L,"Technik",
                new Lehrer(1234L, "Martin", "Pfeffel", "01.01.1919", "martin.pfeffel@htlstp.at", new Adresse("STP","Waldstraße", 99,1234), "PFEF"),
                new Adresse("STP","Waldstraße",3,3100),
                new Abteilung("Elektronik und Technische Informatik", "EL", HTL));

        HTL.addAbteilung("Elektrotechnik", "ET");

        Fach FSST = new Fach("FSST", 4, "KLASSENZIMMER");
        Fach GGP = new Fach("GGP", 1, "KLASSENZIMMER");
        Fach Labor = new Fach("Labor", 2, "LABORRAUM");
        Fach HWE = new Fach("HWE", 3, "LABORRAUM");
        Fach AM = new Fach("AM", 3, "KLASSENZIMMER");

        Raum W211 = new Raum("W211",36,"KLASSENZIMMER");
        Raum W213 = new Raum("W213",36,"KLASSENZIMMER");



        for(Abteilung iabt : HTL.getAbteilungen()){
            if(iabt.getKuerzel().equals("EL")){
                Lehrer abv = new Lehrer(3210L, "Wolfgang", "Kuran", "01.01.1919", "wolfgang.kuran@htlstp.at",new Adresse("STP", "Waldstraße", 99, 1234), "KURA");
                //iabt.setAbteilungsvorstand(abv);
                iabt.addLehrer(abv);
                abv.addFach(FSST);


                Lehrer AHkv = new Lehrer(1231L, "Christian", "CRHA", "01.01.1919", "christian.crha@htlstp.at",new Adresse("STP", "Waldstraße", 99, 1234), "CRHA");
                iabt.addLehrer(AHkv);
                AHkv.addFach(HWE);
                AHkv.addFach(Labor);

                Lehrer BHkv = new Lehrer(2231L, "abcdef", "Sengstschmid", "01.01.1919", "abcdef.sengstschmied@htlstp.at",new Adresse("STP", "Waldstraße", 99, 1234), "SENG");
                iabt.addLehrer(BHkv);
                BHkv.addFach(AM);

                Lehrer peham = new Lehrer(2231L, "Christop", "Peham", "01.01.1919", "christoph.peham@htlstp.at",new Adresse("STP", "Waldstraße", 99, 1234), "PEHA");
                iabt.addLehrer(peham);
                peham.addFach(GGP);

                iabt.rliste.add(W211);
                iabt.rliste.add(new Raum("W011",36,"LABORRAUM"));
                iabt.rliste.add(W213);
                iabt.rliste.add(new Raum("V109",36,"LABORRAUM"));


                Schueler AHksp = new Schueler(1234L, "Florian","Höllerer","14.02.2000","flotschi.hölli@gpunkt.at",new Adresse("Gföhl","Holaweg",69,1234), "03.09.1939");
                Schueler BHksp = new Schueler(4534L, "abcd","efgh","15.09.2000","abcd.efgh@htlstp.at",new Adresse("AOrt","BStraße",12,1234), "03.09.2015");

                iabt.addKlasse(new Klasse("4AHELS",4, AHkv, AHksp, W211,iabt, AHksp));
                iabt.addKlasse(new Klasse("4BHELS", 4, BHkv, BHksp, W213, iabt, BHksp));

                Schueler asprecher = new Schueler(3333L, "Sebastian","Krampl","10.06.2001","sebastian.krampl@htlstp.at",new Adresse("Hart","Straße",88,3100), "03.09.2015");

                for(Klasse ik : iabt.kliste){
                    if(ik.getBezeichnung().equals("4AHELS")){
                        ik.addSchueler(new Schueler(1534L, "Benjamin","Gassner","22.06.2001","benji.gassner@htlstp.at",new Adresse("Gföhl","Gasse",88,1234), "03.09.2015"));
                        ik.addSchueler(new Schueler(1244L, "Daniel","Priemayer","10.05.2001","daniel.priemayer@htlstp.at",new Adresse("Waidhofen","Hauptstraße",1,4234), "03.09.2015"));
                        ik.addSchueler(new Schueler(1893L, "Gruber","Lukas","21.03.2001","luki.grubsi@htlstp.at",new Adresse("Zelking","Grubenstraße",88,2144), "03.09.2015"));
                        ik.addSchueler(asprecher);
                        ik.addFach(FSST);
                        ik.addFach(GGP);
                        ik.addFach(AM);
                        ik.addFach(Labor);
                        ik.addFach(HWE);
                        //ik.exportStundenplan();
                    }
                    else if(ik.getBezeichnung().equals("4BHELS")){
                        ik.addSchueler(new Schueler(4321L, "dcba","hgfe","14.09.2000","dcba.hgfe@gpunkt.at", new Adresse("DOrt","hStraße",21,1234), "03.09.2015"));
                        ik.addFach(FSST);
                        ik.addFach(GGP);
                        ik.addFach(AM);
                        ik.addFach(Labor);
                        ik.addFach(HWE);
                        //ik.exportStundenplan();
                    }
                }


                for(Klasse ki : iabt.kliste){
                    ki.exportStundenplan();
                }
                for(Lehrer li : iabt.lliste){
                    li.exportStundenplan();
                }
                for(Raum ri : iabt.rliste){
                    ri.exportRaumbelegung();
                }
            }
            else if(iabt.getKuerzel().equals("ET")){
                Lehrer ETabv = new Lehrer(3123L, "ETvorstand","ETnachstand","01.01.1929", "ETvorstand.ETnachstand@htlstp.at", new Adresse("ETOrt", "ETStraße", 520, 5200), "ETET");
                iabt.setAbteilungsvorstand(ETabv);
                iabt.addLehrer(ETabv);

                Lehrer AHkv = new Lehrer(1231L, "ETL", "Lehrer", "01.01.1919", "ETl.Lehrer@htlstp.at",new Adresse("STP", "Waldstraße", 99, 1234), "ETL");
                iabt.addLehrer(AHkv);

                Schueler AHksp = new Schueler(5432L, "ETS","Schüler","14.02.2001","ETS.Schüler@gpunkt.at",new Adresse("ETOrt","ETStraße",44,1234), "03.09.2015");

                iabt.addKlasse(new Klasse("4AHET",4, AHkv, AHksp, new Raum(), iabt, AHksp));
            }
        }






    }
}
