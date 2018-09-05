import java.util.*;
class encrypt
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String re="";
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>s2.charAt(i))
			{
				int l=(int)(s2.charAt(i));
				int k=l-96;
				int c=(int)(s1.charAt(i)+k);
				if(c>122)
				{
					c=c-26;
					char n=(char)(c);
					re=re+n;
				}
				else
				{
					char n=(char)(c);
					re=re+n;
				}
			}
			else
			{
				int l=(int)(s1.charAt(i));
				int k=l-96;
				int c=(int)(s2.charAt(i)+k);
				if(c>122)
				{
					c=c-26;
					char n=(char)(c);
					re=re+n;
				}
				else
				{
					char n=(char)(c);
					re=re+n;
				}
			}
		}
		System.out.println(re);
	}
