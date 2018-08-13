import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class sqmul
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a*b;
		int d=(int)Math.sqrt(c);
		int e=d*d;
		if(e==c)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
