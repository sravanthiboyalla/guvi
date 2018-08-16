import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class fila
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fid=n;
		while(fid>=10)
		{
			fid=fid/10;
		}
		int sec=n%10;
		int sum=fid+sec;
		System.out.println(sum);
	}
}
