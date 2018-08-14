import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class iso
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int count=0;
		int count1=0;
		for(int i=0;i<s1.length()-1;i++)
		{
			if((s1.charAt(i))==s1.charAt(i+1))
			{
				count++;
				break;
			}
		}
		for(int i=0;i<s2.length()-1;i++)
		{
			if(s2.charAt(i)==s2.charAt(i+1))
			{
				count1++;
				break;
			}
		}
		if(count>0&&count1>0)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
