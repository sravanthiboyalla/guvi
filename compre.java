import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class compre
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String re="";
		if(s1.length()>s2.length())
		{ 
			for(int i=0;i<s2.length();i++)
			{
				if(s1.charAt(i)==s2.charAt(i))
				{
					re=re+s1.charAt(i);
				}
				else
				{
					break;
				}
			}
		}
		else
		{
			for(int i=0;i<s1.length();i++)
			{
				if(s1.charAt(i)==s2.charAt(i))
				{
					re=re+s1.charAt(i);
				}
				else
				{
					break;
				}
			}	
		}
		System.out.println(re);
	}
}
