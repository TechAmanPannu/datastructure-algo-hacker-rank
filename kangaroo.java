import java.io.*;
import java.util.*;
class abc
{
	public static void main(String arj[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of x1, v1, x2 ,v2");
		
		int x1,v1,x2,v2;
		x1=sc.nextInt();
		v1=sc.nextInt();
		x2=sc.nextInt();
		v2=sc.nextInt();
		int flag=0;
		int i=0;
while(i<=10000000)
{
	x1=x1+v1;
	x2=x2+v2;
	if(x1==x2)
	{
		flag=1;
		break;
	}
	i++;
}
 if(flag==1)
 {
	 System.out.println("yes");
 }
 else
 {
	 System.out.println("no");
 }
	 

		
	}
}