import java.io.*;
import java.util.*;
class abc
{
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
			int diff_x=Math.abs(z-x);
			int diff_y=Math.abs(z-y);
			if(diff_x==diff_y)
			{
				System.out.println("Mouse c");
			}
			else if(diff_x<diff_y)
			{
				System.out.println("Cat A");
			}
			else if(diff_x>diff_y)
			{
				System.out.println("Cat B");
			}
        }
    }
}