import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class swapstr
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char temp;
		char a;	
		char b;
		String result="";
		for(int i=0;i<s.length();i+=2)
		{
			a=s.charAt(i);
			b=s.charAt(i+1);
			temp=a;
			a=b;
			b=temp;
			result=result+a+b;
		}
		System.out.println(result);
	}
}
