import java.util.*;
class binaryor1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int n=a|b;
		int count=0;
		String k=Integer.toBinaryString(n);
		for(int i=0;i<k.length();i++)
		{
			if(k.charAt(i)=='1')
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
