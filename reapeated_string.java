import java.io.*;
import java.util.*;
class abc
{
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.next();
    long n = in.nextLong();
    long count =0;
    for(char c : s.toCharArray())
        if(c == 'a')
        count++;
	System.out.println("mycount"+count);

     long factor = (n/s.length());
	 System.out.println("factor="+factor);
     long rem = (n%s.length());
	 System.out.println("rem="+rem);
     count =  factor*count  ;
	 
	 System.out.println("down count="+count);
    for(int i=0;i<rem;i++)
        if(s.charAt(i)=='a')
                count++;        
    System.out.println(count);



}
}