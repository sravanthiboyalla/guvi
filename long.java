import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class long
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		long a=sc.nextInt();
		long b=sc.nextInt();
		String s1=Long.toString(a);
		String s2=Long.toString(b);
		String s3=s1+s2;
		long c=Long.valueOf(s3).longValue();
		System.out.println(c);
	}
}
