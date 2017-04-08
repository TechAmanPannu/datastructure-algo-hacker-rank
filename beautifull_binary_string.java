import java.io.*;
import java.util.*;
class abc
{
public static void main(String arg[])
{
	String B="0100101010";
	System.out.println((B.length()-B.replaceAll("010","").length())/3);
}
}