import java.io.*;
import java.util.*;

class abc{
		public static void main(String agr[])
		{
			Scanner sc=new Scanner(System.in);
			Vector<Integer> v=new Vector<Integer>();
			
			int n=sc.nextInt();
			for(int k=0;k<n;k++)
			{
			String str=sc.next();
			StringBuilder sb=new StringBuilder(str);
			sb=sb.reverse();
			String strrev=sb.toString();
			if(str.equals(strrev))
			{
				v.add(-1);
			}
		

		else
			{
				
				
				int index=0;
				int i=0;
				for(i=0;i<ch.length;i++)
				{
					
					StringBuilder sb1=new StringBuilder(str);
					StringBuilder sbr=new StringBuilder();
					sb1=sb1.delete(i,i+1);
					String str1=sb1.toString();
					StringBuilder sb1n=new StringBuilder(str1);
					sbr=sb1.reverse();
					//System.out.println("sb1n="+sb1n);
					//System.out.println("sbr="+sbr);
					//String str2=sb1n.toString();
					String str3=sbr.toString();
					if(str.equals(str3))
					{
						index=i;
						v.add(index);
						break;
					}
					
						
				}
				
			}
			
			}
			Iterator ii=v.iterator();
		while(ii.hasNext())
		{
			System.out.println(ii.next());
		}
		}
}