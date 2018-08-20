import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class octal
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int pow1=0;
		int dec=0;
		while(n>0)
		{
			int c=n%10;
			dec=dec+(int)(Math.pow(2,pow1)*c);
			pow1++;
			n=n/10;
		}
		int rev=0;
		while(dec>0)
		{
			int k=dec%8;
			rev=rev*10+k;
			dec=dec/8;
		}
		int f=0;
		while(rev>0)
		{
			int e=rev%10;
			f=f*10+e;
			rev=rev/10;
		}
		System.out.println(f);
	}
}
