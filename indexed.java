import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class indexed
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String re="";
		for(int i=0;i<s.length();i=i+3)
		{
			re=re+s.charAt(i);
		}
		System.out.println(re);
	}
}
