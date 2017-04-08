import java.io.*;
import java.util.*;

class abc
{
	public static void main(String arg[])
	{
		int n,k,amount;
		System.out.println("enter the value of n and k and amount");
		
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		
		
		int arr1[]=new int[n];
		boolean flag[]=new boolean[n];
		for(int i=0;i<flag.length;i++)
		{
			flag[i]=false;
		}
		
		System.out.println("enter the value of arr1:");
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("enter the amount");
		amount=sc.nextInt();
		int sum=0;
		for(int i=0;i<arr1.length;i++)
		{
			flag[k]=true;
			if(flag[i]==false)
			{
				sum=sum+arr1[i];
			}
			
		}
		sum=sum/2;
		int actual_amount=amount-sum;
		if(actual_amount==0)
		{
			System.out.println("Bon Appetite");
		}
		else
		{
			System.out.println(actual_amount);
		}
		
		
		
		
	}
}