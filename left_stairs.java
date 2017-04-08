/*
How Many Rows You Want In Your Pyramid?
6
Here Is Your Pyramid
*
**
***
****
*****
******

*/

import java.util.Scanner;
 
 class MainClass
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
 
       
 
        System.out.println("How Many Rows You Want In Your Pyramid?");
 
        int noOfRows = sc.nextInt();
 
        int rowCount = 1;
 
        System.out.println("Here Is Your Pyramid");
 
        
        for(int i=1;i<=noOfRows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
    }
}