
public class breakWithLabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int j=0;
		int k=0;
		while (i<=2)
		{
			System.out.println("��һ��ѭ��"+i);
			point:
				while(j<=2)
				{
					System.out.println("�ڶ���ѭ��"+j);
					j++;
					while(k<=2)
					{
						System.out.println("������ѭ��"+k);
						k++;
						break point;
					}
				}
			i++;
		}
	}

}
