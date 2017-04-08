import java.io.*;
import java.util.*;
class abc
{
	public static void main(String aru[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			String str="";
			str=sc.next();
			StringBuilder sb=new StringBuilder();
			//String rev=(String)sb.reverse();
			sb.append(str);
			sb=sb.reverse();
			String rev=sb.toString();
			//System.out.println("reverse"+rev);
			char chstr[]= str.toCharArray();
			char chrev[]=rev.toCharArray();
			int countf=0;
			int countin=0;
			for(int j=1;j<chstr.length;j++)
			{
				countf++;
				int d=(int)chstr[j];
				int d_pre=(int)chstr[j-1];
				int f=(int)chrev[j];
				int f_pre=(int)chrev[j-1];

				int div=Math.abs(d-d_pre);
				int div1=Math.abs(f-f_pre);
				//System.out.printf("div=%d div1=%d  ",div,div1);
				if(div==div1)
				{
					countin++;
				}
				
			}
			//System.out.println("countin"+countin);
			//System.out.println("countf"+countf);
			if(countf==countin)
			{
				System.out.println("Funny");
			}
			else
			{
				System.out.println("Not Funny");
			}
			countf=0;
			countin=0;
			
			
		}
	}
}