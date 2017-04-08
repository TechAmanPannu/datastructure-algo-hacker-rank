import java.io.*;
import java.util.*;
class abc
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		String str;
		int k;
		n=sc.nextInt();
		str=sc.next();
		k=sc.nextInt();
		
		char ch[]=str.toCharArray();
		String newstr="";
		for(int i=0;i<ch.length;i++)
		{
			int d=(int)ch[i];
			char newc;
			
			 if((d>=65 && d<=90) || (d>=97 && d<=122))
			{	
			   // System.out.println("first");
				//d=d+k;
				int b=0;
				if(d>=65 && d<=90)
					{
						//System.out.println("second");
						
						d=d+k;
				
						if( (d>90))
							{
							//	System.out.println("fourth");
	
								while(!(d<=90))
									{
										b=d-90;
										b=b+64;
										d=b;
										//System.out.println("up d= "+d);
						
									}
									
									newc=(char)d;
									newstr=newstr+newc;
							}
							
							
							else	
							{
								//System.out.println("third");
								
								newc=(char)d;
								newstr=newstr+newc;
							}
							
					}
					
			
					else if(d>=97 && d<=122)
						{
							d=d+k;
				
							if( (d>122))
							{
	
								while(!(d<=122))
									{
										b=d-122;
										b=b+96;
										d=b;
										//System.out.println("down d= "+d);
						
									}
									
									newc=(char)d;
									newstr=newstr+newc;
							}
							else{
								newc=(char)d;
								newstr=newstr+newc;
							}
							
							
					}
					
					
					
				}
			else
			{
				newc=(char)d;
				newstr=newstr+newc;
			}	
			}	
		
		
		System.out.println(newstr);
	}
}