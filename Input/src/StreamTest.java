import java.io.*;
public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			String str;
			InputStreamReader stdin=new InputStreamReader(System.in);
			BufferedReader bufin=new BufferedReader(stdin);
			try {
				System.out.println("请输入字符：");
				str=bufin.readLine();
				System.out.println("你输入的字符是："+str);
			}
			catch(Exception e)
			{
				System.err.println("发生I/O错误！！！");
				e.printStackTrace();
			}
		}
	}

}
