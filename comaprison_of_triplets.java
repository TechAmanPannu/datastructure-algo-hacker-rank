import java.io.*;
import java.util.*;
class abc
{
public static void main(String arg[])
{
int a[]=new int[3];
int b[]=new int[3];
int alice=0;
int bob=0;
for(int i=0;i<3;i++)
{
a[i]=sc.nextInt();
}


for(int i=0;i<3;i++)
{
b[i]=sc.nextInt();
}

for(int i=0;i<3;i++)
{
	if(a[i]>b[i])
	{
		alice++;
	}
	else if(a[i]=b[i])
	{
		
	}
	else if(a[i]<b[i])
	{
		bob++;
	}
}

System.out.println(alice+" "+bob);
}
}