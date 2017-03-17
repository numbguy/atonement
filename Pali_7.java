import java.util.Scanner;
public class Pali_7{
	public static void main(String args[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		pali(n);
	}
	static void pali(int i)
	{
		int r;
		int s = 0;
		int num = i;
		while(i>0)
		{
			r = i%10;
			s = (s*10)+r;
			i = i/10;
		}
		if(s == num)
			System.out.println("no is palindrome");
		else
			System.out.println("no is not palindrome");
	}
}
