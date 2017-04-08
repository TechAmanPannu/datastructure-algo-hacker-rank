import java.io.*;
import java.util.*;
class abc{
public static void main(String agr[])
{
	 Scanner in = new Scanner(System.in);
        //actually returned
		int d1 = in.nextInt();
        int m1 = in.nextInt();
        int y1 = in.nextInt();
		//expected return
        int d2 = in.nextInt();
        int m2 = in.nextInt();
        int y2 = in.nextInt();
		
		
		if(y1<=y2)
		{
			if(m1<=m2)
			{
				if(d1<=d2)
				{
					System.out.println("0");
				}
				else{
					int value=Math.abs(d1-d2);
					System.out.println(value*15);
				}
			}
			else{
				int value=Math.abs(m1-m2);
				System.out.println(value*500);
			}
		}
		else
		{
			System.out.println("10000");
		}
		
		
			
		
		
			
		
}

}