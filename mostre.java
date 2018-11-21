import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class mostre
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int k=0;
		String A=s.substring(0,1);
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			if(k<count)
			{
				k=count;
				A=s.substring(i,i+1);
			}
		}
		System.out.println(A);
	}
}
