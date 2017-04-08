import java.io.*;
import java.util.*;
class abc
{
	/*public static void main(String arg[])
	{
		
		int n,k,q;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		q=sc.nextInt();
		int arr[]=new int[n];
		int arrq[]=new int[q];
		//System.out.println("array for arr");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		//System.out.println("array for arrq");
		
		
		
		for(int i=0;i<k;i++)
		{
			for(int j=0;j<n;j++)
			{
				for(int m=0;m<n;m++)
				{
					int temp;
					temp=arr[j];
					arr[j]=arr[m];
					arr[m]=temp;
				}
				
			}
		}
		
		for(int i=0;i<q;i++)
		{
			System.out.println(arr[arrq[i]]);
		}

		
		
		
	}*/
	
	public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int N=in.nextInt();
    int K=in.nextInt();
    int Q=in.nextInt();
    int rot=K%N;
	System.out.println("rotation ="+rot);
    int[] arr=new int[N];

    for(int i=0;i<N;i++)
        arr[i]=in.nextInt();

   for(int i=0;i<Q;i++)
       {
           int idx=in.nextInt();
           if(idx-rot>=0)
              System.out.println(arr[idx-rot]);
           else
            System.out.println(arr[idx-rot+arr.length]);
}
	
}
}


/*public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int N=in.nextInt();
    int K=in.nextInt();
    int Q=in.nextInt();
    int rot=K%N;
    int[] arr=new int[N];

    for(int i=0;i<N;i++)
        arr[i]=in.nextInt();

   for(int i=0;i<Q;i++)
       {
           int idx=in.nextInt();
           if(idx-rot>=0)
              System.out.println(arr[idx-rot]);
           else
            System.out.println(arr[idx-rot+arr.length]);
}*/



/*public static void main(String[] args) {
    Scanner s1=new Scanner(System.in);
    int n=s1.nextInt();
    int k=s1.nextInt();
    int q=s1.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
        {
        a[i]=s1.nextInt();
    }
    for(int i=0;i<q;i++)
        {
        int m=s1.nextInt();
        System.out.println(a[(n-k+m)%n]);
    }
}*/