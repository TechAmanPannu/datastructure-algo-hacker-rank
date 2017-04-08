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

Arrays.sort(arr);
int subarr[]=new int[k];
for(int i=0;i<k;i++)
{
	subarr[i]=arr[i];
}

int max=subarr[k-1];
int min=subarr[0];
int diff=max-min;
System.out.println(diff);

}
}

/*

*/