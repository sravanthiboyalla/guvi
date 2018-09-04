import java.util.*;
class encode
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isDigit(c))
			{
				int k=Character.getNumericValue(c);
				for(int j=0;j<k;j++)
				{
					System.out.print(s.charAt(i-1));
				}
			}	
		}
	}
}
