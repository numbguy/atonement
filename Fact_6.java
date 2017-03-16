import java.util.Scanner;
public class Fact_6{
	public static void main(String args[])throws Exception
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for fac:");
		n = sc.nextInt();
		fact(n);
	}
	static void fact(int x)
	{
		int f=1;
		while(x>0)
		{
			f=f*x;
			x--;
		}
		System.out.println(f);
	}
}