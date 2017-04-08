import java.io.*;
import java.util.*;
class abc
{
	static int N;
	abc(int a)
	{
		N=a;
	}
	
public static void main(String agr[])

{
int n=0;
int limit=1;
new abc(n);
multiply(n);

}

static int arr[]=new int[N];
static int multiply(int n)
{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the value for n "+n);
	if(n==5)
	{
		return 1;
	}
	
	else
	{
		arr[n]=sc.nextInt();
		return multiply(++n);
	}
}
}