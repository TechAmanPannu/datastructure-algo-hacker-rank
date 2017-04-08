import java.io.*;
import java.util.*;

class abc
{
	public static void main(String aru[])
	{
		
		int n;
		System.out.println("enter the value of n");
		 
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		//taking values in the arr1 and arr2
		
		
		
		for(int i=0;i<n;i++)
		{
			int count=0;
			System.out.println("enter the value in s and k:	");
			int s,k;
				s=sc.nextInt();
				k=sc.nextInt();
				
				int arr[]=new int[s];
				for(int j=0;j<s;j++)
				{
				arr[i]=sc.nextInt();
						if(arr[i]<=0)
						{
							count++;
						}
				}
				//System.out.println("count="+count);
				if(count>=k)
				{
					System.out.println("NO");
				}
				else
					System.out.println("YES");
			}
	}
}