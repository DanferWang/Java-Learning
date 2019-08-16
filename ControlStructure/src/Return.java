
public class Return {
		public static void main(String args[]) {
			String str;
			for(int i=0;i<10;i++)
			{
				if(i>6)
				{
					str="现在开始执行return";
					System.out.println(str);
					return;
				}
				System.out.println("i="+i);
			}
			
		}
}
