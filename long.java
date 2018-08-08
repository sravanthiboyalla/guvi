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
		int a=sc.nextInt();
		int b=sc.nextInt();
		String s1=Integer.toString(a);
		String s2=Integer.toString(b);
		String s3=s1+s2;
		int c=Integer.valueOf(s3).intValue();
		System.out.println(c);
	}
}
