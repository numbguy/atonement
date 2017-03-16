import java.util.Scanner;
class Fiborec_5
{
	public static void main(String args[])throws Exception
	{
		int n;
		Scanner sc = new Scanner(System.in);
		 n = sc.nextInt();
		fibo(n);
	}
	static int a , b;
	static void fibo(int i)
	{
		int c = 0;
		if(i<2)
		{
			a=0;
			b=1;
		}
		else
		{
			fibo(i-1);
			c=b;
			b=a+b;
			a=c;
		}
		System.out.println(a);

	}
}

