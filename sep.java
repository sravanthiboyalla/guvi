import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class sep
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1="";
		String s2="";
		for(int i=0;i<s.length();i++)
		{
			if(i%2==0)
			{
				s1=s1+s.charAt(i);
			}
			else
			{
				s2=s2+s.charAt(i);
			}
		}
		System.out.println(s1+" "+s2);
	}
}
