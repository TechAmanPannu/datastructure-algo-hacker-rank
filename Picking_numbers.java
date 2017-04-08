import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class abc
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arr1[]=new int[100];
        for(int i=0; i < n; i++){
            arr[i] = sc.nextInt();
            int b=arr1[arr[i]]++;
			System.out.println("b="+b);
        }
        int newnum=0,c;
        for(int i=0;i<99;i++)
            {
				//System.out.println("arc="+arr1[i]+" i "+i);
            c=arr1[i]+arr1[i+1];
			//System.out.printf("newnum=%d =%d\n",c,newnum);
            if(c>newnum)
                newnum=c;
        }
        
        System.out.println(newnum);
    }
}