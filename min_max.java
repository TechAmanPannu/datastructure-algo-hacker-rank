import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();
		long value[]={a,b,c,d,e};
		
		Boolean bb[]=new Boolean[5];
		for(int i=0;i<5;i++)
		{
			bb[i]=true;
		}
		long sum[]=new long[5];
		for(int i=0;i<5;i++)
		{
			bb[i]=false;
			for(int j=0;j<5;j++)
			{
				if(bb[j]==true)
				{
					
					sum[i]=sum[i]+value[j];
				}
			}
			bb[i]=true;
		}
		
		Arrays.sort(sum);
		System.out.print(sum[0]+" ");
		System.out.println(sum[4]);
    }
}
