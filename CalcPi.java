// exercose 5.20
import java.util.Scanner;
public class CalcPi
{
	public static void main (String []args)
	{
		Scanner input = new Scanner(System.in);
		int userValue;
		double piValue = 4.0;
		double flip = -1.0;
		System.out.println("Enter number of loops:");
		userValue = input.nextInt();
		for(double i = 3.0; i <= userValue; i= i + 2.0)
		{
			piValue = piValue + flip *(4.0/i);
			flip = -1.0 * flip;
		}
		System.out.println(piValue);
	}
}
