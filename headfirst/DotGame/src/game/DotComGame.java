package game;

import java.util.ArrayList;

public class DotComGame {

	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
	private int numOfGuess = 0;

	public static void main(String[] args) {
		DotComGame game = new DotComGame();
		game.startGame();
		game.startPlay();
	}

	private void startGame() {
		DotCom pet = new DotCom();
		pet.setName("Pets.com");
		DotCom go2 = new DotCom();
		go2.setName("Go2.com");
		DotCom ask = new DotCom();
		ask.setName("AskMe.com");
		dotComList.add(pet);
		dotComList.add(go2);
		dotComList.add(ask);

		for (DotCom com : dotComList) {
			ArrayList<String> newLocation = helper.placeDotCom(3);
			com.setLocationCells(newLocation);
		}

		System.out.println("input cell to hit");
	}

	private void check(String guess) {
		numOfGuess++;
		String res = "miss";
		for (DotCom com : dotComList) {
			res = com.checkYourself(guess);
			if (res.equals("hit")) {
				break;
			}
			if (res.equals("kill")) {
				dotComList.remove(com);
				break;
			}
		}
		System.out.println(res);
	}

	private void startPlay() {
		while (!dotComList.isEmpty()) {
			String input = helper.getUserInput("your guess: ");
			check(input);
		}
		System.out.println("you take " + numOfGuess + " steps to kill all DotCom!");
	}

}
