import java.util.Scanner;
class Fibo_4{
	public static void main(String args[])throws Exception
	{
		int start , end;
		Scanner sc = new Scanner(System.in);
		start = sc.nextInt();
		end = sc.nextInt();
		fibo(start , end);
	}
	static int fibo(int i , int j)
	{
		if(i==j)
			System.out.println(i);
		else if(i>j)
			System.out.println("Entry Wrong");
		else{
			int next = i;
			System.out.println(i);
			while(next<j)
			{
				i++;
				next = next +i;
				if(next<j)
				System.out.println(next);
			}
		}return 0;
	}
}
