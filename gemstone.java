import java.io.*;
import java.util.*;

class abc
{
	public static void main(String agr[])
	{

Scanner sc=new Scanner(System.in); 
int n=sc.nextInt();
 int lastcount=0; 
 String str[]=new String[n];
 
 for(int i=0;i<n;i++)
 {
	 str[i]=sc.next();
 }
    for(char c='a'; c<='z';c++)
        { 
	int count=0;
        for(int j=0; j<n;j++)
            {
				if(str[j].contains(Character.toString(c)))
					{
					count++;
					}
				else{
					break;
					}

        }
	
         if(count==n)
             {
             lastcount++;
         }
    }
	
    System.out.println(lastcount);
}

	
	
}




