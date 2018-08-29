import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class binarys
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a|b;
		String f=Integer.toBinaryString(c);
		int d=Integer.parseInt(f);
		int count=0;
		while(d>0)
		{
			int e=d%10;
			if(e==1)
			{
				count++;
			}
			d=d/10;
		}
		System.out.println(count);
	}
}
