import java.util.Scanner;
public class YearAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("输入待确认的年份： ");
		int year=input.nextInt();
		int rank=year%12;
		switch(rank)
		{
		case 0:
			System.out.println(year+"是猴年");
			break;
		case 1:
			System.out.println(year+"是鸡年");
			break;
		case 2:
			System.out.println(year+"是狗年");
			break;
		case 3:
			System.out.println(year+"是猪年");
			break;
		case 4:
			System.out.println(year+"是鼠年");
			break;
		case 5:
			System.out.println(year+"是牛年");
			break;
		case 6:
			System.out.println(year+"是虎年");
			break;
		case 7:
			System.out.println(year+"是兔年");
			break;
		case 8:
			System.out.println(year+"是龙年");
			break;
		case 9:
			System.out.println(year+"是蛇年");
			break;
		case 10:
			System.out.println(year+"是马年");
			break;
		case 11:
			System.out.println(year+"是羊年");
			break;
		}
	}

}
