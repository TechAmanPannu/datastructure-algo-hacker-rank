import java.io.*;
import java.util.*;
class abc
{

public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
String str=sc.next();
String str1=sc.next();
char ch[]=str.toCharArray();
char ch1[]=str1.toCharArray();
int arr[]=new int[str.length()];
int arr1[]=new int[str1.length()];

//System.out.println("str="+str.length());
//System.out.println("str1="+str1.length());
boolean b[]=new boolean[str.length()];
boolean b1[]=new boolean[str1.length()];
int count_arr=0;
int count_arr1=0;
for(int i=0;i<str.length();i++)
{
	for(int j=0;j<str1.length();j++)
	{
		
		if(ch[i]==ch1[j])
		{
			if(b1[j]==false)
			{
				System.out.println("ch[i] and ch1[j]="+ch[i]+" "+ch1[j]);
			b[i]=true;
			b1[j]=true;	
			break;
			}
			
		}
		
	}	
}
for(int i=0;i<str.length();i++)
{
	if(b[i]==false)
	{
		count_arr++;
	}
}
for(int i=0;i<str1.length();i++)
{
	if(b1[i]==false)
	{
		count_arr1++;
	}
}
//System.out.println("count_arr="+count_arr);
//System.out.println("count_arr1="+count_arr1);
int total=count_arr+count_arr1;
System.out.println(total);
}
}