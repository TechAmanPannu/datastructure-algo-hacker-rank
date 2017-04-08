import java.io.*;
import java.util.*;

class abc
{
	public static void main(String arg[])
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		try{
			str=br.readLine();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		StringTokenizer st=new StringTokenizer(str,":");
		String arr[]=new String[st.countTokens()];
		while(st.hasMoreTokens())
		{
			for(int i=0;i<3;i++)
			{
			String d=st.nextToken();
			
			arr[i]=d;
			}
		}
		
		int arr1[]=new int[2];
		for(int i=0;i<2;i++)
		{
			arr1[i]=Integer.parseInt(arr[i]);
		}
		int end=0;
		
		if(arr[2].endsWith("PM"))
		{
			end=1;
			
		}
		else if(arr[2].endsWith("AM"))
		{
			end=0;
			
		}
		StringTokenizer sb=new StringTokenizer(arr[2],"PMAM");
		String second;
		int sec=0;
		while(sb.hasMoreTokens())
		{
			String d=sb.nextToken();
			second=d;
			sec=Integer.parseInt(second);
		}
		
		
		
		
	
	if(end==0)
	{
		if(arr1[0]==12)
		{
			arr1[0]=00;
		}
		else if(arr1[0]<12)
		{
			arr1[0]=arr1[0];
		}
	}
	else if(end==1)
	{
		if(arr1[0]==12)
		{
			arr1[0]=12;
		}
		else if(arr1[0]<12)
		{
			arr1[0]=arr1[0]+12;
		}
	}
		
		
		
		System.out.printf("%02d:%02d:%02d",arr1[0],arr1[1],sec);
		
		
	}
	
}