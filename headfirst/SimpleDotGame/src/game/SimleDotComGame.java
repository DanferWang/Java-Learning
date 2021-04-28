package game;

import java.util.Scanner;

public class SimleDotComGame {
	public static void main(String[] args) {
		String guess, res;
		int numOfGuesses = 0;
		Scanner sc = new Scanner(System.in);
		int init = (int)(Math.random()*(7-1)+1);
		int[] initArray = {init, init+1,init+2};
		SimpleDotCom game = new SimpleDotCom();
		game.setLocationCells(initArray);
		
		boolean isAlive = true;
		while(isAlive) {
			System.out.println("input the grid");
			guess = sc.next();
			numOfGuesses++;
			res = game.checkYourself(guess);
			if(res.equals("kill")) {
				isAlive = false;
				System.out.println("Game ends! use " + numOfGuesses + " steps");
			}
		}
		
	}

}
