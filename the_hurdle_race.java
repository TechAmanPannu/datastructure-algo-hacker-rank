import java.io.*;
import java.util.*;
class abc
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			
			Arrays.sort(arr);
			
			int last=arr[n-1];
			if(last>k)
			{
			System.out.println(Math.abs(last-k));
			}
			else
			{
				System.out.println("0");
			}
	}
}