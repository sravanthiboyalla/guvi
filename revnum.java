import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class revnum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int a1,rev=0;
		while(a>0)
		{
			a1=a%10;
			rev=rev*10+a1;
			a=a/10;
		}
		System.out.println(rev);
	}
}
