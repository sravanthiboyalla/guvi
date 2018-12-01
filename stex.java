import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class stex
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] a=s.split(" ");
		for(int i=1;i<a.length-1;i++)
		{
			if(a[i].equals("and"))
			{
				String temp=a[i-1];
				a[i-1]=a[i+1];
				a[i+1]=temp;
			}
		}
		String re="";
		for(int i=0;i<a.length;i++)
		{
			if(i==0)
			{
				re=re+a[i];
			}
			else
			{
				re=re+" "+a[i];
			}
		}
		System.out.println(re);
	}
}
