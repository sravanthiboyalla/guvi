import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class eoe
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if((a%2==0&&b%2==0)||(a%2!=0&&b%2==0)||(a%2==0&&b%2!=0))
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}
}
