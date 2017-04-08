import java.io.*;
import java.util.*;
class abc
{
public static void main(String aghr[])
{
	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	int count1[]=new int[n];
	HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
	LinkedHashSet<Integer> v=new LinkedHashSet<Integer>();
	
	for(int i=0;i<n;i++)
	{
			arr[i]=sc.nextInt();
			v.add(arr[i]);
	}
	
	Iterator ii=v.iterator();
	int j=0;
	while(ii.hasNext())
	{
		int count=0;
		int value=(int)ii.next();
		for(int i=0;i<n;i++)
		{
			if(value==arr[i])
			{
				
				count++;
			
			}
			
		}
		System.out.println("value of hm and count "+value+" "+count);
			hm.put(count,value);
			count1[j]=count;
			j++;
	}
	
	for(int i=0;i<n;i++)
	{
		System.out.println(count1[i]+" count");
	}	
	
		Arrays.sort(count1);
	System.out.println(hm.get(count1[n-1]));
	
	
}
}