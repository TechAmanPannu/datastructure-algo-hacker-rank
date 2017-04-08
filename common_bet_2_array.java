import java.io.*;
import java.util.*;

class abc
{
	public static void main(String arg[])
	{
		
		int n,m;
		System.out.println("enter the value of n and m");
		
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		//taking values in the arr1 and arr2
		int arr1[]=new int[n];
		int arr2[]=new int[m];
		System.out.println("enter the value for arr1");
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("enter the value for arr2");
		for(int i=0;i<m;i++)
		{
			arr2[i]=sc.nextInt();
		}
		LinkedHashSet<Integer> ar=new LinkedHashSet<Integer>();
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					ar.add(arr1[i]);
				}
			}
		}
		
		
		Enumeration e=Collections.enumeration(ar);
		while(e.hasMoreElements())
		{
			int d=(Integer)e.nextElement();
			System.out.println(d);
		}
	}
}