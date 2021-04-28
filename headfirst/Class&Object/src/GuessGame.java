
public class GuessGame {
	Player p1;
	Player p2;
	Player p3;
	
	public void startGame() {
		System.out.println("Guessing Game Starts!");
		while(true) {
			int GameNum = (int)(Math.random()*10);
			System.out.println("Game guess "+GameNum);
			
			p1 = new Player();
			p2 = new Player();
			p3 = new Player();
			
			boolean p1IsRight = false;
			boolean p2IsRight = false;
			boolean p3IsRight = false;
			
			p1.guess();
			p2.guess();
			p3.guess();
			
			int p1Num = p1.number;
			int p2Num = p2.number;
			int p3Num = p3.number;
			
			if (p1Num == GameNum) {
				p1IsRight = true;
			}
			if (p2Num == GameNum) {
				p2IsRight = true;
			}
			if (p3Num == GameNum) {
				p3IsRight = true;
			}
			if(p1IsRight || p2IsRight || p3IsRight) {
				System.out.println("Someone guessed right Number!");
				System.out.println("Player 1 is "+p1IsRight);
				System.out.println("Player 2 is "+p2IsRight);
				System.out.println("Player 3 is "+p3IsRight);
				break;
			}
		}
		}
		
}
