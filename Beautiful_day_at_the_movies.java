




import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        int count = 0;
        
        for (int m=i;j>m; m++){
            StringBuilder s = new StringBuilder();
            s.append(m);
            s=s.reverse();
            String news = s.toString();
            int rev = Integer.parseInt(temp1);
            if(Math.abs((m-rev)%k)==0){
                count++;
            }
        }
        
        System.out.println(count);
    }
}


Q1 What is the use of append() in String builder
ans: 	it will create object reference.

