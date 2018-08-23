import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class draw
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		char s=sc.next().charAt(0);
		if(c=='R'&&s=='P')
		{
			System.out.println("P");
		}
		else if(c=='P'&&s=='R')
		{
			System.out.println("P");
		}
		else if(c=='R'&&s=='S')
		{
			System.out.println("R");
		}
		else if(c=='S'&&s=='R')
		{
			System.out.println("R");
		}
		else if(c==s)
		{
			System.out.println("D");
		}
		else
		{
			System.out.println("S");
		}
	}
}
