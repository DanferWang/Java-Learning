import java.io.IOException;

public class Time {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		while(true)
		{
			long totalMillisecongs;
			totalMillisecongs=System.currentTimeMillis();
			long totalsecond;
			totalsecond=totalMillisecongs/1000;
			long second;
			second=totalsecond%60;
			long totalminute;
			totalminute=totalsecond/60;
			long minute;
			minute=totalminute%60;
			long totalhour;
			totalhour=totalminute/60;
			long hour;
			hour=(totalhour+8)%24;
			System.out.println("Current Time ¤Ï¡¡"+hour+":"+minute+":"+second);
			Thread.sleep(1000);
		}
	}

}
