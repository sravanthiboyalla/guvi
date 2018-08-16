import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Asciib
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
			if(c>='A'&&c<='Z')
			{
				char d=(char)(c+32);
				re=re+d;
			}
			if(c>='a'&&c<='z')
			{
				char d=(char)(c-32);
				re=re+d;
			}
		}
		System.out.println(re);
	}
}
