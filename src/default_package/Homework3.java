package default_package;
import java.util.Scanner;

public class Homework3
{
	public static void main(String[] args)
	{
		Scanner decnum = new Scanner(System.in);
		System.out.println("Enter Number: ");
		
		
		int number = decnum.nextInt();
		System.out.println("Decimal is: " + number);
		String binary = "";
		while(number > 0)
		{
			int y = number % 2;
			binary = y + binary;
			number = number / 2;
		}
		System.out.println("Binary is: " + binary);
		decnum.close();
					
	}
}
