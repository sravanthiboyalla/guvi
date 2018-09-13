import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class pro63
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int max=1;
		for(int i=0;i<s.length();i++)
		{
			int count=1;
			for(int j=0;j<=i;j++)
			{
				if(s.charAt(i)!=s.charAt(j))
				{
					count++;
				}
			}
			if(count>max)
			{
				max=count;
			}
		}
		System.out.println(max);
	}
}
