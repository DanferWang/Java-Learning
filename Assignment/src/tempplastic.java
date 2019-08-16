
public class MaxClique{
	static int[] x;
	static int n;
	static int cn;
	static int bestn;
	static int[] bestx;
	static boolean[][] a;
	
	public static int maxClique(int[] v) {
		x=new int [n+1];
		cn=0;
		bestn=0;
		bestx=v;
		backtrack();
		return bestn;
	}
	
	private static void backtrack() {
		int t=1;
		while(t>0) {
			for(t=1;t<=n;t++) {
				boolean ok=true;
				for(int j=1;j<=t;j++) {
					if(x[j]==1&&!a[t][j]) {
						ok=false;
						break;
					}
					x[j]=1;
					while(ok) {
						if(j>n) {
							for(int a=1;a<=n;a++) {
								bestx[a]=x[a];
								bestn=cn;
							}
							cn++;
							}
						if(cn+n-t>bestn) {
							x[t]=0;
							for(int a=1;a<=n;a++) {
								bestx[a]=x[a];
								bestn=cn;
							}
						}
					}
				}
			}
		}
		t--;
	}
}