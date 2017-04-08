import java.io.*;
import java.util.*;
class abc

{
	public static void main(String arj[])
	{
		int count=1;
		int m=0;
		
		int n,x,i,j,noe,sum,l=0,max;
		Scanner sc=new Scanner(System.in);
			System.out.println("enter the no of elements.");
			n=sc.nextInt();
			int a[]=new int[n];
			int copy[]=new int[n];
		int maxarry[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(i=0;i<n;i++)
		{
			copy[i]=a[i];
		}
			noe=2;
			max=0;
		
	int k=0;
while(noe<n)
{
	for(i=0;i<n;i++)
	{
		
	  
		 for (j=i+1;j<n;j++)
      {
        count = 1;
        
        if ((n - j) >= (noe - 1))
        {
          System.out.printf("%d,", a[i]);
          x = j;
          sum = a[i];
          while (count < noe)
          {
            count++;
            System.out.printf("%d,", copy[x]);
            sum += copy[x];
            x++;
          }
          System.out.printf("---%d", sum);
          if (sum > max)
          {
            maxarry[0] = a[i];
            for (l = 1; m ==j; m++)
              maxarry[l]=copy[m];
              max = sum;
          }
          System.out.printf("\n");
        }
      }
	}
    k++;
  }
  System.out.printf("sub array with max sum");
  for (i = 0; i < l; i++)
    System.out.printf("%d,", maxarry[i]);
  System.out.printf("-----%d", max);
}
	
			
	}
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

/*

#include < stdio.h >
#include < conio.h >
void main()
{
  int a[ 20], count = 1, m, copy[20], maxarry[20], n, x, i, j, noe, sum, l, max;
  clrscr();
  printf("\n ENter the no of elements.");
  scanf("%d", &n);
  printf("\n Enter array");
  for (i = 0; i < n; i++)>
    scanf( "%d" ,&a[i]);
  for (i = 0; i < n; i++)>
  {
    copy[i]=a[i];
  }
  for (i = 0; i < n; i++)>
    printf("%d\n", a[i]);
  //noe ia no of elemnts in subarray
  noe=2;
  max=0;
  //possible sub arrays is minimum 2 elements maximum n-1 elements so till noe value < n form sub arrays
  while(noe < n)>
  {
    for (i = 0; i < n; i++)>
    {
      //take the element  a[i] and find possible combinations with copy[j]
      //a[] = 1 2 3 c[] = 1 2 3 j = i + 1, with a[i] and find possible sub arrays from copy[i+1]
      for (j = i + 1; j < n; j++)>
      {
        count = 1;
        //check the possibility of an index j to form sub array
        if ((n - j) >= (noe - 1))
        {
          printf("%d,", a[i]);
          x = j;
          sum = a[i];
          while (count < noe)>
          {
            count++;
            printf("%d,", copy[x]);
            sum += copy[x];
            x++;
          }
          printf("---%d", sum);
          if (sum > max)
          {
            maxarry[0] = a[i];
            for (l = 1, m = j; m++)
              maxarry[l]=c[m];
              max = sub;
          }
          printf("\n");
        }
      }
    }
    k++;
  }
  printf("sub array with max sum");
  for (i = 0; i < l; i++)>
    printf("%d,", maxarray[i]);
  printf("-----%d", max);
  getch();
}
*/
 
