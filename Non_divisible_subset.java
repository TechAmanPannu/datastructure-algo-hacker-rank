import java.io.*;
import java.util.*;
class abc
{
public static void main(String agr[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int k=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
}
boolean b[]=new boolean[n];
Vector<Integer> v=new Vector<Integer>();

for(int i=0;i<n;i++)
{
	for(int j=i+1;j<n;j++)
	{
		
		int value=arr[i]+arr[j];
		if(value%3!=0)
		{
			if(b[i]==false && b[j]==false)
			{
				//System.out.println("point 1");
				v.add(arr[i]);
				v.add(arr[j]);
				b[i]=true;
				b[j]=true;
			}
			else if(b[i]==false)
			{
				//System.out.println("point 2");
				v.add(arr[i]);
				b[i]=true;
				
			}
			else if(b[j]==false)
			{
				//System.out.println("point 3");
				v.add(arr[j]);
				b[j]=true;
			}
			
		}
			
	}
}

Iterator ii=v.iterator();
while(ii.hasNext())
{
	System.out.println(ii.next());
}
System.out.println(v.size());
}

}