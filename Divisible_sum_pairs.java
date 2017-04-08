import java.io.*;
import java.util.*;


class abc
{
	public static void main(String arg[])
	{
		
		int n,k;
		System.out.println("enter the value of n and k");
		
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		int arr1[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
		int sum=0;
		int count=0;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				sum=arr1[i]+arr1[j];
					if(sum%k==0)
					{
					count++;	
					}
			}
		}
		
		System.out.println(count);
		
	}
}