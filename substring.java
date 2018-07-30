import java.util.*;
import java.lang.*;
import java.io.*;
 /* Name of the class has to be "Main" only if the class is public. */
class substring
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=sc.nextInt();
		String re=s.substring(0,n);
		System.out.println(re);
	}
}
