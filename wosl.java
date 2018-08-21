import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class wosl
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char c[]=s.toCharArray();
		int count=0;
		for(int i=0;i<c.length;i++)
		{
			count++;
		}
		System.out.println(count);
	}
}
