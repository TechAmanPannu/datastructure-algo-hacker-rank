import java.io.*;
import java.util.*;
class abc
{
public static void main(String agr[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int d=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
}

int count=0;
for(int i=0;i<n;i++)
{
	
	
	for(int j=i+1;j<n;j++)
	{
			
		for(int k=j+1;k<n;k++)
		{
				
				
			if(Math.abs(arr[i]-arr[j])==d)
			{
					
				if(Math.abs(arr[j]-arr[k])==d)
				{
					
					count++;
				}
				
			}
			else
			{
				
				break;
			}
		}
	}
}
System.out.println("count="+count);
}
}