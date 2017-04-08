import java.io.*;
import java.util.*;
class abc
{
public static void main(String ag[])
{
	Scanner sc=new Scanner(System.in);
	
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		
int count = (int)Math.floor(Math.sqrt(b)) - (int)Math.ceil(Math.sqrt(a)) + 1;
			System.out.println(count);
		
	}
}
}