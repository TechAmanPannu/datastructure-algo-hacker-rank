import java.io.*;
import java.util.*;
class abc
{
	public static void main(String agr[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int max=0;
		int min=0;
		
		int index_max=0;
		int index_min=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		a:
		for(int i=0;i<n;i++)
		{
			
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>=arr[j])
				{
					if(arr[i]>arr[j])
					{
						min=arr[j];
					
					max=arr[i];
					index_max=i;
					index_min=j;
					break a;
					}
					else{
						max=arr[i];
						min=arr[j];
						index_max=i;
					index_min=j;
					break a;
					}
					
				}
				else if(arr[i]<=arr[j])
				{
					if(arr[i]<arr[j])
					{
					min=arr[i];
					max=arr[j];
					index_max=j;
					index_min=i;

					break a;	
					}
					else{
						min=arr[i];
					max=arr[j];
					index_max=j;
					index_min=i;

					break a;
					}
					
				}
				
				
			}
		}
		
		
		System.out.println("max "+max);
		System.out.println("min "+min);
		
		int max_count;
			int min_count;
			
			if(max==min)
			{
				max_count=0;
			 min_count=0;
			}
		else if(index_max==0)
		{
			 max_count=0;
			 min_count=1;
		}
		else if(index_min==0)
		{
			 max_count=1;
			 min_count=0;
		}
		else
		{
			max_count=0;
			 min_count=0;
		}
		
		//max
		if(arr.length==1)
		{
			max_count=0;
			min_count=0;
		}
		
		else
		{
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				max_count++;
				max=arr[i];
				
			}
		}
	
//min
	
		for(int i=0;i<n;i++)
		{
			if(arr[i]<min)
			{
				min_count++;
				min=arr[i];
			}
		}
		}
			
			
		
		System.out.printf("%d %d",max_count,min_count);
		
		
	}
}