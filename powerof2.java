import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class powerof2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=1;
		while(k<n)
		{
			k=k*2;
		}
		if(k==n)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
