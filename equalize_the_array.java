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
Vector<Integer> v=new Vector<Integer>();
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
	l.add(arr[i]);
}

Iterator ii=l.iterator();
int j=0;

while(ii.hasNext())
{
	int count=0;
	int value=(int)ii.next();
	for(int i=0;i<n;i++)
	{
		if(value==arr[i])
		{
			count++;
			
			
		}
	}
	//System.out.println("value="+value+" count="+count);
	v.add(count);
}	
Iterator u=v.iterator();
int arr1[]=new int[v.size()];
int k=0;
while(u.hasNext())
{
	arr1[k]=(int)u.next();
	k++;
	
}

Arrays.sort(arr1);
int value=arr1[arr1.length-1];
//System.out.println("value="+value);
int ans=Math.abs(value-n);
System.out.println(ans);

}
}