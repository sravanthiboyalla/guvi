import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class pari
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char a[]=String.valueOf(n).toCharArray();
		int k=sc.nextInt();
		int p=sc.nextInt();
		int u=k+p;
		System.out.println(a[u-1]);
	}
}
