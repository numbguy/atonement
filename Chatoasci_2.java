import java.io.*;
class Chatoasci_2{
	public static void main(String args[])throws Exception
	{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		System.out.println("Enter A Character and Find Out The Ascii Value");
		byte b =(byte)System.in.read();
		System.out.println(b);
	}
}
