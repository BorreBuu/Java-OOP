package viittaustyyppinen.muuttuja;

import java.util.HashMap;

public class Kirja {
	
	private String nimi;
    private String sisalto;
    private int julkaisuvuosi;

    public Kirja(String nimi, int julkaisuvuosi, String sisalto) {
        this.nimi = nimi;
        this.julkaisuvuosi = julkaisuvuosi;
        this.sisalto = sisalto;
    }

    public String getNimi() {
        return this.nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public int getJulkaisuvuosi() {
        return this.julkaisuvuosi;
    }

    public void setJulkaisuvuosi(int julkaisuvuosi) {
        this.julkaisuvuosi = julkaisuvuosi;
    }

    public String getSisalto() {
        return this.sisalto;
    }

    public void setSisalto(String sisalto) {
        this.sisalto = sisalto;
    }

    public String toString() {
        return "Nimi: " + this.nimi + " (" + this.julkaisuvuosi + ")\n"
            + "Sisältö: " + this.sisalto;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kirja jarkiJaTunteet = new Kirja("Järki ja tunteet", 1811, "The family of Dashwood had been long settled in Sussex....");
		Kirja ylpeysJaEnnakkoluulo = new Kirja("Ylpeys ja ennakkoluulo", 1813, "It is a truth universally acknowledged, that a single man in possession of a good fortune, must be in want of a wife....");
		
		HashMap<String, Kirja> hakemisto = new HashMap<>();
		hakemisto.put(jarkiJaTunteet.getNimi(), jarkiJaTunteet);
		hakemisto.put(ylpeysJaEnnakkoluulo.getNimi(), ylpeysJaEnnakkoluulo);
		
		Kirja kirja = hakemisto.get("Viisasteleva sydän");
		System.out.println(kirja);
		System.out.println();
		kirja = hakemisto.get("Ylpeys ja ennakkoluulo");
		System.out.println(kirja);
		
		/*Kirjasto kirjasto = new Kirjasto();
		kirjasto.lisaaKirja(jarkiJaTunteet);
		kirjasto.lisaaKirja(ylpeysJaEnnakkoluulo);

		System.out.println(kirjasto.haeKirja("ylpeys ja ennakkoluulo"));
		System.out.println();

		System.out.println(kirjasto.haeKirja("YLPEYS JA ENNAKKOLUULO"));
		System.out.println();

		System.out.println(kirjasto.haeKirja("JÄRKI"));
		//System.out.println(kirjasto.haeKirjaNimenOsalla("JÄRKI"));*/
		
	}

}
