package tyyppimuunnos;

import java.util.HashMap;

public class Rekisteribongauslaskuri {
	private HashMap<String, Integer> bongatut;

    public Rekisteribongauslaskuri() {
        this.bongatut = new HashMap<>();
    }

    public void lisaaBongaus(String bongattu) {
        /*if (!this.bongatut.containsKey(bongattu)) {
            this.bongatut.put(bongattu, 0);
        }

        int montakoBongausta = this.bongatut.get(bongattu);
        montakoBongausta++;
        this.bongatut.put(bongattu, montakoBongausta);*/
    	int montakoBongausta = this.bongatut.getOrDefault(bongattu, 0);
        montakoBongausta++;
        this.bongatut.put(bongattu, montakoBongausta);
    }

   /* //palauttaa int-tyyppisen muuttujan
    public int montakoKertaaBongattu(String bongattu) {
        this.bongatut.get(bongattu);
    }*/
    
    public int montakoKertaaBongattu(String bongattu) {
        return this.bongatut.getOrDefault(bongattu, 0);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rekisteribongauslaskuri bongaukset = new Rekisteribongauslaskuri();
		bongaukset.lisaaBongaus("ABC-123");
		System.out.println(bongaukset.montakoKertaaBongattu("ABC-123"));
		bongaukset.lisaaBongaus("ABC-123");
		bongaukset.lisaaBongaus("ABC-123");
		System.out.println(bongaukset.montakoKertaaBongattu("ABC-123"));
		System.out.println(bongaukset.montakoKertaaBongattu("DEF-456"));
		

	}

}
