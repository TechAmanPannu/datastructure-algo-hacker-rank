import java.io.*;
import java.util.*;
class abc
{
public static void main(String agr[])
{
Scanner sc=new Scanner(System.in);
String str=sc.next();
int n=str.length();
if(n%2==0)
{
	LinkedHashSet<Character> l=new LinkedHashSet<Character>();
	Vector<Integer> v=new Vector<Integer>();
	char ch[]=str.toCharArray();
	for(int i=0;i<n;i++)
	{
		l.add(ch[i]);
	}
	int countarr[]=new int[l.size()];
	Iterator ii=l.iterator();
	int k=0;
	while(ii.hasNext())
	{
		int count=0;
		char value=(char)ii.next();
		for(int i=0;i<n;i++)
		{
			if(value==ch[i])
			{
				count++;
			}
		}
		countarr[k]=count;
		k++;
	}		
	int count_even=0;
	for(int i=0;i<countarr.length;i++)
	{
		if(countarr[i]%2==0)
		{
			count_even++;
		}
	}
	if(count_even==countarr.length)
	{
		System.out.println("YES");
	}
	else{
		System.out.println("NO");
	}
}
else
{
	LinkedHashSet<Character> l=new LinkedHashSet<Character>();
	Vector<Integer> v=new Vector<Integer>();
	char ch[]=str.toCharArray();
	for(int i=0;i<n;i++)
	{
		l.add(ch[i]);
	}
	int countarr[]=new int[l.size()];
	Iterator ii=l.iterator();
	int k=0;
	while(ii.hasNext())
	{
		int count=0;
		char value=(char)ii.next();
		for(int i=0;i<n;i++)
		{
			if(value==ch[i])
			{
				count++;
			}
		}
		countarr[k]=count;
		k++;
	}		
	int count_even=0;
	for(int i=0;i<countarr.length;i++)
	{
		if(countarr[i]%2==0)
		{
			count_even++;
		}
	}
	if(count_even==countarr.length-1)
	{
		System.out.println("YES");
	}
	else{
		System.out.println("NO");
	}
}
}
}