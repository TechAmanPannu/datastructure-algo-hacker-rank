import java.io.*;
import java.util.*;

class abc
{
	public static void main(String agr[])
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
			int hei=1;
			int var=sc.nextInt();
			if(var==0)
					{
						System.out.println(hei);
						continue;
					}
				for(int j=1;j<=var;j++)
				{
					
					if(j%2==0)
					{
						hei++;
					}
					else
					{
						hei=hei*2;
					}
					
					
				}
				System.out.println(hei);
		}		
		
		
		
	}
}