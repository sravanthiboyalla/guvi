import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class isdigit
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String result="";
		char c;
		for(int i=0;i<s.length();i++)
		{
			c=s.charAt(i);
			if(Character.isDigit(c))
			{
				result=result+c;
			}
		}
		System.out.println(result);
	}
}
