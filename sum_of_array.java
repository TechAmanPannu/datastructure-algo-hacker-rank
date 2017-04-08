import java.io.*;
import java.util.*;
class abc
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		int arr[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println(sum);
		
	}
}