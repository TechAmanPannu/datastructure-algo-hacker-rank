import java.io.*;
import java.util.*;
class abc
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

int arr[]=new int[n];
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();

}
Vector<Integer> v=new Vector<Integer>();

for(int i=0;i<n;i++)
{
	v.add(arr[i]);
}


while(v.size()>0)
{
	
	System.out.println(v.size());
	int arr1[]=new int[v.size()];
	Iterator iii=v.iterator();
	//System.out.println("Point 1")
	int k=0;
	//System.out.println(".......................");
	while(iii.hasNext())
	{
		int value=(int)iii.next();
	//	System.out.println(value);
		arr1[k]=value;
		k++;
	}
		v.clear();
		Arrays.sort(arr1);
		int min=arr1[0];
		//System.out.println("aarr1");
	for(int i=0;i<arr1.length;i++)
	{
	arr1[i]=arr1[i]-min;
	
	if(arr1[i]>0)
	{
		//System.out.println(arr1[i]);
	v.add(arr1[i]);	
	}	
	
	}
	
	
}
}
	


}
