import java.io.*;
import java.util.*;
class abc
{
	public static void main(String arg[])
	{
		  Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int diff=0;
        int a[][] = new int[n][n];
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                a[i][j] = sc.nextInt();
            }
        }
		
		int lsum = 0;
    for(int i = 0; i<n ; i++){
        lsum+=a[i][i];
    }
    int rsum = 0;
    for(int j = 0; j<n ; j++){
        rsum+=a[j][n-1-j];
    }
		diff=Math.abs(lsum-rsum);
		System.out.println(diff);
		
	}
}