import java.io.*;
import java.util.*;

class abc
{
	public static void main(String arf[])
	{
		Scanner sc=new Scanner(System.in);
		
		int s,t;
		s=sc.nextInt();
		t=sc.nextInt();
		
		
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		
int m,n;


m=sc.nextInt();
n=sc.nextInt();

int arr4[]=new int[m];
int arr5[]=new int[n];
int count_a=0,count_b=0;
		for(int i=0;i<m;i++)
		{
			arr4[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			arr5[i]=sc.nextInt();
		}
		
		for(int i=0;i<m;i++)
		{
			arr4[i]=a+arr4[i];
			if(arr4[i]>=s && arr4[i]<=t)
			{
				count_a++;
			}
		}
		for(int i=0;i<n;i++)
		{
			
			arr5[i]=b+arr5[i];
			if(arr5[i]>=s && arr5[i]<=t)
			{
				count_b++;
			}
			}
			
		
		
		System.out.println(count_a+" "+count_b);
	}
}