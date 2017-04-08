import java.io.*;
import java.util.*;
class abc
{
public static void main(String agr[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int j=0;j<n;j++)
{
String str=sc.next();
int strn=Integer.parseInt(str);

char ch[]=str.toCharArray();
int count=0;
for(int i=0;i<ch.length;i++)
{
	
	Character c=new Character(ch[i]);
	String s=c.toString();
	int sn=Integer.parseInt(s);
	if(sn>0)
	{
	if(strn%sn==0)
	{
		count++;
	}
	}	
}
System.out.println(count);
}
}
}