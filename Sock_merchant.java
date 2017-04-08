import java.io.*;
import java.util.*;
class abc
{
	public static void main(String arg[])
	{
		int n;
		System.out.println("enter the value of n");
		
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		//taking values in the arr1 and arr2
		int arr1[]=new int[n];
		
		System.out.println("enter the value for arr1");
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		boolean b[]=new boolean[n];
		for(int i=0;i<n;i++)
		{
			b[i]=true;
		}
		
		int count=0;
		for(int i=0;i<n;i++)
		{
			
			for(int j=i+1;j<n;j++)
			{
				if(arr1[i]==arr1[j])
				{
					if(b[i]==true && b[j]==true )
					{
						
					count++;
						b[i]=false;
						b[j]=false;
					}
					break;
				}
				
			}
		}
		
		System.out.println(count);
		
		
	}
	
}