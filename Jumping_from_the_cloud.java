import java.io.*;
import java.util.*;
class abc
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int k=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
}
int e=100;
int m=1;
int move=1;
for(int i=0;m!=0;i=(i+k)%n)
{
	if(arr[i]==0)
	{
		e=e-1;
	}
	else
	{
		e=e-2-1;
		
	}
	
	m=(i+k)%n;
}
System.out.println(e);

}


}