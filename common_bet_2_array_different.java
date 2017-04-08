import java.io.*;
import java.util.*;
class abc
{
public static void main(String agr[])
{
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int arr1[]=new int[n1];
for(int i=0;i<n1;i++)
{
	arr1[i]=sc.nextInt();
}

int n2=sc.nextInt();
int arr2[]=new int[n2];
for(int i=0;i<n2;i++)
{
	arr2[i]=sc.nextInt();
}

boolean b[]=new boolean[n2];
Vector<Integer> v=new Vector<Integer>();
for(int i=0;i<n1;i++)
{
	for(int j=0;j<n2;j++)
	{
		if(b[j]==false)
		{
			if(arr1[i]==arr2[j])
			{
				v.add(arr2[j]);
				b[j]=true;
				break;
			}
		}
	}
}
Iterator ii=v.iterator();
while(ii.hasNext())
{
	int val=(int)ii.next();
	System.out.println(val);
}
}
}