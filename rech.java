import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class rech
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String re="";
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			for(int j=0;j<i;j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			if(count==0)
			{
				re=re+s.charAt(i);
			}
		}
		System.out.println(re);
	}
}
