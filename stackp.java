import java.util.Stack;
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class stackp
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		Stack st=new Stack();
		for(int i=0;i<s.length();i++)
		{
			st.push(s.charAt(i));
		}
		String re="";
		while(!st.isEmpty())
		{
			re=re+st.pop();
		}
		if(s.equals(re))
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}
