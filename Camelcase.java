import java.io.*;
import java.util.*;
class abc
{
public static void main(String arg[])
{
	
	String str="";
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	try
	{
		str=br.readLine();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
int count=1;
StringBuilder s=new StringBuilder(str);
for(int i=0;i<s.length();i++)
{
	if((int)s.charAt(i)>=65  && (int)s.charAt(i)<=90 )
	{
		count++;
	}
}
System.out.println(count);

}
}