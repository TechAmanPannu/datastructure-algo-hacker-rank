import java.io.*;
import java.util.*;
class abc
{
public static void main(String arg[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr1[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr1[i]=sc.nextInt();
	}
	
	int k=sc.nextInt();
	
	int arr2[]=new int[k];
	for(int i=0;i<k;i++)
	{
		arr2[i]=sc.nextInt();
	}
	
	LinkedHashSet<Integer> l1=new LinkedHashSet<Integer>();
	LinkedHashSet<Integer> l2=new LinkedHashSet<Integer>();
	
	for(int i=0;i<n;i++)
	{
		l1.add(arr1[i]);
	}
	
	for(int i=0;i<k;i++)
	{
		l2.add(arr2[i]);
	}
	
	Map<Integer,Integer> hm1=new HashMap<Integer,Integer>();
	Map<Integer,Integer> hm2=new HashMap<Integer,Integer>();
	
	Iterator ii1=l1.iterator();
	Iterator ii2=l2.iterator();
	
	while(ii1.hasNext())
	{
		int c=(Integer)ii1.next();
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(c==arr1[i])
			{
				count++;
			}
		}
		
		hm1.put(c,count);
		
		
		
	}
	
	while(ii2.hasNext())
	{
		int c=(Integer)ii2.next();
		int count=0;
		for(int i=0;i<k;i++)
		{
			if(c==arr2[i])
			{
				count++;
			}
		}
		
		hm2.put(c,count);
		
		
		
	}
	int la1[]=new int[l1.size()];
	int la2[]=new int[l2.size()];
	Iterator iia1=l1.iterator();
	Iterator iia2=l2.iterator();
	int m=0;
	while(iia1.hasNext())
	{
		int c=(Integer)iia1.next();
		for(m=m;m<la1.length;)
		{
			la1[m]=c;
			m++;
			break;
		}
	}
	
	int o=0;
	while(iia2.hasNext())
	{
		int c=(Integer)iia2.next();
		for(o=o;o<la2.length;)
		{
			la2[o]=c;
			o++;
			break;
		}
	}
	TreeSet<Integer> ts=new TreeSet<Integer>();
	
	for(int b=0;b<la1.length;b++)
	{
		int flag=0;
		for(int d=0;d<la2.length;d++)
		{
			if(la1[b]==la2[d])
			{
				System.out.println("point 1"+la1[b]);
				
				flag=1;
				
			}
		}
		
		if(flag==1)
		{
			//System.out.println("Point 2");
			int value=la1[b];
			//System.out.println("value="+value);
			int f=hm1.get(value);
				int g=hm2.get(value);
				int diff=Math.abs(f-g);
				
				if(diff!=0)
				{
				//	System.out.println("Point 3");
					ts.add(la1[b]);
				}
		}
		else
		{
			
			//System.out.println("point 4"+la1[b]);
			ts.add(la1[b]);
		}
	}
	
	
	
	for(int b=0;b<la2.length;b++)
	{
		int flag=0;
		for(int d=0;d<la1.length;d++)
		{
			if(la2[b]==la1[d])
			{
				flag=1;
				
			}
			
			
		}
		if(flag==0)
		{
			ts.add(la2[b]);
		}
		
	}
	//System.out.println("............ye mera answer he..........");
	 Iterator iii4=ts.iterator();
	while(iii4.hasNext())
	{
		System.out.println(iii4.next());
	}
	
	//System.out.println(".............ye mera answer he..............");
	
	
/*	System.out.println("......111111....................");
	
	
	for(int i=0;i<la1.length;i++)
		{
			System.out.println(la1[i]);
			
		
		}
		
		System.out.println("...........111111........");
		
		System.out.println("......22222222....................");
	
	
	for(int i=0;i<la2.length;i++)
		{
			System.out.println(la2[i]);
			
		
		}
		
		System.out.println(".........222222..........");
	
	*/
	/*for(Map.Entry map: hm1.entrySet())
	{
		//int c=(Integer)map.getKey();
		System.out.println(map.getKey()+" "+map.getValue());
	}
	System.out.println();
	for(Map.Entry map: hm2.entrySet())
	{
		System.out.println(map.getKey()+" "+map.getValue());
	}*/
	
	
	
}
}