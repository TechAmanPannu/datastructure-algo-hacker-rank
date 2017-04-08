import java.io.*;
import java.util.*;
class abc
{
public static void main(String arg[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String str[]=new String[2];
		for(int m=0;m<n;m++)
	{
	for(int i=0;i<2;i++)
	{
		str[i]=sc.next();
	}
	int count=0;
	for(char i='a';i<='z';i++)
	{
		Character c=new Character(i);
		String s=c.toString();
		if(str[0].contains(s))
		{
			if(str[1].contains(s))
			{
				count++;
			}
		}
	}
	if(count>0)
	{
		System.out.println("YES");
		
	}
	else
	{
		System.out.println("NO");
	}
	

	}
}
}