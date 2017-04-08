
//Conversion is not possible.


/*import java.io.*;
import java.util.*;

class driver
{
	public static void main(String are[])
	{
		
		Scanner sc=new Scanner(System.in);
		Integer arr[]=new Integer[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		Set<Integer> set=new HashSet<Integer>(arr);
	}
}*/

//conversion of hashset to treemap

import java.io.*;
import java.util.*;

class driver{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		Set<Integer> set=new HashSet<Integer>();
 		set.add(5);
		set.add(2);
		set.add(7);
		set.add(2);
		set.add(8);
		
		TreeSet<Integer> trs=new TreeSet<Integer>(set);
		Enumeration e=Collections.enumeration(trs);
		System.out.println("your sorted Hashset is:");
		while(e.hasMoreElements())
		{
			int d=(Integer)e.nextElement();
			
			System.out.println(d);
		}
		
	}
}