import java.io.*;
import java.util.*;
class abc
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		StringTokenizer st=new StringTokenizer(str," ");
		String s="";
		while(st.hasMoreTokens())
		{
			s=s+(String)st.nextToken();
			
		}
		System.out.println(s);
		char ch[]=s.toCharArray();
		
	LinkedHashSet<Character> sd=new LinkedHashSet<Character>();
		for(int i=0;i<ch.length;i++)
		{
			sd.add(ch[i]);
		}
		
		Iterator ii=sd.iterator();
		while(ii.hasNext())
		{
			int count=0;
			char c=(Character)ii.next();
			for(int i=0;i<ch.length;i++)
			{
				if(c==ch[i])
				{
					count++;
				}
			}
			
			System.out.println(c+"="+count);
			
			
		}
	}
}
