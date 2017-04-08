import java.io.*;
import java.util.*;

class test
{
	public static void main(String arg[])
	{
		  Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int day = in.nextInt();
        int year = in.nextInt();
		Calendar c=Calendar.getInstance();
		c.set(Calendar.DATE,day);
		c.set(Calendar.MONTH,month);
		c.set(Calendar.YEAR,year);
		
		int m=c.get(Calendar.MONTH);
		int d=c.get(Calendar.DATE);
		int y=c.get(Calendar.YEAR);
		
		System.out.println(d+"/"+d+"/"+y);
		int dd=c.get(Calendar.DAY_OF_WEEK);
		switch(dd)
		{
			case 2:	System.out.println("MONDAY");
						break;
					
			
				case 3:System.out.println("TUESDAY");
				break;
				case 4:System.out.println("WEDNESDAY");
				break;
				case 5:System.out.println("THRUSDAY");
				break;
				case 6:System.out.println("FRIDAY");
				break;	
			case 7:System.out.println("SATURDAY");
			break;
				case 1:System.out.println("SUNDAY");
				break;
		}
	}
}