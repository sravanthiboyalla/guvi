import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class reverse
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String s1="";
		for(int i=0;i<a.length();i++)
		{
			s1=a.charAt(i)+s1;
		}
		System.out.println(s1);
	}
}
