import java.io.*;
public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			String str;
			InputStreamReader stdin=new InputStreamReader(System.in);
			BufferedReader bufin=new BufferedReader(stdin);
			try {
				System.out.println("�������ַ���");
				str=bufin.readLine();
				System.out.println("��������ַ��ǣ�"+str);
			}
			catch(Exception e)
			{
				System.err.println("����I/O���󣡣���");
				e.printStackTrace();
			}
		}
	}

}
