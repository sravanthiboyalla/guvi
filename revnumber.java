import java.util.*;
import java.lang.*;
import java.io.*;

class revnumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=0,rev=0;
		while(n>0)
		{
			n1=n%10;
			rev=rev*10+n1;
			n=n/10;
		}
		System.out.println(rev);
	}
}
