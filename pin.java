import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class pin
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=sc.nextInt();
		String re="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if((i+1)%n==0)
			{
				re=re+Character.toUpperCase(ch);
			}
			else
			{
				re=re+ch;
			}
		}
		System.out.println(re);
	}
}
