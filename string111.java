import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class string111
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=0;
		int count1=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='b')
			{
				count++;
			}
			else
			{
				count1++;
			}
		}
		if((count==s.length()-1)||(count==s.length()))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
