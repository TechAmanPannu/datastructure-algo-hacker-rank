import java.io.*;
import java.util.*;
class abc
{
public static void main(String agr[])
{

Scanner sc=new Scanner(System.in);

int n=sc.nextInt();
int m=sc.nextInt();
int k=sc.nextInt();
int actarr[][]=new int[k][k];
for(int i=0;i<k;i++)
{
	for(int j=0;j<k;j++)
	{
		actarr[i][j]=sc.nextInt();
	}
}

boolean redarr[][]=new boolean[n][m];
for(int i=0;i<n;i++)
{
	for(int j=0;j<m;j++)
	{
		redarr[i][j]=true;
	}
}
for(int i=0;i<n;i++)
{
	int innarr[]=new int[3];
	for(int j=0;j<m;j++)
	{
		 innarr[j]=actarr[i][j];
		
	}
	 
	
	
}
/*for(int i=0;i<n;i++)
{
	for(int j=0;j<m;j++)
	{
		System.out.print(redarr[i][j]);
	}
	System.out.println();
}*/
}
}