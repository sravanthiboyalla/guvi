import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class circular
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)==s.charAt(s.length()-1))&&s.contains("R")||s.contains("L"))
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
			break;
		}
	}
}
