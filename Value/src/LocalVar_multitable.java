
public class LocalVar_multitable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int table;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=i;j++) 
			{
				table=i*j;
				System.out.print(j+"*"+i+"="+table+"\t");
			}
			System.out.println();
		}
	}

}
