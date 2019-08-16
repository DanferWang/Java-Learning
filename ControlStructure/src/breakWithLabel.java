
public class breakWithLabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int j=0;
		int k=0;
		while (i<=2)
		{
			System.out.println("第一重循环"+i);
			point:
				while(j<=2)
				{
					System.out.println("第二重循环"+j);
					j++;
					while(k<=2)
					{
						System.out.println("第三重循环"+k);
						k++;
						break point;
					}
				}
			i++;
		}
	}

}
