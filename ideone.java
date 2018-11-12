import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int count=0;
		while(i<=n+1)
		{
			String s=sc.nextLine();
			if(s.contains("a")||s.contains("e")||s.contains("i")||s.contains("o")||s.contains("u"))
			{
				count++;
			}
			i++;
		}
		if(count==n)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
