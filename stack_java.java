/*
program on all operations on stack.
*/
import java.io.*;
import java.util.*;
class abc
{
	public static void main(String ar[])
	{
		Stack<Integer> se=new Stack<Integer>();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("1. Push");
		System.out.println("2. Pop");
		System.out.println("3. Peak");
		System.out.println("4. Traversal");
		System.out.println("5. Search an element");
		System.out.println("6. Exit");
		System.out.println(" Enter your choice:	");
		int choice;
		choice=sc.nextInt();
		int element;
		switch(choice)
		{
			case 1:				
							System.out.println("Enter element");
							element=sc.nextInt();
							int d=se.push(element);
							System.out.println("element "+d+" inserted Successfuly");
							
							break;
			case 2:	int p=0;
						
						if(se.empty())
						{
							System.out.println("your stack is empty");
							
						}
						else
						{
							p=se.pop();
					System.out.println("element "+p+" poped Successfully");
						}
							break;
			case 3:
						int pe=0;
						pe=se.peek();
						System.out.println("element "+pe+" peak Successfully");
						break;
			case 4:
			
					if(se.empty())
					{
						System.out.println("your stack is empty");
					}
					else
					{
					Enumeration e=Collections.enumeration(se);
					while(e.hasMoreElements())
					{
						int tt=(Integer)e.nextElement();
						System.out.println("your traversal is:	"+tt);
					}
					}
					break;
			case 5: if(se.empty())
			{
				System.out.println("your stack is empty");
			}
			else{	
				System.out.println("enter the element to be search:	");
				int k=sc.nextInt();
				int position=se.search(k);
				if(position>=1)
				{
					System.out.println("your element found at:	"+position);
				}
				else{
					System.out.println("element doesnot found");
				}
			}
			break;
			case 6: System.exit(0);
			default:	
		}
		}
	}
}