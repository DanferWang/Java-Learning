public class ChapterTwo_8_Find {
	static int[] T= {-2,1,2,5,8,10};
	public static int findsub(int n)
	{
		int mid=(n-1)/2;
		if(T[mid]==mid)
		{
			return mid;
		}
		else if(T[mid]<mid)
		{
			n=n-mid;
			findsub(n);
		}
		else if(T[mid]>mid)
		{
			n=mid;
			findsub(n);
		}
		return 0;
	};

	public static void main(String[] args) {
		int sub;
		sub=findsub(6);
		System.out.println("ÏÂ±ê"+sub+"="+"ÔªËØ"+T[sub]);
	}
}
