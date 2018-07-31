import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class lcm
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int lcm=(a>b)?a:b;
		while(true)
		{
			if(lcm%a==0&&lcm%b==0)
			{
				System.out.println(lcm);
				break;
			}
			lcm++;
		}
	}
}
