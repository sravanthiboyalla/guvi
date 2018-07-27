import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class od
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int e=sc.nextInt();
		for(int i=s+1;i<=e;i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
		}
	}
}
