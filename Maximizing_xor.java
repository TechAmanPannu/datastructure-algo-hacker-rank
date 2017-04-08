import java.io.*;
import java.util.*;
class abc
{
public static void main(String ag[])
{
Scanner sc=new Scanner(System.in);
int l=sc.nextInt();
int r=sc.nextInt();
Vector<Integer> v=new Vector<Integer>();
for(int i=l;i<=r;i++)
{
	for(int j=i;j<=r;j++)
	{
		int value=i^j;
		v.add(value);
		
	}
}
int arr[]=new int[v.size()];
Iterator ii=v.iterator();
int k=0;
while(ii.hasNext())
{
	int val=(int)ii.next();
	//System.out.println("val="+val);
	arr[k]=val;
	k++;
}
Arrays.sort(arr);

System.out.println(arr[v.size()-1]);
}
}