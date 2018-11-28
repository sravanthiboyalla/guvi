import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class longpal
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int k=0;
		String str="";
		for(int i=0;i<s.length()-1;i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
				k=j;
				break;
				}
			}
			String re="";
			String re1="";
			for(int l=i;l<=k;l++)
			{
				re=re+s.charAt(l);
				re1=s.charAt(l)+re1;
			}
			if(re.equals(re1))
			{
				if(str.length()<re1.length())
				{
					str=re1;
				}
			}
		}
		System.out.println(str);
	}
}
