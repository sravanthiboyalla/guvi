import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class sums1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1,sums=0;
		while(n>0)
		{
			n1=n%10;
			sums=sums+n1*n1;
			n=n/10;
		}	
		System.out.println(sums);
	}
}
