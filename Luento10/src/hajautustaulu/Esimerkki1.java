package hajautustaulu;

import java.util.HashMap;

public class Esimerkki1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//esimerkki1 a
		HashMap<String, String> postinumerot = new HashMap<>();
		postinumerot.put("00710", "Helsinki");
		postinumerot.put("90014", "Oulu");
		postinumerot.put("33720", "Tampere");
		postinumerot.put("33014", "Tampere");
		
		System.out.println(postinumerot.get("00710"));
		System.out.println(postinumerot.get("20100"));
		
		//esimerkki 1b
		
		HashMap<String, String> dinot = new HashMap<>();
		
		dinot.put("Marjukka", "T-Rex");
		dinot.put("Kaarlo", "Kentrosaurus");
		dinot.put("Olavi", "Oviraptor");
		
		System.out.println(dinot.get("Marjukka"));
		dinot.put("Marjukka", "Stegosaurus");
		System.out.println(dinot.get("Marjukka"));

	}

}
