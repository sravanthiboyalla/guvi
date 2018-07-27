class ar
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int d=sc.nextInt();
		int sum=((n)*(2*a+((n-1)*d)))/2;
		System.out.println(sum);
	}
}
