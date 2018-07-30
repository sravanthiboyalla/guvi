import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class mult
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int mul=1;
		int n1;
		while(n>0)
		{
			n1=n%10;
			mul=mul*n1;
			n=n/10;
		}
		System.out.println(mul);
	}
}
