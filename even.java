class even
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Output:");
		if(n>0)
		{
			if(n%2==0)
			{
				System.out.println("Even");
			}
			else
			{
				System.out.println("Odd");
			}
		}
		else
		{
			System.out.println("invalid");
		}
	}
}
