import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class lsust
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] a=new String[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.next();
		}
		String re=a[0];
		for(int i=0;i<n;i++)
		{
			String re1="";
			if(re.length()>a[i].length())
			{
				for(int j=0;j<a[i].length();j++)
				{
					if(re.charAt(j)==a[i].charAt(j))
					{
						re1=re1+re.charAt(j);
					}
				}
			}
			else
			{
				for(int j=0;j<re.length();j++)
				{
					if(re.charAt(j)==a[i].charAt(j))
					{
						re1=re1+re.charAt(j);
					}
				}	
			}
			re=re1;
		}
		System.out.println(re);
	}
}
