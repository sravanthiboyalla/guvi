import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class pro63
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int max=0;
		int max1=0;
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			for(int j=0;j<i;j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					max1++;
				}
				else
				{
					count++;
				}
			}
			if(max1==1||max1==0)
			{
				max=count;
			}
		}
		System.out.println(max+1);
	}
}
