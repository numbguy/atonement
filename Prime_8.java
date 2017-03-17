import java.util.Scanner;
public class Prime_8{
	public static void main(String args[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		prime(n);
	}
	static void prime(int p)
	{
		int i,j,flag=1;
		for(i=2;i<=p;i++)
		{
			for(j=2;j<=i/2;j++)
			{
				if(i%j==0 && i != j)
				{	flag=0;
					break;
				}
				else
				flag=1;
			}
			if(flag==1)
				System.out.println(i+"no is  prime");
			else
				System.out.println(i+"no. is not prime");
		}
	}

}