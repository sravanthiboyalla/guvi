import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class iland
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int a[][]=new int[n][n];
			int i,j,count=0;
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					a[i][j]=sc.nextInt();
				}
			}
			if(n==1)
			{
				for(i=0;i<n;i++)
				{
					for(j=0;j<n;j++)
					{
						if(a[i][j]==1)
						{
							count++;
						}
					}
				}
			}
			else
			{
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					if(a[i][j]==1)
					{
						if(i==0&&j==0)
						{
							if(a[i][j+1]==0&&a[i+1][j]==0)
							{
								count++;
							}
						}
						else if(i==0&&j==n-1)
						{
							if(a[i][j-1]==0&&a[i+1][j]==0)
							{
								count++;
							}
						}
						else if(i==n&&j==0)
						{
							if(a[i-1][j]==0&&a[i][j+1]==0)
							{
								count++;
							}
						}
						else if(i==n-1&&j==n-1)
						{
							if(a[i-1][j]==0&&a[i][j-1]==0)
							{
								count++;
							}
						}
						else if(i==0&&j!=n-1)
						{
							if(a[i][j-1]==0&&a[i][j+1]==0&&a[i+1][j]==0)
							{
								count++;
							}
						}
						else if(i==n-1&&j!=n-1&&j!=0)
						{
							if(a[i][j-1]==0&&a[i][j+1]==0&&a[i-1][j]==0)
							{
								count++;
							}
						}
						else if(i!=0&&i!=n&&j==0)
						{
							if(a[i][j+1]==0&&a[i-1][j]==0&&a[i-1][j]==0)
							{
								count++;
							}
						}
						else if(i!=0&&i!=n&&j!=0&&j==n-1)
						{
							if(a[i][j-1]==0&&a[i-1][j]==0&&a[i+1][j]==0)
							{
								count++;
							}
						}
						else
						{
							if(a[i][j+1]==0&&a[i-1][j]==0&&a[i+1][j]==0&&a[i][j-1]==0)
							{
								count++;
							}
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}
