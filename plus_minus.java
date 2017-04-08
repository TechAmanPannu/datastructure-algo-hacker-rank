import java.io.*;
import java.util.*;
class abc
{
public static void main(String arg[])
{
	 Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int count_p=0;
		int count_n=0;
		int count_o=0;
        int a[] = new int[n];
        for(int i=0; i < n; i++){
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			if(a[i]<0)
			{
				count_n++;
			}
			else if(a[i]>0)
			{
				count_p++;
			}
			
			else if(a[i]==0)
			{
				count_o++;
			}
			
		}
		

		//DecimalFormat df=new DecimalFormat("#.######");
	double frac_p;
		double frac_n;
		double frac_o;
		frac_p=(double)count_p/n;
		
		
		frac_n=(double)count_n/n;
		
		
		frac_o=(double)count_o/n;
		
		
		
		System.out.printf("%.6f %n",frac_p);
		System.out.printf("%.6f %n",frac_n);
		System.out.printf("%.6f %n",frac_o);
	
}
}