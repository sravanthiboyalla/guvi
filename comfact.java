import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class comfact
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		while(a!=b)
		{
			if(a>b)
			{
				a=a-b;
			}
			else
			{
				b=b-a;
			}
		}
		System.out.println(a);
	}
}
