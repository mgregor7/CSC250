package default_package;
import java.util.Scanner;

public class Homework4
{
	public static String hexFromDecimal(int decimalNum)
	{
		int temp1;
		String hex="";
		char hexchars[]= 
		{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		while(decimalNum>0)
		{
			temp1=decimalNum%16;
			hex=hexchars[temp1]+hex;
			decimalNum=decimalNum/16;
		}
		return hex;
	}
	
	public static int decimalFromBinary(String binary)
	{
		int decimal = 0;
		int n = 0;
		int binaryInt = Integer.parseInt(binary);
		while(binaryInt != 0)
		{
			int temp = binaryInt % 10;
			decimal += temp*Math.pow(2,n);
			binaryInt = binaryInt/10;
			n++;
		}
	return decimal;
	}
	
	
	public static void main(String[] args)
	{
		Scanner binumber = new Scanner(System.in);
		System.out.println("Enter Binary: ");
		
		
		String binary = binumber.nextLine();

		System.out.println("Binary is: " + binary);
		System.out.println("Decimal is: " + decimalFromBinary(binary));
		System.out.println("Hexadecimal is: " + hexFromDecimal(decimalFromBinary(binary)));
		
		binumber.close();
					
	}
}
