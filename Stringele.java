import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Stringele
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);		
		int n=sc.nextInt();
		String s=sc.next();
		String re="";
		for(int i=n-1;i>=0;i--)
		{
			re=re+s.charAt(i);
		}
		String s1="";
		for(int i=0;i<re.length();i++)
		{
			char c=re.charAt(i);
			if(c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u'&&c!='A'&&c!='E'&&c!='I'&&c!='O'&&c!='U')
			{	
				s1=s1+c;
			}
		}
		System.out.println(s1);
	}
}
