import java.util.Scanner;
class Base_n_power_3{
	public static void main(String args[])throws Exception
	{
		int n , x ,power;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter values for n and x : ");
		n = s.nextInt();
		x = s.nextInt();
		power = rec(n,x);
		System.out.println("\nPower is :" +power);
	}
	static int rec(int i , int j)
	{
		int r = 1;
		if(i==1)
			return i;
		else{
			while(j>0)
				{
					r = r*i;
					j--;
				}
			return r;
		}
	}
}