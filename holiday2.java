import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class holiday2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		if(s.equals("Sunday")||s.equals("Saturday"))
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
