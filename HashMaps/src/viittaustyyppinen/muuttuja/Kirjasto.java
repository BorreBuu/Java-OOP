package viittaustyyppinen.muuttuja;

import java.util.ArrayList;
import java.util.HashMap;

public class Kirjasto {
	private HashMap<String, Kirja> hakemisto;

    public Kirjasto() {
        this.hakemisto = new HashMap<>();
    }

    public void lisaaKirja(Kirja kirja) {
    	String nimi = siistiMerkkijono(kirja.getNimi());

        //containsKey-metodin avulla voimme tarkistaa onko avain jo olemassa
        //metodi palauttaa arvon true, jos avaimella on mikä tahansa arvo
        if (this.hakemisto.containsKey(nimi)) {
            System.out.println("Kirja on jo kirjastossa!");
        } else {
            hakemisto.put(nimi, kirja);
        }
    }
    
    public Kirja haeKirja(String kirjanNimi) {
        kirjanNimi = siistiMerkkijono(kirjanNimi);
        return this.hakemisto.get(kirjanNimi);
    }

    public void poistaKirja(String kirjanNimi) {
        kirjanNimi = siistiMerkkijono(kirjanNimi);

        if (this.hakemisto.containsKey(kirjanNimi)) {
            this.hakemisto.remove(kirjanNimi);
        } else {
            System.out.println("Kirjaa ei löydy, ei voida poistaa!");
        }
    }
    
    public static String siistiMerkkijono(String merkkijono) {
        if (merkkijono == null) {
            return "";
        }

        merkkijono = merkkijono.toLowerCase();
        return merkkijono.trim();
    }
    
    /*public ArrayList<Kirja> haeKirjaNimenOsalla(String nimenOsa) {
        nimenOsa = siistiMerkkijono(nimenOsa);

        ArrayList<Kirja> kirjat = new ArrayList<>();

        for(String kirjanNimi : this.hakemisto.keySet()) {
            if(!kirjanNimi.contains(nimenOsa)) {
                continue;
            }

            // mikäli avain sisältää haetun merkkijonon, haetaan avaimeen
            // liittyvä arvo ja lisätään se palautettavien kirjojen joukkoon
            kirjat.add(this.hakemisto.get(kirjanNimi));
        }

        return kirjat;
    }*/
    
}
