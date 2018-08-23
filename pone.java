import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class pone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String re="";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			re=s.charAt(i)+re;
		}
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==re.charAt(i))
			{
				count++;
			}
		}
		if((s.length()==count+2)||(s.length()==count))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
