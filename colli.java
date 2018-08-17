import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class colli
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
        int x, y, x1, x2, y1, y2;
        x = scan.nextInt();
        y = scan.nextInt();
        x1 = scan.nextInt();
        x2 = scan.nextInt();
        y1 = scan.nextInt();
        y2 = scan.nextInt();
		int s = (y2 - y1) * x + (x1 - x2) * y + (x2 * y1 - x1 * y2);
        if (s < 0)
            System.out.println("no");
        else if (s > 0)
            System.out.println("no");
        else
            System.out.println("yes");
	}
}
