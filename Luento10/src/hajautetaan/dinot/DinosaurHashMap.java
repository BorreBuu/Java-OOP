package hajautetaan.dinot;

import java.util.ArrayList;
import java.util.HashMap;

public class DinosaurHashMap {
	private HashMap<Integer, Dinosaur> dinosaurdata;
	
	public DinosaurHashMap() {
		this.dinosaurdata = new HashMap<>();
	}
	
	public void addDinosaur(Integer id, Dinosaur dinosaur) {
		if (this.dinosaurdata.containsKey(id)) {
			System.out.println("Dinosaurus already exists in hashmap");
		} else {
			this.dinosaurdata.put(id, dinosaur);
		}
	}
	
	public Dinosaur findDino(Integer id) {
		return this.dinosaurdata.get(id);
	}
	
	public void removeDino(Integer id) {
		if (this.dinosaurdata.containsKey(id)) {
			this.dinosaurdata.remove(id);
		} else {
			System.out.println("Dinosaurus cannot be found, not able to remove");
		}
	}
	
	public ArrayList<Dinosaur> searchDinoWithName(String name) {
		ArrayList<Dinosaur> dinosaursList = new ArrayList<>();
		for (Dinosaur dinosaur : this.dinosaurdata.values()) {
			if (!dinosaur.getName().contains(name)) {
				continue;
			}
			dinosaursList.add(dinosaur);
		}
		return dinosaursList;
	}

}
