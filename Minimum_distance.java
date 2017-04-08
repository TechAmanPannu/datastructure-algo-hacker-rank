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

Vector<Integer> v=new Vector<Integer>();
for(int i=0;i<n;i++)
{
	for(int j=i+1;j<n;j++)
	{
		if(arr[i]==arr[j])
		{
			int value=Math.abs(i-j);
			v.add(value);
		}
	}
}

if(v.size()>1)
{
	int ar1[]=new int[v.size()];
Iterator ii=v.iterator();
int k=0;
while(ii.hasNext())
{
	int num=(int)ii.next();
	ar1[k]=num;
	k++;
}
Arrays.sort(ar1);
System.out.println(ar1[0]);
}
else
	System.out.println("-1")

}	
}