import java.io.*;
import java.util.*;
class abc
{
public static void main(String agr[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	int count=0;
	for(int i=0;i<n;i++)
	{
	
		int len=n-2;
		if(i<len)
		{
		 
			if(arr[i+2]==0)
		{
			i=i+1;
			count++;
		}	
		else if(arr[i+1]==0)
		{
			
			
			count++;
		
		}
		
		}
		else if(i<n-1)
		{
			if(arr[i+1]==0)
		{
			
			
			count++;
		
		}
		}
	}
	System.out.println(count);
}
}