import java.io.*;
import java.util.*;
class abc
{
	public static void main(String agr[])
	{
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Vector<Integer> v=new Vector<Integer>();
		int m=5;
		for(int i=1;i<=n;i++)
		{
			
			int like=m/2;
			v.add(like);
			m=like*3;
			
		}
		int sum=0;
		 Iterator iii4=v.iterator();
	while(iii4.hasNext())
	{
		sum=sum+(int)iii4.next();
	}
	
	System.out.println(sum);
	}
}