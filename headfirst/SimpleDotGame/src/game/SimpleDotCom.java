package game;

public class SimpleDotCom {
	private int[] locationCells;
	private int numOfHits;

	public void setLocationCells(int[] locationCells) {
		this.locationCells = locationCells;
	}

	public String checkYourself(String stringGuess) {
		int guess = Integer.parseInt(stringGuess);
		String res = "miss";

		for (int i = 0; i < locationCells.length; i++) {
			if (guess == locationCells[i]) {
				res = "hit";
				locationCells[i] = -1;
				numOfHits++;
				break;
			}
		}
		if (numOfHits == locationCells.length) {
			res = "kill";
		}
		System.out.println(res);
		return res;
	}

}
