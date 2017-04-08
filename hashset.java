/* training over hashset collection framework*/
import java.io.*;
import java.util.*;

class abc
{
public static void main(String aru[])
{
Set<Integer> set=new HashSet<Integer>();

set.add(1);
set.add(2);
set.add(3);
set.add(4);
set.add(1);set.add(3);


Enumeration e=Collections.enumeration(set);
while(e.hasMoreElements())
{
	int i=(Integer)e.nextElement();
	System.out.println(i);
}

}
}