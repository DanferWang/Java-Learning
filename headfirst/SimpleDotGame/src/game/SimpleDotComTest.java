package game;

public class SimpleDotComTest {
	public static void main(String[] args) {
		SimpleDotCom dot = new SimpleDotCom();
		
		int[] test = {2,3,4};
		dot.setLocationCells(test);
		
		String userGuess = "6";
		String result = dot.checkYourself(userGuess);
		String testReslut = "failed";
		if(result == "miss") {
			testReslut = "passed";
		}
		System.out.println(testReslut);
	}

}
