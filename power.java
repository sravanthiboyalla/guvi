import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class power
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		int b=sc.nextInt();
		int a=1;
		for(int i=0;i<b;i++)
		{
			a=a*c;
		}
		System.out.println(a);
	}
}
