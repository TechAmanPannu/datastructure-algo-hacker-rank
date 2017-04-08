import java.io.*;
import java.util.*;
class abc
{
public static void main(String agr[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];

LinkedHashSet<Integer> l=new LinkedHashSet<Integer>();
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
	l.add(arr[i]);
}
HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
Iterator ii=l.iterator();
while(ii.hasNext())
{
	int count=0;
	int value=(int)ii.next();
	for(int i=0;i<n;i++)
	{
		if(arr[i]==value)
		{
			count++;
		}
	}
	hm.put(count,value);
}

System.out.println(hm.get(1));
}
}