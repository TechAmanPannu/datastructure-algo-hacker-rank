import java.io.*;
import java.util.*;
class abc
{
	public static void main(String agf[])
	{
		Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	for(int i=0; i<t; i++)
	{
            int p = sc.nextInt();
            int m = sc.nextInt();
            int id = sc.nextInt();
            if((m+id-1)%p==0)
            System.out.println(p);
            else 
            System.out.println((m+id-1)%p);
        }
	}
}
