import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class encoding
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int i,j;
		for(i=0;i<s.length();i++)
		{
			int count=0;
			for(j=i;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
				else
				{
					break;
				}
			}
			System.out.print(s.charAt(i)+""+count);
			i=j-1;
		}
	}
}
