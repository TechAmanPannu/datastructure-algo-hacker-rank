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
	LinkedHashSet<Character> st=new LinkedHashSet<Character>();
	StringBuilder sb=new StringBuilder(str);
	for(int i=0;i<sb.length();i++)
	{
		st.add(sb.charAt(i));
		
	}
	
	Iterator ii=st.iterator();
	
	while(ii.hasNext())
	{
		Character s=(Character)ii.next();
		System.out.println(s);
		
	}
	
	
	}
	}