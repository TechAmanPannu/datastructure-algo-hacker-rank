 import java.io.*;
 import java.util.*;
 import java.math.*;
 class abc
 {
	 public static void main(String srg[])
	 {
		 Scanner sc=new Scanner(System.in);
		 String str=sc.next();
		 BigInteger bi=new BigInteger(str);
		 bi=fact(bi);
		 System.out.println(bi.toString());
	
	 
	 }
	 
		 static BigInteger fact(BigInteger b)
	 {
		 String s=b.toString();
		 int n=Integer.parseInt(s);
		 for(int i=1;i<n;i++)
		 {
			Integer ii=new Integer(i);
				String s1=ii.toString();
				BigInteger bb=new BigInteger(s1);
			b=b.multiply(bb);		
			}
		 
		 return b;
	 }
 }