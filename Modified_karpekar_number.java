import java.io.*;
import java.util.*;
class abc
{
public static void main(String arg[])

{
	Scanner sc=new Scanner(System.in);
int start=sc.nextInt();
long limit=sc.nextLong();
Vector<Long> v=new Vector<Long>();
for(long i=start;i<=limit;i++)
{
	long sqr=i*i;
	
	int len=new Long(sqr).toString().length();
	
	if(len>1)
	{
		int n=len/2;
		
		Long m = new Long(sqr);
		String ls=m.toString();
		
		String ls1=ls.substring(0,n);//(inclusive,exclusive)
		
		String rs1=ls.substring(n,len);
		
		int l=Integer.parseInt(ls1);
		int r=Integer.parseInt(rs1);
		
		long sum=l+r;
		if(sum==i)
		{
			v.add(sum);
		}
	}
	else
	{
		long l=sqr;
		int r=0;
		long sum=l+r;
		if(sum==i)
		{
			v.add(sum);
		}
	}
	
	
	
}
if(v.size()==0)
{
	System.out.println("INVALID RANGE");
}
else
{
Iterator ii=v.iterator();

while(ii.hasNext())
{
	System.out.print((long)ii.next()+" ");
}
}
}
}