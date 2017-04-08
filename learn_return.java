import java.io.*;
import java.util.*;

class abc
{
	
	public static void calculate(int x,int y)
	{
		int c;
		c=x+y;
		if(x==y)
		{
			System.out.println("value of  c:	"+c);
			return ;
		}
		
		
		
	
		for(int i=0;i<=5;i++)
		{
			calculate(x,y+i);
		}
	
			
		
		
			
	}
	
	public static void main(String ari[])
	{
		
		calculate(5,4);
		//System.out.println("value of d is:	"+d);
	}
}