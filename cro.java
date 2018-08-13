import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class cro
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0;
		int re=0;
		while(n>0)
		{
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		int l=String.valueOf(n).length();
		while(rev>0)
		{
			int s=rev%10;
			if(s%2==1)
			{
				re=re*10+s;	
			}
			rev=rev/10;
		}
		String b=Integer.toString(re);
		for(int i=0;i<b.length();i++)
		{
			if(i==b.length()-1)
			{
				System.out.print(b.charAt(i));
			}
			else
			{
				System.out.print(b.charAt(i)+" ");
			}
		}
	}
}
