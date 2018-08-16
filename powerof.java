import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class powerof
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=1;
		while(a<n)
		{
			a=a*2;
		}
		if(a==n)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
