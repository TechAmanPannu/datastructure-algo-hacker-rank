import java.io.*;
import java.util.*;
class abc
{
public static void main(String abg[])
{
Scanner sc=new Scanner(System.in);
int p=sc.nextInt();
int q=sc.nextInt();
int front_count=-1;
int back_count=-1;
Vector<Integer> v=new Vector<Integer>();
for(int i=0;i<=p;i=i+2)
{
	front_count++;
	for(int j=i;j<=i+1;j++)
	{
		if(j==q)
		{
			
			v.add(front_count);
			break;
		}
	}
}

for(int i=p;i>=0;i=i-2)
{
	back_count++;
	for(int j=i;j>=i-1;j--)
	{
		if(j==q)
		{
			v.add(back_count);
			break;
		}
	}
	
	
}
int arr[]=new int[v.size()];
Iterator i=v.iterator();
while(i.hasNext())
{
	//System.out.println("value"+i.next());
	for(int j=0;j<arr.length;j++)
	{
		arr[j]=(int)i.next();
	}
}
Arrays.sort(arr);
System.out.println("your output="+arr[0]);


}
}