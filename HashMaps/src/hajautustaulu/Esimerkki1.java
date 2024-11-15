package hajautustaulu;

import java.util.HashMap;

public class Esimerkki1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//a
		HashMap<String, String> postinumerot = new HashMap<>();
		postinumerot.put("00710", "Helsinki");
		postinumerot.put("90014", "Oulu");
		postinumerot.put("33720", "Tampere");
		postinumerot.put("33014", "Tampere");

		System.out.println(postinumerot.get("00710")); //Helsinki
		System.out.println(postinumerot.get("20100")); //ei ole, #null
		
		//b
		HashMap<String, String> dinot = new HashMap<>();
		
		dinot.put("Marjukka", "T-rex");
		dinot.put("Kaarlo", "Stegosaurus");
		dinot.put("Olavi", "Oviraptor");
		
		System.out.println(dinot.get("Marjukka"));
		dinot.put("Marjukka", "Kentrosaurus");
		System.out.println(dinot.get("Marjukka"));
		
		//c
		int avain = 2;
		HashMap<Integer, Integer> taulu = new HashMap<>();
		taulu.put(avain, 10);
		int arvo = taulu.get(avain);
		System.out.println(arvo);

	}

}
