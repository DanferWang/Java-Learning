
public class IntegerOverflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=java.lang.Integer.MAX_VALUE;
		int min=Integer.MIN_VALUE;
		System.out.println(max);
		System.out.println(min);
		System.out.println(max+1);
		System.out.println(min-1);
		System.out.println(max+(long)1);
		System.out.println(min+1L);
	}

}
