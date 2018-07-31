import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class gcd
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int gcd=(a>b)?b:a;
		while(true)
		{
			if(a%gcd==0&&b%gcd==0)
			{
				System.out.println(gcd);
				break;
			}
			gcd--;
		}
	}
}
