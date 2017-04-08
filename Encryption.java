import java.io.*;
import java.util.*;
class abc
{
public static void main(String agr[])
{
Scanner sc=new Scanner(System.in);
String str=sc.next();


int len=str.length();
//System.out.println("length="+len);
int x,y;
x=(int)Math.floor(Math.sqrt(len));
 y=(int)Math.ceil(Math.sqrt(len));
 int max=x*y;
if(max<len)
{
	x++;
}

//System.out.printf("after x and y %d %d\n",x,y);
char arr[][]=new char[x][y];
char ch[]=str.toCharArray();
int k=0;
for(int i=0;i<x;i++)
{
	for(int j=0;j<y;j++)
	{
	
	if(k<str.length())
	{
		//System.out.println("point 1");
		//System.out.println(ch[k]+" "+k);
		arr[i][j]=ch[k];
		k++;
	}
		else
		{
			//System.out.println("point 2");
			arr[i][j]='\u0000';
			k++;
		}
	}
}

/*for(int i=0;i<x	;i++)
{
	for(int j=0;j<y;j++)
	{
		

		System.out.print(arr[i][j]);
		
		
	}
	System.out.println(" ");

}*/

for(int i=0;i<y	;i++)
{
	for(int j=0;j<x;j++)
	{
		
if(arr[j][i]=='\u0000')
{
	break ;
}
		System.out.print(arr[j][i]);
		
		
	}
	System.out.print(" ");

}
//System.out.println("x and y "+x+" "+y);
}

/*public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        double row=Math.floor(Math.pow(s.length(),0.5));
        double col=Math.ceil(Math.pow(s.length(),0.5));
        String ans ="";
        for(int i=0;i<col;i++){
        	int j=0;
        	while(i+j<s.length()){
        		ans=ans+s.substring(i+j,i+j+1);
            	j=(int) (j+col);}
        	ans=ans+" ";}
        System.out.println(ans);}*/
}