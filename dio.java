import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class dio
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n>0)
		{
			if(n%2==0)
			{
				n=n/2;
			}
			else
			{
				System.out.println(n);
				break;
			}
		}
	}
}
