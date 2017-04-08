import java.io.*;
import java.util.*;
class abc
{
	public static void main(String[] args) 
    {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    StringBuilder builder = new StringBuilder();
    for (int i = 0; i <n ; i++) 
        builder.append(" ");
	
	System.out.println(builder);
    int j = 0;

    for (int i =1; i <=n; i++) 
	{
        builder.replace(builder.length()-i,builder.length() - j, "#");
        System.out.println(builder);
        j++;
    }

}
}



//right side pyramid
/*public static void main(String agrs[]) {
        System.out.println("The Pattern is");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j <= i) {
                    System.out.print("  $");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
	
	
	//leftside pyramid
	
	public static void main(String agrs[]) {
        System.out.println("The Pattern is");
        for (int i = 0; i<5; i++){
            for (int j = 4; j >=0; j--) {
                if (j <= i) 
				{
                    System.out.print("  $");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }*/