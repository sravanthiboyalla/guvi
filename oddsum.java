import java.util.*;
import java.lang.*;
import java.io.*;
class oddsum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int r=sc.nextInt();
		int sum=0;
		for(int i=l;i<=r;i++)
		{
			if(i%2==1)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
}
