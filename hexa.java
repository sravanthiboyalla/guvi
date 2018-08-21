import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class hexa
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		int c=Integer.parseInt(n,2);
		String d=Integer.toHexString(c);
		System.out.println(d.toUpperCase());
	}
}
