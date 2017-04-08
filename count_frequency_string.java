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
		char ch[]=str.toCharArray();
		
	LinkedHashSet<Character> sd=new LinkedHashSet<Character>();
		for(int i=0;i<ch.length;i++)
		{
			sd.add(ch[i]);
		}
		
	System.out.println("size is"+sd.size());
		boolean b[]=new boolean[ch.length];
		
		for(int i=0;i<ch.length;i++)
		{
			b[i]=false;
		}
		
		
		for(int i=0;i<ch.length;i++)
		{
			if(b[i]==false)
			{
			int count=1;
			for( int j=i+1;j<ch.length;j++)
			{
				if(b[j]==false)
				{
					if(ch[i]==ch[j])
					{
						count++;
						b[i]=true;
						b[j]=true;
					}
					
				}
				
			}
			System.out.println(ch[i]+"="+count);
			
		}
		}
	}
}