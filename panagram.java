import java.io.*;
import java.util.*;
class abc
{
public static void main(String arg[])
{
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	
	
	StringTokenizer s=new StringTokenizer(str,":  ");
	System.out.println("tokens="+s.countTokens());
	LinkedHashSet<Character> st=new LinkedHashSet<Character>();
	
	char ch[]=str.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		if((ch[i]>=97 && ch[i]<=122))
		{
		st.add(ch[i]);
		}
		else if((ch[i]>=65 && ch[i]<=90))
 		{
			int aa=32+(int)ch[i];
			char dd=(char)aa;
			st.add(dd);
		}
		
		
	}
	Iterator ii=st.iterator();
	
	while(ii.hasNext())
	{
		Character sd=(Character)ii.next();
		System.out.println(sd);
		
	}
	
	System.out.println("size="+st.size());
	
	if(st.size()==26)
	{
		System.out.println("pangram");
	}
	else
		System.out.println("not pangram");
	
}
}