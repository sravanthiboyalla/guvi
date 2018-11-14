import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class wordrev
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] a=s.split(" ");
		String re=" ";
		for(int i=0;i<a.length;i++)
		{
			String b="";
			for(int j=0;j<a[i].length();j++)
			{
				b=a[i].charAt(j)+b;	
			}
			if(i==0)
			{
				re=re+b;
			}
			else
			{
				re=re+" "+b;
			}
		}
		System.out.println(re);
	}
}
