import java.io.*;
import java.util.*;
class abc
{
	Scanner sc1=new Scanner(System.in);
	HashMap<String,Long> hm=new HashMap<String,Long>();
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public void dataentry()
	{
		
		System.out.println("Enter the name of a person u want to save:	");
			String str="";
			try{
			str=br.readLine();
			}
			catch(Exception e)
			{
				System.out.println();
			}
			System.out.println("Enter the respective contact number:	");
			long num=sc1.nextLong();
			hm.put(str,num);
			System.out.println("......................Contact Saved Successfully...............");
		
	}
	
	public void showContact(String str)
	{
		try{
			long value=(long)hm.get(str);
		Long i=new Long(value);
		String s=i.toString();
		
		System.out.println(str+"="+value);
		}
		catch(Exception e)
		{
			System.out.println("The name u have entered doesnot exists ");
			System.out.println();
		}
	}
public static void main(String agr[])
{
	Scanner sc=new Scanner(System.in);
	abc a=new abc();
	while(true)
	{
		System.out.println("1. Enter a Entry\n2.Search for a Contact\n3.Exit\n");
		System.out.println("Enter your choice:	");
		int ch=sc.nextInt();
		switch (ch)
		{
			case 1: a.dataentry();
						break;
						
			case 2: 			System.out.println("enter the name of person u want to search");
							String str=sc.next();
							a.showContact(str);
							break;
			case 3: 		System.exit(0);				
		}
	}




	

}
}