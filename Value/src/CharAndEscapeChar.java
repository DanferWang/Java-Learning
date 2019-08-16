
public class CharAndEscapeChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch1=97;
		char ch2='a';
		char ch3='\"';
		char ch4='Íõ';
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println("\""+ch1+ch2+ch3);
		System.out.println("\""+ch1+ch2+"\"");
		System.out.println("\"Hello Java\"");
		System.out.println(ch4);
	}

}
