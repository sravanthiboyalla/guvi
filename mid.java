import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class mid
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int s1=s.length();
		int i=s1/2;
		String s2="";
		if(s1%2==0)
		{
			s2=s.substring(0,i-1)+"**"+s.substring(i+1);
		}
		else
		{	
			s2=s.substring(0,i)+"*"+s.substring(i+1);
		}
		System.out.println(s2);
	}
}
