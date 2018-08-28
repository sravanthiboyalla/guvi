import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class koccur
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char c=sc.next().charAt(0);
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch==c)
			{
				System.out.println(i+1);
				break;
			}
		}
	}
}
