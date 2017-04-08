import java.io.*;
import java.util.*;
class abc
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		String s="SOS";
		
		String str;
		str=sc.next();
		int count=	0;
		char sc1[]=s.toCharArray();
		
		char c[]=new char[3];
ArrayList<Character> v=new ArrayList<Character>();
		char ch[]=str.toCharArray();
			for(int i=0;i<ch.length;i++)
			{
				
				//System.out.println("one");
				
				//System.out.println(ch[i]);
				v.add(ch[i]);
				
				
				if(v.size()==3)
				{
					
					//System.out.println("two");
					Iterator ii=v.iterator();
					while(ii.hasNext())
					{
						
						for(int j=0;j<c.length;j++)
						{
							char d=(Character)ii.next();
							//System.out.println(d);
							//System.out.println("three");
							c[j]=d;
						} 
						for(int j=0;j<c.length;j++)
						{
							
							//System.out.println("five");
							if(sc1[j]==c[j])
							{
							continue;	
							}
							else
							{
								//System.out.println("six");
								count++;
							}
							
						}
						
						v.clear();
					}
					
					
					
					
					
					
				}
					System.out.println("count"+count);
			}
			
		
			
	
}