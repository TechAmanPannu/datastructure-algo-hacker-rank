import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

  public static void main(String aghr[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	
	for(int l=0;l<n;l++)
	{
	String str=sc.next();	
	char p=0,q=0;
	char ch[]=str.toCharArray();
	int index_p=0;
	int index_q=0;	
	int count=0;
	for(int i=ch.length-2;i>=0;i--)
	{
			int val1=(int)ch[i];
			int val2=(int)ch[i+1];
			if(val1<val2)
			{
				count++;				
				index_p=i;
				p=ch[i];
				break ;
			}
	}
	if(count==0)
	{
		System.out.println("no answer");
	}
	else
	{
	for(int i=ch.length-1;i>=0;i--)
	{
		int val=(int)ch[i];
		if(val>p)
		{
			index_q=i;
			q=ch[i];
			break;
		}	
	}
char temp=ch[index_p];
ch[index_p]=ch[index_q];
ch[index_q]=temp;
int m=index_p+1;
char arr[]=new char[Math.abs(m-ch.length)];
for(int i=0;i<arr.length;i++)
{	
	arr[i]=ch[m];
	m++;
}
int d=0;
for(int i=ch.length-1;i>=index_p+1;i--)
{
	ch[i]=arr[d];
	d++;	
}
for(int i=0;i<ch.length;i++)
{
System.out.print(ch[i]);	
}
System.out.println();
}
}
	
	
}
}