import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class asciisum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes 
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			int k=(int)(s.charAt(i));	
			sum=sum+k;
		}
		System.out.println(sum);
	}
}
