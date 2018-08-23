import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class redu
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char c[]=s.toCharArray();
		Set s1=new HashSet();
		StringBuilder sb=new StringBuilder();
		for(char ch:c)
		{
			if(!s1.contains(ch))
			{
				s1.add(ch);
				sb.append(ch);
			}
		}
		System.out.println(sb.toString());
	}
}
