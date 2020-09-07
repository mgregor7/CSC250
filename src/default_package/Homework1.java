package default_package;

public class Homework1 {

	public static void main(String[] args) 
	{
		int count = 0;
		String s1 = "Acts";
		for(int i = s1.length()-1; i >= 0; i--)
		{
			if(s1.charAt(i) == 'a'||
			   s1.charAt(i) == 'e'||
			   s1.charAt(i) == 'i'||
			   s1.charAt(i) == 'o'||
			   s1.charAt(i) == 'u'||
			   s1.charAt(i) == 'A'||
			   s1.charAt(i) == 'E'||
			   s1.charAt(i) == 'I'||
			   s1.charAt(i) == 'O'||
			   s1.charAt(i) == 'U')
			{
				count++;
			}
		}
		System.out.println("Number of vowels:");
		System.out.println(count);

	}

}
