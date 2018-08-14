import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class casm
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String re="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				re=re+c;
			}
		}
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u')
			{
				re=re+c;
			}
		}
		System.out.println(re);
	}
}
