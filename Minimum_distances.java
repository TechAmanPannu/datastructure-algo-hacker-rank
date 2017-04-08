import java.io.*;
import java.util.*;
class abc
{
public static void main(String agr[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
	
}
Vector<Integer> v= new Vector<Integer>();
for(int i=0;i<n;i++)
{
	for(int j=i+1;j<n;j++)
	{
		if(arr[i]==arr[j])
		{
			int d=Math.abs(i-j);
			v.add(d);
		}
	}
}
if(v.size()==0)
{
	System.out.println("-1");
}
else
{
int arr1[]=new int[v.size()];
Iterator ii=v.iterator();
int m=0;
while(ii.hasNext())
{
	int val=(int)ii.next();
	arr1[m]=val;
	m++;
}

Arrays.sort(arr1);
System.out.println(arr1[0]);
}
}
}