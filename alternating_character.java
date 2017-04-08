import java.io.*;
import java.util.*;
class abc
{
public static void main(String arg[])
{
	int n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	
	
	for(int j=0;j<n;j++)
	{
		String str=sc.next();
	StringBuilder sb=new StringBuilder(str);
	int count=0;
	
	for(int i=1;i<sb.length();i++)
	{
		
		if(sb.charAt(i)==sb.charAt(i-1))
		{
			count++;
			sb.delete(i-1,i);
			i=0;
		}
	}
		System.out.println(count);
	}
	
	}
	}