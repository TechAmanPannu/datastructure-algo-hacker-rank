import java.io.*;
import java.util.*;

class abc
{
	public static void main(String ar[])
	{
	int k,n;
	Scanner sc=new Scanner(System.in);
	k=sc.nextInt();
	n=sc.nextInt();
	int flag=0;
	int index=0;
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		if(arr[i]==k)
		{
			flag=1;
			index=i;
			break;
		}
	}
	if(flag==1)
		System.out.println(index);
	
}
}