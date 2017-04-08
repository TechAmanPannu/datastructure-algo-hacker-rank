import java.io.*;
import java.util.*;
class abc
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
Vector<Integer> v=new Vector<Integer>();
for(int k=0;k<n;k++)
{
String str=sc.next();
char ch[]=str.toCharArray();
int last_len=str.length()/2;

	int count=0;
	int j=ch.length-1;
	for(int i=0;i<last_len;i++)
	{
		
			
			int cal=Math.abs((int)ch[i]-(int)ch[j]);
		count=count+cal;
			System.out.println("count="+count);
			j--;
			
			
		
	}
	v.add(Math.abs(count));
	
}

Iterator ii=v.iterator();
	while(ii.hasNext())
	{
		System.out.println(ii.next());
	}
	
	
}
}