import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class viceversa
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String re="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='a'&&c<='z')
			{
				re=re+(char)(c-32);
			}
			else if(c>='A'&&c<='Z')
			{
				re=re+(char)(c+32);
			}
			else
			{
				re=re;
			}
		}
		System.out.println(re);
	}
}
