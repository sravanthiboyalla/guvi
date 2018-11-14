import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class arzero
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[][]=new int[n][m];
		int b[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			int k=0;
			int l=0;
			for(int j=0;j<m;j++)
			{
				if(a[i][j]==0)
				{
					while(k<n)
					{
						b[k][j]=0;
						k++;
					}
					while(l<=j)
					{
						b[i][l]=0;
						l++;
					}
				}
				else
				{
					b[i][j]=a[i][j];
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(j==0)
				{
				System.out.print(b[i][j]);
				}
				else
				{
					System.out.print(" "+b[i][j]);
				}
			}
			System.out.print("\n");
		}
	}
}
