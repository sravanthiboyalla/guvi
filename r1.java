import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class r1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String result="";
		String result1="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u'&&c!='A'&&c!='E'&&c!='I'&&c!='O'&&c!='U')
			{
				result=result+c;
			}
		}
		for(int i=result.length()-1;i>=0;i--)
		{
			result1=result1+result.charAt(i);
		}
		System.out.println(result1);
	}
}
