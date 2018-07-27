import java.util.Scanner;

class prime1
{
	public static void main(String args[])
	{
		int s1, s2,count = 0, i, j;
		Scanner s = new Scanner(System.in);
		s1 = s.nextInt();
		s2 = s.nextInt();
    for(i = s1; i <= s2; i++)
		{
			for( j = 2; j < i; j++)
			{
				if(i % j == 0)
				{
					count = 0;
					break;
				}
				else
				{
					count = 1;
				}
			}
			if(count == 1)
			{
				System.out.println(i );
			}
		}
	}
}
