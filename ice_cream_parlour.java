import java.io.*;
import java.util.*;

class abc
{
	public static void main(String arg[])
	{ 
	Vector<Integer> v=new Vector<Integer>();
	Vector<Integer> v1=new Vector<Integer>();
	int d=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int c=0;c<n;c++)
		{
		int k=sc.nextInt();
		int m=sc.nextInt();
		
		int arr[]=new int[m];
		for(int i=0;i<m;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<m;i++)
		{
			for(int j=i+1;j<m;j++)
			{
				if(arr[i]+arr[j]==k)
				{
					v.add(i+1);
					v1.add(j+1);
				}
				
			}
		}
		}
		Iterator ii=v.iterator();
		Iterator iii=v1.iterator();
		while(ii.hasNext() && iii.hasNext())
		{
			System.out.println(ii.next()+" "+iii.next());
		}
		
	}
}