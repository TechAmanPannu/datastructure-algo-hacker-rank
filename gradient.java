import java.io.*;
import java.util.*;
class abc
{
	public static void main(String ag[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}			
		
		Vector<Integer> v=new Vector<Integer>();
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]<38)
			{
				v.add(arr[i]);
			}
			else
			{
				int mod=arr[i]%5;
				int mod_diff=5-mod;
				if(mod_diff<3)
				{
					arr[i]=arr[i]+mod_diff;
					v.add(arr[i]);
				}
				else{
					v.add(arr[i]);
				}
			}
		}
		
		 Iterator iii4=v.iterator();
	while(iii4.hasNext())
	{
		System.out.println(iii4.next());
	}
			
			
	}
}