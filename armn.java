import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class armn
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int st=sc.nextInt();
		int e=sc.nextInt();
		for (int k=st;k<=e;k++) 
            	{ 
                                int n=k; 
                                int d=0; 
                                int s=0;
                                while(n>0) 
                                 { 
                                             d=n % 10; 
                                             s=s+(d*d*d); 
                                             n=n/10; 
                                 } 
                                 if(k==s) 
                                  { 
                                             System.out.println(k);
                                  } 
                      } 
		
	}
}
