import java.util.Scanner;
public class YearAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("�����ȷ�ϵ���ݣ� ");
		int year=input.nextInt();
		int rank=year%12;
		switch(rank)
		{
		case 0:
			System.out.println(year+"�Ǻ���");
			break;
		case 1:
			System.out.println(year+"�Ǽ���");
			break;
		case 2:
			System.out.println(year+"�ǹ���");
			break;
		case 3:
			System.out.println(year+"������");
			break;
		case 4:
			System.out.println(year+"������");
			break;
		case 5:
			System.out.println(year+"��ţ��");
			break;
		case 6:
			System.out.println(year+"�ǻ���");
			break;
		case 7:
			System.out.println(year+"������");
			break;
		case 8:
			System.out.println(year+"������");
			break;
		case 9:
			System.out.println(year+"������");
			break;
		case 10:
			System.out.println(year+"������");
			break;
		case 11:
			System.out.println(year+"������");
			break;
		}
	}

}
