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
		
		
		
		
		
		
		
		LinkedHashSet<Integer> v2=new LinkedHashSet<Integer>();
		
		int countn=0;
		int countm=0;
		int countmain=0;
		int i=arr1[0];
		int last=arr2[arr2.length-1];
		while(i<=last)
		{
			countm=0;
			for(int j=0;j<arr1.length;j++)
			{
				
					if((i%arr1[j]==0))
					{
							
						countm++;
						
					}
				}
				
				if(countm==arr1.length)
				{
					v2.add(i);
				}
			i++;	
			}
			
		
		
		
		
		
		int narr[]=new int[v2.size()];
		Iterator i2=v2.iterator();
		while(i2.hasNext())
		{
		for(int j=0;j<v2.size();j++)
		{
			int f=(Integer)i2.next();
			narr[j]=f;
			
		}
		}
		
		for(int j=0;j<v2.size();j++)
		{
			countn=0;
			for(int k=0;k<arr2.length;k++)
			{
				if(arr2[k]%narr[j]==0)
				{
					countn++;
				}
			}
			if(countn==arr2.length)
			{
				countmain++;
			}
			
		}
		
		System.out.println("countm "+countmain);
		
		
		
			
		
		
		
	}
}
