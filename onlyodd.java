import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class onlyodd
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int digit=0;
		int sum=0;
		int rev=0;
		while(n>0)
		{
			digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		int di=0;
		int j=1;
		int k=0;
		while(rev>0)
		{
			di=rev%10;
			if(j%2==1)
			{
				k=k+di;	
			}
			j++;
			rev=rev/10;
		}
		if(k%2==0)
		{
			System.out.println("E");
		}
		else
		{
			System.out.println("O");
		}
	}
}
