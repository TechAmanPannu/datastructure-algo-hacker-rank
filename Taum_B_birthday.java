import java.io.*;
import java.util.*;
class abc
{
public static void main(String agr[])
{
	 Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++)
		{
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
			if(x>z)
			{
				long val=w*y;
				val=val+z+x*w;
				System.out.println(val);
			}
			else if(y>z)
			{
				long val=b*y;
				val=val+z*y*b;
				System.out.println(val);
			}
			
			else 
			{
				long val=b*x+w*y;
				System.out.println(val);
			}
			
        }
    }
}
