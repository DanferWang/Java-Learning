import java.util.Scanner;
public class Boolean {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		boolean DanferIsMale;
		@SuppressWarnings("resource")
		Scanner judgement=new Scanner(System.in);
		System.out.println("Danfer's Sex?");
		String str=judgement.nextLine();
		System.out.println("Your judgement is "+str);
		if(str.equals("male"))
		{
			DanferIsMale=true;
		}
		else DanferIsMale=false;
		System.out.println("Your judgement is "+DanferIsMale);
	}

}
