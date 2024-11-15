package hajautetaan.dinot;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class Dinosaur {
	private final String name;
    private final int age;
    private final String species;
    private final String liveOn;
    //private final MainFoodSource mainFoodSource;
    private String favoriteFood;


    public Dinosaur() {
        // are these default values valid at all?
        this.name = "name";
        this.age = 0;
        this.species = "species";
        //this.mainFoodSource = MainFoodSource.CARNIVORE; //
        this.liveOn = "AFL";
        this.favoriteFood = null;
    }
    
    public Dinosaur(String name, int age, String species, String liveOn, String favoriteFood) {
        this.name = name;
        this.age = age;
        this.species = species;
        //this.mainFoodSource = mainFoodSource;
        this.liveOn = liveOn;
        this.favoriteFood = favoriteFood;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public String toString() {
        return "Dinosaur{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", species='" + species + '\'' +
                ", liveOn=" + liveOn +
                ", favorite food=" + favoriteFood +
                '}';
    }	

	public static void main(String[] args) {
		Dinosaur marjukka = new Dinosaur("Marjukka", 83, "T-rex", "Land", "spiders");
		Dinosaur kaarlo = new Dinosaur("Kaarlo", 155, "Stegosaurus", "Land", "lehmuksen lehdet");
		Dinosaur olavi = new Dinosaur("Olavi", 89, "Oviraptor", "Land", "dodo egg");
		
		//annetaan idnumero jokaiselle dinosaurukselle avaimeksi
		HashMap<Integer, Dinosaur> dinosaurs = new HashMap<>();
		dinosaurs.put(1, marjukka);
		dinosaurs.put(2, kaarlo);
		dinosaurs.put(3, olavi);
		
		System.out.println(dinosaurs.get(1));
		System.out.println();
		for (Map.Entry<Integer, Dinosaur> ite : dinosaurs.entrySet())
			System.out.println(ite.getKey());
		
		Dinosaurs dinosaursHash = new Dinosaurs();
		dinosaursHash.addDinosaur(1, marjukka);
		dinosaursHash.addDinosaur(2, kaarlo);
		dinosaursHash.addDinosaur(3, olavi);
		System.out.println("From Dinosaurs object");
		System.out.println(dinosaursHash.findDino(1));
		System.out.println();
		System.out.println(dinosaursHash.findDino(2));
		System.out.println("Etsitään nimellä");
		System.out.println(dinosaursHash.searchDinoWithName("Olavi"));
	}

}
