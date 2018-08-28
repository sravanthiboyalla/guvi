import java.util.*;
import java.lang.*;
import java.io.*;
class stanagram
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s="Dhoni";
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		int count=0;
		if(s.length()==s1.length())
		{
			if(s1.contains("D")&&s1.contains("h")&&s1.contains("o")&&s1.contains("n")&&s1.contains("i"))
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
		}
		else
		{
			System.out.println("no");
		}
	}
}
