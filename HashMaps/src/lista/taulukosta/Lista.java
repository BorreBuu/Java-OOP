package lista.taulukosta;

public class Lista<T> {
	
	private T[] arvot;
	private int arvoja;
	
	public Lista()  {
		this.arvot = (T[]) new Object[10];
		this.arvoja = 0;
	}
	
	public void lisaa(T arvo) {
		if (this.arvoja == this.arvot.length) {
			kasvata();
		}
		this.arvot[this.arvoja] = arvo;
		this.arvoja++;
	}
	
	private void kasvata() {
		int uusiKoko = this.arvot.length + this.arvot.length / 2;
		T[] uusi = (T[]) new Object[uusiKoko];
		for (int i = 0; i < this.arvot.length; i++) {
			uusi[i] = this.arvot[i];
		}
		this.arvot = uusi;	
	}
	
	// Tarkastetaan, jos arvo on listallamme
	// edellytetään, että käyttäjä ei lisää listalle null-viitettä
	// edellyttää, että equals-metodi tarkastaa ettei parametrina saatu arvo ole null
	public boolean sisaltaa(T arvo) {
		/*for (int i = 0; i < this.arvoja; i++) {
			if (this.arvot[i].equals(arvo)) {
				return true;
			}
		}
		return false;*/
		//tämän metodin voi suorittaa arvonIndeksi avulla
		//palauttaa true, jos arvo on suurempi tai yhtäsuusi kuin 0
		return arvonIndeksi(arvo) >= 0;
	}
	//tämä on aika monimutkainen metodi, parempi tapa hajottaa kahteen
	// eli arvonIndeksi-metodiin ja siirraVasemmalle metodiin
	// huom! uusi poista-metodi löytyy alempaa, siinä kutsutaan arvonIdeksi
	//ja siirraVasemmalle metodeja
	/*public void poista(T arvo) {
		boolean loytyi = false;
		for (int i = 0; i < this.arvoja; i++) {
			if (loytyi) {
				this.arvot[i - 1] = this.arvot[i];
			} else if (arvo == this.arvot[i] || this.arvot[i].equals(arvo)) {
				this.arvoja--;
				loytyi = true;
			}
		}
	} */
	
	public int arvonIndeksi(T arvo) {
		for (int i = 0; i < this.arvoja; i++) {
			if (this.arvot[i].equals(arvo)) {
				return i;
			}
		}
		
		return -1;
	}
	
	private void siirraVasemmalle(int indeksistaLahtien) {
		for (int i = indeksistaLahtien; i < this.arvoja - 1; i++) {
			this.arvot[i] = this.arvot[i+1];
		}
	}
	
	public void poista(T arvo) {
		int arvonIndeksi = arvonIndeksi(arvo);
		//jos arvonIndeksi metodi palauttaa -1
		if (arvonIndeksi < 0) {
			return;
		}
		
		siirraVasemmalle(arvonIndeksi);
		this.arvoja--;
	}
	
	//Kohdasta hakeminen (get-metodi)
	public T arvo(int indeksi) {
		if (indeksi < 0 || indeksi >= this.arvoja) {
			throw new ArrayIndexOutOfBoundsException("Indeksi " + 
		indeksi + " alueen [0, " + this.arvoja + " ] ulkopuolella.");
		}
		
		return this.arvot[indeksi];
	}
	
	public int koko() {
		return this.arvoja;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista<String> lista = new Lista<>();
		lista.lisaa("hei");
		lista.lisaa("maailma");
		
		for (int i = 2; i < 11; i++) {
			lista.lisaa("jee");
		}
		
		System.out.println(lista.sisaltaa("moi"));
		lista.lisaa("moi");
		System.out.println(lista.sisaltaa("moi"));
		int indeksi = lista.arvonIndeksi("moi");
		System.out.println(indeksi);
		System.out.println(lista.arvo(indeksi));
		lista.poista("moi");
		System.out.println(lista.sisaltaa("moi"));
		
		for(int i = 0; i < lista.koko(); i++) {
		    System.out.println(lista.arvo(i));
		}

	}

}
