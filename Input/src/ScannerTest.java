import java.util.Scanner;
public class ScannerTest
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.println("���룺");
		String str=input.nextLine();
		System.out.println("�����"+str);
	}
}