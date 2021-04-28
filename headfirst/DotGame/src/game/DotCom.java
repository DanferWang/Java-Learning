package game;

import java.util.ArrayList;

public class DotCom {
	private ArrayList<String> locationCells;
	private String name;

	public void setLocationCells(ArrayList<String> locationCells) {
		this.locationCells = locationCells;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public String checkYourself(String stringGuess) {
		String res = "miss";
		int index = locationCells.indexOf(stringGuess);
		if (index >= 0) {
			locationCells.remove(index);
			if (locationCells.isEmpty()) {
				res = "kill";
				System.out.println("you kill " + this.name);
			} else {
				res = "hit";
				System.out.println("you hit " + this.name);
			}
		}
		return res;
	}

}
