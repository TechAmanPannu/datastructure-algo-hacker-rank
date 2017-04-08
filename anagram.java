import java.io.*;
import java.util.*;
class abc
{
	public static void main(String agr[])
	{
		Scanner sc=new Scanner(System.in);
	Vector<Integer> v=new Vector<Integer>();
	
		int n=sc.nextInt();
		for(int m=0;m<n;m++)
		{
		String str=sc.next();
		char ch1[]=str.toCharArray();
		int len=str.length();
		
		
		if(len%2==0)
		{
			char ch2[]=new char[len/2];
			char ch3[]=new char[len/2];
			for(int i=0;i<len/2;i++)
			{
				ch2[i]=ch1[i];
			}
			
			int j=0;
			for(int i=len/2;i<len;i++)
			{
				ch3[j]=ch1[i];
				j++;
			}
			
			
			boolean b[]=new boolean[len/2];
			for(int i=0;i<len/2;i++)
			{
				b[i]=false;
			}
		/*	for(int i=0;i<len/2;i++)
			{
				System.out.println("ch2="+ch2[i]);
			}
			
				for(int i=0;i<len/2;i++)
			{
				System.out.println("ch3="+ch3[i]);
			}*/
			
			int count=0;
			for(int i=0;i<len/2;i++)
			{
				for(int k=0;k<len/2;k++)
				{
			/*		System.out.println("ch2="+ch2[i]);
					System.out.println("ch3="+ch3[k]);*/
					if(b[k]==false)
					{
						if(ch2[i]==ch3[k])
						{
							count++;
							b[k]=true;
							break;
						}
					}
						
				}
			}
			
			int diff=Math.abs(count-len/2);
			v.add(diff);
			
		}
		else
		{
			v.add(-1);
		}
		}
		
		Iterator ii=v.iterator();
		while(ii.hasNext())
		{
			System.out.println(ii.next());
		}
		
	}
}



/*


*/