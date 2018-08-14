import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class hex
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int count=0;
		int count1=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if((c>='0'&&c<='9')||(c>='A'&&c<='E'))
			{
				count++;
			}
			else
			{
				count1++;
			}
		}
		if(count1==0)
		{
		System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
