import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class maxdi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String ch=String.valueOf(n);
		char[] cr = ch.toCharArray();
		for(int i=0;i<cr.length-1;i++)
		{
			for(int j=i+1;j<cr.length;j++)
			{
				if(cr[i]<cr[j])
				{
					char temp=cr[i];
					cr[i]=cr[j];
					cr[j]=temp;
				}
			}
		}
		String k=String.valueOf(cr);
		System.out.println(k);
	}
}
