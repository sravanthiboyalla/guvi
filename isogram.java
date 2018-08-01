import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class isogram
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char s1;
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			s1=s.charAt(i);
			for(int j=2;j<i;j++)
			{
				if(s1==s.charAt(j))		
				{
					count++;
				}
			}
		}
		if(count>0)
		{
			System.out.println("No");
		}
		else
		{
			System.out.println("Yes");
		}
	}
}
