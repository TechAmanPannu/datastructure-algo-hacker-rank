import java.io.*;
import java.util.*;
class test
{
	public static void main(String argj[])
	{
		
		Scanner sc=new Scanner(System.in);
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		int l=97;
		int arr[]= new int[26];
		for(int i=0;i<26;i++)
		{
			arr[i]=sc.nextInt();
			map.put(l+i,arr[i]);
		}
		System.out.println("enter the string in small letters: ");
		String str=sc.next();
		
	char ch[]=str.toCharArray();
	int nar[]=new int[ch.length];
	for(int k=0;k<ch.length;k++)
	{
		for(Map.Entry entry:map.entrySet())
		{
			
			
			Integer j=(Integer)entry.getKey();
			String js=j.toString();
			int jsi=Integer.parseInt(js);
			char jsc=(char)jsi;
			
			if(ch[k]==jsc)
			{
				Integer jii=(Integer)entry.getValue();
			String jsii=jii.toString();
			int jsin=Integer.parseInt(jsii);
				nar[k]=jsin;
				break;
			}
			}
			
			
		}
		
		Arrays.sort(nar);
		int slarea=nar[ch.length-1]*ch.length;
		
		System.out.println("selection area is: "+slarea);
	}
}