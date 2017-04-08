import java.io.*;
import java.util.*;
class abc
{
	public static void main(String agr[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int m=0;m<n;m++)
		{
		
		String str1=sc.next();
		String str="hackerrank";
		int len=str.length();
		char ch[]=str.toCharArray();//hackerrank
		char ch1[]=str1.toCharArray();//new string
		boolean b[]=new boolean[str1.length()];
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch1.length;j++)
			{
				if(b[j]==false)
				{
					if(ch[i]==ch1[j])
					{
						//System.out.println(ch1[j]);
					count++;
					b[j]=true;
					break;
					
					}
					else
					{
					b[j]=true;
					}
				}
				
			}
		}
		if(count==len)
	{
	System.out.println("Yes");
	}
	else
		System.out.println("No");
	}
	}
	
}