import java.util.*;

class Comparator{
	String name;
	int size;
	int calories;
	String taste;

	void input()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name of the biscuit");
		name=s.nextLine();
		System.out.println("Enter the size of biscuit in mm");
		size= s.nextInt();
		System.out.println("Enter the calories per biscuit");
		calories= s.nextInt();
		System.out.println("Enter its taste :Type Sweet ; Salty ; Neutral;");
		taste= s.next();
	}


	void display()
	{

		System.out.println(name+" "+size+" "+calories+" "+taste);
			}
	int compare(Comparator ob2)
	{
		int i=0;
		int j=0;
		if(size>ob2.size)
		{
			i++;
		}
		else
		{
			j++;
		}
		if(calories>ob2.calories)
		{
			i++;
		}
		else
		{
			j++;
		}
		if(i>j)
		{
			System.out.println(name+" "+"is good which taste"+" "+taste);
		}
		else
		{
			System.out.println(ob2.name+" "+"is good which taste"+" "+taste);
		}
		return 0;
	}



}
class Biscuit_1{
	public static void main(String args[])
	{
		Comparator ob1 = new Comparator();
		ob1.input();
		Comparator ob2 = new Comparator();
		ob2.input();
		ob1.display();
		ob2.display();
		ob1.compare(ob2);

	}
}