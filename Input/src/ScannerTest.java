import java.util.Scanner;
public class ScannerTest
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.println("ÊäÈë£º");
		String str=input.nextLine();
		System.out.println("Êä³ö£º"+str);
	}
}