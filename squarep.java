import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class squarep
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		int x3=sc.nextInt();
		int y3=sc.nextInt();
		int x4=sc.nextInt();
		int y4=sc.nextInt();
		if(y1==x2&&y2==x3&&y3==x4&&y4==x1)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
